package com.example.belajarandroid10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSiswa extends AppCompatActivity {

    RecyclerView rvListSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_siswa);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListSiswa = findViewById(R.id.rvListSiswa);

        ArrayList<SIswaModel> ListDataSiswa = new ArrayList<>();

        ListDataSiswa.add(new SIswaModel("Albay","1","Jati", R.drawable.dummy, "ini detail profil Albay"));
        ListDataSiswa.add(new SIswaModel("Abdillah","2","Ngembal", R.drawable.dummy,"ini detail profil Abdillah"));
        ListDataSiswa.add(new SIswaModel("Zizo","3","Mayong", R.drawable.dummy,"ini detail profil Zizo"));
        ListDataSiswa.add(new SIswaModel("Rahman","4","Damaran", R.drawable.dummy,"ini detail profil Rahman"));
        ListDataSiswa.add(new SIswaModel("Haki","5","Kuningan", R.drawable.dummy,"ini detail profil Haki"));
        ListDataSiswa.add(new SIswaModel("Dani","28","Gondang Manis", R.drawable.dummy,"ini detail profil Dani"));
        ListDataSiswa.add(new SIswaModel("Devo","9","Kaliputu", R.drawable.dummy,"ini detail profil Devo"));
        ListDataSiswa.add(new SIswaModel("Irvan","24","Kaliputu", R.drawable.dummy,"ini detail profil Irvan"));
        ListDataSiswa.add(new SIswaModel("Bisma","6","Jakarta", R.drawable.dummy,"ini detail profil Bisma"));
        ListDataSiswa.add(new SIswaModel("Illyn","27","Solo", R.drawable.dummy,"ini detail profil Illyn"));

        AdapterListSiswa adapter = new AdapterListSiswa(ListDataSiswa, siswa -> {
            Toast.makeText(this, "Hallo " + siswa.getNama(), Toast.LENGTH_SHORT).show();
            Intent in = new Intent(ListSiswa.this, DetailListSiswa.class);

            in.putExtra("nama", siswa.getNama());
            in.putExtra("absen", siswa.getAbsen());
            in.putExtra("alamat", siswa.getAlamat());
            in.putExtra("detail", siswa.getDetailInfo());
            in.putExtra("gambar", siswa.getGambar());
            startActivity(in);
        });



        rvListSiswa.setLayoutManager(new LinearLayoutManager(this));
        rvListSiswa.setAdapter(adapter);
    }
}