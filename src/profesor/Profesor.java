package profesor;

import persona.Persona;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String dni){
        super(nombre, dni);
    }

    public Profesor(String nombre, String dni, String materia){
        super(nombre, dni);
        this.materia = materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }
    @Override
    public String getDni(){
        return dni;
    }

    @Override
    public void setDni(String dni){
        this.dni = dni;
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

}
