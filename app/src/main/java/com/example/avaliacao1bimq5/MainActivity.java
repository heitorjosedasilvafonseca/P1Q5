package com.example.avaliacao1bimq5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregaTelaPrincipal();
    }
    private void CarregaTelaPrincipal() {
        setContentView(R.layout.activity_main);
        Button btIMC = findViewById(R.id.btIMC);
        Button btConv = findViewById(R.id.btConv);

        btIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregaTelaIMC();
            }
        });

        btConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregaTelaConv();
            }
        });

    }

    private void CarregaTelaIMC () {
        setContentView(R.layout.telaimc);
        Button btVoltarIMC = findViewById(R.id.btVoltarIMC);
        Button btCalculaIMC = findViewById(R.id.btCalculaIMC);

        btVoltarIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregaTelaPrincipal();
            }
        });

        btCalculaIMC.setOnClickListener(new View.OnClickListener() {
            EditText edtAltura = findViewById(R.id.edtAltura);
            EditText edtPeso = findViewById(R.id.edtPeso);
            EditText edtIMC = findViewById(R.id.edtIMC);

            @Override
            public void onClick(View v) {
                double altura = Double.parseDouble(edtAltura.getText().toString());
                double peso = Double.parseDouble(edtPeso.getText().toString());
                altura = altura / 100;
                double imc = (peso / (altura * altura));
                edtIMC.setText(String.valueOf(imc));
            }
        });
    }

    private void CarregaTelaConv () {
        setContentView(R.layout.telaconv);
        Button btVoltarConv = findViewById(R.id.btVoltarConv);
        Button btConverte = findViewById(R.id.btConverte);

        btVoltarConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregaTelaPrincipal();
            }
        });

        btConverte.setOnClickListener(new View.OnClickListener() {
            EditText edtGC = findViewById(R.id.edtGC);
            EditText edtGF = findViewById(R.id.edtGF);

            @Override
            public void onClick(View v) {
                double grausC = Double.parseDouble(edtGC.getText().toString());
                double grausF = ((grausC * 1.8) + 32);
                edtGF.setText(String.valueOf(grausF));
            }
        });


    }
}
