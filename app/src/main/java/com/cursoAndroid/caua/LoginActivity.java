package com.cursoAndroid.caua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if (login.equals("QI") && senha.equals("123")) {
                    alert("Login Realizado com sucesso");
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                } else {
                    alert("Login ou senha incorretos!");
                }
            }
        });
    }

    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}