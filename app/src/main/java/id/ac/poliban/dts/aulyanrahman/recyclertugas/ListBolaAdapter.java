package id.ac.poliban.dts.aulyanrahman.recyclertugas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBolaAdapter extends RecyclerView.Adapter<ListBolaAdapter.ListViewHolder> {
    private ArrayList<Bola> listBola;

    public ListBolaAdapter(ArrayList<Bola> list) {
        this.listBola = list;
    }

    @NonNull
    @Override
    public ListBolaAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_bola, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBolaAdapter.ListViewHolder holder, int position) {
        Bola bola = listBola.get(position);
        holder.tvName.setText(bola.getName());
        holder.tvDetail.setText(bola.getDetail());
        Glide.with(holder.itemView.getContext())
                .load(bola.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(holder.itemView.getContext(), BolaDetail.class);
            intent.putExtra("bola", listBola.get(position));
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listBola.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;
        ImageView imgPhoto;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
