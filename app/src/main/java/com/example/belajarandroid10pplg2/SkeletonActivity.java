package com.example.belajarandroid10pplg2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SkeletonActivity extends AppCompatActivity {

    TextView tvUsername;
    Button btnLogout;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skeleton);

        tvUsername = findViewById(R.id.tvUsername);
        btnLogout = findViewById(R.id.btnLogout);

        sharedPreferences = getSharedPreferences("LoginPrefs", MODE_PRIVATE);

        String username = sharedPreferences.getString("username", "Guest");
        tvUsername.setText("Username: " + username);

        btnLogout.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.apply();

            startActivity(new Intent(SkeletonActivity.this, MainActivity.class));
            finish();
        });
    }
}