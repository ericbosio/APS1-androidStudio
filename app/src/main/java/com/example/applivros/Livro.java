package com.example.applivros;

public class Livro {
  public int id;
  public String nome, ano, categoria;

    public Livro() {
    }

    public Livro(String nome, String ano, String categoria) {
        this.nome = nome;
        this.ano = ano;
        this.categoria = categoria;
    }

    public Livro(int id, String nome, String ano, String categoria) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.categoria = categoria;
    }
}
