package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.ListOfProbing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destinyapp.e_businessprofile.R;

public class ListOfProbingActivity extends AppCompatActivity {
    LinearLayout financialaspect,businessaspect,riskandmitigation;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_probing);
        financialaspect=findViewById(R.id.linearFinancialAspect);
        businessaspect=findViewById(R.id.linearBusinessAspect);
        riskandmitigation=findViewById(R.id.linearRiskAndMitigation);
        financialaspect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfProbingActivity.this,FinancialActivity.class);
                startActivity(intent);
            }
        });

        businessaspect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfProbingActivity.this,BusinessAspectActivity.class);
                startActivity(intent);
            }
        });
    }
}
