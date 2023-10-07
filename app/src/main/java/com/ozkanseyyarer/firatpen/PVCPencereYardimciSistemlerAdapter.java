package com.ozkanseyyarer.firatpen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PVCPencereYardimciSistemlerAdapter extends ArrayAdapter<String> {
    private String[] urunler;
    private int[] resimler;
    private int[] fiyatlar;
    private Context context;
    private ImageView imageViewResim;
    private TextView textViewIsim,textViewFiyat;
    public PVCPencereYardimciSistemlerAdapter(@NonNull Context context, String[] urunler, int[] resimler, int[] fiyatlar) {
        super(context,R.layout.pvcpencere_yardimci_sistemler_item,urunler);
        this.urunler = urunler;
        this.resimler = resimler;
        this.fiyatlar = fiyatlar;
        this.context = context;}
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.pvcpencere_yardimci_sistemler_item,null);

        if (v != null){
            imageViewResim = v.findViewById(R.id.imageViewUrun);
            textViewIsim = v.findViewById(R.id.txtUrunIsim);
            textViewFiyat = v.findViewById(R.id.txtUrunFiyat);

            imageViewResim.setBackgroundResource(resimler[position]);
            textViewIsim.setText(urunler[position]);
            textViewFiyat.setText(String.valueOf(fiyatlar[position])+" TL");}
        return v;}}

