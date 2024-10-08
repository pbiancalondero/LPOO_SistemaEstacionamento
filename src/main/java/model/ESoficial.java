/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author paula
 */
public class ESoficial extends EntradaSaída{
    private int kmRegistrado;
    private Pessoa motorista;

    public ESoficial(Tipo tipo, Veículo veículo, Pessoa motorista) {
        super(tipo, veículo);
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
