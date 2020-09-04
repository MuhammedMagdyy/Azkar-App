package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.AsmaaAllah;
import com.example.test.models.DoaaFromQuran;

import java.util.ArrayList;

public class AsmaaAllahAdapter extends RecyclerView.Adapter<AsmaaAllahAdapter.AsmaaAllahViewHolder> {
    private ArrayList<AsmaaAllah> mAsmaaAllah;

    public static class AsmaaAllahViewHolder extends RecyclerView.ViewHolder {
        public TextView AsmaaAllahTV;

        public AsmaaAllahViewHolder(View itemView) {
            super(itemView);
            AsmaaAllahTV = itemView.findViewById(R.id.asmaa_allah_text_view);
        }
    }

    public AsmaaAllahAdapter(ArrayList<AsmaaAllah> AsmaaAllahArrayList) {
        mAsmaaAllah = AsmaaAllahArrayList;
    }

    @NonNull
    @Override
    public AsmaaAllahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_asmaa_allah, parent, false);
        AsmaaAllahAdapter.AsmaaAllahViewHolder AAVH = new AsmaaAllahAdapter.AsmaaAllahViewHolder(v);
        return AAVH;
    }

    @Override
    public void onBindViewHolder(@NonNull AsmaaAllahViewHolder holder, int position) {
        AsmaaAllah currentItem = mAsmaaAllah.get(position);
        holder.AsmaaAllahTV.setText(currentItem.getAsmaa_allah_textView());
    }

    @Override
    public int getItemCount() {
        return mAsmaaAllah.size();
    }


}
