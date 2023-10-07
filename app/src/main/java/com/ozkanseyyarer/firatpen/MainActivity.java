package com.ozkanseyyarer.firatpen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnPvcPencere,btnPvcKapi, btnAcilimSecenekleri,btnYardimciSistemler;

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPvcPencere = findViewById(R.id.activity_main_btnPVCPencereSistemleri);
        btnPvcKapi = findViewById(R.id.activity_main_btnPVCKapiSistemleri);
        btnAcilimSecenekleri = findViewById(R.id.activity_main_btnAcilimSeceneklerineGorePVCPencereSecenekleri);
        btnYardimciSistemler = findViewById(R.id.activity_main_btnPVCPencereYardimciSistemler);


        btnPvcPencere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,PVCPencereSistemleri.class);
                startActivity(intent);
            }
        });


        btnPvcKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,PVCKapiSistemleri.class);
                startActivity(intent);
            }
        });


        btnAcilimSecenekleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,AcilimSeceneklerineGorePVCPencereSistemleri.class);
                startActivity(intent);
            }
        });


        btnYardimciSistemler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,PVCPencereYardimciSistemler.class);
                startActivity(intent);
            }
        });
    }
}