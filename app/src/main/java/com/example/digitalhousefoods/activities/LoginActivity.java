package com.example.digitalhousefoods.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalhousefoods.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText emailEditText;
    private TextInputEditText senhaEditText;
    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


//        Intent intent = getIntent();
//        if (intent != null) {
//            Bundle bundle = intent.getExtras();
//            if (bundle != null) {
//                String emailDigitado = bundle.getString("EMAIL");
//                String senhaDigitada = bundle.getString("PASS");
//
//                TextInputEditText emailEditText = findViewById(R.id.edit_text_email);
//                TextInputEditText passWordEditText = findViewById(R.id.edit_text_password);
//
//                emailEditText.setText(emailDigitado);
//                passWordEditText.setText(senhaDigitada);
//            }
//        }

        emailEditText = findViewById(R.id.login_email_edit_text);
        senhaEditText = findViewById(R.id.login_senha_edit_text);
        loginButton = findViewById(R.id.login_button);
        registerButton = findViewById(R.id.registrar_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irParaCadastro();
            }
        });
    }

    private void logar(){

//        final String emailDigitado = emailEditText.getEditableText().toString();
//        final String senhaDigitada = senhaEditText.getEditableText().toString();
//
////        emailEditText.setError(null);
////        senhaEditText.setError(null);
//
//        if(emailDigitado.equals("ricardo@teste.com.br") && senhaDigitada.equals("123456")){

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

//        } else {
//            emailEditText.setError("Usuário e/ou senha incorreto(s)");
//            senhaEditText.setError("Usuário e/ou senha incorreto(s)");
//        }
    }

    private void irParaCadastro(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
