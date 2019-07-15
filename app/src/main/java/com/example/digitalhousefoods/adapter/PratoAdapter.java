package com.example.digitalhousefoods.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.interfaces.PratoListener;
import com.example.digitalhousefoods.model.Prato;

import java.util.List;

public class PratoAdapter extends RecyclerView.Adapter<PratoAdapter.ViewHolder> {

    private List<Prato> listaDePratos;
    private PratoListener pratoListener;

    public PratoAdapter(List<Prato> listaDePratos, PratoListener pratoListener) {
        this.listaDePratos = listaDePratos;
        this.pratoListener = pratoListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_pratos, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final Prato prato = listaDePratos.get(position);
        viewHolder.setupPrato(prato);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pratoListener.onPratoClicado(prato);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaDePratos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView pratoTextView;
        private ImageView imagemPratoImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemPratoImageView = itemView.findViewById(R.id.prato_image_view_prato_recycler_id);
            pratoTextView = itemView.findViewById(R.id.nome_prato_recycler_id);


        }

        public void setupPrato(Prato prato) {
            pratoTextView.setText(prato.getNomePrato());
            imagemPratoImageView.setImageResource(prato.getFotoPrato());


        }
    }
}
