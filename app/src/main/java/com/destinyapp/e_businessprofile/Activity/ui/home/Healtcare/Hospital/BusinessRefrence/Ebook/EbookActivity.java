package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.Ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.BusinessRefrenceActivity;
import com.destinyapp.e_businessprofile.Model.Method;
import com.destinyapp.e_businessprofile.R;

public class EbookActivity extends AppCompatActivity {
    LinearLayout full,highlight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook);
        full = findViewById(R.id.linearFullVersion);
        highlight = findViewById(R.id.linearHighlight);
        final Method method = new Method();
        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EbookActivity.this, FullVersionActivity.class);
                startActivity(intent);
            }
        });
        highlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method.copyReadAssets(EbookActivity.this,"Materi Highligt e-Book.pdf");
            }
        });
    }
}
