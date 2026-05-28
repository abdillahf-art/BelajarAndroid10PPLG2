package com.example.belajarandroid10pplg2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListSiswa extends RecyclerView.Adapter<AdapterListSiswa.ViewHolder> {

    private List<SIswaModel> listSiswa;
    private OnItemClickListener listener;
    public interface OnItemClickListener {
        void onItemClick(SIswaModel siswa);
    }

    public AdapterListSiswa(List<SIswaModel> listSiswa, OnItemClickListener listener) {
        this.listSiswa = listSiswa;
        this.listener = listener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvAbsen, tvAlamat;
        ImageView gambar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvSiswa);
            tvAbsen = itemView.findViewById(R.id.tvAbsen);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }

    @NonNull
    @Override
    public AdapterListSiswa.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_siswa_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListSiswa.ViewHolder holder, int position) {

        String nama = listSiswa.get(position).getNama();
        holder.tvNama.setText(nama);

        String absen = listSiswa.get(position).getAbsen();
        holder.tvAbsen.setText(absen);

        String alamat = listSiswa.get(position).getAlamat();
        holder.tvAlamat.setText(alamat);


        int gambar = listSiswa.get(position).getGambar();
        holder.gambar.setImageResource(gambar);

        holder.itemView.setOnClickListener(v -> {
            listener.onItemClick(listSiswa.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }
}