package com.uemg.atividade2dispositivosmoveis_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.uemg.atividade2dispositivosmoveis_app.model.Mercadoria;
import com.uemg.atividade2dispositivosmoveis_app.model.Servico;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Mercadoria> listaMercadorias = new ArrayList<>();
    public static ArrayList<Servico> listaServicos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnCadastraMercadoria = findViewById(R.id.btnCadastraMercadoria);
        Button btnCadastraServico = findViewById(R.id.btnCadastraServico);
        Button btnBuscarMercadoria = findViewById(R.id.btnBuscarMercadoria);
        Button btnBuscarServico = findViewById(R.id.btnBuscarServico);
        Button btnSair = findViewById(R.id.btnSair);

        btnCadastraMercadoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CadastroMercadoria = new Intent(MainActivity.this, CadastroMercadoriaActivity.class);
                startActivity(CadastroMercadoria);
                finish();
            }
        });

        btnCadastraServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CadastroServico = new Intent(MainActivity.this, CadastroServicoActivity.class);
                startActivity(CadastroServico);
                finish();
            }
        });

        btnBuscarMercadoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuscaMercadoria = new Intent(MainActivity.this, BuscaMercadoriaActivity.class);
                startActivity(BuscaMercadoria);
                finish();
            }
        });

        btnBuscarServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuscaServico = new Intent(MainActivity.this, BuscaServicoActivity.class);
                startActivity(BuscaServico);
                finish();
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }
}