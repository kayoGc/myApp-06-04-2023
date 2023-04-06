package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    // Declarar a variavel global da toolbar;
    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // declarar o xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        // colocar ação de clique no menu
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei aqui", Toast.LENGTH_SHORT).show();
            }
        });

        // Criando o clique nos itens de menu
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mFavorito:
                        // abrindo a janela do bottomAppBar
                        startActivity(new Intent(getApplicationContext(), BottomNavActivity.class));
                        break;
                    case R.id.mCompartilhar:
                        Toast.makeText(getApplicationContext(), "Cliquei no compartilhar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPesquisar:
                        Toast.makeText(getApplicationContext(), "Cliquei em pesquisar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNotificação:
                        Toast.makeText(getApplicationContext(), "Cliquei nas notificações", Toast.LENGTH_SHORT).show();
                        break;

                }

                return false;
            }
        });
    }
}