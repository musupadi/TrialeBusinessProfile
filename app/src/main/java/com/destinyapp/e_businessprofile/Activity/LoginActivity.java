package com.destinyapp.e_businessprofile.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.API.ApiRequestFajar;
import com.destinyapp.e_businessprofile.API.RetroServerFajar;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.Model.ResponseModel;
import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;
import com.destinyapp.e_businessprofile.SharedPreferance.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    LinearLayout failed;
    CardView succes;
    EditText email,password;
    Button register,login;
    TextView forgotPassword;
    Dialog LoginScreen;
    private List<DataModel> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        register = findViewById(R.id.btnRegister);
        login = findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckInput().equals("Succes")){
                    final ProgressDialog pd = new ProgressDialog(LoginActivity.this);
                    pd.setMessage("Sedang Mencoba Login");
                    pd.setCancelable(false);
                    pd.show();
                    ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
                    Call<ResponseModel> login =api.login(email.getText().toString(),password.getText().toString());
                    login.enqueue(new Callback<ResponseModel>(){
                        @Override
                        public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                            if(response.body().getMessage() == null){
                                if (response.body().getNama_user() != null || response.body().getId_user() != null){
                                    pd.hide();
                                    DB_Helper dbHelper = new DB_Helper(LoginActivity.this);
                                    User user = new User(email.getText().toString(),response.body().getNama_user(),response.body().getId_user());
                                    dbHelper.saveSession(user);
                                    Intent intentLoading = new Intent(LoginActivity.this,LoadingActivity.class);
                                    startActivity(intentLoading);
                                }else{
                                    Toast.makeText(LoginActivity.this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
                                }
                            }else if (response.body().getMessage().equals("not found")){
                                pd.hide();
                                Toast.makeText(LoginActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                            }else if(response.body().getMessage().equals("Password Error")){
                                pd.hide();
                                Toast.makeText(LoginActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                            }else if(response.body().getMessage().equals("false")){
                                pd.hide();
                                Toast.makeText(LoginActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseModel> call, Throwable t) {
                            pd.hide();
                            Toast.makeText(LoginActivity.this, "Koneksi Gagal", Toast.LENGTH_SHORT).show();
                        }
                    });
                }else{
                    Toast.makeText(LoginActivity.this, CheckInput(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
    private String CheckInput(){
        String Check = "";
        String Email = email.getText().toString();
        if (email.getText().toString().isEmpty()){
            Check = "Silahkan Masukan Email";
        }else if (password.getText().toString().isEmpty()){
            Check = "Silahkan Masukan Password";
        }else{
            Check = "Succes";
        }
        return  Check;
    }
}
