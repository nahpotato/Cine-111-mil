package sistemacine.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Cine {
    
    private String direccion;
    private LocalDate fechaInauguracion;
    private String nombre;
    private long precioEntrada;
    private List<Sala> salas;
    private List<Programacion> programaciones;
    private List<HorarioFuncion> horarioFunciones;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(LocalDate fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(long precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }

    public List<HorarioFuncion> getHorarioFunciones() {
        return horarioFunciones;
    }

    public void setHorarioFunciones(List<HorarioFuncion> horarioFunciones) {
        this.horarioFunciones = horarioFunciones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.direccion);
        hash = 83 * hash + Objects.hashCode(this.fechaInauguracion);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + (int) (this.precioEntrada ^ (this.precioEntrada >>> 32));
        hash = 83 * hash + Objects.hashCode(this.salas);
        hash = 83 * hash + Objects.hashCode(this.programaciones);
        hash = 83 * hash + Objects.hashCode(this.horarioFunciones);
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
        final Cine other = (Cine) obj;
        if (this.precioEntrada != other.precioEntrada) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechaInauguracion, other.fechaInauguracion)) {
            return false;
        }
        if (!Objects.equals(this.salas, other.salas)) {
            return false;
        }
        if (!Objects.equals(this.programaciones, other.programaciones)) {
            return false;
        }
        if (!Objects.equals(this.horarioFunciones, other.horarioFunciones)) {
            return false;
        }
        return true;
    }
}
