/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author paula
 */
@Entity
@Table(name = "tb_veiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_veiculo", discriminatorType = DiscriminatorType.STRING)
public class Veiculo implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    
    @Column(nullable = false, length = 7, unique = true)
    private String placa;
    
    @Column(length = 20)
    private String cor;
    
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    
    
    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = true)
    private Modelo modelo;
    
    
    @OneToMany(mappedBy = "veiculo")
    private List<EntradaSaida> listaMovimentacoes;

    @ManyToOne
    @JoinColumn(name = "veiculo_proprietario", nullable = true)
    private Pessoa proprietario;
    
    

    public Veiculo() {
        listaMovimentacoes = new ArrayList<>();
    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        listaMovimentacoes = new ArrayList<>();
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

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public void addMovimentacao(EntradaSaida movimentacao){
        listaMovimentacoes.add(movimentacao);
    }
//
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }
//
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
//
    public List<EntradaSaida> getListaMovimentacoes() {
        return listaMovimentacoes;
    }
//    

    @Override
    public String toString() {
        return placa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.placa);
        hash = 61 * hash + Objects.hashCode(this.cor);
        hash = 61 * hash + Objects.hashCode(this.tipoVeiculo);
        hash = 61 * hash + Objects.hashCode(this.modelo);
        hash = 61 * hash + Objects.hashCode(this.listaMovimentacoes);
        hash = 61 * hash + Objects.hashCode(this.proprietario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (this.tipoVeiculo != other.tipoVeiculo) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.listaMovimentacoes, other.listaMovimentacoes)) {
            return false;
        }
        return Objects.equals(this.proprietario, other.proprietario);
    }

}