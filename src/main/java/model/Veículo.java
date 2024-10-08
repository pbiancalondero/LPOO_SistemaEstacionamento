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
public class Veículo {
    private int id;
    private String placa;
    private String cor;
    private TipoVeículo tipoVeiculo;
    private Modelo modelo;

    
    
    private List<EntradaSaída> listaMovimentacoes;

    
    
    
    private Pessoa proprietario;
    
    public Veículo(){
        listaMovimentacoes = new ArrayList<>();
    }
    
    public Veículo(String placa, TipoVeículo tipoVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        listaMovimentacoes = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoVeículo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeículo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public List<EntradaSaída> getListaMovimentacoes() {
        return listaMovimentacoes;
    }

    public void setListaMovimentacoes(List<EntradaSaída> listaMovimentacoes) {
        this.listaMovimentacoes = listaMovimentacoes;
    }
    
    public void addMovimentacao(EntradaSaída movimentacao){
        listaMovimentacoes.add(movimentacao);
    }
    
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    
}
