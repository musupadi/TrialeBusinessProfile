package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.destinyapp.e_businessprofile.R;

public class InputSimulationAnalisisKinerjaRSActivity extends AppCompatActivity {
    TextView tittle;
    EditText jan,feb,mar,apr,mei,jun,jul,ags,sep,okt,nov,des;
    Button hitung;
    boolean accept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_simulation_anlisiskinerjars);

        Intent data = getIntent();
        final String TITTLE_PERHITUNGAN = data.getStringExtra("KEY_TITTLE_PERHITUNGAN");

        tittle = findViewById(R.id.tvTittle);
        jan = findViewById(R.id.etJan);
        feb = findViewById(R.id.etFeb);
        mar = findViewById(R.id.etMar);
        apr = findViewById(R.id.etApr);
        mei = findViewById(R.id.etMei);
        jun = findViewById(R.id.etJun);
        jul = findViewById(R.id.etJuli);
        ags = findViewById(R.id.etAgs);
        sep = findViewById(R.id.etSep);
        okt = findViewById(R.id.etOkt);
        nov = findViewById(R.id.etNov);
        des = findViewById(R.id.etDes);
        hitung = findViewById(R.id.btnHitung);

        if (TITTLE_PERHITUNGAN.equals("BOR")){
            tittle.setText("Masukan Angka BOR Perbulan (%)");
        }else if(TITTLE_PERHITUNGAN.equals("AVLOS-BEDAH")){
            tittle.setText("Masukan Angka AvLOS perulan (hari)");
        }else if(TITTLE_PERHITUNGAN.equals("AVLOS-NON-BEDAH")){
            tittle.setText("Masukan Angka AvLOS perulan (hari)");
        }else if(TITTLE_PERHITUNGAN.equals("BTO")){
            tittle.setText("Masukan Angka BTO Perbulan (Jumlah Pemakaian)");
        }else if(TITTLE_PERHITUNGAN.equals("TOI")){
            tittle.setText("Masukan ANgka TOI Perbulan (Hari)");
        }else if(TITTLE_PERHITUNGAN.equals("NDR")){
            tittle.setText("Masukan Angka NDR perbulan (Orang/Pasien)");
        }else if(TITTLE_PERHITUNGAN.equals("GDR")){
            tittle.setText("Masukan Angka GRD perbulan (Orang/Pasien)");
        }

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LOGIC(TITTLE_PERHITUNGAN);
            }
        });
    }

    private void LOGIC(String perhitungan){
        Intent goInput = new Intent(this, GraphLineActivity.class);
        goInput.putExtra("JAN",IFELSES(jan));
        goInput.putExtra("FEB",IFELSES(feb));
        goInput.putExtra("MAR",IFELSES(mar));
        goInput.putExtra("APR",IFELSES(apr));
        goInput.putExtra("MEI",IFELSES(mei));
        goInput.putExtra("JUN",IFELSES(jun));
        goInput.putExtra("JUL",IFELSES(jul));
        goInput.putExtra("AGS",IFELSES(ags));
        goInput.putExtra("SEP",IFELSES(sep));
        goInput.putExtra("OKT",IFELSES(okt));
        goInput.putExtra("NOV",IFELSES(nov));
        goInput.putExtra("DES",IFELSES(des));
        goInput.putExtra("TITTLE",perhitungan);;
        startActivity(goInput);
    }
    private String IFELSES(EditText data){
        String done="0";
        if (data.getText().toString().isEmpty()){
            done = "0";
        }else{
            done = data.getText().toString();
        }
        return done;
    }
}
