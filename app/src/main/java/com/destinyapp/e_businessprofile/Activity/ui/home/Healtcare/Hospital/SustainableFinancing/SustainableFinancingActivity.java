package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.R;

public class SustainableFinancingActivity extends AppCompatActivity {
    LinearLayout HitungInvestasi,NilaiRujukan,InvestasiPeralatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sustainable_financing);
        HitungInvestasi = findViewById(R.id.linearHitungInvestasi);
        NilaiRujukan = findViewById(R.id.linearNilaiRujukanInvestasi);
        InvestasiPeralatan = findViewById(R.id.linearInvestasiPeralatan);

        HitungInvestasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SustainableFinancingActivity.this,InputInvestasiActivity.class);
                startActivity(intent);
            }
        });
        NilaiRujukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SustainableFinancingActivity.this,NilaiRujukanActivity.class);
                startActivity(intent);
            }
        });
        InvestasiPeralatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SustainableFinancingActivity.this,PeralatanKesehatanActivity.class);
                startActivity(intent);
            }
        });
    }
}
