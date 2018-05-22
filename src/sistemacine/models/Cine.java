package sistemacine.models;

import java.time.LocalDate;
import java.util.List;

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
}
