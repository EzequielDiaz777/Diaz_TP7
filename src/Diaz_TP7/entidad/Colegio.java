package Diaz_TP7.entidad;

import java.util.HashSet;

public class Colegio {
    
    public static void main(String[] args) {
        HashSet<Alumno> listaDeAlumnos = new HashSet<>();
        HashSet<Materia> listaDeMaterias = new HashSet<>();
        Materia ingles1 = new Materia(1, "Ingles", 1);
        Materia matematicas1 = new Materia(2, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio", 1);
        Alumno alumno1 = new Alumno(1001, "López", "Martin");
        Alumno alumno2 = new Alumno(1002, "Martínez", "Brenda");
        
        alumno1.agregarMateria(ingles1);        
        alumno1.agregarMateria(matematicas1);        
        alumno1.agregarMateria(laboratorio1);      
        alumno2.agregarMateria(ingles1);
        alumno2.agregarMateria(matematicas1);
        alumno2.agregarMateria(laboratorio1);
        alumno2.agregarMateria(laboratorio1);
        alumno1.cantidadMaterias();
        alumno2.cantidadMaterias();
    }
    
}
/*
Se pide:
En el método main de una clase de nombre Colegio:
a) Crear las materias:
i. Ingles I de primer año.
ii. Matemáticas de primer año.
iii. Laboratorio 1 de primer año
b) Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.
c) Inscribir a López en las 3 materias.
d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
e) Visualizar la cantidad de materias a las que está inscripto cada alumno.
*/