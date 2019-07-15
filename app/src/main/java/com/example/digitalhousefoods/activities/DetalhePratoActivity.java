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
                int fotoPrato = bundle.getInt("FOTO");

              //  Log.e("nome prato",nomePrato);

                TextView nomePratoTextView = findViewById(R.id.nome_prato_recycler_id);
                ImageView fotoPratoImageView = findViewById(R.id.prato_image_view_prato_recycler_id);

                nomePratoTextView.setText(nomePrato);
                //fotoPratoImageView.setImageResource(fotoPrato);




            }
        }
    }

}
