package com.example.tugassensorgenap2022akbif_310119119;

//Nama  : Muhammad Hadyan Nur Adabi
//NIM   : 10119119
//Kelas : IF-3

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugassensorgenap2022akbif_310119119.BotNav.DaftarLokasiFragment;
import com.example.tugassensorgenap2022akbif_310119119.BotNav.LokasiPenggunaFragment;
import com.example.tugassensorgenap2022akbif_310119119.BotNav.ProfilFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {



    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ProfilFragment()).commit();
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.nav_profile:
                        selectedFragment = new ProfilFragment();
                        break;
                    case R.id.nav_daftar:
                        selectedFragment = new DaftarLokasiFragment();
                        break;
                    case R.id.nav_lokasi:
                        selectedFragment = new LokasiPenggunaFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();

                return true;
            }
        });
    }
}