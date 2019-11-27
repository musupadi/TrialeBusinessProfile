package com.destinyapp.e_businessprofile.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.R;

import java.util.List;

public class AdapterBerita extends RecyclerView.Adapter<AdapterBerita.HolderData> {
    private List<DataModel> mList;
    private Context ctx;
    public AdapterBerita(Context ctx, List<DataModel> mList){
        this.ctx = ctx;
        this.mList = mList;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_berita,viewGroup,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBerita.HolderData holderData, int posistion) {
        final DataModel dm = mList.get(posistion);
        holderData.judul.setText(dm.getJudul_berita());
        Glide.with(ctx)
                .load(dm.getCover_berita())
                .into(holderData.cover);
        holderData.dm=dm;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class HolderData extends RecyclerView.ViewHolder{
        TextView judul;
        ImageView cover;
        DataModel dm;
        HolderData(View v){
            super(v);
            judul = v.findViewById(R.id.tvJudul);
            cover = v.findViewById(R.id.ivCoverBerita);
        }
    }
}
