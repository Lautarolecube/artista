package com.mycompany.app;

import java.util.ArrayList;

public class Album {

    public String titulo;
    public int anio;
    public List<Tema>temas;
    private String artistainvitado;
    public String tema;

    void agregarTema(String titulo, int anio, String genero, List temas, String tema){

    this.temas = new Album().temas[""].add(tema);

    }

    void agregarTemaConArtistaInvitado(String titulo, int anio, String genero, List temas, String artistainvitado, String tema){

    Tema nuevoTema = new Tema(genero, titulo, artistainvitado);
    nuevoTema.add(tema);   


    }

