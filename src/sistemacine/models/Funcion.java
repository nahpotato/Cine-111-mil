package sistemacine.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Funcion {
    
    private String diaSemana;
    private int duracion;
    private LocalDate horaInicio;
    private long numero;
    private List<Entrada> entradas;

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.diaSemana);
        hash = 41 * hash + this.duracion;
        hash = 41 * hash + Objects.hashCode(this.horaInicio);
        hash = 41 * hash + (int) (this.numero ^ (this.numero >>> 32));
        hash = 41 * hash + Objects.hashCode(this.entradas);
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
        final Funcion other = (Funcion) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.diaSemana, other.diaSemana)) {
            return false;
        }
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.entradas, other.entradas)) {
            return false;
        }
        return true;
    }
}
