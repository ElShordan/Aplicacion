package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrimeraActivity extends AppCompatActivity {
    private TextView txtPrimeraActivityNumero;
    private Button btnPrimeraActivitySumar, btnPrimeraActivityRestar;
    private Button btnPrimeraActivityZoomMas, btnPrimeraActivityZoomMenos;
    private Button btnPrimeraActivityOcultar;
    private Button btnPrimeraActivityReset;
    private int cantidad = 0;
    private int cantidad_tamanio = 34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera);

        txtPrimeraActivityNumero = findViewById(R.id.txtPrimeraActivityNumero);
        btnPrimeraActivitySumar = findViewById(R.id.btnPrimeraActivitySumar);
        btnPrimeraActivityRestar = findViewById(R.id.btnPrimeraActivityRestar);
        btnPrimeraActivityZoomMas = findViewById(R.id.btnPrimeraActivityZoomMas);
        btnPrimeraActivityZoomMenos = findViewById(R.id.btnPrimeraActivityZoomMenos);
        btnPrimeraActivityOcultar = findViewById(R.id.btnPrimeraActivityOcultar);
        btnPrimeraActivityReset = findViewById(R.id.btnPrimeraActivityReset);

        btnPrimeraActivityReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidad = 0;

                txtPrimeraActivityNumero.setText("" + cantidad);
            }
        });

        btnPrimeraActivityOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtPrimeraActivityNumero.getVisibility() == View.VISIBLE) {
                    txtPrimeraActivityNumero.setVisibility(View.INVISIBLE);
                }
                else
                {
                    txtPrimeraActivityNumero.setVisibility(View.VISIBLE);
                }
            }
        });

        btnPrimeraActivityZoomMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPrimeraActivityNumero.getTextSize();

                cantidad_tamanio--;

                if(cantidad_tamanio < 11) cantidad_tamanio = 10;

                txtPrimeraActivityNumero.setTextSize(cantidad_tamanio);
            }
        });

        btnPrimeraActivityZoomMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPrimeraActivityNumero.getTextSize();

                cantidad_tamanio++;

                txtPrimeraActivityNumero.setTextSize(cantidad_tamanio);
            }
        });

        btnPrimeraActivityRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPrimeraActivityNumero.getText().toString();

                cantidad--;

                if(cantidad < 1) cantidad = 0;

                txtPrimeraActivityNumero.setText("" + cantidad);
            }
        });

        btnPrimeraActivitySumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPrimeraActivityNumero.getText().toString();

                cantidad++;

                txtPrimeraActivityNumero.setText("" + cantidad);
            }
        });
    }
}