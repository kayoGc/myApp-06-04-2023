package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomappbar.BottomAppBar;

public class BottomNavActivity extends AppCompatActivity {
    BottomAppBar idBottomappBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_nav_layout);
    }
}