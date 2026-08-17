package alumno;

import persona.Persona;

public class Alumno extends Persona {
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(String nombre, String dni){
        super(nombre, dni);

    }

    public Alumno(String nombre,String dni, double nota1, double nota2, double nota3){
        super(nombre, dni);
        this.nota1= nota1;
        this.nota2=nota2;
        this.nota3=nota3;


    }

    public void setNota1(Double nota1){
        this.nota1=nota1;
    }

    public double getNota1(){
        return nota1;
    }
    
    public void setNota2(Double nota2){
        this.nota2=nota2;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota3(Double nota3){
        this.nota3=nota3;
    }

    public double getNota3(){
        return nota3;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " (DNI: " + dni + ")");
        System.out.println("Notas: [" + nota1 + ", " + nota2 + ", " + nota3 + "]");
        double promedio = (nota1+nota2+nota3)/3;
        System.out.println("Promedio: "+promedio);
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String getDni(){
        return dni;
    }

    @Override
    public void setDni(String dni){
        this.dni=dni;
    }

  
}
