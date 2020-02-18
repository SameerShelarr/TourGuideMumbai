package com.example.tourguide_mumbai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        CustomFragmentPagerAdapter customFragmentPagerAdapter = new CustomFragmentPagerAdapter(MainActivity.this, getSupportFragmentManager());
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        viewPager.setAdapter(customFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}