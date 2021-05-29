package com.example.practica11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDatos (View view){
        //Creamos el Intent para redireccionarme a otra actividad
        Intent intent = new Intent(MainActivity.this, RecibirDatos.class);
        EditText txt_dato_enviar = (EditText)findViewById(R.id.txtDato);
        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        Log.d("error", txt_dato_enviar.getText().toString());
        b.putString("NOMBRE", txt_dato_enviar.getText().toString());
        //Añadimos la información al intent
        intent.putExtras(b);
        startActivity(intent);
    }
}