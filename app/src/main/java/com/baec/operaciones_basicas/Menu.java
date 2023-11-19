package com.baec.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnsumar, btnrestar, btnmultiplicar, btndividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnsumar = findViewById(R.id.btnsumar);
        btnrestar = findViewById(R.id.btnrestar);
        btnmultiplicar = findViewById(R.id.btnmultiplicar);
        btndividir = findViewById(R.id.btndividir);

        btnsumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Resta.class);
                startActivity(intent);
            }
        });
        btnmultiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Multiplicacion.class);
                startActivity(intent);
            }
        });
        btndividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Division.class);
                startActivity(intent);
            }
        });
    }
}