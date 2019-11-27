package com.destinyapp.e_businessprofile.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.R;

import java.util.List;

public class AdapterSpinnerProvinsi extends ArrayAdapter<DataModel> {

    public AdapterSpinnerProvinsi(Context context, List<DataModel> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.spinner_provinsi, parent, false
            );
        }

        TextView textProvinsi = convertView.findViewById(R.id.tvProvinsi);
        TextView textId = convertView.findViewById(R.id.tvId);
        DataModel currentItem = getItem(position);

        if (currentItem != null) {
            textProvinsi.setText(currentItem.getNama_provinsi());
            textId.setText(currentItem.getId_provinsi());
        }

        return convertView;
    }
}
