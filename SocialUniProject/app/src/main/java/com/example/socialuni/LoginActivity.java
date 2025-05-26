public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLoginSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLoginSubmit = findViewById(R.id.btnLoginSubmit);

        btnLoginSubmit.setOnClickListener(view -> {
            // Giriş işlemleri yapılacak
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();
            Toast.makeText(this, "Hoşgeldin " + username, Toast.LENGTH_SHORT).show();
        });
    }
}
