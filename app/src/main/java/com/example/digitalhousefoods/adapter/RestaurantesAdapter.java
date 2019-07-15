package com.example.digitalhousefoods.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.interfaces.RestaurantesListener;
import com.example.digitalhousefoods.model.Restaurante;

import java.util.List;

public class RestaurantesAdapter extends RecyclerView.Adapter<RestaurantesAdapter.ViewHolder> {

    private List<Restaurante> listaRestaurantes;
    private RestaurantesListener restaurantesListener;

    public RestaurantesAdapter(List<Restaurante> listaRestaurantes, RestaurantesListener restaurantesListener) {
        this.listaRestaurantes = listaRestaurantes;
        this.restaurantesListener = restaurantesListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_restaurantes, viewGroup, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Restaurante restaurante = listaRestaurantes.get(i);
        viewHolder.setupRestaurantes(restaurante);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurantesListener.onRestauranteClicado(restaurante);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView restaurantesImageView;
        private TextView nomeRestauranteTextView;
        private TextView enderecoTextView;
        private TextView horarioFuncionamentoTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            restaurantesImageView = itemView.findViewById(R.id.foto_restaurante);
            nomeRestauranteTextView = itemView.findViewById(R.id.textview_nome_restaurante);
            enderecoTextView = itemView.findViewById(R.id.textview_endereco_restaurante);
            horarioFuncionamentoTextView = itemView.findViewById(R.id.textview_horario_restaurante);
        }

        public void setupRestaurantes(Restaurante restaurante){
            restaurantesImageView.setImageResource(restaurante.getFoto());
            nomeRestauranteTextView.setText(restaurante.getNomeRestaurante());
            enderecoTextView.setText(restaurante.getEndereco());
            horarioFuncionamentoTextView.setText(restaurante.getHorarioFuncionamento());
        }


    }






}
