/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.*;
  
public class ListIterator<E> implements Iterator<E>{
    
    List<E> pila = new ArrayList();
    int puntero;
    
    public ListIterator(List<E> Stack, int p){
        this.pila=Stack;
        this.puntero=p;
    }
    
    @Override
    public void remove()      { throw new UnsupportedOperationException();  }

    @Override
    public boolean hasNext() {
        if (this.puntero>0) {return true;}
        else {return false;}
       }

    @Override
    public E next() {
        if (!hasNext()) {throw new NoSuchElementException();}
        return pila.get(puntero);
        }

    } 
