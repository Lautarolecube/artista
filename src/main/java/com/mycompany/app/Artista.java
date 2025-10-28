package com.mycompany.app;
import java.util.ArrayList;



public class Artista extends Persona{

    public String nombre;
    private String nacionalidad;
    private String titulo;
    private String genero;


    //Getters
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    public String getTitulo() { return titulo;}
    public String getGenero() { return genero;}


    //Setters
    public String setNombre() { this.nombre = nombre;}
    public String setNacionalidad() { this.nacionalidad = nacionalidad;}
    public String setTitulo() { this.titulo= titulo;}
    public String setGenero() { this.genero= genero;}

    //Constructor
    Persona artista = new Persona();
    
    

    //Métodos
    
    void agregarAlbum(String titulo, int anio, String genero, List temas, String tema, String nombre){

    Album nuevoAlbum = new Album(titulo, anio, genero, temas, nombre, tema);
    nuevoAlbum.add(artista);

    }  

    void agregarAlbumConArtistaInvitado(String titulo, int anio, String genero, List temas, String artistainvitado, String tema, String nombre){

    Album nuevoAlbum = new Album(titulo, anio, genero, temas, nombre, tema, artistainvitado, nombre);
    nuevoAlbum.add(artista);

    }

    void agregarAlbumAAlbums(String titulo, int anio, String genero, List temas, String artistainvitado, String tema, String nombre){

    Album Albums = new Album(titulo, anio, genero, temas, nombre, tema, artistainvitado, tema, nombre);
    Albums.add(Album);

    }


}
