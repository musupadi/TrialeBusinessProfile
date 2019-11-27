package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.ListOfHospital.ListOfHospitalActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.SupportingIndustries.SupportingIndustriesActivity;
import com.destinyapp.e_businessprofile.R;

public class EcosystemActivity extends AppCompatActivity {
    LinearLayout listOfHospital,supportingIndustries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecosystem);
        listOfHospital = findViewById(R.id.linearListOfHospital);
        supportingIndustries = findViewById(R.id.linearSupportingIndustries);

        listOfHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EcosystemActivity.this, ListOfHospitalActivity.class);
                startActivity(intent);
            }
        });
        supportingIndustries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EcosystemActivity.this, SupportingIndustriesActivity.class);
                startActivity(intent);
            }
        });

    }
}
