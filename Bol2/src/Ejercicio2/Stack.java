
package Ejercicio2;

import java.util.ArrayList;
import java.util.List;



public class Stack<E> extends java.util.AbstractQueue<E> {

    // ATRIBUTOS

    List<E> pila = new ArrayList();
    
    //CONSTRUCTOR 

    public Stack(){
        
        pila= new ArrayList<E>();
    }
    
    @Override
    public int size(){
        return(pila.size());  
    }
    
    @Override
    public boolean isEmpty(){
        return pila.isEmpty();
    }
    
    //Peek devuelve el elemento de la cima sin eliminarlo
    @Override
    public E peek() {
       try{ return (E) pila.get(pila.size()-1);}
       catch(Exception ex) {return null;}
    }
    
    //Offer inserta en la cima de la pila. Por defecto, el comando add inserta en la última posición si no se especifica la posición

    @Override
    public boolean offer(E e) {
        boolean x=true;
        try{ pila.add(e);}
        catch(Exception ex){x=false;}
        return x;
        } 
    
    @Override
    public E poll() {
            E elemento;
            elemento=pila.get(pila.size());
            try {pila.remove(pila.size());}
            catch (Exception ex){elemento=null;}
            return elemento;    
    }
    
    @Override
    public ListIterator iterator()  { return new ListIterator(pila, pila.size()); }
    
    
        
    public int Search(E e){
        int i=pila.lastIndexOf(e);
        return (pila.size()-i);
        }

 }



 
  
 
 
    
   
