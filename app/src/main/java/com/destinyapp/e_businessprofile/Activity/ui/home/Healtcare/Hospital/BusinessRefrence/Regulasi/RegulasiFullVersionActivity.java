package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.Regulasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destinyapp.e_businessprofile.Adapter.AdapterEbook;
import com.destinyapp.e_businessprofile.Adapter.AdapterRegulasi;
import com.destinyapp.e_businessprofile.Model.StaticModel.EbookData;
import com.destinyapp.e_businessprofile.Model.StaticModel.EbookModel;
import com.destinyapp.e_businessprofile.Model.StaticModel.RegulasiData;
import com.destinyapp.e_businessprofile.R;

import java.util.ArrayList;

public class RegulasiFullVersionActivity extends AppCompatActivity {
    RecyclerView rvCategory;
    private ArrayList<EbookModel> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulasi_full_version);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);

        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        pList.addAll(RegulasiData.getListData());
        AdapterRegulasi cardViewAdapter = new AdapterRegulasi(this);
        cardViewAdapter.setListBatik(pList);
        rvCategory.setAdapter(cardViewAdapter);
    }
}
