package com.example.trabalhom22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class tela3 extends AppCompatActivity {


    private TextInputEditText etQuilo;
    private TextInputEditText etLitros;
    private TextInputEditText etData;
    private TextInputEditText etPosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Deu merda2","Fudeo2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        etQuilo = findViewById(R.id.idQuilo);
        etLitros = findViewById(R.id.idLitro);
        etData = findViewById(R.id.idData);
        etPosto = findViewById(R.id.idPosto);

    }

    public void onClickBtnSalvar(View view){

            float Km = Float.parseFloat(etQuilo.getText().toString());
            float litros = Float.parseFloat(etLitros.getText().toString());
            String Data = etData.getText().toString();
            String Posto = etPosto.getText().toString();
            Float autonomia = Km / litros;

        Intent intentSalvar = new Intent(getApplicationContext(), MainActivity.class);

        Bundle parametros = new Bundle();

        parametros.putFloat("chave_km",Km);
        parametros.putFloat("chave_litros",litros);
        parametros.putString("chave_data",Data);
        parametros.putString("chave_posto",Posto);
        parametros.putFloat("chave_auto",autonomia);

        intentSalvar.putExtras(parametros);
        startActivity(intentSalvar);

    }
}
