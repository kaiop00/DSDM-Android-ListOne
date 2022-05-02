package com.example.inicioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private Object savedInstanceState;
    private static String[] OPCOES = new String[]{"sim", "nao",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView opcoes = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextopcoes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, OPCOES);
        opcoes.setAdapter(adapter);

        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music);
        Button abrirOutraTela = findViewById(R.id.activity_main_btn_AbrirOutraTela);

        abrirOutraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outraTela = new Intent(MainActivity.this, SegundaTelaProject.class);
                startActivity(outraTela);
                mediaPlayer.start();
            }

        });
    }
}
