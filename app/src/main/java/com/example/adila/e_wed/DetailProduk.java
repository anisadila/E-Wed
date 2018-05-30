package com.example.adila.e_wed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailProduk extends AppCompatActivity {

    private TextView mDetailProdukNama;
    private TextView mDetailProdukHarga;
    private TextView mDetailProdukLokasi;
    private LinearLayout mBtnOrder;
    private LinearLayout mBtnChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        initView();
    }

    private void initView() {
        mDetailProdukNama = findViewById(R.id.detail_produk_nama);
        mDetailProdukHarga = findViewById(R.id.detail_produk_harga);
        mDetailProdukLokasi = findViewById(R.id.detail_produk_lokasi);
        mBtnOrder = findViewById(R.id.btn_order);
        mBtnChat = findViewById(R.id.btn_chat);

        mBtnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), OrderForm.class);
                startActivity(i);
            }
        });
    }
}
