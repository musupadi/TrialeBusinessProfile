package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.destinyapp.e_businessprofile.R;

public class InputInvestasiActivity extends AppCompatActivity {
    EditText PP,ROA,ROI,ARR,NPV,IRR,PI;
    Button btnHitung,btnBatal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_investasi);
        PP = findViewById(R.id.etPPTahun);
        ROA = findViewById(R.id.etROA);
        ROI = findViewById(R.id.etROI);
        ARR = findViewById(R.id.etARR);
        NPV = findViewById(R.id.etNPV);
        IRR = findViewById(R.id.etIRR);
        PI = findViewById(R.id.etPI);
        btnHitung = findViewById(R.id.btnHitung);
        btnBatal = findViewById(R.id.btnBatal);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnBatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
