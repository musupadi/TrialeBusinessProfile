package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.R;

public class AnalisisKinerjaRSActivity extends AppCompatActivity {
    LinearLayout parameters,simulation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis_kinerja_rs);
        parameters = findViewById(R.id.linearParmeter);
        simulation = findViewById(R.id.linearSimulation);

        parameters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnalisisKinerjaRSActivity.this,ParametersAnalisisKinerjaRSActivity.class);
                startActivity(intent);
            }
        });
        simulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnalisisKinerjaRSActivity.this,SimulationAnalisisKinerjaRSActivity.class);
                startActivity(intent);
            }
        });
    }
}
