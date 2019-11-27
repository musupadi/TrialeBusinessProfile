package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS.AnalisisKinerjaRSActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisLaporanKeuangan.AnalisisLaporanKeuanganActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.RasioKebutuhan.InputRasioKebutuhanActivity;
import com.destinyapp.e_businessprofile.R;

public class CreditWorthinessActivity extends AppCompatActivity {
    LinearLayout AnalisisKinerjaRS,AnalisisLaporanKeuangan,RasioKebutuhanRS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_worthiness);
        AnalisisKinerjaRS = findViewById(R.id.linearAnalisisKinerjaRS);
        AnalisisLaporanKeuangan = findViewById(R.id.linearAnalisisLaporanKeuangan);
        RasioKebutuhanRS = findViewById(R.id.linearRasioKebutuhanRS);

        AnalisisKinerjaRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreditWorthinessActivity.this, AnalisisKinerjaRSActivity.class);
                startActivity(intent);
            }
        });
        AnalisisLaporanKeuangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreditWorthinessActivity.this, AnalisisLaporanKeuanganActivity.class);
                startActivity(intent);
            }
        });

        RasioKebutuhanRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreditWorthinessActivity.this, InputRasioKebutuhanActivity.class);
                startActivity(intent);
            }
        });
    }
}
