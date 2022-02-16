package com.jhonssantiago.applanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BoloActivity extends AppCompatActivity {
    private EditText editTextBolo;
    private Button btnCalcular;
    double valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolo);
        editTextBolo = findViewById(R.id.editTextBolo);
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
        double quantidadeBolo = Double.parseDouble(editTextBolo.getText().toString());
        double total = quantidadeBolo*8.00;
        total = total + valor;
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
        it.putExtra("total", total);
        startActivity(it);
    }
}