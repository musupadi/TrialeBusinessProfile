package com.destinyapp.e_businessprofile.Activity.ui.account;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.destinyapp.e_businessprofile.Activity.LoginActivity;
import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;

public class AccountFragment extends Fragment {


    LinearLayout failed;
    CardView succes;
    Button Logout,ChangePassword;
    LinearLayout linearData;
    RelativeLayout relativeData;
    TextView nama,email;
    RelativeLayout Progress;
    String User,Person;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DB_Helper dbHelper = new DB_Helper(getActivity());
        Cursor cursor = dbHelper.checkSession();
        succes = view.findViewById(R.id.cardSucces);
        failed = view.findViewById(R.id.linearFailed);
        nama= view.findViewById(R.id.tvNama);
        email = view.findViewById(R.id.tvEmail);
        Logout = view.findViewById(R.id.btnLogout);
        Progress = view.findViewById(R.id.relativeProgressBar);
        linearData = view.findViewById(R.id.linearData);
        ChangePassword = view.findViewById(R.id.btnChangePassword);
        Progress.setVisibility(View.VISIBLE);
        linearData.setVisibility(View.GONE);
        succes.setVisibility(View.VISIBLE);
        failed.setVisibility(View.GONE);
        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                User = cursor.getString(0);
                Person = cursor.getString(1);
            }
        }
        Progress.setVisibility(View.GONE);
        linearData.setVisibility(View.VISIBLE);
        nama.setText(Person);
        email.setText(User);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage("Anda Yakin ingin Logout ?")
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(getActivity(), LoginActivity.class);
                                DB_Helper dbHelper = new DB_Helper(getActivity());
                                dbHelper.userLogout(User,getActivity());
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        //Set your icon here
                        .setTitle("Perhatian !!!")
                        .setIcon(R.drawable.ic_close_black_24dp);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        ChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}