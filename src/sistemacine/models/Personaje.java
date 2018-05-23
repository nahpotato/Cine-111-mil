package sistemacine.models;

import java.util.Objects;

public class Personaje {
    
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nombreEnPelicula);
        hash = 59 * hash + Objects.hashCode(this.actor);
        hash = 59 * hash + Objects.hashCode(this.rol);
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
        final Personaje other = (Personaje) obj;
        if (!Objects.equals(this.nombreEnPelicula, other.nombreEnPelicula)) {
            return false;
        }
        if (!Objects.equals(this.actor, other.actor)) {
            return false;
        }
        if (!Objects.equals(this.rol, other.rol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (this.getActor().isAnimado()) {
            return this.getNombreEnPelicula();
        } else {
            return this.getActor().getNombre() + " " + this.getActor().getApellido()
                    + " como " + this.getNombreEnPelicula();
        }
    }
}
