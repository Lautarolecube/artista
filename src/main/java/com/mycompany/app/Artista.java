package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;



public class Artista extends Persona{

    public String nombre;
    private String nacionalidad;
    private String titulo;
    private String genero;
    private ArrayList<Album> albums;


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
    public Artista(String nombre, String nacionalidad, String titulo, String genero){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.genero = genero;
        this.albums = new ArrayList<Album>();
    }

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

    Album albums = new Album(titulo, anio, genero, temas, nombre, tema, artistainvitado, tema, nombre);
    albums.add(artista);

    }


}
