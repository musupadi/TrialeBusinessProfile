package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.SupportingIndustries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Model.Method;
import com.destinyapp.e_businessprofile.R;

public class SupportingIndustriesActivity extends AppCompatActivity {
    LinearLayout Alkes,Farmasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supporting_industries);
        Alkes = findViewById(R.id.linearAlkes);
        Farmasi = findViewById(R.id.linearFarmasi);
        final Method method = new Method();
        Alkes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method.copyReadAssets(SupportingIndustriesActivity.this,"Daftar Perusahaan Alkes (Produsen dan Penyalur).pdf");
            }
        });

        Farmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method.copyReadAssets(SupportingIndustriesActivity.this,"Industri Farmasi (final).pdf");
            }
        });
    }
}
