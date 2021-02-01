package com.example.vu.android.toolstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.vu.android.R;

import java.net.URI;
import java.util.List;

public class StoreItemAdapter extends RecyclerView.Adapter<StoreItemAdapter.ViewHolder> {


    private Context context;
    private List<StoreItem> list;

    public StoreItemAdapter(Context context, List<StoreItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        StoreItem storeItem = list.get(position);

        holder.textName.setText(storeItem.getName());
        holder.textSKU.setText(String.valueOf(storeItem.getSku()));
        holder.textPrice.setText(String.valueOf(storeItem.getPrice()));
        //holder.imageItem.setImageURI(new URi(String.valueOf(storeItem.getImage())));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textName, textSKU, textPrice;
        public ImageView imageItem;

        public ViewHolder(View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.main_name);
            textSKU = itemView.findViewById(R.id.main_sku);
            textPrice = itemView.findViewById(R.id.main_price);
            imageItem = itemView.findViewById(R.id.main_image);
        }
    }

}
