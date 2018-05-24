package sistemacine.controller;

import java.util.ArrayList;
import java.util.List;
import nucleuxsoft.collections.ObservableList;
import sistemacine.models.Calificacion;
import sistemacine.models.Genero;
import sistemacine.models.PaisDeOrigen;
import sistemacine.models.Pelicula;

public class GestorPeliculas {
    
    private static GestorPeliculas current;
    
    private List<Genero> generos;
    private List<Calificacion> calificaciones;
    private List<PaisDeOrigen> paisesDeOrigen;
    private List<Pelicula> peliculas;
    
    public GestorPeliculas() {
        current = this;
        
        inicializarCampos();
        rellenarGeneros();
        rellenarCalificaciones();
        rellenarPaisesDeOrigen();
    }
    
    public static GestorPeliculas getCurrent() {
        return current;
    }
    
    private void inicializarCampos() {
        setGeneros(new ArrayList<>());
        setCalificaciones(new ArrayList<>());
        setPaisesDeOrigen(new ArrayList<>());
        setPeliculas(new ObservableList<>());
    }
    
    private void rellenarGeneros() {        
        getGeneros().add(new Genero("Acción"));
        getGeneros().add(new Genero("Terror"));
        getGeneros().add(new Genero("Comedia"));
        getGeneros().add(new Genero("Suspenso"));
        getGeneros().add(new Genero("Aventura"));
        getGeneros().add(new Genero("Ciencia ficción"));
        getGeneros().add(new Genero("Romance"));
        getGeneros().add(new Genero("Drama"));
        getGeneros().add(new Genero("Comedia musical"));
        getGeneros().add(new Genero("Documental"));
        getGeneros().add(new Genero("Misterio"));
        getGeneros().add(new Genero("Fantástico"));
        getGeneros().add(new Genero("Gore"));
        getGeneros().add(new Genero("Policíaco"));
        getGeneros().add(new Genero("Thriller"));
    }
    
    private void rellenarCalificaciones() {
        getCalificaciones().add(new Calificacion("Excelente"));
        getCalificaciones().add(new Calificacion("Muy buena"));
        getCalificaciones().add(new Calificacion("Buena"));
        getCalificaciones().add(new Calificacion("Regular"));
        getCalificaciones().add(new Calificacion("Mala"));
    }
    
    private void rellenarPaisesDeOrigen() {
        getPaisesDeOrigen().add(new PaisDeOrigen("Español", "Argentina"));
        getPaisesDeOrigen().add(new PaisDeOrigen("Inglés", "Australia"));
        getPaisesDeOrigen().add(new PaisDeOrigen("Inglés", "Estados Unidos"));
        getPaisesDeOrigen().add(new PaisDeOrigen("Francés", "Francia"));
        getPaisesDeOrigen().add(new PaisDeOrigen("Español", "España"));
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

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
