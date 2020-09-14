package com.ulp.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etDolares;
    private EditText etEuros;
    private RadioButton rbDolares;
    private RadioButton rbEuros;
    private EditText etCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDolares = (EditText) findViewById(R.id.etDolares);
        etEuros = (EditText) findViewById(R.id.etEuros);
        etCambio = (EditText) findViewById(R.id.etCambio);

        rbDolares = (RadioButton)findViewById(R.id.rbDolar);
        rbEuros = (RadioButton)findViewById(R.id.rbEuro);


    }

    // creamos el metodo para convertir

    public void Convertir(View view){

        String dolares = etDolares.getText().toString();
        String euros = etEuros.getText().toString();

        if(rbDolares.isChecked()) {

            double numero1 = Double.parseDouble(dolares); // parseamos los string a int para la suma

            double convertir = numero1 * 1.2;

            String cambio = String.valueOf(convertir);//parseamos de int a String la suma

            etCambio.setText(cambio);

        }else{
            Toast.makeText(this, "Debes Ingresar un Valor .. !", Toast.LENGTH_SHORT).show();
        }
    }

    //


}