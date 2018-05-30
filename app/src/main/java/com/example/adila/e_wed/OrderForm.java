package com.example.adila.e_wed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class OrderForm extends AppCompatActivity {

    private EditText mOrderNama;
    private EditText mOrderTgl;
    private EditText mOrderHarga;
    private EditText mOrderLokasi;
    private EditText mOrderKeterangan;
    private LinearLayout mBtnContinueCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

        initView();
    }

    private void initView() {
        mOrderNama = findViewById(R.id.order_nama);
        mOrderTgl = findViewById(R.id.order_tgl);
        mOrderHarga = findViewById(R.id.order_harga);
        mOrderLokasi = findViewById(R.id.order_lokasi);
        mOrderKeterangan = findViewById(R.id.order_keterangan);
        mBtnContinueCheck = findViewById(R.id.btn_continueCheck);

        mBtnContinueCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), CheckOrderForm.class);
                startActivity(i);
            }
        });
    }
}
