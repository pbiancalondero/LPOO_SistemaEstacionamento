package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 *
 * @author paula
 */
@Entity
@DiscriminatorValue("veiculo_oficial")
public class ESoficial extends EntradaSaida{
    
    
    private int kmRegistrado;
    
    @OneToOne
    @JoinColumn(name = "es_oficial_motorista")
    private Pessoa motorista;

    public ESoficial(TipoMovimentacao tipo, Veiculo veiculo, Pessoa motorista) {
        super(tipo, veiculo);
        this.motorista = motorista;
    }

    public int getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }
    
    
}