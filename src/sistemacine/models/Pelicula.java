package sistemacine.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Pelicula {
    
    private int añoEstreno;
    private boolean disponible;
    private int duracion;
    private LocalDate fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    private Genero genero;
    private PaisDeOrigen paisDeOrigen;
    private Calificacion calificacion;
    private List<Personaje> personajes;
    private List<Funcion> funciones;

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.añoEstreno;
        hash = 97 * hash + (this.disponible ? 1 : 0);
        hash = 97 * hash + this.duracion;
        hash = 97 * hash + Objects.hashCode(this.fechaIngreso);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.tituloOriginal);
        hash = 97 * hash + Objects.hashCode(this.genero);
        hash = 97 * hash + Objects.hashCode(this.paisDeOrigen);
        hash = 97 * hash + Objects.hashCode(this.calificacion);
        hash = 97 * hash + Objects.hashCode(this.personajes);
        hash = 97 * hash + Objects.hashCode(this.funciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (this.añoEstreno != other.añoEstreno) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (this.duracion != other.duracion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tituloOriginal, other.tituloOriginal)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.paisDeOrigen, other.paisDeOrigen)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.getNombre();
    }
}
