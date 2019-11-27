package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.Ebook.EbookActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.Regulasi.RegulasiActivity;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Ecosystem.SupportingIndustries.SupportingIndustriesActivity;
import com.destinyapp.e_businessprofile.Model.Method;
import com.destinyapp.e_businessprofile.Model.StaticModel.EbookData;
import com.destinyapp.e_businessprofile.R;

public class BusinessRefrenceActivity extends AppCompatActivity {
    LinearLayout eBook,Regulation,Newsletter,BusinessReview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_refrence);
        eBook = findViewById(R.id.linearEbook);
        Regulation = findViewById(R.id.linearRegulation);
        Newsletter = findViewById(R.id.linearNewsletter);
        BusinessReview = findViewById(R.id.linearBusinessReview);
        final Method method = new Method();
        eBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessRefrenceActivity.this, EbookActivity.class);
                startActivity(intent);
            }
        });
        Regulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BusinessRefrenceActivity.this, RegulasiActivity.class);
                startActivity(intent);
            }
        });
        Newsletter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method.copyReadAssets(BusinessRefrenceActivity.this,"Newsletter Rumah Sakit Vol.1.pdf");
            }
        });
        BusinessReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method.copyReadAssets(BusinessRefrenceActivity.this,"MARKET OUTLOOK.pdf");
            }
        });
    }
}
