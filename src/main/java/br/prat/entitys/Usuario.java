package br.prat.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String senha;
    @ManyToOne
    @JoinColumn(name = "fk_tipo")
    private tipoUsuario umtipo;
    
    public Usuario(){}

    public Usuario(int id, String nome, String senha, tipoUsuario umtipo) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.umtipo = umtipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public tipoUsuario getUmtipo() {
        return umtipo;
    }

    public void setUmtipo(tipoUsuario umtipo) {
        this.umtipo = umtipo;
    }
    
}   