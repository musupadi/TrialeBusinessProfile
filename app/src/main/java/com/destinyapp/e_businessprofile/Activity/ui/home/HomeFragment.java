package com.destinyapp.e_businessprofile.Activity.ui.home;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.destinyapp.e_businessprofile.API.ApiRequestFajar;
import com.destinyapp.e_businessprofile.API.RetroServerFajar;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.DashboardHospital;
import com.destinyapp.e_businessprofile.Adapter.AdapterBerita;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.Model.ResponseModel;
import com.destinyapp.e_businessprofile.R;
import com.destinyapp.e_businessprofile.SharedPreferance.DB_Helper;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    LinearLayout healtcare;
    String User,Person;
    ImageView ivHeader;
    TextView tvHeader;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        healtcare = view.findViewById(R.id.linearHealtCare);
        ivHeader = view.findViewById(R.id.ivHeader);
        tvHeader = view.findViewById(R.id.tvHeader);

        final DB_Helper dbHelper = new DB_Helper(getContext());
        Cursor cursor = dbHelper.checkSession();

        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                User = cursor.getString(0);
                Person = cursor.getString(1);
            }
        }
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        if (hour > 4 && hour < 11){
            tvHeader.setText("Selamat Pagi, "+Person);
            ivHeader.setImageResource(R.drawable.morning);
        }else if(hour >= 11 && hour <15){
            tvHeader.setText("Selamat Siang, "+Person);
            ivHeader.setImageResource(R.drawable.afternoon);
        }else if(hour >= 15 && hour <18){
            tvHeader.setText("Selamat Sore, "+Person);
            ivHeader.setImageResource(R.drawable.evening);
        }else{
            tvHeader.setText("Selamat Malam, "+Person);
            ivHeader.setImageResource(R.drawable.night);
        }


        healtcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DashboardHospital.class);
                startActivity(intent);
            }
        });

    }


}