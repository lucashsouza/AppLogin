package br.com.lucashsouza.applogin;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.etUsername);
        TextView password = findViewById(R.id.etPassword);

        MaterialButton btLogin = findViewById(R.id.btLogin);

        btLogin.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                        Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        );

    }
}