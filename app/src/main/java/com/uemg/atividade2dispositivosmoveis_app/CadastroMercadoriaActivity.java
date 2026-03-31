package com.uemg.atividade2dispositivosmoveis_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.uemg.atividade2dispositivosmoveis_app.model.Mercadoria;

public class CadastroMercadoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cadastro_mercadoria);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText codigo = findViewById(R.id.inputCodigoMercadoria);
        EditText nome = findViewById(R.id.inputNomeMercadoria);
        EditText peso = findViewById(R.id.inputPeso);
        Button btnsalvar = findViewById(R.id.btnOkMercadoria);

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(codigo.getText().toString());
                String n = nome.getText().toString();
                double p = Double.parseDouble(peso.getText().toString());

                Mercadoria m = new Mercadoria(c, n, p);
                MainActivity.listaMercadorias.add(m);
            }
        });
    }
}