package com.destinyapp.e_businessprofile.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.destinyapp.e_businessprofile.Activity.ui.home.Healtcare.Hospital.BusinessRefrence.Ebook.EbookActivity;
import com.destinyapp.e_businessprofile.Model.Method;
import com.destinyapp.e_businessprofile.Model.StaticModel.EbookModel;
import com.destinyapp.e_businessprofile.R;

import java.util.ArrayList;

public class AdapterEbook extends RecyclerView.Adapter<AdapterEbook.CardViewViewHolder>{
    private Context context;
    private ArrayList<EbookModel> listBatik;


    private ArrayList<EbookModel> getListBatik() {
        return listBatik;
    }
    public void setListBatik(ArrayList<EbookModel> listBatik) {
        this.listBatik= listBatik;
    }
    public AdapterEbook(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_grid_book, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final EbookModel p = getListBatik().get(i);
        cardViewViewHolder.nama.setText(p.getJudul());
        final Method method = new Method();
        cardViewViewHolder.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                method.copyReadAssets(context,p.getPdf());
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListBatik().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        TextView nama;
        LinearLayout list;
        CardViewViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.tvNama);
            list = itemView.findViewById(R.id.List);
        }
    }
}

