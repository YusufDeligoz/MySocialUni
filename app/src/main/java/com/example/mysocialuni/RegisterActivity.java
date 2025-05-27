package com.example.mysocialuni;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class RegisterActivity extends AppCompatActivity {

    EditText edtFirstName, edtLastName, edtSchoolNumber, edtPassword;
    Button btnRegister, btnGoToLogin;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        title = findViewById(R.id.textViewTitle);
        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtSchoolNumber = findViewById(R.id.edtSchoolNumber);
        edtPassword = findViewById(R.id.edtPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnGoToLogin = findViewById(R.id.edtGoToLogin);

        // Fontu sadece başlığa uygula
        Typeface customFont = ResourcesCompat.getFont(this, R.font.socialuni_font);
        title.setTypeface(customFont);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtFirstName.getText().toString().trim();
                String schoolNumber = edtSchoolNumber.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (name.isEmpty() || schoolNumber.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Lütfen tüm alanları doldurun!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Kayıt başarılı! Şimdi giriş yapabilirsiniz.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
