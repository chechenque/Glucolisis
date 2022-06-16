package com.example.kmeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kmeros.Modelo.Analizador;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    EditText secuencia;
    EditText kmero;
    Button boton;
    Log log;
    Analizador analizador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secuencia = (EditText) findViewById(R.id.secuencia);
        kmero = (EditText) findViewById(R.id.kmero);
        boton = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.resultado);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analizador = new Analizador(""+secuencia.getText(),Integer.parseInt(""+kmero.getText()));
                resultado.setText(analizador.muestraKmeros());
            }
        });



    }
}