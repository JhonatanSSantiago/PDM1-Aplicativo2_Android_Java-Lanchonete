package com.jhonssantiago.applanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageBolo, imageCafe, imagePizza, imageHamburguer;
    private Button buttonFinalizar;
    private TextView textViewResultado;
    private double valores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageBolo = findViewById(R.id.imgBolo);
        imageCafe = findViewById(R.id.imgCafe);
        imagePizza = findViewById(R.id.imgPizza);
        imageHamburguer = findViewById(R.id.imgHamburguer);
        buttonFinalizar = findViewById(R.id.btnFinalizar);
        textViewResultado = findViewById(R.id.textViewResultado);

        Intent it = getIntent();
        if(it!=null){
            double c = it.getDoubleExtra("total", 0);
            valores = valores+c;
        }
    }

    public void clicar(View view) {
        if(view.getId() == R.id.imgBolo){
            Intent it = new Intent(getApplicationContext(), BoloActivity.class);
            it.putExtra("valor", valores);
            startActivity(it);
        }
        if(view.getId() == R.id.imgCafe){
            Intent it = new Intent(getApplicationContext(), CafeActivity.class);
            it.putExtra("valor", valores);
            startActivity(it);
        }
        if(view.getId() == R.id.imgHamburguer){
            Intent it = new Intent(getApplicationContext(), HamburguerActivity.class);
            it.putExtra("valor", valores);
            startActivity(it);
        }
        if(view.getId() == R.id.imgPizza){
            Intent it = new Intent(getApplicationContext(), PizzaActivity.class);
            it.putExtra("valor", valores);
            startActivity(it);
        }
        if(view.getId() == R.id.btnFinalizar){
            textViewResultado.setText(String.valueOf(valores));
        }

    }
}