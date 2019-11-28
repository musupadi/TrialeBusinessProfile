package com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.Compilance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.CreditWorthiness.AnalisisKinerjaRS.GraphLineActivity;
import com.destinyapp.e_businessprofile.R;

public class VideoActivity extends AppCompatActivity {
    LinearLayout vid1,vid2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        vid1 = findViewById(R.id.linearVideo1);
        vid2 = findViewById(R.id.linearVideo2);

        vid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(VideoActivity.this, DetailActivity.class);
                goInput.putExtra("VIDEO_URL","https://www.youtube.com/watch?v=tApMzHlybzk");
                startActivity(goInput);
            }
        });
        vid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(VideoActivity.this, DetailActivity.class);
                goInput.putExtra("VIDEO_URL","https://www.youtube.com/watch?v=z_VyaNaIKgE");
                startActivity(goInput);
            }
        });
    }
}
