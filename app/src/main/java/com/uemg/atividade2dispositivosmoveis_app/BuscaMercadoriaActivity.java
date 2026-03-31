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

import com.uemg.atividade2dispositivosmoveis_app.model.Mercadoria;

public class BuscaMercadoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.busca_mercadoria);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        EditText inputBuscaMercadoria = findViewById(R.id.inputBuscaMercadoria);
        TextView outputBuscaMercadoria = findViewById(R.id.outputBuscaMercadoria);
        Button btnBuscaMercadoria = findViewById(R.id.btnBuscaMercadoria);
        Button btnvoltar = findViewById(R.id.btnVoltarBM);

        btnBuscaMercadoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeMercadoria = inputBuscaMercadoria.getText().toString();
                if (!nomeMercadoria.isBlank()) {
                    for (Mercadoria m : MainActivity.listaMercadorias) {
                        if (m.getNome().equalsIgnoreCase(nomeMercadoria)) {
                            outputBuscaMercadoria.setText(m.toString());
                            return;
                        }
                    }
                }
            }
        });

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(BuscaMercadoriaActivity.this, MainActivity.class);
                startActivity(MainActivity);
                finish();
            }
        });
    }
}