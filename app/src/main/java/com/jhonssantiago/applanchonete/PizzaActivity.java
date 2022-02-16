package com.jhonssantiago.applanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PizzaActivity extends AppCompatActivity {
    private EditText editTextPizza;
    private Button btnCalcular;
    double valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        editTextPizza = findViewById(R.id.editTextPizza);
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
        double quantidadePizza = Double.parseDouble(editTextPizza.getText().toString());
        double total = quantidadePizza*20.00;
        total = total + valor;
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
        it.putExtra("total", total);
        startActivity(it);
    }
}