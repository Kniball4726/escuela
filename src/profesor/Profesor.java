package profesor;

public class Profesor {
    private String nombre;
    private String dni;
    private String materia;

    public Profesor(){};

    public Profesor(String nombre,String dni){
        this.nombre=nombre;
        this.dni=dni;

    }

    public Profesor(String nombre,String dni,String materia){
        this.nombre = nombre;
        this.dni=dni;
        this.materia=materia;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getDni(){
        return dni;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }


}
