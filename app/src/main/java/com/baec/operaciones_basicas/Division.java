package com.baec.operaciones_basicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {

    EditText txtnumdiv1, txtnumdiv2;

    TextView lblresultadodiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        txtnumdiv1=findViewById(R.id.txtnumdiv1);
        txtnumdiv2=findViewById(R.id.txtnumdiv2);
        lblresultadodiv=findViewById(R.id.lblresultadodivision);
    }
    public void dividir_numeros(View view){
        double num1 = Double.parseDouble(txtnumdiv1.getText().toString());
        double num2 = Double.parseDouble(txtnumdiv2.getText().toString());
        double resultado = num1 / num2;
        lblresultadodiv.setText(resultado+"");
    }
}