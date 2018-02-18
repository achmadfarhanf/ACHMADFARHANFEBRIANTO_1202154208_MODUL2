package com.example.android.achmadfarhanfebrianto_1202154208_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class IsiMenu extends AppCompatActivity {
    private List<datamenu> detailmenu = new ArrayList<>();
    private RecyclerView recyclerView;
    private menuAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_menu);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new menuAdapter(this, detailmenu);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

    }

    private void prepareMovieData() {
        datamenu datamenu = new datamenu(R.drawable.chicken, "Chicken", "Rp. 16.000", R.string.chicken);
        detailmenu.add(datamenu);
        datamenu = new datamenu (R.drawable.cappucino, "Cappucion", "Rp. 15.000", R.string.cappucino);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.cola, "Cola", "Rp. 10.000", R.string.cola);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.cupcake, "Cup Cake", "Rp. 9.000", R.string.cupcake);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.milkshake, "Milk Shake", "Rp. 12.000", R.string.milkshake);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.mineralwater, "Mineral Water", "Rp. 5.000", R.string.mineralwater);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.pizza, "Pizza", "Rp. 23.000", R.string.pizza);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.spaghetti, "Spaghetti", "Rp. 18.000", R.string.spaghetti);
        detailmenu.add(datamenu);
        datamenu = new datamenu(R.drawable.sprite, "Sprite", "Rp. 7.000", R.string.sprite);
        detailmenu.add(datamenu);


    }

}

