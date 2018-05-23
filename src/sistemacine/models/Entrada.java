package sistemacine.models;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.fechaHoraFuncion);
        hash = 71 * hash + Objects.hashCode(this.fechaHoraVenta);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.precioCobrado) ^ (Double.doubleToLongBits(this.precioCobrado) >>> 32));
        hash = 71 * hash + (int) (this.ticketNro ^ (this.ticketNro >>> 32));
        hash = 71 * hash + Objects.hashCode(this.funcion);
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
        final Entrada other = (Entrada) obj;
        if (Double.doubleToLongBits(this.precioCobrado) != Double.doubleToLongBits(other.precioCobrado)) {
            return false;
        }
        if (this.ticketNro != other.ticketNro) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraFuncion, other.fechaHoraFuncion)) {
            return false;
        }
        if (!Objects.equals(this.fechaHoraVenta, other.fechaHoraVenta)) {
            return false;
        }
        if (!Objects.equals(this.funcion, other.funcion)) {
            return false;
        }
        return true;
    }
}
