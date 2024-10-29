/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author paula
 */
@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Id
    private int id;
    
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    
    @Column(name = "fone", length = 11, nullable = false)
    private String fone;
    
    @Column(name = "email", length = 25, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private VinculoPessoa vinculoPessoa;
   
    //private List<Veiculo> listaVeiculos; --> Comentar para implementar esse relacionamento futuramente
    // Getters, Setters e outros métodos
    
   
    
    //private List<Veiculo> listaVeiculos;

    /*public Pessoa() {
        listaVeiculos = new ArrayList<>();
    }*/
    
    /*

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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VinculoPessoa getVinculoPessoa() {
        return vinculoPessoa;
    }

    public void setVinculoPessoa(VinculoPessoa vinculoPessoa) {
        this.vinculoPessoa = vinculoPessoa;
    }
    
    public void addVeiculo(Veiculo vei){
        listaVeiculos.add(vei);
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }*/
    
    
}