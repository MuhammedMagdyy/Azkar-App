package com.example.test.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.test.R;

public class SectionsActivity extends AppCompatActivity {
    private Button btnSabah, btnMasaa, btnAllah, btnDoaa, btnRoqia,
            DoaafromQuranBtn, asmaaAllahBtn, SonnaBtn, hadeethBtn,
            HekamBtn, ahkamBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sections);
        btnSabah = findViewById(R.id.sabahBtn);
        btnMasaa = findViewById(R.id.masaaBtn);
        btnAllah = findViewById(R.id.AllahBtn);
        btnDoaa = findViewById(R.id.DoaaBtn);
        btnRoqia = findViewById(R.id.roqiaBtn);
        DoaafromQuranBtn = findViewById(R.id.DoaaFromQuranBtn);
        asmaaAllahBtn = findViewById(R.id.asmaa_allah_btn);
        SonnaBtn = findViewById(R.id.sonna_nabawya_btn);
        hadeethBtn = findViewById(R.id.hadeeth_btn);
        HekamBtn = findViewById(R.id.hekam_deneya_btn);
        ahkamBtn = findViewById(R.id.ahkam_tajweed_btn);

        btnSabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        btnMasaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, CitationNightActivity.class);
                startActivity(intent);
            }
        });

        btnRoqia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, RoqiaActivity.class);
                startActivity(intent);
            }
        });

        btnDoaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, AllDoaaActivity.class);
                startActivity(intent);
            }
        });
        DoaafromQuranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, DoaaFromQuranActivity.class);
                startActivity(intent);
            }
        });


        btnAllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        asmaaAllahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, AsmaaAllahActivity.class);
                startActivity(intent);
            }
        });


        SonnaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, SonnaNabawyaActivity.class);
                startActivity(intent);
            }
        });


        hadeethBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, HadeethActivity.class);
                startActivity(intent);
            }
        });


        HekamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, HekamDeneyaActivity.class);
                startActivity(intent);
            }
        });

        ahkamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SectionsActivity.this, AhkamTajweedActivity.class);
                startActivity(intent);
            }
        });

    }
}