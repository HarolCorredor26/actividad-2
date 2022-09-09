package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textopantalla;
    private Button Boton;
    private TextView Res2,Res3;
    private TextView Res1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textopantalla = findViewById(R.id.editTextTextPersonName2);
        Res1 = findViewById(R.id.res1);

        Boton = findViewById(R.id.sumar);

        Res2 = findViewById(R.id.res2);
        Res3 = findViewById(R.id.res3);



    }
    public void Sumar(View view)
    {

        String suma2 = Res1.getText().toString();
        int Numero = Integer.parseInt(suma2);
        int suma=0;

        for(int i =0; i <= Numero;i++)
            suma += i;

        String res1 = String.valueOf(suma);
        Res3.setText(res1);
        Res2.setText(res1);
        Res1.setText(res1);


    }
}