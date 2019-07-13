package com.example.digitalhousefoods.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.interfaces.RestaurantesListener;
import com.example.digitalhousefoods.model.Restaurantes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RestaurantesListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Restaurantes> restaurantesList = new ArrayList<>();
        Restaurantes restaurantes1 = new Restaurantes();
        restaurantes1.setNomeRestaurante("Italiano");
        restaurantes1.setEndereco("Rua Sem nome, 123 - Moema - São Paulo - SP");
        restaurantes1.setHorarioFuncionamento("aberto de Segunda à Sextta das 12:00hs às 23:00hs");



    }

    @Override
    public void onRestauranteClicado(Restaurantes restaurantes) {

    }
}
