package com.ozkanseyyarer.firatpen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class AcilimSeceneklerineGorePVCPencereSistemleri extends AppCompatActivity {
    private GridView gridView;

    private String[] urunler = {"Çek Aç Sürme Sistemleri",
    "Çek Aç Sürme Sistemleri","Akordiyon Kapı ve Katlanır Pvc Pencere Sistemleri","Pivot PVC Pencereler",
    "Tek Açılım PVC Pencere","Çift Açılım PVC Pencere","Vasistas Açılım PVC Pencereler",
    "Çift Kanat Açılım Pencereler"};
    private int[] resimler = {R.drawable.cekacsurmesistemleri,R.drawable.cekacsurmesistemleri2,
    R.drawable.ardiyonkapi,R.drawable.pivotpencere,R.drawable.tekacilim,R.drawable.ciftacilimpencere,
    R.drawable.vasistaspencere,R.drawable.ciftkanatpencere};
    private int[] fiyatlar = {2453,2453,4125,1245,1200,1500,1850,1850};

    private AcilimSeceneklerineGorePVCPencereSecenekleriAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acilim_seceneklerine_gore_pvcpencere_sistemleri);



        gridView = findViewById(R.id.gridView);
        adapter = new AcilimSeceneklerineGorePVCPencereSecenekleriAdapter(this, urunler, resimler, fiyatlar);
        gridView.setAdapter(adapter);
    }
}