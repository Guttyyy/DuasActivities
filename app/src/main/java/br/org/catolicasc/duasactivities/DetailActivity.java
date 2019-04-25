package br.org.catolicasc.duasactivities;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvPokemon;


    public void voltar(View view){
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvPokemon = findViewById(R.id.tvPokemon);

        Intent intent = getIntent(); //Não precisa dar New no intent. Ele vai pegar o intent do MainActivity
        tvPokemon.setText(intent.getStringExtra("nome")); //Pegando nome

    }
}
