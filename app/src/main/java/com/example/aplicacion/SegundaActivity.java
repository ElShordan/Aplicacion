package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class SegundaActivity extends AppCompatActivity {
    private EditText edtTxtSegundaActivityMonto;
    private RadioButton radBtnSegundaActivityDolar;
    private RadioButton radBtnSegundaActivityEuro;
    private RadioButton radBtnSegundaActivityReal;
    private EditText edtTxtSegundaActivityResultado;
    private Button btnSegundaActivityConvertir;
    private Button btnSegundaActivityReiniciar;
    String textoPesos;
    double numeroPesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        edtTxtSegundaActivityMonto = findViewById(R.id.edtTxtSegundaActivityMonto);
        radBtnSegundaActivityDolar = findViewById(R.id.radBtnSegundaActivityDolar);
        radBtnSegundaActivityEuro = findViewById(R.id.radBtnSegundaActivityEuro);
        radBtnSegundaActivityReal = findViewById(R.id.radBtnSegundaActivityReal);
        edtTxtSegundaActivityResultado = findViewById(R.id.edtTxtSegundaActivityResultado);
        btnSegundaActivityConvertir = findViewById(R.id.btnSegundaActivityConvertir);
        btnSegundaActivityReiniciar = findViewById(R.id.btnSegundaActivityReiniciar);

        btnSegundaActivityReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxtSegundaActivityMonto.setText("");
            }
        });

        btnSegundaActivityConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radBtnSegundaActivityReal.isChecked()) {
                    textoPesos = edtTxtSegundaActivityMonto.getText().toString();
                    numeroPesos = Double.parseDouble(textoPesos);

                    double numeroReal = numeroPesos / 17.94;
                    String textoReal = String.valueOf(numeroReal);

                    edtTxtSegundaActivityResultado.setText(textoReal);
                }

                if(radBtnSegundaActivityEuro.isChecked()) {
                    textoPesos = edtTxtSegundaActivityMonto.getText().toString();
                    numeroPesos = Double.parseDouble(textoPesos);

                    double numeroEuro = numeroPesos / 114.99;
                    String textoEuro = String.valueOf(numeroEuro);

                    edtTxtSegundaActivityResultado.setText(textoEuro);
                }

                if(radBtnSegundaActivityDolar.isChecked()) {
                    textoPesos = edtTxtSegundaActivityMonto.getText().toString();
                    numeroPesos = Double.parseDouble(textoPesos);

                    double numeroDolar = numeroPesos / 94.17;
                    String textoDolar = String.valueOf(numeroDolar);

                    edtTxtSegundaActivityResultado.setText(textoDolar);
                }

                if("".equals(edtTxtSegundaActivityMonto.getText().toString())) {
                    textoPesos = "0";
                }
            }
        });
    }
}