package br.prat.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Feedback implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String usuario;
    private String aMelhorar;
    private int perg1;
    private int perg2;
    private int perg3;
    private int perg4;
    private Date data;
    private String setor;
    private String cargo;

    public Feedback() {
    }

    public Feedback(int id, String usuario, String aMelhorar, int perg1, int perg2, int perg3, int perg4, Date data, String setor, String cargo) {
        this.id = id;
        this.usuario = usuario;
        this.aMelhorar = aMelhorar;
        this.perg1 = perg1;
        this.perg2 = perg2;
        this.perg3 = perg3;
        this.perg4 = perg4;
        this.data = data;
        this.setor = setor;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getaMelhorar() {
        return aMelhorar;
    }

    public void setaMelhorar(String aMelhorar) {
        this.aMelhorar = aMelhorar;
    }

    public int getPerg1() {
        return perg1;
    }

    public void setPerg1(int perg1) {
        this.perg1 = perg1;
    }

    public int getPerg2() {
        return perg2;
    }

    public void setPerg2(int perg2) {
        this.perg2 = perg2;
    }

    public int getPerg3() {
        return perg3;
    }

    public void setPerg3(int perg3) {
        this.perg3 = perg3;
    }

    public int getPerg4() {
        return perg4;
    }

    public void setPerg4(int perg4) {
        this.perg4 = perg4;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}