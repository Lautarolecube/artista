package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.List;


public class TestExamen 
{

    /* 
    Artista fito;
    Artista calamaro;
    Album amor;
    Album circo;

    @BeforeEach
    void setUp() {
        fito = new Artista("Fito Páez", "Argentina");
        calamaro = new Artista("Andrés Calamaro", "Argentina");

        amor = new Album("El amor después del amor", 1992);
        circo = new Album("Circo Beat", 1994);

        amor.agregar(new Tema("A rodar mi vida", 3.8, "Rock"));
        amor.agregar(new Tema("Tumbas de la gloria", 4.2, "Rock"));
        circo.agregar(new Tema("Mariposa Tecknicolor", 3.5, "Rock"));
    }

     @Test
    void test01_HerenciaArtistaEsPersona() {
        assertTrue(fito instanceof Persona, "Artista debe heredar de Persona");
    }

    @Test
    void test02_AgregarAlbumADiscografia() {
        fito.agregar(amor);
        fito.agregar(circo);
        assertEquals(2, fito.getAlbums().size());
        assertTrue(fito.getAlbums().contains(amor));
    }

    @Test
    void test03_BuscarAlbumPorParteDelNombre() {
        fito.agregar(amor);
        fito.agregar(circo);
        List<Album> res = fito.buscarAlbum("amor");
        assertEquals(1, res.size());
        assertEquals("El amor después del amor", res.get(0).getTitulo());
    }

    @Test
    void test04_AgregarTemaAAlbum() {
        Album nuevo = new Album("Nuevo", 2024);
        Tema t = new Tema("Canción", 3.1, "Pop");
        nuevo.agregar(t);
        assertEquals(1, nuevo.getTemas().size());
        assertTrue(nuevo.getTemas().contains(t));
    }

    @Test
    void test05_AgregarTemaConArtistaInvitado() {
        Tema dueto = new Tema("Dueto", 3.2, "Rock");
        amor.agregar(dueto, calamaro);
        assertTrue(dueto.getArtistasInvitados().contains(calamaro));
        assertTrue(amor.getArtistasInvitados().contains(calamaro));
    }

    @Test
    void test06_AgregarAlbumConInvitadoDesdeArtista() {
        fito.agregar(circo, calamaro); // registra invitado a nivel álbum
        assertTrue(fito.getAlbums().contains(circo));
        assertTrue(circo.getArtistasInvitados().contains(calamaro));
    }

    @Test
    void test07_NoDuplicarAlbumsEnArtista() {
        fito.agregar(amor);
        fito.agregar(new Album("El amor después del amor", 1992)); // mismo equals
        assertEquals(1, fito.getAlbums().size(), "No debe duplicar álbumes iguales");
    }

    @Test
    void test08_DuracionDeTemaDebeSerPositiva() {
        assertThrows(IllegalArgumentException.class,
                () -> new Tema("X", 0.0, "Rock"));
        assertThrows(IllegalArgumentException.class,
                () -> new Tema("Y", -1.0, "Pop"));
    }

    @Test
    void test09_RelacionColeccion_TemasEnAlbum() {
        int inicial = amor.getTemas().size();
        amor.agregar(new Tema("Polaroid", 3.0, "Rock"));
        assertEquals(inicial + 1, amor.getTemas().size());
    }

    @Test
    void test10_PolimorfismoPorReferenciaPersona() {
        Persona p = fito; // upcasting
        assertEquals("Fito Páez", p.getNombre());
        assertEquals("Argentina", p.getNacionalidad());
    }

    */
}
