package com.example.makananfavorite;

public class ModelMakanan {
    String namaMakanan, deskripsiMakanan;
    String image;

    public ModelMakanan(String namaMakanan, String deskripsiMakanan, String image) {
        this.namaMakanan = namaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
        this.image = image;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }

    public String getImage() {
        return image;
    }
}
