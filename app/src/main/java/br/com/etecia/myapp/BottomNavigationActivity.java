package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {
    BottomNavigationView idBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_naviigation_layout);
        idBottomNavigation = findViewById(R.id.idBottomNavigation);
        idBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.mNavFavorite:
                        Toast.makeText(getApplicationContext(), "Cliquei no favorito", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNavMusic:
                        Toast.makeText(getApplicationContext(), "Cliquei na música", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNavPlace:
                        Toast.makeText(getApplicationContext(), "Cliquei no place", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNavNewsPaper:
                        Toast.makeText(getApplicationContext(), "Cliquei no jornal", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

    }
}