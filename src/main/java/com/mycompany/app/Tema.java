package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;



public class Tema {

    public String titulo;
    public String genero;
    public ArrayList<Tema>temas;
    public int anio;
    public String artistaInvitado;

    public Tema(){

        
    }

    //Getters
    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getAnio(){
        return anio;
    }

    public String getArtistaInvitado(){
        return artistaInvitado;
    }

    //Setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setArtistaInvitado(String artistaInvitado){
        this.artistaInvitado = artistaInvitado;
    }

    //Constructor con artista invitado
    public Tema(String titulo, String genero, int anio, ArrayList<Tema>temas, String artistaInvitado){
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.temas = (temas != null) ? temas : new ArrayList<>();
        this.artistaInvitado = artistaInvitado;
    }

    //Constructor sin artista invitado
    public Tema(String titulo, String genero, int anio, ArrayList<Tema>temas){
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.temas = (temas != null) ? temas : new ArrayList<>();
    }


}