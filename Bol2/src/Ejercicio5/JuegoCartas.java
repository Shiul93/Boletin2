/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;
import java.util.*;
        
/**
 *
 * @author Luis
 */
public abstract class JuegoCartas {
  public List<Jugador> listaJugadores;
  public  Mazo mazo;
   
   public JuegoCartas(List<Jugador> lista){
       
       this.listaJugadores=lista;
       
   }
   
   
   public void jugar(){
       
        Baraja baraja =new Baraja(); 
        this.mazo=baraja.barajar();
        this.listaJugadores=jugarJuego();
        
       
       
   }
   

   List<Jugador> jugarJuego(){
   
   return this.listaJugadores;}
   
   
   ;
    
}
