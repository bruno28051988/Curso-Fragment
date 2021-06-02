package com.br.cursofragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.br.cursofragment.R;
import com.br.cursofragment.fragment.ContatosFragment;
import com.br.cursofragment.fragment.CoversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversas, btnContatos;
    private CoversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remover espaço em branco ou sombra do ActionBar
        getSupportActionBar().setElevation(0);

        btnContatos = findViewById(R.id.buttonContatos);
        btnConversas = findViewById(R.id.buttonConversas);

        conversasFragment = new CoversasFragment();

        //Configurar objeto para o Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conversasFragment = new CoversasFragment();

                //Configurar objeto para o Fragmento
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });


    }
}