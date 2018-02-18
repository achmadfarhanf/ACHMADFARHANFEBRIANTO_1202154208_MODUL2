package com.example.android.achmadfarhanfebrianto_1202154208_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    String next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "FARHAN_1202154208", Toast.LENGTH_LONG); //memunculkan toast yang berisikan FARHAN_1202154208
        toast.show();
    }

    public void dinein(View view) {
        this.next = "Dine In";
    }

    public void takeaway(View view) {
        this.next = "Take Away";
    }

    public void pesanmakanan(View view) {
        if(this.next == "Dine In"){ //saat if berhasil dijalankan dia akan menuju activity dine in
            Intent i = new Intent(this, dinein.class);
            startActivity(i);

        }else if(this.next == "Take Away"){ //saat if berhasil dijalankan dia akan menuju activity take away
            Intent i = new Intent(this, takeaway.class);
            startActivity(i);
        }else{
            Context context = getApplicationContext(); //saat tidak melakukan aktivitas lalu memencet button makan akan muncul tulisan Data Anda Salah
            Toast toast = Toast.makeText(context, "Data anda salah", Toast.LENGTH_LONG);
            toast.show();

        }
    }
}
