package Diaz_TP7.entidad;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;
    private String nombre;
    private String apellido;
    private HashSet<Materia> listaDeMaterias;
    
    public Alumno(int legajo, String nombre, String apellido) {
        this.listaDeMaterias = new HashSet<>();
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
//    public Materia agregarMateria(Materia materia){
//        for(int i = 0; i < listaDeMaterias.size(); i++){
//            if(listaDeMaterias.contains(materia)){
//                System.out.println("El alumno ya esta inscripto en esta materia.");
//                return materia;
//            }
//        }
//        System.out.println("Ingreso exitoso!");
//        listaDeMaterias.add(materia);
//        return materia;
//    }
    public void agregarMateria(Materia materia){
        if(listaDeMaterias.add(materia)){
            JOptionPane.showMessageDialog(null,"El alumno se inscribio correctamente.");
        } else {
            JOptionPane.showMessageDialog(null,"El alumno ya se encuentra inscripto en esta materia.");
        }
    }
    
    public int cantidadMaterias(){
        return listaDeMaterias.size();
    }

    @Override
    public String toString() {
        return  apellido + ", " + nombre;
    }

    @Override
    public int hashCode() {
        return legajo;
    }

    @Override
    public boolean equals(Object obj) {
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
}

/*
Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista de materias en las que está inscripto; 
para ello tiene un método agregarMateria que permite inscribir al Alumno en una materia determinada 
(implementar de manera tal que no deje inscribir un alumno en dos materias iguales.) 
y otro método cantidadMaterias que devuelve la cantidad de materias a las que está inscripto el alumno.
*/