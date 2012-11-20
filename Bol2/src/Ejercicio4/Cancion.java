/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Luis
 */
public class Cancion implements Comparable<Cancion>{
    private  String titulo="";
    private  String autor="";
    private  String album="";
    private  String estilo="";
    private  String duracion="";
    
    public Cancion(String titulo,String autor, String album,String genero)
    {
     this.titulo=titulo;
     this.autor=autor;
     this.album=album;
     this.estilo=genero;   
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String Genero) {
        this.estilo = Genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public int compareTo(Cancion t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
