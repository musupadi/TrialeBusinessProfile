package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.ListOfProbing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destinyapp.e_businessprofile.R;

public class BusinessAspectActivity extends AppCompatActivity {
    LinearLayout linear1,linear2,linear3,linear4,linear5,linear6,linear7;
    TextView tvLinear1,tvLinear2,tvLinear3,tvLinear4,tvLinear5,tvLinear6,tvLinear7;
    Boolean BLinear1= true;
    Boolean BLinear2= true;
    Boolean BLinear3= true;
    Boolean BLinear4= true;
    Boolean BLinear5= true;
    Boolean BLinear6= true;
    Boolean BLinear7= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_aspect);
        linear1 = findViewById(R.id.linear1);
        tvLinear1 = findViewById(R.id.tvLinear1);
//        linear2 = findViewById(R.id.linear2);
//        tvLinear2 = findViewById(R.id.tvLinear2);
//        linear3 = findViewById(R.id.linear3);
//        tvLinear3 = findViewById(R.id.tvLinear3);
//        linear4 = findViewById(R.id.linear4);
//        tvLinear4 = findViewById(R.id.tvLinear4);
//        linear5 = findViewById(R.id.linear5);
//        tvLinear5 = findViewById(R.id.tvLinear5);
//        linear6 = findViewById(R.id.linear6);
//        tvLinear6 = findViewById(R.id.tvLinear6);
//        linear7 = findViewById(R.id.linear7);
//        tvLinear7 = findViewById(R.id.tvLinear7);
        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BLinear1 == true){
                    tvLinear1.setVisibility(View.VISIBLE);
                    BLinear1 = false;
                }else if(BLinear1 == false){
                    tvLinear1.setVisibility(View.GONE);
                    BLinear1 = true;
                }
            }
        });
    }
}