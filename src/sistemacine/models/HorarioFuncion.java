package sistemacine.models;

import java.time.LocalDate;
import java.util.Objects;

public class HorarioFuncion {
    
    private String diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private LocalDate horaPrimeraFuncion;
    private LocalDate horaUltimaFuncion;

    public String getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(String diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public int getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public int getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean isEsTrasnoche() {
        return esTrasnoche;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    public LocalDate getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(LocalDate horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public LocalDate getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(LocalDate horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.diaDeSemana);
        hash = 23 * hash + this.duracionIntervalo;
        hash = 23 * hash + this.duracionPublicidad;
        hash = 23 * hash + (this.esTrasnoche ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.horaPrimeraFuncion);
        hash = 23 * hash + Objects.hashCode(this.horaUltimaFuncion);
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
        final HorarioFuncion other = (HorarioFuncion) obj;
        if (this.duracionIntervalo != other.duracionIntervalo) {
            return false;
        }
        if (this.duracionPublicidad != other.duracionPublicidad) {
            return false;
        }
        if (this.esTrasnoche != other.esTrasnoche) {
            return false;
        }
        if (!Objects.equals(this.diaDeSemana, other.diaDeSemana)) {
            return false;
        }
        if (!Objects.equals(this.horaPrimeraFuncion, other.horaPrimeraFuncion)) {
            return false;
        }
        if (!Objects.equals(this.horaUltimaFuncion, other.horaUltimaFuncion)) {
            return false;
        }
        return true;
    }
}
