package com.example.maana.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tv1;
    private EditText et1;
    private TextView tv2;
    private EditText et2;
    private EditText editTextResultado;
    private Button s,r,m,d;
    private double num1,num2;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.textViewNum1);
        tv1.setText("Número 1: ");

        et1 = (EditText)findViewById(R.id.editText) ;

        tv2 = (TextView)findViewById(R.id.textViewNum2);
        tv2.setText("Número 2: ");

        et2 = (EditText)findViewById(R.id.editText2);

        s = (Button)findViewById(R.id.sumar);
        s.setOnClickListener(this);
        r = (Button)findViewById(R.id.restar);
        r.setOnClickListener(this);
        m = (Button)findViewById(R.id.multiplicar);
        m.setOnClickListener(this);
        d = (Button)findViewById(R.id.dividir);
        d.setOnClickListener(this);

        editTextResultado = (EditText)findViewById(R.id.editTextResultado);

    }

    public void onClick(View v){
        num1 = Double.parseDouble(et1.getText().toString());
        num2 = Double.parseDouble(et2.getText().toString());

        if(v == s){
            total = num1+num2;
            editTextResultado.setText(Double.toString(total));
        }else if (v==r){
            total = num1-num2;
            editTextResultado.setText(Double.toString(total));
        }else if(v==m){
            total = num1*num2;
            editTextResultado.setText(Double.toString(total));
        }else{
            total = num1/num2;
            editTextResultado.setText(Double.toString(total));
        }
    }
    /*
    public void funcionSumar(View v){
        EditText et1 = (EditText)findViewById(R.id.editText);
        int num1 = Integer.parseInt(et1.getText().toString());
        EditText et2 = (EditText)findViewById(R.id.editText2);
        int num2 = Integer.parseInt(et2.getText().toString());
        int suma = num1 + num2;
        editTextResultado.setText(suma);
    }
    public void funcionRestar(View v){
        EditText num1 = (EditText)findViewById(R.id.editText);
        EditText num2 = (EditText)findViewById(R.id.editText2);
        int suma = (Integer.parseInt(num1.getText().toString())) + (Integer.parseInt(num2.getText().toString()));
        editTextResultado.setText(suma);
    }
    public void funcionMultiplicar(View v){
        EditText num1 = (EditText)findViewById(R.id.editText);
        EditText num2 = (EditText)findViewById(R.id.editText2);
        int suma = (Integer.parseInt(num1.getText().toString())) + (Integer.parseInt(num2.getText().toString()));
        editTextResultado.setText(suma);
    }
    public void funcionDividir(View v){
        EditText num1 = (EditText)findViewById(R.id.editText);
        EditText num2 = (EditText)findViewById(R.id.editText2);
        int suma = (Integer.parseInt(num1.getText().toString())) + (Integer.parseInt(num2.getText().toString()));
        editTextResultado.setText(suma);
    }*/

}

