package escuela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import alumno.Alumno;
import profesor.Profesor;

public class Escuela {
    public static void main(String[] args) {
        
        List<Alumno> listaAlumno = new ArrayList<>(); 
        List<Profesor> listaProfesores = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;

        while (seleccion != 8){
        menu();
        seleccion = teclado.nextInt();

        switch (seleccion) {
            case 1 -> {
                System.out.println("--------------------");
                System.out.println("Incluir nuevo Alumno");
                System.out.println("--------------------");
                System.out.println("Indique nombre del alumno: ");
                String nombre = teclado.next();
                System.out.println("Indique DNI del alumno: ");
                String dni = teclado.next();
                listaAlumno.add(new Alumno(nombre, dni));
                System.out.println();
                System.out.println("Alumno "+nombre +" guardado con exito\n");


            }
            case 2 -> {
                System.out.println("-------------------");
                System.out.println("Alumnos cargados");
                for (Alumno alumno:listaAlumno){
                    System.out.println("-------------------");
                    System.out.println("Nombre: "+alumno.getNombre());
                    System.out.println("DNI: "+alumno.getDni());
                    System.out.println("Nota 1: "+alumno.getNota1());
                    System.out.println("Nota 2: "+alumno.getNota2());
                    System.out.println("Nota 2: "+alumno.getNota3());
                }


            }
            case 3 -> {
                System.out.println("-------------------------");
                System.out.println("Buscar Alumno");
                System.out.println("-------------------------");
                System.out.println("Indique el dni del alumno a buscar: ");
                String dni = teclado.next();
                Alumno encontrado = buscarPorDni(listaAlumno, dni);

                if (encontrado != null) {
                    System.out.println();
                    System.out.println("Nombre: "+encontrado.getNombre());
                    System.out.println("DNI: "+encontrado.getDni());
                    System.out.println("Notas:\n\tnota 1: "+encontrado.getNota1()+"\n\tnota 2: "+encontrado.getNota2()+"\n\tnota 3: "+encontrado.getNota3());
                } else {
                    // No encontramos a nadie con ese DNI
                    System.out.println("Error: No se encontró ningún estudiante con el DNI " + dni);
                }


            }
            case 4 -> {
                System.out.println("-------------------------");
                System.out.println("Carga de calificaciones");
                System.out.println("-------------------------");
                System.out.println("Indique el dni del alumno a calificar: ");
                String dni = teclado.next();
                Alumno encontrado = buscarPorDni(listaAlumno, dni);

                if (encontrado != null) {
                    // ¡Lo encontramos! Ahora le cargamos las notas interactiva o directamente
                    System.out.println("Estudiante encontrado: " + encontrado.getNombre());
            
                    System.out.print("Ingrese Nota 1: ");
                    int n1 = teclado.nextInt();
                    encontrado.setNota1(n1);;

                    System.out.print("Ingrese Nota 2: ");
                    int n2 = teclado.nextInt();
                    encontrado.setNota2(n2);

                    System.out.print("Ingrese Nota 3: ");
                    int n3 = teclado.nextInt();
                    encontrado.setNota3(n3);

                    System.out.println("\n¡Notas cargadas con éxito!");
                } else {
                    // No encontramos a nadie con ese DNI
                    System.out.println("Error: No se encontró ningún estudiante con el DNI " + dni);
                }
            }
            case 5 -> {
                System.out.println("----------------------");
                System.out.println("Incluir nuevo Profesor");
                System.out.println("----------------------");
                System.out.println("Indique nombre del profesor: ");
                String nombre = teclado.next();
                System.out.println("Indique DNI del profesor: ");
                String dni = teclado.next();
                System.out.println("Indique materia asignada: ");
                String materia = teclado.next();
                listaProfesores.add(new Profesor(nombre, dni, materia));
                System.out.println();
                System.out.println("Profesor "+nombre +" guardado con exito\n");


            }
            case 6 -> {
                System.out.println("---------------------");
                System.out.println("Profesores cargados");
                for (Profesor profesor:listaProfesores){
                    System.out.println("---------------------");
                    System.out.println("Nombre: "+profesor.getNombre());
                    System.out.println("DNI: "+profesor.getDni());
                    System.out.println("Materia: "+profesor.getMateria());
                }
            }
            case 7 -> {
                System.out.println("-------------------------");
                System.out.println("Buscar Profesor");
                System.out.println("-------------------------");
                System.out.println("Indique el dni del profesor a buscar: ");
                String dni = teclado.next();
                Profesor encontrado = buscarPorDni2(listaProfesores, dni);

                if (encontrado != null) {

                    System.out.println();
                    System.out.println("Nombre: "+encontrado.getNombre());
                    System.out.println("DNI: "+encontrado.getDni());
                    System.out.println("Materias: "+encontrado.getMateria());
                } else {
                    // No encontramos a nadie con ese DNI
                    System.out.println("Error: No se encontró ningún estudiante con el DNI " + dni);
                }

            }
            case 8 ->{
                System.out.println("Saliendo de sistema ");
                break;
            }
            default -> {
                System.out.println("Indique un número valido");

            }
        }
        }

        teclado.close();
        
    }

    public static void menu(){
        System.out.println("--------------------");
        System.out.println("Menú principal");
        System.out.println("--------------------");
        System.out.println("1.- Crear Alumno");
        System.out.println("2.- Ver Alumnos");
        System.out.println("3.- Buscar Alumno");
        System.out.println("4.- Cargar Nota");
        System.out.println("5.- Crear Profesor");
        System.out.println("6.- Ver Profesores");
        System.out.println("7.- Buscar Profesor");
        System.out.println("8.- Salir");

    }
    public static Alumno buscarPorDni(List<Alumno> listaAlumno, String dniA_Buscar) {
        for (Alumno actual : listaAlumno) {
            // Como el atributo dni de la clase Persona es protected, 
            // la clase Main (que está en el mismo paquete) o los métodos pueden leerlo.
            // Usamos .equals() porque los textos en Java no se comparan con ==
            if (actual.getDni().equals(dniA_Buscar)) {
                return actual; // Retorna el estudiante y corta el bucle inmediatamente
            }
        }
        return null; // Si el bucle termina y no encontró coincidencia
    }

    public static Profesor buscarPorDni2(List<Profesor> listaProfesor, String dniA_Buscar) {
        for (Profesor actual : listaProfesor) {
            // Como el atributo dni de la clase Persona es protected, 
            // la clase Main (que está en el mismo paquete) o los métodos pueden leerlo.
            // Usamos .equals() porque los textos en Java no se comparan con ==
            if (actual.getDni().equals(dniA_Buscar)) {
                return actual; // Retorna el estudiante y corta el bucle inmediatamente
            }
        }
        return null; // Si el bucle termina y no encontró coincidencia
    }
    
}
