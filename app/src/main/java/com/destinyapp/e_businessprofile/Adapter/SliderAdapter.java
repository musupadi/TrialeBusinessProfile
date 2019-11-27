package com.destinyapp.e_businessprofile.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.destinyapp.e_businessprofile.Activity.LoadingActivity;
import com.destinyapp.e_businessprofile.Activity.LoginActivity;
import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.AnalisisInput;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;
import com.destinyapp.e_businessprofile.SharedPreferance.User;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }
    public int[] id ={
            0,
            1,
            2
    };


    @Override
    public int getCount() {
        return id.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_input_analisis,container,false);


        TextView tahunke = view.findViewById(R.id.tvTahunPenilaian);
        final EditText ROI = view.findViewById(R.id.etROI);
        final EditText CashRatio = view.findViewById(R.id.etCashRatio);
        final EditText CurrentRatio = view.findViewById(R.id.etCurrentRatio);
        final EditText CollectivePeriod = view.findViewById(R.id.etCP);
        final EditText PP = view.findViewById(R.id.etPP);
        final EditText TATO = view.findViewById(R.id.etTATO);
        final EditText AktivaBersih = view.findViewById(R.id.etRasioAktiva);
        Button simpan = view.findViewById(R.id.btnSimpan);
        tahunke.setText("Tahun Ke-"+String.valueOf(position+1));
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DB_Helper dbHelper = new DB_Helper(context);
                AnalisisInput user = new AnalisisInput(String.valueOf(position+1),
                        ROI.getText().toString(),
                        CashRatio.getText().toString(),
                        CurrentRatio.getText().toString(),
                        CollectivePeriod.getText().toString(),
                        PP.getText().toString(),
                        TATO.getText().toString(),
                        AktivaBersih.getText().toString());
                dbHelper.InputData(user);
                Toast.makeText(context, "Data Tahun ke "+position+1+" Berhasil Tersimpan", Toast.LENGTH_SHORT).show();
            }
        });
//        slideImageView.setImageResource(slide_image[position]);
//        Nama.setText(slide_nama[position]);
//        Tittle.setText(slide_title[position]);
//        Deskripsi.setText(slide_deskripsi[position]);
//        final MediaPlayer SuaraMe = MediaPlayer.create(context,suara_saya[position]);
//        Deskripsi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context,"Tekan Untuk mendengarkan Suara Saya",Toast.LENGTH_SHORT).show();
//            }
//        });
//        Deskripsi.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                SuaraMe.start();
//                return true;
//            }
//        });
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
