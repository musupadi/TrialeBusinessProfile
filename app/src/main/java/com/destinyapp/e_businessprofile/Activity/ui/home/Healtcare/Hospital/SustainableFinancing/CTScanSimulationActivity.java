package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.R;

public class CTScanSimulationActivity extends AppCompatActivity {
    EditText Investasi,bpjs,pribadi,totalcogs,operationalprofit,paybackperiod;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctscan_simulation);
        Investasi = findViewById(R.id.etNilaiInvestasi);
        bpjs = findViewById(R.id.etBPJS);
        pribadi = findViewById(R.id.etPribadiUmum);
        totalcogs = findViewById(R.id.etTotalCOGS);
        operationalprofit = findViewById(R.id.etOprationalProfit);
        paybackperiod = findViewById(R.id.etPaybackPeriod);
        hitung = findViewById(R.id.btnHitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bpjs.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "BPJS Kosong", Toast.LENGTH_SHORT).show();
                }else if(pribadi.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "Umum Kosong", Toast.LENGTH_SHORT).show();
                }else if(totalcogs.getText().toString().isEmpty()){
                    Toast.makeText(CTScanSimulationActivity.this, "Total COGS Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    int INVESTASI = Integer.parseInt(Investasi.getText().toString());
                    int BPJS = Integer.parseInt(bpjs.getText().toString());
                    int PRIBADI = Integer.parseInt(pribadi.getText().toString());
                    int TOTALCOGS = Integer.parseInt(totalcogs.getText().toString());

                    int profit = (BPJS+PRIBADI) - TOTALCOGS;
                    int PP = INVESTASI+profit;
                    operationalprofit.setText(String.valueOf(PP));
                    paybackperiod.setText(String.valueOf(profit));
                }

            }
        });
    }

}
