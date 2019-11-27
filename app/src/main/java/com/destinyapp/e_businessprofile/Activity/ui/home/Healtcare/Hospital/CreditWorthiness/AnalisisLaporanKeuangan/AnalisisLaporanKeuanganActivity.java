package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisLaporanKeuangan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS.AnalisisKinerjaRSActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS.ParametersAnalisisKinerjaRSActivity;
import com.destinyapp.e_businessprofile.R;

public class AnalisisLaporanKeuanganActivity extends AppCompatActivity {
    LinearLayout parameters,simulation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis_laporan_keuangan);
        parameters = findViewById(R.id.linearParmeter);
        simulation = findViewById(R.id.linearSimulation);

        parameters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnalisisLaporanKeuanganActivity.this, ParameterAnalisisLaporanKeuanganActivity.class);
                startActivity(intent);
            }
        });
        simulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnalisisLaporanKeuanganActivity.this, InputAnalisisLaporanActivity.class);
                startActivity(intent);
            }
        });
    }
}
