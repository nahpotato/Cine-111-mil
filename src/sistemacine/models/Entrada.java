package sistemacine.models;

import java.time.LocalDate;

public class Entrada {
    
    private LocalDate fechaHoraFuncion;
    private LocalDate fechaHoraVenta;
    private double precioCobrado;
    private long ticketNro;
    private Funcion funcion;

    public LocalDate getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(LocalDate fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public LocalDate getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(LocalDate fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public double getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(double precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public long getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(long ticketNro) {
        this.ticketNro = ticketNro;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
}
