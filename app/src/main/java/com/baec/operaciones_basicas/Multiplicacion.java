package com.baec.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacion extends AppCompatActivity {

    EditText txtnumeromulti1, txtnumeromulti2;

    TextView lblresultadomulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
        txtnumeromulti1 = findViewById(R.id.txtnummulti1);
        txtnumeromulti2 = findViewById(R.id.txtnummulti2);
        lblresultadomulti = findViewById(R.id.lblresultadomulti);
    }

    public void multiplicar_numeros(View view){
        int num1 = Integer.parseInt(txtnumeromulti1.getText().toString());
        int num2 = Integer.parseInt(txtnumeromulti2.getText().toString());
        int resultado = num1 * num2;
        lblresultadomulti.setText(resultado+"");
    }
}