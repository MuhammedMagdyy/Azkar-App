package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.test.R;
import com.example.test.models.AhkamTajweed;
import com.example.test.models.AllDoaa;

import java.util.ArrayList;
import java.util.List;

public class AhkamTajweedAdapter extends RecyclerView.Adapter<AhkamTajweedAdapter.AhkamTajweedViewHolder> {
    private ArrayList<AhkamTajweed> mAhkamTajweed;

    public class AhkamTajweedViewHolder extends RecyclerView.ViewHolder {
        public TextView ahkamTEXTVIEW;

        public AhkamTajweedViewHolder(@NonNull View itemView) {
            super(itemView);
            ahkamTEXTVIEW = itemView.findViewById(R.id.ahkam_tajweed_text_view);
        }
    }

    public AhkamTajweedAdapter(ArrayList<AhkamTajweed> arrayListAhkam) {
        mAhkamTajweed = arrayListAhkam;
    }

    @NonNull
    @Override
    public AhkamTajweedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ahkam_tajweed, parent, false);
        AhkamTajweedAdapter.AhkamTajweedViewHolder ATVH = new AhkamTajweedAdapter.AhkamTajweedViewHolder(v);
        return ATVH;
    }

    @Override
    public void onBindViewHolder(@NonNull AhkamTajweedViewHolder holder, int position) {
        AhkamTajweed currentItemAllDoaa = mAhkamTajweed.get(position);
        holder.ahkamTEXTVIEW.setText(currentItemAllDoaa.getAhkamTV());
    }

    @Override
    public int getItemCount() {
        return mAhkamTajweed.size();
    }


}