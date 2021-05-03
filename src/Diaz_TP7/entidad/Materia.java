package Diaz_TP7.entidad;

public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    @Override
    public boolean equals(Object obj) {
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return idMateria;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
/*
La Materia tiene un idMateria, un nombre de la materia y año al que pertenece, 
tiene además un constructor que inicializa sus propiedades y 
métodos get y set para cada uno de sus atributos.
*/