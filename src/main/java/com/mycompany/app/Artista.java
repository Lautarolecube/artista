package com.mycompany.app;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Artista extends Persona{

    public String nombre;
    private int edad;
    private String nacionalidad;
    private String titulo;
    private String genero;
    private ArrayList<Album> albums;


    public static void main(String[] args){

    List<Artista> lista = new LinkedList<Artista>();

        //Con LinkedList lo que hacemos es agregar artistas al final de la lista
        lista.add(new Artista("Lautaro", "Argentina", "The King", "Electronica"));
        lista.add(new Artista("Gustavo", "Argentina", "Bocanada", "Rock Nacional"));
        lista.add(new Artista("Patricio", "Argentina", "Fusilados por la cruz roja", "Rock Nacional"));
        lista.add(new Artista("Cordera", "Argentina", "Capo", "Rock Nacional"));
        lista.add(new Artista("Dread Mar I",  "Argentina", "Love", "Reggae"));


        System.out.println("----ForEARCH---");

            for(Artista artista:lista){
                System.err.println("prueba " + artista.getNombre() + artista.getNacionalidad() + artista.getTitulo() + artista.getGenero());


        }
    }

    //Getters
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    public String getTitulo() { return titulo;}
    public String getGenero() { return genero;}


    //Setters
    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad;}
    public void setTitulo(String titulo) { this.titulo= titulo;}
    public void setGenero(String genero) { this.genero= genero;}

    //Constructor
    public Artista(String nombre, String nacionalidad, String titulo, String genero){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.genero = genero;
        this.albums = new ArrayList<Album>();
    }

    //Métodos
    
    void agregarAlbum(String titulo, int anio, String genero, List temas, String tema, String nombre){

    Album nuevoAlbum = new Album(titulo, anio, genero, temas, nombre, tema);
    albums.add(nuevoAlbum);

    }  

    void agregarAlbumConArtistaInvitado(String titulo, int anio, String genero, List temas, String artistainvitado, String tema, String nombre){

    Album nuevoAlbum = new Album(titulo, anio, genero, temas, nombre, tema, artistainvitado, nombre);
    albums.add(nuevoAlbum);

    }

    void agregarAlbumAAlbums(String titulo, int anio, String genero, List temas, String artistainvitado, String tema, String nombre){

    Album albums = new Album(titulo, anio, genero, temas, nombre, tema, artistainvitado, tema, nombre);
    albums.add(artista);

    }


