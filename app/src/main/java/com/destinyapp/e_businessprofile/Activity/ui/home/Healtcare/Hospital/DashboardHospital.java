package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.destinyapp.e_businessprofile.API.ApiRequestFajar;
import com.destinyapp.e_businessprofile.API.RetroServerFajar;
import com.destinyapp.e_businessprofile.Activity.DashboardActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.BusinessRefrenceActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Compilance.VideoActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.CreditWorthinessActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.EcosystemActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.ListOfProbing.ListOfProbingActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.SustainableFinancing.SustainableFinancingActivity;
import com.destinyapp.e_businessprofile.Adapter.AdapterBerita;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.Model.ResponseModel;
import com.destinyapp.e_businessprofile.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardHospital extends AppCompatActivity {
    LinearLayout BusinessRefrence,MarketPlayers,ListOfProbing,CreditWorthiness,Compilance,SustainableFinancing;
    RecyclerView recyclerBerita;
    private List<DataModel> mItems = new ArrayList<>();
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mManager;
    ProgressBar pdLoadingBerita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_hospital);
        BusinessRefrence = findViewById(R.id.linearBusinessRefrence);
        MarketPlayers = findViewById(R.id.linearMarketPlayers);
        ListOfProbing = findViewById(R.id.linearListOfProbing);
        CreditWorthiness = findViewById(R.id.linearCreditWorthiness);
        Compilance = findViewById(R.id.linearCompilance);
        SustainableFinancing = findViewById(R.id.linearSustainableFinancing);
        recyclerBerita = findViewById(R.id.recycler);
        pdLoadingBerita = findViewById(R.id.pdBerita);
        BusinessRefrence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardHospital.this, BusinessRefrenceActivity.class);
                startActivity(intent);
            }
        });
        MarketPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardHospital.this,EcosystemActivity.class);
                startActivity(intent);
            }
        });
        CreditWorthiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardHospital.this, CreditWorthinessActivity.class);
                startActivity(intent);
            }
        });
        ListOfProbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardHospital.this, ListOfProbingActivity.class);
                startActivity(intent);
            }
        });
        SustainableFinancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardHospital.this, SustainableFinancingActivity.class);
                startActivity(intent);
            }
        });
        Compilance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardHospital.this, VideoActivity.class);
                startActivity(intent);
            }
        });
        Berita();
    }

    private void Berita(){
        pdLoadingBerita.setVisibility(View.VISIBLE);
        mManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerBerita.setLayoutManager(mManager);
        ApiRequestFajar api = RetroServerFajar.getClient().create(ApiRequestFajar.class);
        Call<ResponseModel> Berita = api.berita();
        Berita.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                pdLoadingBerita.setVisibility(View.GONE);
                if (response.body().getData() == null){

                }else{
                    mItems=response.body().getData();
                    mAdapter = new AdapterBerita(DashboardHospital.this,mItems);
                    recyclerBerita.setAdapter(mAdapter);
                    mAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });
    }
}
