package com.jhonssantiago.applanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HamburguerActivity extends AppCompatActivity {
    private EditText editTextHamburguer;
    private Button btnCalcular;
    double valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburguer);
        editTextHamburguer = findViewById(R.id.editTextHamburguer);
        btnCalcular = findViewById(R.id.btnCalcular);

        Intent it = getIntent();
        if(it!=null){
            valor = it.getDoubleExtra("valor", 0);
        }
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calcular(); }
        });
    }

    private void calcular(){
        double quantidadeHamburguer = Double.parseDouble(editTextHamburguer.getText().toString());
        double total = quantidadeHamburguer*18.00;
        total = total + valor;
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
        it.putExtra("total", total);
        startActivity(it);
    }
}