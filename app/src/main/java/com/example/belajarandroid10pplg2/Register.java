package com.example.belajarandroid10pplg2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    EditText edpass;

    EditText edconpass;

    EditText ednama;
    EditText edemail;
    EditText edalamat;
    EditText ednowa;
    Button btnRegister;

    Button btnConRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        btnConRegister = findViewById(R.id.btnConRegister);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, MainActivity.class));
            }
        });

        edpass = (EditText) findViewById(R.id.edpass);
        edconpass = (EditText) findViewById(R.id.edconpass);
        ednama = (EditText) findViewById(R.id.ednama);
        edemail = (EditText) findViewById(R.id.edemail);
        edalamat = (EditText) findViewById(R.id.edalamat);
        ednowa = (EditText) findViewById(R.id.ednowa);
        btnConRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = ednama.getText().toString();
                String email = edemail.getText().toString();
                String alamat = edalamat.getText().toString();
                String nowa = ednowa.getText().toString();
                String pass = edpass.getText().toString();
                String conpass = edconpass.getText().toString();


                Intent intent = new Intent(Register.this, ConfirmRegister.class);

                intent.putExtra("nama", nama);
                intent.putExtra("email", email);
                intent.putExtra("alamat", alamat);
                intent.putExtra("nowa", nowa);
                intent.putExtra("pass", pass);
                intent.putExtra("conpass", conpass);
                startActivity(intent);
            }
        });


    }
}
