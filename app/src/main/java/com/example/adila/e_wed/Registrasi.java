package com.example.adila.e_wed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Registrasi extends AppCompatActivity {

    private EditText mRegistrasiNama;
    private EditText mRegistrasiHp;
    private EditText mRegistrasiEmail;
    private EditText mRegistrasiKtp;
    private EditText mRegistrasiProvinsi;
    private EditText mRegistrasiKota;
    private EditText mRegistrasiAlamat;
    private LinearLayout mBtnSubmitRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        initView();
    }

    private void initView() {
        mRegistrasiNama = findViewById(R.id.registrasi_nama);
        mRegistrasiHp = findViewById(R.id.registrasi_hp);
        mRegistrasiEmail = findViewById(R.id.registrasi_email);
        mRegistrasiKtp = findViewById(R.id.registrasi_ktp);
        mRegistrasiProvinsi = findViewById(R.id.registrasi_provinsi);
        mRegistrasiKota = findViewById(R.id.registrasi_kota);
        mRegistrasiAlamat = findViewById(R.id.registrasi_alamat);
        mBtnSubmitRegistrasi = findViewById(R.id.btn_submitRegistrasi);

        mBtnSubmitRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
