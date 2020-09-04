package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.Hadeeth;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class HadeethAdapter extends RecyclerView.Adapter<HadeethAdapter.HadeethViewHolder> {
    private ArrayList<Hadeeth> mHadeeth;

    public class HadeethViewHolder extends RecyclerView.ViewHolder {
        public TextView hadeethTV;

        public HadeethViewHolder(@NonNull View itemView) {
            super(itemView);
            hadeethTV = itemView.findViewById(R.id.hadeeth_text_view);
        }
    }

    public HadeethAdapter(ArrayList<Hadeeth> hadeethArrayList) {
        mHadeeth = hadeethArrayList;
    }

    @NonNull
    @Override
    public HadeethViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hadeeth, parent, false);
        HadeethAdapter.HadeethViewHolder HVH = new HadeethAdapter.HadeethViewHolder(v);
        return HVH;
    }

    @Override
    public void onBindViewHolder(@NonNull HadeethViewHolder holder, int position) {
        Hadeeth currentItem = mHadeeth.get(position);
        holder.hadeethTV.setText(currentItem.getHadeeth_textView());
    }

    @Override
    public int getItemCount() {
        return mHadeeth.size();
    }

}