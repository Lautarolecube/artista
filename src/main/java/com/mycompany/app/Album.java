package com.mycompany.app;
import java.util.ArrayList;

public class Album {

    private String titulo;
    private String genero;
    private int anio;
    private ArrayList<Tema>temas;
    private String cancion;
    private String artistaInvitado;


    public Album(String titulo, int anio, ArrayList<Tema>temas, String cancion) {
        this.titulo = titulo;
        this.anio = anio;
        this.temas = (temas != null) ? temas : new ArrayList<>();
        this.cancion = cancion;
    }

    public Album(String titulo, String genero, int anio, ArrayList<Tema>temas, String cancion, String artistaInvitado) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.temas = (temas != null) ? temas : new ArrayList<>();
        this.cancion = cancion;
        this.artistaInvitado = artistaInvitado;
   }

    void agregarTema(String titulo, String genero, int anio, ArrayList<Tema>temas, String cancion){

    Tema nuevoTemaAlbum = new Tema(titulo, genero, anio, temas, cancion);
    this.temas.add(nuevoTemaAlbum);

    }

    void agregarTemaConArtistaInvitado(String titulo, String genero, int anio, ArrayList<Tema>temas, String cancion, String artistaInvitado){

    Tema nuevoTemaAlbum = new Tema(titulo, genero, anio, temas, cancion, artistaInvitado);
    this.temas.add(nuevoTemaAlbum);   
    }

    //Getters
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getAnio() { return anio; }
    public ArrayList<Tema> getTemas() { return temas; }
    public String getCancion() { return cancion; }
    public String getArtistaInvitado() { return artistaInvitado; }


}
