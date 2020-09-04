package com.example.test.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;
import com.example.test.models.CitationNight;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CitationNightAdapter extends RecyclerView.Adapter<CitationNightAdapter.citationNightViewHolder> {
    private ArrayList<CitationNight> mCitationNight;

    public static class citationNightViewHolder extends RecyclerView.ViewHolder {
        public TextView citationNight;

        public citationNightViewHolder(View itemView) {
            super(itemView);
            citationNight = itemView.findViewById(R.id.citation_night_text_view);
        }
    }

    public CitationNightAdapter(ArrayList<CitationNight> citationNights) {
        mCitationNight = citationNights;
    }

    @NonNull
    @Override
    public citationNightViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_citation_night, parent, false);
        citationNightViewHolder cnv = new citationNightViewHolder(v);
        return cnv;
    }

    @Override
    public void onBindViewHolder(@NonNull citationNightViewHolder holder, int position) {
        CitationNight currentItemNight = mCitationNight.get(position);
        holder.citationNight.setText(currentItemNight.getCitation_night_text());
    }

    @Override
    public int getItemCount() {
        return mCitationNight.size();
    }
}
