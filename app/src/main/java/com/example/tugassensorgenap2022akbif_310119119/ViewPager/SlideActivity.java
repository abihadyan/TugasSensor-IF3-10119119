package com.example.tugassensorgenap2022akbif_310119119.ViewPager;

//Nama  : Muhammad Hadyan Nur Adabi
//NIM   : 10119119
//Kelas : IF-3

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tugassensorgenap2022akbif_310119119.MainActivity;
import com.example.tugassensorgenap2022akbif_310119119.R;

public class SlideActivity extends AppCompatActivity {

    ViewPager viewPager;
    SlideViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        viewPager=findViewById(R.id.viewpager);
        adapter=new SlideViewPagerAdapter(this);
        viewPager.setAdapter(adapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(SlideActivity.this, MainActivity.class);
        startActivity(intent);
    }
}