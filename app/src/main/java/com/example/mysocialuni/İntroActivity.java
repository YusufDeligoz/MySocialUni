package com.example.mysocialuni;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class İntroActivity extends AppCompatActivity {

    Button btnLogin;
    TextView txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        // Özel fontu tanımla ve uygula
        TextView title = findViewById(R.id.textViewTitle);
        Typeface customFont = ResourcesCompat.getFont(this, R.font.socialuni_font);
        title.setTypeface(customFont);

        // Buton ve kayıt yazısı tanımları
        btnLogin = findViewById(R.id.btnLogin);
        txtRegister = findViewById(R.id.txtRegister);

        // Giriş yap butonuna tıklanınca LoginActivity'e geç
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(İntroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // Kayıt ol yazısına tıklanınca RegisterActivity'e geç
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(İntroActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
