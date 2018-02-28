package com.example.kid_d_000.lab16;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contenido> listDatos;
    RecyclerView recycler;
    String [] generos={"Rock","Jazz","Blues","Electrónica","Música Clásica","Funk","Mariachi"};
    String [] titulos={"I Can't Get No satisfaction","PORTRAIT","Dust My Broom","Faded","Für Elise","Flashlight","Bésame Mucho"};
    int [] imagenes={R.drawable.satisfaction,R.drawable.portrait,R.drawable.dust_my_broom,R.drawable.faded,R.drawable.fur_elise,R.drawable.flashlight,R.drawable.besame_mucho};
    int [] colores={Color.rgb(128,128,128),
            Color.rgb(0,0,0),
            Color.rgb(128,0,0),
            Color.rgb(0,128,0),
            Color.rgb(0,128,128),
            Color.rgb(0,0,128),
            Color.rgb(128,0,128)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler=findViewById(R.id.recyclerView);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos=new ArrayList<Contenido>();

        for(int i=0;i<generos.length;i++){
            listDatos.add(new Contenido(generos[i],titulos[i],imagenes[i],colores[i]));
        }

        AdapterDatos adapter=new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);
    }
}
