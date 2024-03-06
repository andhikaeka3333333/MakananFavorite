package com.example.makananfavorite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class PreviewProduct extends AppCompatActivity {
    ImageView ivGambarProduk, ivArrowBack;
    TextView tvNamaProduk;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_preview_product);





        ivGambarProduk = findViewById(R.id.ivGambarProduk);
        ivArrowBack = findViewById(R.id.ivArrowBack);
        tvNamaProduk = findViewById(R.id.tvNamaProduk);



        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");

        switch (nama) {
            case "Nasi Goreng":
                tvNamaProduk.setText("Nasi Goreng");
                Glide.with(this).load("https://miro.medium.com/v2/resize:fit:670/0*HFS5StgmAiZGwqHd.jpg").into(ivGambarProduk);
                break;
            case "Ayam Goreng":
                tvNamaProduk.setText("Ayam Goreng");
                Glide.with(this).load("https://www.astronauts.id/blog/wp-content/uploads/2023/04/Resep-Ayam-Goreng-Serundeng-ala-Rumahan-yang-Nggak-Kalah-Enak-dari-Restoran.jpg").into(ivGambarProduk);
                break;
            case "Bubur Ayam":
                tvNamaProduk.setText("Bubur Ayam");
                Glide.with(this).load("https://www.sasa.co.id/medias/page_medias/bubur_ayam.jpg").into(ivGambarProduk);
                break;
            case "Bakso":
                tvNamaProduk.setText("Bakso");
                Glide.with(this).load("https://cdn0-production-images-kly.akamaized.net/ZGgx--GJNOoEn4XNmkAXkknlqwk=/800x450/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/2763419/original/071857300_1553761217-shutterstock_1148354906.jpg").into(ivGambarProduk);
                break;
            case "Soto Ayam":
                tvNamaProduk.setText("Soto Ayam");
                Glide.with(this).load("https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/17043644/Praktis-dan-Simpel-Ini-Resep-Soto-Ayam-Lamongan-yang-Menggugah-Selera-.jpg").into(ivGambarProduk);
                break;
            case "Cheese Burger":
                tvNamaProduk.setText("Cheese Burger");
                Glide.with(this).load("https://barapigrill.com/wp-content/uploads/2017/07/barachiz-burger-jakarta.jpg").into(ivGambarProduk);
                break;

        }

        ivArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreviewProduct.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });

    }
}