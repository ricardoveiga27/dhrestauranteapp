package com.example.digitalhousefoods.model;

public class Pratos {

    private String nomePrato;
    private String descricaoPrato;
    private String fotoPrato;


    public Pratos(String nomePrato, String descricaoPrato, String fotoPrato) {
        this.nomePrato = nomePrato;
        this.descricaoPrato = descricaoPrato;
        this.fotoPrato = fotoPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescricaoPrato() {
        return descricaoPrato;
    }

    public void setDescricaoPrato(String descricaoPrato) {
        this.descricaoPrato = descricaoPrato;
    }

    public String getFotoPrato() {
        return fotoPrato;
    }

    public void setFotoPrato(String fotoPrato) {
        this.fotoPrato = fotoPrato;
    }
}
