package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.Citation;

import java.util.ArrayList;

public class CitationAdapter extends RecyclerView.Adapter<CitationAdapter.CitationViewHolder> {
    private ArrayList<Citation> mCitations;
    public static class CitationViewHolder extends RecyclerView.ViewHolder{
        public TextView citationTv;
        public CitationViewHolder(View itemView){
            super(itemView);
            citationTv = itemView.findViewById(R.id.citation_text_view);
        }
    }
    public CitationAdapter(ArrayList<Citation> citationsList) {
        mCitations = citationsList;
    }
    @Override
    public CitationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ctation, parent, false);
        CitationViewHolder cvh = new CitationViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CitationViewHolder holder, int position) {
        Citation currentItem = mCitations.get(position);
        holder.citationTv.setText(currentItem.getCitation_text());
    }

    @Override
    public int getItemCount() {
        return mCitations.size();
    }


}
