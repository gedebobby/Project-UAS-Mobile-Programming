package com.example.androstorev2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String datanama="datanama";
    public static final String datagambar="null";
    public static final String dataHarga="dataharga";
    public static final String dataDeskripsi="datadeskripsi";
    public ImageView imgGambar;
    public TextView tvNama;
    public TextView tvHarga;
    public TextView tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_nama);
        tvHarga = findViewById(R.id.tv_harga);
        tvDesc = findViewById(R.id.tv_desc);
        imgGambar = findViewById(R.id.img_menu);

        String data_nama = getIntent().getStringExtra(datanama);
        String data_harga =  getIntent().getStringExtra(dataHarga);
        String data_desc =  getIntent().getStringExtra(dataDeskripsi);
        String data_gambar =  getIntent().getStringExtra(datagambar);

        tvNama.setText(data_nama);
        tvHarga.setText(data_harga);
        tvDesc.setText(data_desc);
        Glide
                .with(this)
                .load(data_gambar)
                .centerCrop()
                .into(imgGambar);

    }
}
