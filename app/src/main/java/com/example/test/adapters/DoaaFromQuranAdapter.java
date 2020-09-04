package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.Citation;
import com.example.test.models.DoaaFromQuran;

import java.util.ArrayList;

public class DoaaFromQuranAdapter extends RecyclerView.Adapter<DoaaFromQuranAdapter.DoaaFromQuranViewHolder> {
    private ArrayList<DoaaFromQuran> mDooDoaaFromQuran;

    public static class DoaaFromQuranViewHolder extends RecyclerView.ViewHolder {
        public TextView DoaaFromQuranTV;

        public DoaaFromQuranViewHolder(View itemView) {
            super(itemView);
            DoaaFromQuranTV = itemView.findViewById(R.id.doaaFromQuran_text_view);
        }
    }

    public DoaaFromQuranAdapter(ArrayList<DoaaFromQuran> doaaFromQuranArrayList) {
        mDooDoaaFromQuran = doaaFromQuranArrayList;
    }

    @NonNull
    @Override
    public DoaaFromQuranViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doaa_from_quran, parent, false);
        DoaaFromQuranAdapter.DoaaFromQuranViewHolder dfqv = new DoaaFromQuranAdapter.DoaaFromQuranViewHolder(v);
        return dfqv;
    }

    @Override
    public void onBindViewHolder(@NonNull DoaaFromQuranViewHolder holder, int position) {
        DoaaFromQuran currentItem = mDooDoaaFromQuran.get(position);
        holder.DoaaFromQuranTV.setText(currentItem.getDoaaFromQuran_text());
    }

    @Override
    public int getItemCount() {
        return mDooDoaaFromQuran.size();
    }


}
