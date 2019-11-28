package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.ListOfHospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.destinyapp.e_businessprofile.API.ApiRequestFajar;
import com.destinyapp.e_businessprofile.API.RetroServerFajar;
import com.destinyapp.e_businessprofile.Adapter.AdapterAutoComplete;
import com.destinyapp.e_businessprofile.Adapter.AdapterDataRS;
import com.destinyapp.e_businessprofile.Adapter.AdapterSpinnerKota;
import com.destinyapp.e_businessprofile.Adapter.AdapterSpinnerProvinsi;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.Model.ResponseModel;
import com.destinyapp.e_businessprofile.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListOfHospitalActivity extends AppCompatActivity implements OnMapReadyCallback {
    RecyclerView recyclerData;
    AutoCompleteTextView NamaRS;
    Button cari;
    private GoogleMap mMap;
    private RecyclerView.Adapter mAdapter;
    private List<DataModel> mItems = new ArrayList<>();
    private List<DataModel> pList = new ArrayList<>();
    private RecyclerView.LayoutManager mManager;
    Spinner kota,kelas,provinsi;
    TextView JumlahRumahSakit,JumlahBed,IdKota,IdProvinsi;
    LinearLayout succes,failed;
    ImageView imageFailed;
    ImageView back;
    private AdapterSpinnerProvinsi SpinnerProvinsi;
    int loop = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_hospital);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        JumlahRumahSakit=findViewById(R.id.tvJumlahRumahSakit);
        JumlahBed=findViewById(R.id.tvJumlahBed);
        kelas = findViewById(R.id.spinnerKelas);
        kota = findViewById(R.id.spinnerKota);
        provinsi = findViewById(R.id.spinnerProvinsi);
        succes= findViewById(R.id.linearSucces);
        failed= findViewById(R.id.linearFailed);
        imageFailed= findViewById(R.id.ivFailed);
        IdKota = findViewById(R.id.tvIdKota);
        IdProvinsi = findViewById(R.id.tvIdProvinsi);
        NamaRS=findViewById(R.id.etNamaRS);
        cari=findViewById(R.id.btnCari);
        failed.setVisibility(View.GONE);

        LatLng latLng = new LatLng(-6.2468965, 115.2898833);
        BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.fabalogonew);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b,1,1,false);
        MarkerOptions markerOptions = new MarkerOptions().position(latLng)
                .title(kota.getSelectedItem().toString())
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,4F));
        googleMap.addMarker(markerOptions);

        //GetProvinsiData
        getProvinsi();
        SpinnerProvinsi = new AdapterSpinnerProvinsi(ListOfHospitalActivity.this,mItems);
        provinsi.setAdapter(SpinnerProvinsi);
        provinsi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                DataModel clickedItem = (DataModel) parent.getItemAtPosition(position);
                IdProvinsi.setText(clickedItem.getId_provinsi());
                getKota(IdProvinsi.getText().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //DONE
        //GetKotaData
        SpinnerProvinsi = new AdapterSpinnerProvinsi(ListOfHospitalActivity.this,mItems);
        kota.setAdapter(SpinnerProvinsi);
        kota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                DataModel clickedItem = (DataModel) parent.getItemAtPosition(position);
                IdKota.setText(clickedItem.getId_kab_kota());
                getDefaultLatLong(mMap,Double.parseDouble(clickedItem.getLatitude()),Double.parseDouble(clickedItem.getLongitude()),clickedItem.getNama_provinsi());
                Logic(mMap,"0");
                loop = loop + 1;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //DONE
        kelas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (loop >1){
                    Logic(mMap,"0");
                }
                loop = loop + 1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (NamaRS.getText().toString().isEmpty()){
                    Logic(mMap,"0");
                }else{
                    Logic(mMap,NamaRS.getText().toString());
                }

            }
        });
        imageFailed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logic(mMap,"0");
            }
        });
    }
    private void getAutoNamaRS(){
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> getMapel = api.listHospital(IdKota.getText().toString(),IdProvinsi.getText().toString(),"","");
        getMapel.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                mItems=response.body().getData();
                AdapterAutoComplete adapter = new AdapterAutoComplete(ListOfHospitalActivity.this,mItems);
                NamaRS.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(ListOfHospitalActivity.this,"Data Error dalam getMapel Method",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getDefaultLatLong(GoogleMap googleMap,double Latitude,double Longitude,String Prov){
        mMap.clear();
        LatLng latLng = new LatLng(Latitude, Longitude);
        BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.fabalogonew);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b,1,1,false);
        MarkerOptions markerOptions = new MarkerOptions().position(latLng)
                .title(Prov)
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,8F));
        googleMap.addMarker(markerOptions);
    }

    private void getProvinsi(){
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> getProvinsi = api.provinsi();
        getProvinsi.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                mItems=response.body().getData();
                AdapterSpinnerProvinsi adapter = new AdapterSpinnerProvinsi(ListOfHospitalActivity.this,mItems);
                provinsi.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(ListOfHospitalActivity.this,"Kelas Tidak Ditemukan",Toast.LENGTH_SHORT).show();
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
                AdapterSpinnerKota adapter = new AdapterSpinnerKota(ListOfHospitalActivity.this,mItems);
                kota.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(ListOfHospitalActivity.this,"Kelas Tidak Ditemukan",Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void Logic(final GoogleMap googleMap,final String namaRS){
        failed.setVisibility(View.GONE);
        mMap = googleMap;
        mMap.clear();
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage("Sedang Mengambil Data Dari Server");
        pd.setCancelable(false);
        pd.show();
        final RecyclerView rv = findViewById(R.id.recyclerDataRumahSakit);
        mManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(mManager);
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        String skelas = "0";
        if (!kelas.getSelectedItem().toString().equals("Semua Kelas")){
            skelas = kelas.getSelectedItem().toString();
        }
        Call<ResponseModel> ListRumahSakit = api.listHospital(IdKota.getText().toString(),IdProvinsi.getText().toString(),"0",skelas);
        ListRumahSakit.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                succes.setVisibility(View.VISIBLE);
                List<DataModel> mItems = new ArrayList<>();
                if (response == null){
                    failed.setVisibility(View.VISIBLE);
                    succes.setVisibility(View.GONE);
                    pd.hide();
                }else{
                    if (response.isSuccessful()){
                        pd.hide();
                        mItems= response.body().getList();
                        mAdapter = new AdapterDataRS(ListOfHospitalActivity.this,mItems);
                        rv.setAdapter(mAdapter);
                        mAdapter.notifyDataSetChanged();
                        JumlahRumahSakit.setText(": "+String.valueOf(mItems.size()));
                        int w = 0;
                        while (w < mItems.size()) {
                            DataModel dm = mItems.get(w);
                            if (dm.getKelas_rs().equals("A")){
                                BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.kelasa);
                                Bitmap b=bitmapdraw.getBitmap();
                                Bitmap smallMarker = Bitmap.createScaledBitmap(b,50,50,false);
                                googleMap.addMarker(new MarkerOptions()
                                        .position(new LatLng(Double.parseDouble(dm.getLatitude()),Double.parseDouble(dm.getLongitude())))
                                        .anchor(0.5f,0.5f)
                                        .title(dm.getNama_rs())
                                        .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
                            }else if(dm.getKelas_rs().equals("B")){
                                BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.kelasb);
                                Bitmap b=bitmapdraw.getBitmap();
                                Bitmap smallMarker = Bitmap.createScaledBitmap(b,50,50,false);
                                googleMap.addMarker(new MarkerOptions()
                                        .position(new LatLng(Double.parseDouble(dm.getLatitude()),Double.parseDouble(dm.getLongitude())))
                                        .anchor(0.5f,0.5f)
                                        .title(dm.getNama_rs())
                                        .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
                            }else if(dm.getKelas_rs().equals("C")){
                                BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.kelasc);
                                Bitmap b=bitmapdraw.getBitmap();
                                Bitmap smallMarker = Bitmap.createScaledBitmap(b,50,50,false);
                                googleMap.addMarker(new MarkerOptions()
                                        .position(new LatLng(Double.parseDouble(dm.getLatitude()),Double.parseDouble(dm.getLongitude())))
                                        .anchor(0.5f,0.5f)
                                        .title(dm.getNama_rs())
                                        .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
                            }else if(dm.getKelas_rs().equals("D")){
                                BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.kelasd);
                                Bitmap b=bitmapdraw.getBitmap();
                                Bitmap smallMarker = Bitmap.createScaledBitmap(b,50,50,false);
                                googleMap.addMarker(new MarkerOptions()
                                        .position(new LatLng(Double.parseDouble(dm.getLatitude()),Double.parseDouble(dm.getLongitude())))
                                        .anchor(0.5f,0.5f)
                                        .title(dm.getNama_rs())
                                        .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
                            }else if(dm.getKelas_rs().equals("D PRATAMA")){
                                BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.kelasd);
                                Bitmap b=bitmapdraw.getBitmap();
                                Bitmap smallMarker = Bitmap.createScaledBitmap(b,50,50,false);
                                googleMap.addMarker(new MarkerOptions()
                                        .position(new LatLng(Double.parseDouble(dm.getLatitude()),Double.parseDouble(dm.getLongitude())))
                                        .anchor(0.5f,0.5f)
                                        .title(dm.getNama_rs())
                                        .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
                            }else if(dm.getKelas_rs().equals("BELUM DITETAPKAN")){
                                BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.belumditetapkan);
                                Bitmap b=bitmapdraw.getBitmap();
                                Bitmap smallMarker = Bitmap.createScaledBitmap(b,50,50,false);
                                googleMap.addMarker(new MarkerOptions()
                                        .position(new LatLng(Double.parseDouble(dm.getLatitude()),Double.parseDouble(dm.getLongitude())))
                                        .anchor(0.5f,0.5f)
                                        .title(dm.getNama_rs())
                                        .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
                            }

                            //Toasty("Test"+dm.getUsername_umkm());
                            w++;
                        }
                        JumlahBed.setText(": "+response.body().getJumlah_bed());
                    }else{
                        pd.hide();
                        Toast.makeText(ListOfHospitalActivity.this, "Data Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                    }
                }

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                failed.setVisibility(View.VISIBLE);
                succes.setVisibility(View.GONE);
                pd.hide();
            }
        });
    }
}
