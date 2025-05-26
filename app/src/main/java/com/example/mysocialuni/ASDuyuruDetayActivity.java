package com.example.mysocialuni;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ASDuyuruDetayActivity extends Activity {
    private ImageView ivDuyuruResim;
    private TextView tvBaslik, tvAciklama, tvTarih;
    private Button btnVazgec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.as_duyuru_detail);

        // View'ları bağla
        ivDuyuruResim = findViewById(R.id.ivDuyuruResim);
        tvBaslik = findViewById(R.id.tvBaslik);
        tvAciklama = findViewById(R.id.tvBaslikHaber);
        tvTarih = findViewById(R.id.tvTarih);
        btnVazgec = findViewById(R.id.btnVazgec);

        // Intent'ten verileri al
        Intent intent = getIntent();
        tvBaslik.setText(intent.getStringExtra("baslik"));
        tvAciklama.setText(intent.getStringExtra("aciklama"));
        tvTarih.setText(intent.getStringExtra("gun") + " " + intent.getStringExtra("ay"));

        // Resim kontrolü
        int resimId = intent.getIntExtra("resimId", -1);
        if (resimId != -1) {
            ivDuyuruResim.setImageResource(resimId);
            ivDuyuruResim.setVisibility(View.VISIBLE);
        }

        // Geri butonu
        btnVazgec.setOnClickListener(v -> finish());
    }
}