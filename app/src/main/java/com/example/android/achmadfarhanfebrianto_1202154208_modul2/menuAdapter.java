package com.example.android.achmadfarhanfebrianto_1202154208_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Han on 18/02/2018.
 */
public class menuAdapter extends RecyclerView.Adapter<menuAdapter.MyViewHolder> {
    private LayoutInflater mInflater;
    private List<datamenu> detailmenu;


    public menuAdapter(Context context, List<datamenu> detailmenu) {
        mInflater = LayoutInflater.from(context);
        this.detailmenu = detailmenu;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView nama, harga;
        ImageView gambar;

        public MyViewHolder(View view) {
            super(view);

            nama = (TextView) view.findViewById(R.id.namamakanan);
            harga = (TextView) view.findViewById(R.id.harga);
            gambar = (ImageView) view.findViewById(R.id.gambar);
            view.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            String element = detailmenu.get(mPosition).toString();
            Toast.makeText(view.getContext(), nama.getText(), Toast.LENGTH_SHORT).show();
            Intent i = new Intent(view.getContext(), detailmakanan.class);
            int gambar = detailmenu.get(mPosition).getGambar();
            int komposisi = detailmenu.get(mPosition).getKomposisi();
            i.putExtra("gambar", gambar);
            i.putExtra("nama",nama.getText());
            i.putExtra("harga",harga.getText());
            i.putExtra("komposisi",komposisi);
            view.getContext().startActivity(i);

        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_detailmenu, parent, false);

        return new MyViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        datamenu datamenu = detailmenu.get(position);
        holder.gambar.setImageResource(datamenu.getGambar());

        holder.harga.setText(datamenu.getHarga());
        holder.nama.setText(datamenu.getNama());


    }

    @Override
    public int getItemCount() { return detailmenu.size();
    }



}