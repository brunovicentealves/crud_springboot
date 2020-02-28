package com.bruno.CrudSpringBoot.modelo;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
