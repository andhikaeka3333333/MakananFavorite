package com.example.makananfavorite;

public class ModelMakanan {
    String nama, deskripsi;
    int image;

    public ModelMakanan(String nama, String deskripsi, int image) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getImage() {
        return image;
    }
}
