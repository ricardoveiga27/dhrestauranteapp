package com.example.digitalhousefoods.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalhousefoods.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText editTextSenha;
    private TextInputEditText editTextConfirmarSenha;
    private TextInputEditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registrar = findViewById(R.id.button_registrar);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClicado(v);
            }
        });

        editTextSenha = findViewById(R.id.edit_text_password);
        editTextConfirmarSenha = findViewById(R.id.edit_text_confirm_password);
        editTextEmail = findViewById(R.id.edit_text_email);
    }


    public void botaoClicado(View view){
        editTextSenha.setError(null);
        editTextConfirmarSenha.setError(null);
        editTextEmail.setError(null);

        if(!editTextSenha.getEditableText().toString().equals(editTextConfirmarSenha.getEditableText().toString())) {
            editTextSenha.setError("As senhas não conferem");
            editTextConfirmarSenha.setError("As senhas não conferem");
        }else if(editTextSenha.getEditableText().toString().equals("")){
            editTextSenha.setError("Campo obrigatório");
        } else if (editTextEmail.getEditableText().toString().equals("")){
            editTextEmail.setError("Campo obrigatório");
        } else {
            Snackbar.make(view, "Usuário cadastro com sucesso", Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            irParaLogin();
                        }
                    }).setActionTextColor(getResources().getColor(R.color.colorAccent))
                    .show();
        }
    }

    private void irParaLogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
