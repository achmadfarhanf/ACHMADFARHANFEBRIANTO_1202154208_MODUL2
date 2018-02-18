package com.example.android.achmadfarhanfebrianto_1202154208_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class dinein extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int a;
    String pilih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        showSpinner();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "Dine In", Toast.LENGTH_LONG);
        toast.show();
    }
    public void showSpinner(){
        //Membuat SPinner
        Spinner spinner = (Spinner) findViewById(R.id.nomeja);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Membuat Array adapter menggunakan string array dan default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.menu, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        //Memasukan adapter pada spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }
    public void pemesanan(View view) {Context context = getApplicationContext();

        if(a!=0) {
            Intent i = new Intent(this, detailmenu.class);
            startActivity(i);}
        else {
            Toast toast = Toast.makeText(context, "Silahkan Pilih Meja Terlebih Dahulu", Toast.LENGTH_LONG);
            toast.show();

        }
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.pilih = adapterView.getItemAtPosition(i).toString();
        String showToast = this.pilih+"Dapat Dipesan";
        this.a = i;
        if(i!=0) {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, showToast, Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
