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

public class LoginActivity extends AppCompatActivity {

    EditText edtSchoolNumber, edtPassword;
    Button btnLogin, btnGoToRegister;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        title = findViewById(R.id.textViewTitle);
        edtSchoolNumber = findViewById(R.id.edtSchoolNumber);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnGoToRegister = findViewById(R.id.btnGoToRegister);

        // Fontu sadece başlığa uygula
        Typeface customFont = ResourcesCompat.getFont(this, R.font.socialuni_font);
        title.setTypeface(customFont);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String schoolNumber = edtSchoolNumber.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (schoolNumber.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Lütfen tüm alanları doldurun!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if ((schoolNumber.equals("230609005") && password.equals("556699")) ||
                        (schoolNumber.equals("230609020") && password.equals("123456")) ||(schoolNumber.equals("220609011") && password.equals("123456"))) {

                    Toast.makeText(LoginActivity.this, "Giriş başarılı!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Hatalı okul numarası veya şifre!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
