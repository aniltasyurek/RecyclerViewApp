package com.aniltasyurek.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Filmler> filmlerArrayList;
    private FilmAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        Filmler f1 = new Filmler(1,"avengers","avengers",12.99);

        Filmler f2 = new Filmler(2,"harrypotter","harrypotter",10.99);

        Filmler f3 = new Filmler(3,"interstellar","interstellar",29.99);

        Filmler f4 = new Filmler(4,"planetoftheapes","planetoftheapes",5.99);

        Filmler f5 = new Filmler(5,"themazerunner","themazerunner",11.99);

        filmlerArrayList = new ArrayList<>();
        filmlerArrayList.add(f1);
        filmlerArrayList.add(f2);
        filmlerArrayList.add(f3);
        filmlerArrayList.add(f4);
        filmlerArrayList.add(f5);

        adapter = new FilmAdapter(this,filmlerArrayList);
        rv.setAdapter(adapter);
    }
}