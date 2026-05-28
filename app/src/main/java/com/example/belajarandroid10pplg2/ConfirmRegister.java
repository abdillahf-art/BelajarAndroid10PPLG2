package com.example.belajarandroid10pplg2;

import  android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmRegister extends AppCompatActivity {

    TextView tvnama, tvemail, tvalamat, tvnowa, tvpass, tvconpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirm_register);

        tvnama = findViewById(R.id.tvnama);
        tvemail = findViewById(R.id.tvemail);
        tvalamat = findViewById(R.id.tvalamat);
        tvnowa = findViewById(R.id.tvnowa);
        tvpass = findViewById(R.id.tvpass);
        tvconpass = findViewById(R.id.tvconpass);

        Intent intent = getIntent();

        String nama = intent.getStringExtra("nama");
        String email = intent.getStringExtra("email");
        String alamat = intent.getStringExtra("alamat");
        String nowa = intent.getStringExtra("nowa");
        String pass = intent.getStringExtra("pass");
        String conpass = intent.getStringExtra("conpass");


        tvnama.setText("username : " + nama);
        tvemail.setText("email : " + email);
        tvalamat.setText("alamat : " + alamat);
        tvnowa.setText("no wa : " + nowa);
        tvpass.setText("pass : " + pass);
        tvconpass.setText("conpass : 9      " + conpass);

    }
}