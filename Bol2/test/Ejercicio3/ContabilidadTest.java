/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class ContabilidadTest {
    
    public ContabilidadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of IncluirFactura method, of class Contabilidad.
     */
    @Test
    public void testIncluirFactura() {
        Empresa e1=new Empresa(1, "EMPRESA1", "domicilio1", 5);
        Factura f1=new Factura("01/01/2001","OBJETO2", "200€", e1);
        Persona p1=new Persona(2, "PERSONA1", "domicilio3", "6/5/1989");
        Factura f2=new Factura("02/01/2001","OBJETO3", "100€", p1);
        Empresa e2=new Empresa(3, "EMPRESA2", "domicilio2", 10);
        Factura f3=new Factura("03/01/2001","OBJETO1", "500€", e2);
        Persona p2=new Persona(4, "PERSONA2", "domicilio4", "7/5/1989");
        Factura f4=new Factura("04/01/2001","OBJETO4", "100€", p2);
   
        Contabilidad c=new Contabilidad();

        c.IncluirFactura(f1);
        c.IncluirFactura(f2);
        c.IncluirFactura(f3);
        c.IncluirFactura(f4);
        
        c.ProcesarContabilidad(); //Se imprimen los elementos que se esperaban
    
    }
    
    @Test
    public void testEliminarFactura(){
        
        Empresa e1=new Empresa(1, "EMPRESA1", "domicilio1", 5);
        Factura f1=new Factura("01/01/2001","OBJETO2", "200€", e1);
        Factura f2=new Factura("03/01/2001","OBJETO1", "500€", e1);
        Persona p1=new Persona(2, "PERSONA1", "domicilio3", "6/5/1989");
        Factura f3=new Factura("02/01/2001","OBJETO3", "100€", p1);
        Persona p2=new Persona(4, "PERSONA2", "domicilio4", "7/5/1989");
        Factura f4=new Factura("04/01/2001","OBJETO4", "100€", p2);
        Factura f5=new Factura("03/01/2001","OBJETO1", "500€", e1);
        
        Contabilidad c=new Contabilidad();
        
        c.IncluirFactura(f1);
        c.IncluirFactura(f2);
        c.IncluirFactura(f3);
        c.IncluirFactura(f4);
        c.IncluirFactura(f5);
        
        c.EliminarFactura(e1);
        
        c.ProcesarContabilidad();
        
     }


}
