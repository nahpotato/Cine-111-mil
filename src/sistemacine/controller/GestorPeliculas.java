package sistemacine.controller;

import java.util.ArrayList;
import java.util.List;
import sistemacine.models.Calificacion;
import sistemacine.models.Genero;
import sistemacine.models.PaisDeOrigen;

public class GestorPeliculas {
    
    private List<Genero> generos;
    private List<Calificacion> calificaciones;
    private List<PaisDeOrigen> paisesDeOrigen;
    
    public GestorPeliculas() {
        rellenarGeneros();
        rellenarCalificaciones();
        rellenarPaisesDeOrigen();
    }
    
    private void rellenarGeneros() {
        List<Genero> listaGenero = new ArrayList<>();
        
        listaGenero.add(new Genero("Acción"));
        listaGenero.add(new Genero("Terror"));
        listaGenero.add(new Genero("Comedia"));
        listaGenero.add(new Genero("Suspenso"));
        listaGenero.add(new Genero("Aventura"));
        listaGenero.add(new Genero("Ciencia ficción"));
        listaGenero.add(new Genero("Romance"));
        listaGenero.add(new Genero("Drama"));
        listaGenero.add(new Genero("Comedia musical"));
        listaGenero.add(new Genero("Documental"));
        listaGenero.add(new Genero("Misterio"));
        listaGenero.add(new Genero("Fantástico"));
        listaGenero.add(new Genero("Gore"));
        listaGenero.add(new Genero("Policíaco"));
        listaGenero.add(new Genero("Thriller"));
        
        this.setGeneros(listaGenero);
    }
    
    private void rellenarCalificaciones() {
        List<Calificacion> listaCalificaciones = new ArrayList<>();
        
        listaCalificaciones.add(new Calificacion("Excelente"));
        listaCalificaciones.add(new Calificacion("Muy buena"));
        listaCalificaciones.add(new Calificacion("Buena"));
        listaCalificaciones.add(new Calificacion("Regular"));
        listaCalificaciones.add(new Calificacion("Mala"));
        
        this.setCalificaciones(listaCalificaciones);
    }
    
    private void rellenarPaisesDeOrigen() {
        List<PaisDeOrigen> listaPaisesDeOrigen = new ArrayList<>();
        
        listaPaisesDeOrigen.add(new PaisDeOrigen("Español", "Argentina"));
        listaPaisesDeOrigen.add(new PaisDeOrigen("Inglés", "Australia"));
        listaPaisesDeOrigen.add(new PaisDeOrigen("Inglés", "Estados Unidos"));
        listaPaisesDeOrigen.add(new PaisDeOrigen("Francés", "Francia"));
        listaPaisesDeOrigen.add(new PaisDeOrigen("Español", "España"));
        
        this.setPaisesDeOrigen(listaPaisesDeOrigen);
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<PaisDeOrigen> getPaisesDeOrigen() {
        return paisesDeOrigen;
    }

    public void setPaisesDeOrigen(List<PaisDeOrigen> paisesDeOrigen) {
        this.paisesDeOrigen = paisesDeOrigen;
    }
}
