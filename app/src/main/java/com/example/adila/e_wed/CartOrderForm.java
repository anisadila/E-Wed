package com.example.adila.e_wed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CartOrderForm extends AppCompatActivity {

    private TextView mCheckInvoice;
    private TextView mCheckProduk;
    private TextView mCheckVendor;
    private TextView mCheckKategori;
    private TextView mCheckTgl;
    private TextView mCheckHarga;
    private TextView mCheckLokasi;
    private TextView mCheckKet;
    private TextView mCheckNamaLengkap;
    private TextView mCheckRekening;
    private TextView mCheckHp;
    private TextView mCheckProvinsi;
    private TextView mCheckKota;
    private TextView mCheckAlamat;
    private LinearLayout mBtnConfirmPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_order_form);
        initView();
    }

    private void initView() {
        mCheckInvoice = findViewById(R.id.check_invoice);
        mCheckProduk = findViewById(R.id.check_Produk);
        mCheckVendor = findViewById(R.id.check_vendor);
        mCheckKategori = findViewById(R.id.check_kategori);
        mCheckTgl = findViewById(R.id.check_tgl);
        mCheckHarga = findViewById(R.id.check_harga);
        mCheckLokasi = findViewById(R.id.check_lokasi);
        mCheckKet = findViewById(R.id.check_ket);
        mCheckNamaLengkap = findViewById(R.id.check_namaLengkap);
        mCheckRekening = findViewById(R.id.check_rekening);
        mCheckHp = findViewById(R.id.check_hp);
        mCheckProvinsi = findViewById(R.id.check_provinsi);
        mCheckKota = findViewById(R.id.check_kota);
        mCheckAlamat = findViewById(R.id.check_alamat);
        mBtnConfirmPayment = findViewById(R.id.btn_confirmPayment);

        mBtnConfirmPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PaymentConfirmation.class);
                startActivity(i);
            }
        });
    }
}
