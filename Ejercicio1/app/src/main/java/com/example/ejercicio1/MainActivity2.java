package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnVolver = (Button) findViewById(R.id.btnVolver);
        EditText nombre = (EditText) findViewById(R.id.txtNombre2);
        EditText apellido = (EditText) findViewById(R.id.txtApellido2);
        EditText edad = (EditText) findViewById(R.id.txtEdad2);
        EditText correo = (EditText) findViewById(R.id.txtCorreo2);
        nombre.setKeyListener(null);
        apellido.setKeyListener(null);
        edad.setKeyListener(null);
        correo.setKeyListener(null);

        Intent intent = getIntent();
        String nomb = intent.getStringExtra("nombre");
        String apell = intent.getStringExtra("apellido");
        String age = intent.getStringExtra("edad");
        String email = intent.getStringExtra("correo");
        nombre.setText("" + nomb);
        apellido.setText("" + apell);
        edad.setText("" + age);
        correo.setText("" + email);


        btnVolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantalla);
            }
        });

    }
}