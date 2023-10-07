package com.ozkanseyyarer.firatpen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class PVCPencereSistemleri extends AppCompatActivity {

    private GridView gridView;

    private String[] urunler = {"Selenit 75 Pvc", "Garnet 70", "Garnet 70 Strong"
            , "Garnet 70 Selective", "Garnet 70 Slc Strong","Zenia Slide","Zenia Hebeschiebe","Elegance 80"
    ,"Redonit 85","Giyotin Pencere","Selenit Cover"};
    private int[] resimler = {R.drawable.selenit75pvc, R.drawable.garnet70, R.drawable.garnet70strong
            , R.drawable.garnet70selective,R.drawable.garnet70selectivestrong,R.drawable.zeniaslide
    ,R.drawable.zeniahebeschiebe,R.drawable.elegance80,R.drawable.redonit85,R.drawable.giyotinpencere,
    R.drawable.selenitcover};
    private int[] fiyatlar = {150, 350, 635, 700,785,825,835,855,950,1150,750};

    private PVCPencereSistemleriAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvcpencere_sistemleri);

        gridView = findViewById(R.id.gridView);
        adapter = new PVCPencereSistemleriAdapter(this, urunler, resimler, fiyatlar);
        gridView.setAdapter(adapter);
    }
}