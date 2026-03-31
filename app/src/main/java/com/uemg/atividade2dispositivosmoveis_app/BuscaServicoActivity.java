package com.uemg.atividade2dispositivosmoveis_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.uemg.atividade2dispositivosmoveis_app.model.Servico;

public class BuscaServicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.busca_servico);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText inputBuscaServico = findViewById(R.id.inputBuscaServico);
        Button btnBuscaServico = findViewById(R.id.btnBuscaServico);
        TextView outputBuscaServico = findViewById(R.id.outputBuscaServico);
        Button btnvoltar = findViewById(R.id.btnVoltarBS);


        btnBuscaServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeServico = inputBuscaServico.getText().toString();
                if (!nomeServico.isBlank()) {
                    for (Servico s : MainActivity.listaServicos) {
                        if (s.getNome().equalsIgnoreCase(nomeServico)) {
                            outputBuscaServico.setText(s.toString());
                            return;
                        }
                    }
                }
            }
        });

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(BuscaServicoActivity.this, MainActivity.class);
                startActivity(MainActivity);
                finish();
            }
        });
    }
}