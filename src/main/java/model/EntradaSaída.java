/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author paula
 */
public class EntradaSaída {
    private int id;
    private Date data;
    private Tipo tipoMovimentacao;
    
    private final Veículo veículo;
    
    public EntradaSaída(Tipo tipo, Veículo veículo){
        tipoMovimentacao = tipo;
        this.veículo = veículo;
        data = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Tipo getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(Tipo tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Veículo getVeiculo() {
        return veículo;
    }

    
}
