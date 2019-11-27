package com.destinyapp.e_businessprofile.Activity.ui.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.destinyapp.e_businessprofile.Activity.ui.chat.HealtcareChat.GroupChatHealtcareActivity;
import com.destinyapp.e_businessprofile.R;

public class ChatFragment extends Fragment {

    LinearLayout healtcare;
    String User,Person;
    ImageView ivHeader;
    TextView tvHeader;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        healtcare = view.findViewById(R.id.linearHealtCare);

        healtcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),GroupChatHealtcareActivity.class);
                startActivity(intent);
            }
        });
    }
}