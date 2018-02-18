package com.example.android.achmadfarhanfebrianto_1202154208_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "Take Away", Toast.LENGTH_LONG);
        toast.show();
    }

    public void pilihpesanan(View view) {
        Intent intent = new Intent(this, IsiMenu.class);
        startActivity(intent);
    }
}
