/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author miguel.mezo
 */
public class StackTest<E> {
    
    E elemento;
    
    @Test
    public void testSize() {
        Stack pila = new Stack();
        pila.offer(0);
        assertEquals(1, pila.size());
        pila.offer(1);
        assertEquals(2, pila.size());
        pila.offer("cosa");
        assertEquals(3, pila.size());

    }
    
    @Test
    public void testIsEmpty(){
        Stack pila = new Stack();
        assertTrue(pila.isEmpty());
        pila.offer(0);
        pila.offer(1);
        assertFalse(pila.isEmpty());
        
    }
    
    @Test
    public void testOffer(){
        Stack pila = new Stack();
        assertTrue(pila.offer(0));
        assertTrue(pila.offer("miguel"));
        assertEquals(2, pila.size());
        assertEquals(2, pila.Search(0));
    }
    
    @Test
    public void testPeek(){
        Stack pila=new Stack();
         pila.offer(0);
        assertEquals(pila.peek(), 0);
    }

    @Test
    public void testSearch(){
        
        
        
    }
    
}
