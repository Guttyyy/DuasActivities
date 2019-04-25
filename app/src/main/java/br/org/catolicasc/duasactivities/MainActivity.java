package br.org.catolicasc.duasactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvPokemon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPokemon = findViewById(R.id.lvPokemon);

        final ArrayList<String> pokemons = new ArrayList<>(); //Lista para guardar os pokemons


        pokemons.add("Pikachu");
        pokemons.add("Tokepi");
        pokemons.add("Raychu");
        pokemons.add("Ekans");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                MainActivity.this, android.R.layout.simple_list_item_1, pokemons   //Layout simples que vai mostrar apenas 1 item
        );


        lvPokemon.setAdapter(arrayAdapter); //
        lvPokemon.setOnItemClickListener(new AdapterView.OnItemClickListener() { //Quando clica em um item
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  //pai, quem é a view, qual a posição e qual o id
                Intent intent = new Intent(MainActivity.this, DetailActivity.class); //passar o contexto e qual a activity que eu vou lançar
                intent.putExtra("nome", pokemons.get(position)); //Pega a posição do array que eu clicar
                startActivity(intent);


            }
        });
    }
}
