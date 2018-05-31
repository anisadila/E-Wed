package com.example.adila.e_wed.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.adila.e_wed.About;
import com.example.adila.e_wed.FAQ;
import com.example.adila.e_wed.MainActivity;
import com.example.adila.e_wed.R;
import com.example.adila.e_wed.TermsConditions;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    View view;

    private EditText mProfileNama;
    private EditText mProfileHp;
    private EditText mProfileEmail;
    private EditText mProfileKtp;
    private EditText mProfileRekening;
    private EditText mProfileProvinsi;
    private EditText mProfileKota;
    private EditText mProfileAlamat;
    private LinearLayout mBtnSigninVendor;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_profile, container, false);
        initView();
        setHasOptionsMenu(true);
        return view;
    }

    private void initView() {
        mProfileNama = view.findViewById(R.id.profile_nama);
        mProfileHp = view.findViewById(R.id.profile_hp);
        mProfileEmail = view.findViewById(R.id.profile_email);
        mProfileKtp = view.findViewById(R.id.profile_ktp);
        mProfileRekening = view.findViewById(R.id.profile_rekening);
        mProfileProvinsi = view.findViewById(R.id.profile_provinsi);
        mProfileKota = view.findViewById(R.id.profile_kota);
        mProfileAlamat = view.findViewById(R.id.profile_alamat);
        mBtnSigninVendor = view.findViewById(R.id.btn_signinVendor);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_item, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_faq:
                Intent i1 = new Intent(getContext(), FAQ.class);
                startActivity(i1);
                break;
            case R.id.menu_term:
                Intent i2 = new Intent(getContext(), TermsConditions.class);
                startActivity(i2);
                break;
            case R.id.menu_about:
                Intent i3 = new Intent(getContext(), About.class);
                startActivity(i3);
                break;
            case R.id.menu_signout:
//                session.clearSession();
                Intent i4 = new Intent(getContext(), MainActivity.class);
                startActivity(i4);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
