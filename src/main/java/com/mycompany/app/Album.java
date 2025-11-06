package com.mycompany.app;
import java.util.ArrayList;



public class Album {

    private String titulo;
    private String genero;
    private int anio;
    private List<Temas>tema;
    private String cancion;
    private String artistaInvitado;


    public Album(String titulo, String genero, int anio, List<Temas>tema, String cancion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.tema = (tema != null) ? tema : new ArrayList<>();
        this.cancion = cancion;
    }

    public Album(String titulo, String genero, int anio, List<Temas>tema, String cancion, String artistaInvitado) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.tema = (tema != null) ? tema : new ArrayList<>();
        this.cancion = cancion;
        this.artistaInvitado = artistaInvitado;
   }

    void agregarTema(String titulo, String genero, int anio, ArrayList<Temas>tema, String cancion){

    Tema nuevoTemaAlbum = new Tema(titulo, genero, anio, tema, cancion);
    this.tema.add(nuevoTemaAlbum);

    }

    void agregarTemaConArtistaInvitado(String titulo, String genero, int anio, ArrayList<Tema>temas, String cancion, String artistaInvitado){

    Tema nuevoTemaAlbum = new Tema(titulo, genero, anio, temas, cancion, artistaInvitado);
    this.temas.add(nuevoTemaAlbum);   
    }

    //Getters
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getAnio() { return anio; }
    public ArrayList<Temas> getTemas() { return tema; }
    public String getCancion() { return cancion; }
    public String getArtistaInvitado() { return artistaInvitado; }

    //Setters
    public void setTitulo(String titulo){ this.titulo = titulo;}
    public void setGenero(String genero){ this.genero = genero;}
    public void setAnio(int anio){ this.anio = anio;}
    public void 


}

