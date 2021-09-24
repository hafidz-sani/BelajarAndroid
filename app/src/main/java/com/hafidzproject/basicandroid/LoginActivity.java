package com.hafidzproject.basicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkLogin(etUsername.getText().toString(), etPassword.getText().toString())){
                    moveToPage(v, MainActivity.class);
                } else {
//                    etUsername.setError("Kesalahan Username");
//                    etPassword.setError("Kesalahan Password");
                    Toast.makeText(v.getContext(), "Username atau Passowrd Anda Salah...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean checkLogin(String username, String password){
        if(username.equals("admin") && password.equals("admin"))
            return true;
        else
            return false;
    }

    private void moveToPage(View v, Class<?> cls) {
        Intent intentToPage = new Intent(v.getContext(), cls);
        startActivity(intentToPage);
        finish();
    }
}