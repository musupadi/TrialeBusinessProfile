package com.destinyapp.e_businessprofile.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;

public class MainActivity extends AppCompatActivity {
    String User,Person;
    private static final int PERMISSION_STORAGE_CODE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DB_Helper dbHelper = new DB_Helper(this);
        Cursor cursor = dbHelper.checkSession();
        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                User = cursor.getString(0);
                Person = cursor.getString(1);
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                    PackageManager.PERMISSION_DENIED){
                //
                String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};

                requestPermissions(permissions,PERMISSION_STORAGE_CODE);
            }else{
                logic();
            }
        }else{
            logic();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_STORAGE_CODE:{
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    logic();
                }else{
                    Toast.makeText(MainActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    finishAffinity();
                    startActivity(intent);
                }
            }
        }
    }

    private void logic(){
        if (User != null){
            Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
            startActivity(intent);
        }else{
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    changeActivity();
                }
            }, 3000); //3000 L = 3 detik
        }
    }

    private void changeActivity(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
