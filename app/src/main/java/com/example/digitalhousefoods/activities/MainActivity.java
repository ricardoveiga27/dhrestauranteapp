package com.example.digitalhousefoods.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.adapter.RestaurantesAdapter;
import com.example.digitalhousefoods.interfaces.RestaurantesListener;
import com.example.digitalhousefoods.model.Prato;
import com.example.digitalhousefoods.model.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RestaurantesListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        List<Restaurante>listaRestaurantes=new ArrayList<>();
        List<Prato> listaPratosRestaurante1 = new ArrayList<>();
        List<Prato> listaPratosRestaurante2 = new ArrayList<>();
        List<Prato> listaPratosRestaurante3 = new ArrayList<>();
        List<Prato> listaPratosRestaurante4 = new ArrayList<>();




        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNomeRestaurante("Katsuya Sushi");
        restaurante1.setEndereco("Av. Mal. Mallet, 1210 - Canto do Forte, Praia Grande - SP, 11700-400");
        restaurante1.setHorarioFuncionamento("aberto de Segunda à Domingo das 12:00hs às 23:30hs");
        restaurante1.setFoto(R.drawable.katsuya);
        listaRestaurantes.add(restaurante1);


        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNomeRestaurante("Rufus Gastrobar");
        restaurante2.setEndereco("Av. Mal. Mallet, 815 - Canto do Forte, Praia Grande - SP, 11700-405");
        restaurante2.setHorarioFuncionamento("aberto de Segunda à Domingo das 12:00hs às 23:30hs");
        restaurante2.setFoto(R.drawable.rufus);
        listaRestaurantes.add(restaurante2);

        Restaurante restaurante3 = new Restaurante();
        restaurante3.setNomeRestaurante("Matilde Bar");
        restaurante3.setEndereco("Av. Mal. Mallet, 1210 - Canto do Forte, Praia Grande - SP, 11700-400");
        restaurante3.setHorarioFuncionamento("aberto de Segunda à Domingo das 12:00hs às 23:30hs");
        restaurante3.setFoto(R.drawable.matilde);
        listaRestaurantes.add(restaurante3);

        Restaurante restaurante4 = new Restaurante();
        restaurante4.setNomeRestaurante("Caiçara Pier Restaurante");
        restaurante4.setEndereco("Av. Pres. Castelo Branco, 48 - Canto do Forte, Praia Grande - SP, 11700-800");
        restaurante4.setHorarioFuncionamento("aberto de Segunda à Domingo das 12:00hs às 23:30hs");
        restaurante4.setFoto(R.drawable.caicara);
        listaRestaurantes.add(restaurante4);




        Prato prato1 = new Prato();
        prato1.setNomePrato("Costela Barbecue");
        prato1.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato1.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato1);

        Prato prato2 = new Prato();
        prato2.setNomePrato("Costela Barbecue");
        prato2.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato2.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato2);

        Prato prato3 = new Prato();
        prato3.setNomePrato("Costela Barbecue");
        prato3.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato3.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato3);

        Prato prato4 = new Prato();
        prato4.setNomePrato("Costela Barbecue");
        prato4.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato4.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato4);

        Prato prato5 = new Prato();
        prato5.setNomePrato("Costela Barbecue");
        prato5.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato5.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato5);

        Prato prato6 = new Prato();
        prato6.setNomePrato("Costela Barbecue");
        prato6.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato6.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato6);

        Prato prato7 = new Prato();
        prato7.setNomePrato("Costela Barbecue");
        prato7.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato7.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato7);

        Prato prato8 = new Prato();
        prato8.setNomePrato("Costela Barbecue");
        prato8.setDescricaoPrato("Deliciosa Costela Suina selecionada, coberta com molho Barbecue. Acompanha batatas rusticas e pão artesanal.");
        prato8.setFotoPrato(R.drawable.costelinha);
        listaPratosRestaurante2.add(prato8);




        Prato prato11 = new Prato();
        prato11.setNomePrato("Barca Family");
        prato11.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato11.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato11);

        Prato prato12 = new Prato();
        prato12.setNomePrato("Barca Family");
        prato12.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato12.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato12);

        Prato prato13 = new Prato();
        prato13.setNomePrato("Barca Family");
        prato13.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato13.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato13);

        Prato prato14 = new Prato();
        prato14.setNomePrato("Barca Family");
        prato14.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato14.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato14);

        Prato prato15 = new Prato();
        prato15.setNomePrato("Barca Family");
        prato15.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato15.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato15);

        Prato prato16 = new Prato();
        prato16.setNomePrato("Barca Family");
        prato16.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato16.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato16);

        Prato prato17 = new Prato();
        prato17.setNomePrato("Barca Family");
        prato17.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato17.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato17);

        Prato prato18 = new Prato();
        prato18.setNomePrato("Barca Family");
        prato18.setDescricaoPrato("10 Hossomaki De Salmão Grelhado C/ Cream Cheese + 10 Uramaki Tropical + 8 Acelga Maki De Salmão Grelhado C/ Cream Cheese E Doritos + 8 Uramaki De Salmão C/ Cream Cheese + 8 Uramaki Camarão C/ Cream Cheese + 4 Joe Camarão + 4 Sashimi Salmão + 3 Nigiri De Salmão + 3 Nigiri De Kani + 2 Nigiri De Camarão.");
        prato18.setFotoPrato(R.drawable.barca_familia);
        listaPratosRestaurante1.add(prato18);


        Prato prato21 = new Prato();
        prato21.setNomePrato("Bolinho de Bacalhau");
        prato21.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato21.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato21);

        Prato prato22 = new Prato();
        prato22.setNomePrato("Bolinho de Bacalhau");
        prato22.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato22.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato22);

        Prato prato23 = new Prato();
        prato23.setNomePrato("Bolinho de Bacalhau");
        prato23.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato23.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato23);

        Prato prato24 = new Prato();
        prato24.setNomePrato("Bolinho de Bacalhau");
        prato24.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato24.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato24);

        Prato prato25 = new Prato();
        prato25.setNomePrato("Bolinho de Bacalhau");
        prato25.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato25.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato25);

        Prato prato26 = new Prato();
        prato26.setNomePrato("Bolinho de Bacalhau");
        prato26.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato26.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato26);

        Prato prato27 = new Prato();
        prato27.setNomePrato("Bolinho de Bacalhau");
        prato27.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato27.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato27);

        Prato prato28 = new Prato();
        prato28.setNomePrato("Bolinho de Bacalhau");
        prato28.setDescricaoPrato("A receita tradicional portuguesa leva batatas, bacalhau cozido e desfiado, " +
                "cebola picada, alho, cheiro-verde e ovo." +
                "Servido em porção de seis bolinhos, acompanha molho especial da casa.");
        prato28.setFotoPrato(R.drawable.bacalhau);
        listaPratosRestaurante3.add(prato28);



        Prato prato31 = new Prato();
        prato31.setNomePrato("Meca na Brasa");
        prato31.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato31.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato31);

        Prato prato32 = new Prato();
        prato32.setNomePrato("Meca na Brasa");
        prato32.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato32.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato32);

        Prato prato33 = new Prato();
        prato33.setNomePrato("Meca na Brasa");
        prato33.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato33.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato33);

        Prato prato34 = new Prato();
        prato34.setNomePrato("Meca na Brasa");
        prato34.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato34.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato34);

        Prato prato35 = new Prato();
        prato35.setNomePrato("Meca na Brasa");
        prato35.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato35.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato35);

        Prato prato36 = new Prato();
        prato36.setNomePrato("Meca na Brasa");
        prato36.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato36.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato36);

        Prato prato37 = new Prato();
        prato37.setNomePrato("Meca na Brasa");
        prato37.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato37.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato37);

        Prato prato38 = new Prato();
        prato38.setNomePrato("Meca na Brasa");
        prato38.setDescricaoPrato("Deliciosa e tradicional receira da casa, servida em porção com guarnições e molho tartaro especial.");
        prato38.setFotoPrato(R.drawable.peixe_na_brasa);
        listaPratosRestaurante4.add(prato38);


        restaurante1.getListaPratos().add(prato7);
        restaurante1.getListaPratos().add(prato8);
        restaurante1.getListaPratos().add(prato17);
        restaurante1.getListaPratos().add(prato18);
        restaurante1.getListaPratos().add(prato27);
        restaurante1.getListaPratos().add(prato38);
        restaurante1.getListaPratos().add(prato33);
        restaurante1.getListaPratos().add(prato5);

        restaurante2.getListaPratos().add(prato7);
        restaurante2.getListaPratos().add(prato8);
        restaurante2.getListaPratos().add(prato17);
        restaurante2.getListaPratos().add(prato18);
        restaurante2.getListaPratos().add(prato27);
        restaurante2.getListaPratos().add(prato38);
        restaurante2.getListaPratos().add(prato33);
        restaurante2.getListaPratos().add(prato5);

        restaurante3.getListaPratos().add(prato7);
        restaurante3.getListaPratos().add(prato8);
        restaurante3.getListaPratos().add(prato17);
        restaurante3.getListaPratos().add(prato18);
        restaurante3.getListaPratos().add(prato27);
        restaurante3.getListaPratos().add(prato38);
        restaurante3.getListaPratos().add(prato33);
        restaurante3.getListaPratos().add(prato5);

        restaurante4.getListaPratos().add(prato7);
        restaurante4.getListaPratos().add(prato8);
        restaurante4.getListaPratos().add(prato17);
        restaurante4.getListaPratos().add(prato18);
        restaurante4.getListaPratos().add(prato27);
        restaurante4.getListaPratos().add(prato38);
        restaurante4.getListaPratos().add(prato33);
        restaurante4.getListaPratos().add(prato5);





        RestaurantesAdapter restaurantesAdapter = new RestaurantesAdapter(listaRestaurantes, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.container_recycler_restaurante_id);
        recyclerView.setAdapter(restaurantesAdapter);
        recyclerView.setLayoutManager(layoutManager);



    }



    @Override
    public void onRestauranteClicado(Restaurante restaurante) {

        Intent intent = new Intent(this, PratosActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("RESTAURANTE",restaurante);

        intent.putExtras(bundle);

        startActivity(intent);

    }
}
