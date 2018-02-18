package com.example.android.achmadfarhanfebrianto_1202154208_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detailmakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmakanan);

        Intent i = getIntent();
        int gambar = i.getExtras().getInt("gambar");
        String nama = i.getStringExtra("nama");
        String harga = i.getStringExtra("harga");
        int komposisis = i.getExtras().getInt("komposisi");
        ImageView gambarDetail = (ImageView) findViewById(R.id.gambar);
        TextView namaMenu = (TextView) findViewById(R.id.namamakanan);
        TextView hargaMenu = (TextView) findViewById(R.id.hargamakanan);
        TextView komposisi = (TextView) findViewById(R.id.komposisimakanan);


        gambarDetail.setImageResource(gambar);
        namaMenu.setText(nama);
        hargaMenu.setText(harga);
        komposisi.setText(komposisis);}

 }


