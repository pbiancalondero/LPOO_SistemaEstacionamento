/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import model.Marca;
import model.Modelo;
import model.TipoVeiculo;
import model.Veiculo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistencia() {
        Modelo m = new Modelo();
        //m.setDescricao("fox");
        //m.setMarca(Marca.FORD);
        
        //Veiculo t = new Veiculo();
        //t.setModelo(m);
        //t.setCor("PRATA");
        //t.setPlaca("ABC4T67");
        //t.setTipoVeiculo(TipoVeiculo.CARRO);
        
        try{
            jpa.persist(m);
            //jpa.persist(t);
            
            
        } catch(Exception e){
            System.err.println("Erro ao persistir modelo: "+m);
        }
        
    }
}