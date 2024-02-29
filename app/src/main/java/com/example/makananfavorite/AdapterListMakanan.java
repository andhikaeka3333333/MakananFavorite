package com.example.makananfavorite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListMakanan extends RecyclerView.Adapter<AdapterListMakanan.ViewHolder> {

    private List<ModelMakanan> listData;
    private LayoutInflater mInflater;

    public AdapterListMakanan(List<ModelMakanan> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterListMakanan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListMakanan.ViewHolder holder, int position) {
        final ModelMakanan items = this.listData.get(position);

        holder.tvMakananFavorite.setText(items.getNama());
        holder.tvDeskripsi.setText(items.getDeskripsi());
        holder.ivImageMakanan.setImageResource(items.getImage());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvMakananFavorite, tvDeskripsi;
        ImageView ivImageMakanan;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakananFavorite = itemView.findViewById(R.id.tvNamaMakananFav);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            ivImageMakanan = itemView.findViewById(R.id.ivImageMakanan);

        }
    }
}
