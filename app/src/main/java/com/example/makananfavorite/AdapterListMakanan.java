package com.example.makananfavorite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterListMakanan extends RecyclerView.Adapter<AdapterListMakanan.ViewHolder> {

    private Context context;
    private List<ModelMakanan> listData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

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
        ModelMakanan items = this.listData.get(position);

        holder.tvMakananFavorite.setText(items.getNamaMakanan());
        holder.tvDeskripsi.setText(items.getDeskripsiMakanan());

        Glide.with(holder.itemView.getContext())
                .load(items.getImage())
                .into(holder.ivImageMakanan);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tvMakananFavorite, tvDeskripsi;
        ImageView ivImageMakanan;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMakananFavorite = itemView.findViewById(R.id.tvNamaMakananFav);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            ivImageMakanan = itemView.findViewById(R.id.ivImageMakanan);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    ModelMakanan getItem(int id) {
        return listData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


}
