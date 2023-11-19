package com.baec.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends AppCompatActivity {

    EditText txtnumresta1, txtnumresta2;

    TextView lblresultadoresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        txtnumresta1 = findViewById(R.id.txtnumresta1);
        txtnumresta2 = findViewById(R.id.txtnumresta2);
        lblresultadoresta = findViewById(R.id.lblresultadoresta);
    }

    public void resta_numeros(View view){
        int num1 = Integer.parseInt(txtnumresta1.getText().toString());
        int num2 = Integer.parseInt(txtnumresta2.getText().toString());
        int resultado = num1 - num2;
        lblresultadoresta.setText(resultado+"");
    }
}