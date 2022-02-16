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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        editTextPizza = findViewById(R.id.editTextPizza);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calcularPizza(); }
        });
    }

    private void calcularPizza(){
        double quantidadePizza = Double.parseDouble(editTextPizza.getText().toString());
        double total = quantidadePizza*20.00;
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
        it.putExtra("totalPizza", total);
        startActivity(it);
    }
}