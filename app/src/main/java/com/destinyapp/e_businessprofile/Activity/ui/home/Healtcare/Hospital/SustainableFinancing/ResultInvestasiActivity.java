package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.DashboardHospital;
import com.destinyapp.e_businessprofile.R;

public class ResultInvestasiActivity extends AppCompatActivity {
    TextView SkorPP,KeteranganPP,SkorROA,KeteranganROA,SkorROI,KeteranganROI,SkorARR,KeteranganARR,SkorNPV,KeteranganNPV,SkorIRR,KeteranganIRR,SkorPI,KeteranganPI;
    Button kembali,MenuUtama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_investasi);
        SkorPP = findViewById(R.id.tvSkorPP);
        KeteranganPP = findViewById(R.id.tvKeteranganPP);
        SkorROA = findViewById(R.id.tvSkorROA);
        KeteranganROA = findViewById(R.id.tvKeteranganROA);
        SkorROI = findViewById(R.id.tvSkorROI);
        KeteranganROI = findViewById(R.id.tvKeteranganROI);
        SkorARR = findViewById(R.id.tvSkorARR);
        KeteranganARR = findViewById(R.id.tvKeteranganARR);
        SkorNPV = findViewById(R.id.tvSkorNPV);
        KeteranganNPV = findViewById(R.id.tvKeteranganNPV);
        SkorIRR = findViewById(R.id.tvSkorIRR);
        KeteranganIRR = findViewById(R.id.tvKeteranganIRR);
        SkorPI = findViewById(R.id.tvSkorPI);
        KeteranganPI = findViewById(R.id.tvKeteranganPI);
        kembali = findViewById(R.id.btnKembali);
        MenuUtama = findViewById(R.id.btnMenuUtama);
        //GET INTENT DATA
        Intent data = getIntent();
        String PP = data.getStringExtra("PP");
        String ROA = data.getStringExtra("ROA");
        String ROI = data.getStringExtra("ROI");
        String ARR = data.getStringExtra("ARR");
        String NPV = data.getStringExtra("NPV");
        String IRR = data.getStringExtra("IRR");
        String PI = data.getStringExtra("PI");
        SkorPP.setText(PP);
        SkorROA.setText("Skor : "+ROA+"%");
        SkorROI.setText("Skor : "+ROI+"%");
        SkorARR.setText("Skor : "+ARR+"%");
        SkorNPV.setText("Skor : "+NPV);
        SkorIRR.setText("Skor : "+IRR+"%");
        SkorPI.setText("Skor : "+PI);
        //PP
        if (Integer.parseInt(PP) > 0 && Integer.parseInt(PP) < 10){
            KeteranganPP.setText("Keterangan : LAYAK");
        }else{
            KeteranganPP.setText("Keterangan : TIDAK LAYAK");
        }

        //ROA
        if (Integer.parseInt(ROA) >= 20){
            KeteranganROA.setText("Keterangan : LAYAK");
        }else{
            KeteranganROA.setText("Keterangan : TIDAK LAYAK");
        }

        //ROI
        if (Integer.parseInt(ROI) >= 15){
            KeteranganROI.setText("Keterangan : LAYAK");
        }else{
            KeteranganROI.setText("Keterangan : TIDAK LAYAK");
        }

        //ARR
        if (Integer.parseInt(ARR) >= 15){
            KeteranganARR.setText("Keterangan : LAYAK");
        }else{
            KeteranganARR.setText("Keterangan : TIDAK LAYAK");
        }

        //NPV
        if (Integer.parseInt(NPV) >= 0){
            KeteranganNPV.setText("Keterangan : LAYAK");
        }else{
            KeteranganNPV.setText("Keterangan : TIDAK LAYAK");
        }

        //IRR
        if (Integer.parseInt(IRR) >= 13){
            KeteranganIRR.setText("Keterangan : LAYAK");
        }else{
            KeteranganIRR.setText("Keterangan : TIDAK LAYAK");
        }

        //PI
        if (Integer.parseInt(PI) >= 1){
            KeteranganPI.setText("Keterangan : LAYAK");
        }else{
            KeteranganPI.setText("Keterangan : TIDAK LAYAK");
        }

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        MenuUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultInvestasiActivity.this, DashboardHospital.class);
                startActivity(intent);
            }
        });

    }
}
