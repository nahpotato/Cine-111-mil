package sistemacine.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Programacion {
    
    private LocalDate fechaFin;
    private LocalDate fechaHoraCreada;
    private LocalDate fechaInicio;
    private List<Funcion> funciones;

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public void setFechaHoraCreada(LocalDate fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
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
        hash = 13 * hash + Objects.hashCode(this.fechaFin);
        hash = 13 * hash + Objects.hashCode(this.fechaHoraCreada);
        hash = 13 * hash + Objects.hashCode(this.fechaInicio);
        hash = 13 * hash + Objects.hashCode(this.funciones);
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
        final Programacion other = (Programacion) obj;
        if (!Objects.equals(this.fechaFin, other.fechaFin)) {
            return false;
        }
        if (!Objects.equals(this.fechaInicio, other.fechaInicio)) {
            return false;
        }
        if (!Objects.equals(this.funciones, other.funciones)) {
            return false;
        }
        return true;
    }
}
