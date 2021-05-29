package com.example.practica11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RecibirDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos);

        //Localizar los controles
        TextView saludo = (TextView)findViewById(R.id.lblDatoRespuesta);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        Log.d("error",bundle.getString("NOMBRE"));
        //Construimos el mensaje a mostrar
        saludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("NOMBRE"));

    }
}