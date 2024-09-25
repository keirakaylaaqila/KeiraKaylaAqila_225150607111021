package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView nama , keirakaylaaqila, nim, nimangka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        nama = findViewById(R.id.tv_nama);
        keirakaylaaqila = findViewById(R.id.tv_keira);
        nim = findViewById(R.id.tv_nim);
        nimangka = findViewById(R.id.tv_nimangka);

    }
}