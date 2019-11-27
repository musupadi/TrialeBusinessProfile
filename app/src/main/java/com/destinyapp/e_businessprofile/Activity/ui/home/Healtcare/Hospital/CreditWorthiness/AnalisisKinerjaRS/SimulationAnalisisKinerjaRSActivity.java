package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.destinyapp.e_businessprofile.R;

public class SimulationAnalisisKinerjaRSActivity extends AppCompatActivity {
    Button BOR,AVLOSBedah,AVLOSNonBedah,BTO,TOI,NDR,GDR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulation_analisis_kinerja_rs);

        BOR = findViewById(R.id.btnBor);
        AVLOSBedah = findViewById(R.id.btnAvlosBedah);
        AVLOSNonBedah = findViewById(R.id.btnAvlosNonBedah);
        BTO = findViewById(R.id.btnBTO);
        TOI = findViewById(R.id.btnTOI);
        NDR = findViewById(R.id.btnNDR);
        GDR = findViewById(R.id.btnGDR);

        BOR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","BOR");
                startActivity(goInput);
            }
        });
        AVLOSBedah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","AVLOS-BEDAH");
                startActivity(goInput);
            }
        });
        AVLOSNonBedah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","AVLOS-NON-BEDAH");
                startActivity(goInput);
            }
        });
        BTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","BTO");
                startActivity(goInput);
            }
        });
        TOI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","TOI");
                startActivity(goInput);
            }
        });
        NDR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","NDR");
                startActivity(goInput);
            }
        });
        GDR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(SimulationAnalisisKinerjaRSActivity.this, InputSimulationAnalisisKinerjaRSActivity.class);
                goInput.putExtra("KEY_TITTLE_PERHITUNGAN","GDR");
                startActivity(goInput);
            }
        });
    }
}
