package com.example.adila.e_wed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    private LinearLayout mLoginGoogle;
    private LinearLayout mLoginPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        mLoginGoogle = findViewById(R.id.login_google);
        mLoginPhone = findViewById(R.id.login_phone);

        mLoginGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Registrasi.class);
                startActivity(i1);
            }
        });
        mLoginPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), Registrasi.class);
                startActivity(i2);
            }
        });
    }
}
