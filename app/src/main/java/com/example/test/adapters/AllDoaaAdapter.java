package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.AllDoaa;
import com.example.test.models.CitationNight;

import java.util.ArrayList;

public class AllDoaaAdapter extends RecyclerView.Adapter<AllDoaaAdapter.AllDoaaViewHolder> {
    private ArrayList<AllDoaa> allDoaaList;

    public static class AllDoaaViewHolder extends RecyclerView.ViewHolder {
        public TextView allDoaa;

        public AllDoaaViewHolder(View itemView) {
            super(itemView);
            allDoaa = itemView.findViewById(R.id.all_doaa_text_view);
        }
    }

    public AllDoaaAdapter(ArrayList<AllDoaa> allDoaaArrayList) {
        allDoaaList = allDoaaArrayList;
    }

    @NonNull
    @Override
    public AllDoaaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_doaa, parent, false);
        AllDoaaAdapter.AllDoaaViewHolder adv = new AllDoaaAdapter.AllDoaaViewHolder(v);
        return adv;
    }

    @Override
    public void onBindViewHolder(@NonNull AllDoaaViewHolder holder, int position) {
        AllDoaa currentItemAllDoaa = allDoaaList.get(position);
        holder.allDoaa.setText(currentItemAllDoaa.getDoaa_text());
    }

    @Override
    public int getItemCount() {
        return allDoaaList.size();
    }

}
