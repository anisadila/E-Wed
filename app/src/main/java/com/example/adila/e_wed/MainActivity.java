package com.example.adila.e_wed;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.adila.e_wed.Fragment.CartFragment;
import com.example.adila.e_wed.Fragment.ChatFragment;
import com.example.adila.e_wed.Fragment.HomeFragment;
import com.example.adila.e_wed.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigation;
    private ProgressDialog loading;
    private FrameLayout frameLayout;

    private HomeFragment homeFragment;
    private CartFragment cartFragment;
    private ChatFragment chatFragment;
    private ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        navigation = findViewById(R.id.navigation);
        frameLayout = findViewById(R.id.content);

        homeFragment = new HomeFragment();
        cartFragment = new CartFragment();
        chatFragment = new ChatFragment();
        profileFragment = new ProfileFragment();

        setFragment(homeFragment);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        setFragment(homeFragment);
                        return true;
                    case R.id.nav_cart:
                        setFragment(cartFragment);
                        return true;
                    case R.id.nav_chat:
                        setFragment(chatFragment);
                        return true;
                    case R.id.nav_profile:
                        setFragment(profileFragment);
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment);
        fragmentTransaction.commit();
    }
}
