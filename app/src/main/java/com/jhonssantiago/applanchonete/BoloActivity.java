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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolo);
        editTextBolo = findViewById(R.id.editTextBolo);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { calcular(); }
        });
    }

    private void calcular(){
        double quantidadeBolo = Double.parseDouble(editTextBolo.getText().toString());
        double total = quantidadeBolo*8.00;
        Intent it = new Intent(getApplicationContext(), MainActivity.class);
        it.putExtra("totalBolo", total);
        startActivity(it);
    }
}