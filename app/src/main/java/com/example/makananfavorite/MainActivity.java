package com.example.makananfavorite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ModelMakanan> items;
    RecyclerView recyclerView;

    AdapterListMakanan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvMakananFav);

        items = new ArrayList<ModelMakanan>();

        items.add(new ModelMakanan("Nasi Goreng", "Nasi yang digoreng dengan bumbu spesial dan diberi topping berupa telur maupun ayam." ,  R.drawable.nasigoreng));
        items.add(new ModelMakanan("Ayam Goreng", "Ayam yang digoreng dengan bumbu tradisional sehingga menghasilkan cita rasa gurih." , R.drawable.ayamgoreng));
        items.add(new ModelMakanan("Bubur Ayam", "Nasi yang dimasak hingga menjadi bubur kemudian diberi suwiran ayam dan berbagai macam topping." ,  R.drawable.buburayam));
        items.add(new ModelMakanan("Bakso","Olahan daging sapi yang memiliki bentuk bulat dengan kuah spesial." , R.drawable.bakso));
        items.add(new ModelMakanan("Soto Ayam", "Olahan ayam yang disajikan dengan bumbu kuah dan biasanya disajikan dengan nasi.",  R.drawable.sotoayam));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterListMakanan(items, this);
        recyclerView.setAdapter(adapter);
    }
}