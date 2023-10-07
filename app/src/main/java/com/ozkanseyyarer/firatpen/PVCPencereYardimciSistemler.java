package com.ozkanseyyarer.firatpen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class PVCPencereYardimciSistemler extends AppCompatActivity {
    private GridView gridView;

    private String[] urunler = {"Panjur Sistemi Çİft Kanatlı","Kepenkler","Sineklik"};
    private int[] resimler = {R.drawable.panjur1,R.drawable.panjur2,R.drawable.kepenk,R.drawable.sineklik};
    private int[] fiyatlar = {1350,750,1945,1000};

    private PVCPencereYardimciSistemlerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvcpencere_yardimci_sistemler);

        gridView = findViewById(R.id.gridView);
        adapter = new PVCPencereYardimciSistemlerAdapter(this, urunler, resimler, fiyatlar);
        gridView.setAdapter(adapter);
    }
}