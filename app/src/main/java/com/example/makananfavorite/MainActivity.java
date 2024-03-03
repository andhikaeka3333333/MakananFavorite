package com.example.makananfavorite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterListMakanan.ItemClickListener{

    List<ModelMakanan> items;
    RecyclerView recyclerView;

    AdapterListMakanan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvMakananFav);

        items = new ArrayList<ModelMakanan>();

        items.add(new ModelMakanan("Nasi Goreng", "Nasi yang digoreng dengan bumbu spesial dan diberi topping berupa telur maupun ayam." ,  "https://miro.medium.com/v2/resize:fit:670/0*HFS5StgmAiZGwqHd.jpg"));
        items.add(new ModelMakanan("Ayam Goreng", "Ayam yang digoreng dengan bumbu tradisional sehingga menghasilkan cita rasa gurih." , "https://www.astronauts.id/blog/wp-content/uploads/2023/04/Resep-Ayam-Goreng-Serundeng-ala-Rumahan-yang-Nggak-Kalah-Enak-dari-Restoran.jpg"));
        items.add(new ModelMakanan("Bubur Ayam", "Nasi yang dimasak hingga menjadi bubur kemudian diberi suwiran ayam dan berbagai macam topping." , "https://www.sasa.co.id/medias/page_medias/bubur_ayam.jpg"));
        items.add(new ModelMakanan("Bakso","Olahan daging sapi yang memiliki bentuk bulat dengan kuah spesial." , "https://cdn0-production-images-kly.akamaized.net/ZGgx--GJNOoEn4XNmkAXkknlqwk=/800x450/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2763419/original/071857300_1553761217-shutterstock_1148354906.jpg"));
        items.add(new ModelMakanan("Soto Ayam", "Olahan ayam yang disajikan dengan bumbu kuah dan biasanya disajikan dengan nasi.",  "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/17043644/Praktis-dan-Simpel-Ini-Resep-Soto-Ayam-Lamongan-yang-Menggugah-Selera-.jpg"));
        items.add(new ModelMakanan("Cheese Burger", "Daging yang dipadukan dengan keju meleleh menjadikan rasa makanan gurih dan juicy.",  "https://barapigrill.com/wp-content/uploads/2017/07/barachiz-burger-jakarta.jpg"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterListMakanan(items, this);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(MainActivity.this,PreviewProduct.class);
        intent.putExtra("nama",adapter.getItem(position).getNamaMakanan());
        startActivity(intent);
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getNamaMakanan() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}