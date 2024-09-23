package com.example.wastenewgroupapplication.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.wastenewgroupapplication.R;
import com.example.wastenewgroupapplication.databinding.ActivityMainBinding;
import com.example.wastenewgroupapplication.fragments.AboutusFragment;
import com.example.wastenewgroupapplication.fragments.HomeFragment;
import com.example.wastenewgroupapplication.fragments.ProfileFragment;
import com.example.wastenewgroupapplication.fragments.RecycleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        binding.bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        //switch (item.getItemId()) {
        if (item.getItemId() == R.id.home) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new HomeFragment())
                    .commit();
            return true;
        }
        if (item.getItemId() == R.id.recycle) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new RecycleFragment())
                    .commit();
            return true;
        }
        if (item.getItemId() == R.id.profile) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new ProfileFragment())
                    .commit();
            return true;
        }
        if (item.getItemId() == R.id.aboutus) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new AboutusFragment())
                    .commit();
            return true;
        }
        return false;
    }
}