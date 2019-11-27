package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.RasioKebutuhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.API.ApiRequestFajar;
import com.destinyapp.e_businessprofile.API.RetroServerFajar;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.ListOfHospital.ListOfHospitalActivity;
import com.destinyapp.e_businessprofile.Adapter.AdapterDataRS;
import com.destinyapp.e_businessprofile.Adapter.AdapterSpinnerKota;
import com.destinyapp.e_businessprofile.Adapter.AdapterSpinnerProvinsi;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.Model.ResponseModel;
import com.destinyapp.e_businessprofile.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InputRasioKebutuhanActivity extends AppCompatActivity {
    EditText JumlahTempatTidur,Penduduk;
    Spinner Provinsi,Kota;
    Button hitung;
    private RecyclerView.Adapter mAdapter;
    private List<DataModel> mItems = new ArrayList<>();
    private List<DataModel> pList = new ArrayList<>();
    private RecyclerView.LayoutManager mManager;
    private AdapterSpinnerProvinsi aProvinsi;
    TextView idKota,idProvinsi;
    TextView Rasio,tempattidur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_rasio_kebutuhan);
        JumlahTempatTidur = findViewById(R.id.etInputJumlahTempatTidur);
        Penduduk = findViewById(R.id.etInputPenduduk);
        Provinsi = findViewById(R.id.spinnerProvinsi);
        Kota = findViewById(R.id.spinnerKota);
        hitung = findViewById(R.id.btnHitung);
        idKota = findViewById(R.id.tvidKota);
        idProvinsi = findViewById(R.id.tvIdProvinsi);
        Rasio = findViewById(R.id.tvRasioKebutuhan);
        tempattidur = findViewById(R.id.jumlahTempatTidurDibutuhkan);
        getProvinsi();
        aProvinsi = new AdapterSpinnerProvinsi(InputRasioKebutuhanActivity.this,mItems);
        Provinsi.setAdapter(aProvinsi);
        Provinsi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                DataModel clickedItem = (DataModel) parent.getItemAtPosition(position);
                String clickedItems = clickedItem.getId_provinsi();
                getKota(clickedItems);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        aProvinsi = new AdapterSpinnerProvinsi(InputRasioKebutuhanActivity.this,mItems);
        Kota.setAdapter(aProvinsi);
        Kota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                DataModel clickedItem = (DataModel) parent.getItemAtPosition(position);
                idKota.setText(clickedItem.getId_kab_kota());
                JumlahTempatTidur.setText(clickedItem.getJumlah_bed_rs());
                Logic();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hitung();
            }
        });
    }
    private void Hitung(){
        double jumlahTempatTidur = Double.parseDouble(JumlahTempatTidur.getText().toString());
        double jumlahPenduduk = Double.parseDouble(Penduduk.getText().toString());

        double rasio = ((jumlahTempatTidur / jumlahPenduduk) * 1000);
        DecimalFormat df2 = new DecimalFormat("#.##");
        Rasio.setText(String.valueOf(df2.format(rasio)));
        double hasil = jumlahTempatTidur - (jumlahPenduduk / 1000);
        tempattidur.setText(String.valueOf(df2.format(hasil)));
    }

    private void Logic(){
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> ListRumahSakit = api.listHospital(idKota.getText().toString(),idProvinsi.getText().toString(),"0","0");
        ListRumahSakit.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if (response.isSuccessful()){
                    JumlahTempatTidur.setText(response.body().getJumlah_bed());
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }
    private void getKota(String Provinsi){
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> getProvinsi = api.kota(Provinsi);
        getProvinsi.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                mItems=response.body().getData();
                AdapterSpinnerKota adapter = new AdapterSpinnerKota(InputRasioKebutuhanActivity.this,mItems);
                Kota.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(InputRasioKebutuhanActivity.this,"Kelas Tidak Ditemukan",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getProvinsi(){
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> getProvinsi = api.provinsi();
        getProvinsi.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                mItems=response.body().getData();
                AdapterSpinnerProvinsi adapter = new AdapterSpinnerProvinsi(InputRasioKebutuhanActivity.this,mItems);
                Provinsi.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(InputRasioKebutuhanActivity.this,"Kelas Tidak Ditemukan",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
