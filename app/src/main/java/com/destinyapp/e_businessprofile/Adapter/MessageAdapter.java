package com.destinyapp.e_businessprofile.Adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.destinyapp.e_businessprofile.Model.Message;
import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageAdapterViewHolder> {
    String User,Person;
    Context context;
    List<Message> messages;
    DatabaseReference messageDb;

    public MessageAdapter(Context context, List<Message> messages, DatabaseReference messageDb){
        this.context=context;
        this.messageDb = messageDb;
        this.messages = messages;
    }

    @NonNull
    @Override
    public MessageAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_message,parent,false);
        return new MessageAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapterViewHolder holder, int position) {
        Message message = messages.get(position);
        DB_Helper dbHelper = new DB_Helper(context);
        Cursor cursor = dbHelper.checkSession();
        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                User = cursor.getString(0);
                Person = cursor.getString(1);
            }
        }
        if (message.getEmail().equals(User)){
            holder.tvTgl.setText(message.getTgl());
            holder.tvChat.setText(message.getMessage());

            //Gravity
            holder.li.setGravity(Gravity.RIGHT);
            holder.tvNama.setGravity(Gravity.RIGHT);
            holder.tvEmail.setGravity(Gravity.RIGHT);
            holder.tvChat.setGravity(Gravity.RIGHT);
        }else{
            holder.tvNama.setText(message.getName());
            holder.tvEmail.setText(message.getEmail());
            holder.tvTgl.setText(message.getTgl());
            holder.tvChat.setText(message.getMessage());

            //Gravity
            holder.li.setGravity(Gravity.LEFT);
            holder.tvNama.setGravity(Gravity.LEFT);
            holder.tvEmail.setGravity(Gravity.LEFT);
            holder.tvChat.setGravity(Gravity.LEFT);
        }
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public class MessageAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView tvChat,tvNama,tvEmail,tvTgl;
        LinearLayout li;
        public MessageAdapterViewHolder(View itemView){
            super(itemView);
            tvChat = itemView.findViewById(R.id.tvChat);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvTgl = itemView.findViewById(R.id.tvTanggal);
            li = itemView.findViewById(R.id.linearChat);
        }
    }
}

