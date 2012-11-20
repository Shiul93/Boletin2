
package Ejercicio5;
import java.util.*;

/**
 *
 * @author Luis F. Llamas / Miguel Martinez Mezo
 */
public class Mazo {
    List<Carta> mazo=new ArrayList<Carta>(); 
    
    public Mazo(Baraja baraja ){
       
        for (int i=0;i<=47;i++){
            
            this.mazo.add(baraja.getCarta(i));
        }
    Collections.shuffle(mazo);
    
    }
    public void Barajar(){
        
    Collections.shuffle(this.mazo);
        
    }
    
    public Carta getCarta(int i){
        
        return this.mazo.get(i);
        
    }
    
    public void eliminar(Carta carta){
        
        this.mazo.remove(carta);
    }
    public void añadir(Carta carta){
        
        this.mazo.add(carta);
    }
 
}
