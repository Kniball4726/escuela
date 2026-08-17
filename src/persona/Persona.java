package persona;

public class Persona {
    protected String nombre;
    protected String dni;

    public Persona(){};

    public Persona(String nombre,String dni){
        this.nombre = nombre;
        this.dni = dni;


    }

    public String getNombre(){
        return nombre;
    }

    protected void setNombre(String nombre){
        this.nombre=nombre;
    }

    protected String getDni(){
        return dni;
    }

    protected void setDni(String dni){
        this.dni=dni;
    }
}
