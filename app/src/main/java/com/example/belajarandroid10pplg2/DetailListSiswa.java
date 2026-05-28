package com.example.belajarandroid10pplg2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailListSiswa extends AppCompatActivity {
    TextView txtNama, txtAbsen, txtAlamat, txtDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_list_siswa);

        txtNama = findViewById(R.id.txtNama);
        txtAbsen = findViewById(R.id.txtAbsen);
        txtAlamat = findViewById(R.id.txtAlamat);
        txtDetail = findViewById(R.id.txtDetail);


        String nama = getIntent().getStringExtra("nama");
        String absen = getIntent().getStringExtra("absen");
        String alamat = getIntent().getStringExtra("alamat");
        String detail = getIntent().getStringExtra("detail");


        txtNama.setText(nama);
        txtAbsen.setText("Absen: " + absen);
        txtAlamat.setText("Alamat: " + alamat);
        txtDetail.setText(detail);

    }
}