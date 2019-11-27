package com.destinyapp.e_businessprofile.Activity.ui.chat.HealtcareChat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.Adapter.MessageAdapter;
import com.destinyapp.e_businessprofile.Model.GetToday;
import com.destinyapp.e_businessprofile.Model.Message;
import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupChatHealtcareActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference messagaeDb;
    MessageAdapter messageAdapter;
    String User,Person;
    List<Message> messages;
    RecyclerView rvMessage;
    EditText etMessage;
    ImageView imgButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chat_healtcare);
        //FirebaseApp.initializeApp(getActivity());
        database = FirebaseDatabase.getInstance();
        DB_Helper dbHelper = new DB_Helper(GroupChatHealtcareActivity.this);
        Cursor cursor = dbHelper.checkSession();
        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                User = cursor.getString(0);
                Person = cursor.getString(1);
            }
        }
        rvMessage = findViewById(R.id.recyclerImage);
        etMessage = findViewById(R.id.etMessage);
        imgButton = findViewById(R.id.btnSend);
        messages = new ArrayList<>();
        final SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss");
        GetToday today = new GetToday();
        final SimpleDateFormat Formatters= new SimpleDateFormat("yyyy-MM-dd");
        today.getToday(Formatters);

        final Date date = new Date(System.currentTimeMillis());
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(etMessage.getText().toString())){
                    Message message = new Message(etMessage.getText().toString(),Person,User,formatter.format(date));
                    etMessage.setText("");
                    messagaeDb.push().setValue(message);
                }else{
                    Toast.makeText(GroupChatHealtcareActivity.this, "U Cant Send Blank Message", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        messages = new ArrayList<>();
    }

    @Override
    public void onStart() {
        super.onStart();

        messagaeDb = database.getReference("messages-healthcare");
        messagaeDb.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Message message = dataSnapshot.getValue(Message.class);
                message.setKey(dataSnapshot.getKey());
                messages.add(message);
                displayMessage(messages);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Message message = dataSnapshot.getValue(Message.class);
                message.setKey(dataSnapshot.getKey());

                List<Message> newMessage = new ArrayList<Message>();

                for (Message m: messages){
                    if (m.getKey().equals(message.getKey())){
                        newMessage.add(message);
                    }else{
                        newMessage.add(m);
                    }
                }

                messages = newMessage;
                displayMessage(messages);
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
                Message message = dataSnapshot.getValue(Message.class);
                message.setKey(dataSnapshot.getKey());

                List<Message> newMessages = new ArrayList<Message>();

                for (Message m:messages){
                    if(!m.getKey().equals(message.getKey())){
                        newMessages.add(m);
                    }
                }
                messages = newMessages;
                displayMessage(messages);
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void displayMessage(List<Message> messages){
        rvMessage.setLayoutManager(new LinearLayoutManager(GroupChatHealtcareActivity.this));
        messageAdapter = new MessageAdapter(GroupChatHealtcareActivity.this,messages,messagaeDb);
        rvMessage.setAdapter(messageAdapter);
        rvMessage.getLayoutManager().scrollToPosition(messageAdapter.getItemCount()-1);
    }
}
