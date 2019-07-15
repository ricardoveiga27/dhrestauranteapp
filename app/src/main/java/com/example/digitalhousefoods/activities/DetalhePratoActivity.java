package com.example.digitalhousefoods.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalhousefoods.R;

public class DetalhePratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_prato);


        Intent intent = getIntent();
        if (intent!=null){
            Bundle bundle = getIntent().getExtras();
            if (bundle !=null){
                String nomePrato = bundle.getString("PRATO");
                String descricaoPrato = bundle.getString("DESCRICAO");
                int fotoPrato = bundle.getInt("FOTO");



                TextView nomePratoTextView = findViewById(R.id.nome_prato_detalhe_id);
                ImageView fotoPratoImageView = findViewById(R.id.imagem_prato_detalhe_id);
                TextView descricaoPratoTextView = findViewById(R.id.detalhes_prato_text_view_id);

                nomePratoTextView.setText(nomePrato);
                fotoPratoImageView.setImageResource(fotoPrato);
                descricaoPratoTextView.setText(descricaoPrato);


            }
        }
    }

}
