/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;
import java.util.*;
/**
 *
 * @author l.f.llamas
 */
public class CartaAlta extends JuegoCartas{
    
     private int numeroPartidas=5;

    public CartaAlta(List<Jugador> lista) {
        
        
        super(lista);
        
        
    }
    @Override
    List<Jugador> jugarJuego(){
        Carta cartaActual;
        Jugador jugadorGanador;
        int numeroJugadores= super.listaJugadores.size();
        
        
        for (int i = 0; i < numeroPartidas; i++) {
            
            
            for (int j = 0; j < numeroJugadores; j++) {              
                
                cartaActual=super.mazo.getCarta(j);
                super.mazo.eliminar(cartaActual);
                listaJugadores.get(j).setMano(cartaActual);
                
            }
            jugadorGanador=super.listaJugadores.get(0);
            for (int j = 1; j < numeroJugadores; j++) {              
            if (jugadorGanador.getMano().get(0).getNumero()<super.listaJugadores.get(j).getMano().get(0).getNumero()){
                jugadorGanador=super.listaJugadores.get(j);
                
            }
            
            
            
            }
            
            
            
        }
        
       

    return this.listaJugadores;}
    
    
}
