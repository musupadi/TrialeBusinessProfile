package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.R;

public class PeralatanKesehatanActivity extends AppCompatActivity {
    LinearLayout linearCTScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peralatan_kesehatan);

        linearCTScan = findViewById(R.id.linearCTScan);

        linearCTScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeralatanKesehatanActivity.this,CTScanSimulationActivity.class);
                startActivity(intent);
            }
        });
    }
}
