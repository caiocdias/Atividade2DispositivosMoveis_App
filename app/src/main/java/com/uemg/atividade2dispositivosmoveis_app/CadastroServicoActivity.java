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

public class CadastroServicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cadastro_servico);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText codigo = findViewById(R.id.inputCodigoServico);
        EditText nome = findViewById(R.id.inputNomeServico);
        EditText valorHora = findViewById(R.id.inputValor);
        TextView output = findViewById(R.id.outputCadastroServico);
        Button btnsalvar = findViewById(R.id.btnOkServico);
        Button btnvoltar = findViewById(R.id.btnVoltarCS);

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int c = Integer.parseInt(codigo.getText().toString());
                    String n = nome.getText().toString();
                    double v = Double.parseDouble(valorHora.getText().toString());

                    Servico s = new Servico(c, n, v);
                    MainActivity.listaServicos.add(s);

                    output.setText("Mercadoria cadastrada com sucesso!");

                    codigo.setText("");
                    nome.setText("");
                    valorHora.setText("");

                } catch (Exception e) {
                    output.setText("Erro ao cadastrar!");
                }
            }
        });

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(CadastroServicoActivity.this, MainActivity.class);
                startActivity(MainActivity);
                finish();
            }
        });
    }
}