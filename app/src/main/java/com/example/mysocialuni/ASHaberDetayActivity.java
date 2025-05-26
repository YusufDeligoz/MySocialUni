package com.example.mysocialuni;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ASHaberDetayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.as_haber_detay);

        // View'ları bağla
        ImageView ivHaberResim = findViewById(R.id.ivHaberResimm);
        TextView tvBaslik = findViewById(R.id.tvBaslik);
        TextView tvAciklama = findViewById(R.id.tvAciklama); // Açıklama alanı
        TextView tvTarih = findViewById(R.id.tvTarih);
        Button btnVazgec = findViewById(R.id.btnVazgec);

        // Verileri yükle
        ivHaberResim.setImageResource(getIntent().getIntExtra("imageResId", 0));
        tvBaslik.setText(getIntent().getStringExtra("title"));
        tvAciklama.setText(getIntent().getStringExtra("description")); // Açıklamayı set et
        tvTarih.setText(getIntent().getStringExtra("day") + " " + getIntent().getStringExtra("month"));

        btnVazgec.setOnClickListener(v -> finish());
    }
}