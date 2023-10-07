package com.ozkanseyyarer.firatpen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class PVCKapiSistemleri extends AppCompatActivity {


    private GridView gridView;

    private String[] urunler = {"PVC Balkon Kapısı","Kilitli PVC Kapılar","WC PVC Kapıları"};
    private int[] resimler = {R.drawable.pvcbalkonkapilari,R.drawable.kilitlipvckapilar
    ,R.drawable.wcpvckapilari};
    private int[] fiyatlar = {985,1352,745};

    private PVCKapiSistemleriAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvckapi_sistemleri);


        gridView = findViewById(R.id.gridView);
        adapter = new PVCKapiSistemleriAdapter(this, urunler, resimler, fiyatlar);
        gridView.setAdapter(adapter);
    }
}