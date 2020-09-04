package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.AllDoaa;
import com.example.test.models.Roqia;

import java.util.ArrayList;

public class RoqiaAdapter extends RecyclerView.Adapter<RoqiaAdapter.RoqiaViewHolder> {

    private ArrayList<Roqia> roqiaArrayList;

    public static class RoqiaViewHolder extends RecyclerView.ViewHolder {
        public TextView roqiaTexrView;

        public RoqiaViewHolder(View itemView) {
            super(itemView);
            roqiaTexrView = itemView.findViewById(R.id.roqia_text_view);
        }
    }
    public RoqiaAdapter(ArrayList<Roqia> roqias) {
        roqiaArrayList = roqias;
    }


    @NonNull
    @Override
    public RoqiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_roqia, parent, false);
        RoqiaAdapter.RoqiaViewHolder rvh = new RoqiaAdapter.RoqiaViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RoqiaViewHolder holder, int position) {
        Roqia currentItemRoqia = roqiaArrayList.get(position);
        holder.roqiaTexrView.setText(currentItemRoqia.getRoqia_text());
    }

    @Override
    public int getItemCount() {
        return roqiaArrayList.size();
    }


}
