package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.AsmaaAllah;
import com.example.test.models.SonnaNabawya;

import java.util.ArrayList;

public class SonnaNabawyaAdapter extends RecyclerView.Adapter<SonnaNabawyaAdapter.SonnaNabawyaViewHolder> {
    private ArrayList<SonnaNabawya> mSonnaNabawya;

    public static class SonnaNabawyaViewHolder extends RecyclerView.ViewHolder {
        public TextView SonnaNabawya;

        public SonnaNabawyaViewHolder(View itemView) {
            super(itemView);
            SonnaNabawya = itemView.findViewById(R.id.sonna_nabawya_text_view);
        }
    }

    public SonnaNabawyaAdapter(ArrayList<SonnaNabawya> sonnaNabawyas) {
        mSonnaNabawya = sonnaNabawyas;
    }

    @NonNull
    @Override
    public SonnaNabawyaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sonna_nabawya, parent, false);
        SonnaNabawyaAdapter.SonnaNabawyaViewHolder SNVH = new SonnaNabawyaAdapter.SonnaNabawyaViewHolder(v);
        return SNVH;
    }

    @Override
    public void onBindViewHolder(@NonNull SonnaNabawyaViewHolder holder, int position) {
        SonnaNabawya currentItem = mSonnaNabawya.get(position);
        holder.SonnaNabawya.setText(currentItem.getSonna_nabawya_textView());
    }

    @Override
    public int getItemCount() {
        return mSonnaNabawya.size();
    }

}
