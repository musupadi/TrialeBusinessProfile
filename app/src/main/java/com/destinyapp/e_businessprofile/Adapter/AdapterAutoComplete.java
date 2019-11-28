package com.destinyapp.e_businessprofile.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.destinyapp.e_businessprofile.Model.DataModel;
import com.destinyapp.e_businessprofile.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterAutoComplete extends ArrayAdapter<DataModel> {
    private List<DataModel> dmListFull;

    public AdapterAutoComplete(@NonNull Context context, @NonNull List<DataModel> countryList) {
        super(context, 0, countryList);
        dmListFull = new ArrayList<>(countryList);
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return countryFilter;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_auto, parent, false
            );
        }

        TextView textViewName = convertView.findViewById(R.id.tvNama);

        DataModel dm = getItem(position);

        if (dm != null) {
            textViewName.setText(dm.getNama_rs());
        }

        return convertView;
    }

    private Filter countryFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<DataModel> suggestions = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                suggestions.addAll(dmListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (DataModel item : dmListFull) {
                    if (item.getNama_rs().toLowerCase().contains(filterPattern)) {
                        suggestions.add(item);
                    }
                }
            }

            results.values = suggestions;
            results.count = suggestions.size();

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            clear();
            addAll((List) results.values);
            notifyDataSetChanged();
        }

        @Override
        public CharSequence convertResultToString(Object resultValue) {
            return ((DataModel) resultValue).getNama_rs();
        }
    };
}
