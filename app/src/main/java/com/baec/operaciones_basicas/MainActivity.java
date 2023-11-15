package com.baec.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edNumero1, edNumero2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNumero1=findViewById(R.id.txtnumero1);
        edNumero2=findViewById(R.id.txtnumero2);
        tvResultado=findViewById(R.id.lblresultado);
    }

    public void sumar_numeros(View view){
        int num1=Integer.parseInt(edNumero1.getText().toString());
        int num2=Integer.parseInt(edNumero2.getText().toString());
        int resultado=num1+num2;
        tvResultado.setText(resultado+"");
    }
}