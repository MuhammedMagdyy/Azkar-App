package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;

import com.example.test.models.HekamDeneya;

import java.util.ArrayList;


public class HekamDeneyaAdapter extends RecyclerView.Adapter<HekamDeneyaAdapter.HekamDeneyaViewHolder> {
    private ArrayList<HekamDeneya> mHekamDeneya;

    public class HekamDeneyaViewHolder extends RecyclerView.ViewHolder {
        public TextView hekamTV;

        public HekamDeneyaViewHolder(@NonNull View itemView) {
            super(itemView);
            hekamTV = itemView.findViewById(R.id.hekam_deneya_text_view);
        }
    }

    public HekamDeneyaAdapter(ArrayList<HekamDeneya> hekamArrayList) {
        mHekamDeneya = hekamArrayList;
    }

    @NonNull
    @Override
    public HekamDeneyaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hekam_deneya, parent, false);
        HekamDeneyaAdapter.HekamDeneyaViewHolder HDVH = new HekamDeneyaAdapter.HekamDeneyaViewHolder(v);
        return HDVH;
    }

    @Override
    public void onBindViewHolder(@NonNull HekamDeneyaViewHolder holder, int position) {
        HekamDeneya currentItem = mHekamDeneya.get(position);
        holder.hekamTV.setText(currentItem.getHekamDeneta_textView());
    }

    @Override
    public int getItemCount() {
        return mHekamDeneya.size();
    }


}