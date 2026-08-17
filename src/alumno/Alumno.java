package alumno;

import persona.Persona;

public class Alumno extends Persona {
    private int nota1;
    private int nota2;
    private int nota3;

    public Alumno(String nombre, String dni){
        super();
    }

    public Alumno(String nombre,String dni, int nota1, int nota2, int nota3){
        super();
        this.nota1= nota1;
        this.nota2=nota2;
        this.nota3=nota3;


    }

    public void setNota1(int nota1){
        this.nota1=nota1;
    }

    public int getNota1(){
        return nota1;
    }
    
    public void setNota2(int nota2){
        this.nota2=nota2;
    }

    public int getNota2(){
        return nota2;
    }

    public void setNota3(int nota3){
        this.nota3=nota3;
    }

    public int getNota3(){
        return nota3;
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
