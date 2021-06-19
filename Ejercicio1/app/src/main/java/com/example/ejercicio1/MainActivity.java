package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nombre = (EditText) findViewById(R.id.txtNombre);
        EditText apellido = (EditText) findViewById(R.id.txtApellido);
        EditText edad = (EditText) findViewById(R.id.txtEdad);
        EditText correo = (EditText) findViewById(R.id.txtCorreo);
        Button btnEnvio = (Button) findViewById(R.id.btnEnvio);

        btnEnvio.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "Información Enviada Satisfactoriamente", Toast.LENGTH_LONG).show();
                Intent pantalla = new Intent(getApplicationContext(), MainActivity2.class);

                int age = Integer.parseInt(edad.getText().toString());

                pantalla.putExtra("nombre", " " + nombre.getText().toString());
                pantalla.putExtra("apellido", " " + apellido.getText().toString());
                pantalla.putExtra("edad", " " + age);
                pantalla.putExtra("correo", " " + correo.getText().toString());
                startActivity(pantalla);
            }
        });

    }
}