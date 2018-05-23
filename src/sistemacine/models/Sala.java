package sistemacine.models;

public class Sala {
    
    private long capacidad;
    private int numero;
    
    public long getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.capacidad ^ (this.capacidad >>> 32));
        hash = 17 * hash + this.numero;
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
        final Sala other = (Sala) obj;
        if (this.capacidad != other.capacidad) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
}
