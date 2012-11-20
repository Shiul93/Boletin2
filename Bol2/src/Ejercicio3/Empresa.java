

package Ejercicio3;

import java.sql.Date;
/**
 *
 * @author miguel
 */
public class Empresa extends Cliente {
    
    private int n_empleados;
    
    public  Empresa (int ID, String nombre, String domicilio, int empleados){
        
        super(ID, nombre, domicilio);
        this.n_empleados=empleados;
                 
    }
    

    @Override
    public String getPLazo() {
        return "3 meses";
    }
    
    
    @Override
    public String toString(){
       String s=super.toString();
       return (s+"\nNUMERO DE EMPLEADOS: "+this.n_empleados+this.getPLazo());
    }

}
