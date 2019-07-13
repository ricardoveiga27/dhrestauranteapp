package com.example.digitalhousefoods.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Restaurantes implements Serializable {

    private String nomeRestaurante;
    private String endereco;
    private String horarioFuncionamento;
    private String foto;

    private List<Pratos> listaPratos = new ArrayList<>();


    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Pratos> getListaPratos() {
        return listaPratos;
    }

    public void setListaPratos(List<Pratos> listaPratos) {
        this.listaPratos = listaPratos;
    }
}
