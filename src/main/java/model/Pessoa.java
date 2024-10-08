/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paula
 */
public class Pessoa {
    private int id;
    private String nome;
    private String fone;
    private String email;
    
    VínculoPessoa vínculoPessoa;
    
    private List<Veículo> listaVeículos;
    
    public Pessoa(){
        listaVeículos = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public VínculoPessoa getVínculoPessoa() {
        return vínculoPessoa;
    }

    public void setVínculoPessoa(VínculoPessoa vínculoPessoa) {
        this.vínculoPessoa = vínculoPessoa;
    }
    
    public void addVeículo(Veículo vei){
        listaVeículos.add(vei);
    }

    public List<Veículo> getListaVeículos() {
        return listaVeículos;
    }
    
}
