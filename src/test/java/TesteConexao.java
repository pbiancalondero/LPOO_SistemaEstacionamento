/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class TesteConexao {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TesteConexao() {
    }
    
    @Before
    public void setUp() {
        if(jpa.conexaoAberta()){
            System.out.println("Conexao aberta");
        }else{
            System.out.println("Erro ao abrir conexao");
        }
        
    };
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testeConexao() {
         System.out.println("Conexao realizada com sucesso");
    }
}
