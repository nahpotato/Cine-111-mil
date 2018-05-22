package sistemacine.models;

import java.time.LocalDate;
import java.util.List;

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
}
