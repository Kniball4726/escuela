package alumno;

public class Alumno {
    private String nombre;
    private String dni;
    private int nota1;
    private int nota2;
    private int nota3;

    public Alumno(){}

    public Alumno(String nombre,String dni){
        this.nombre = nombre;
        this.dni = dni;

    }
    
    public Alumno(String nombre, String dni, int nota1, int nota2,int nota3 ){
        this.nombre = nombre;
        this.dni = dni;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;

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

    public void setNota1(int nota1){
        this.nota1 = nota1;
    }

    public int getNota1(){
        return nota1;
    }

   public void setNota2(int nota2){
        this.nota2 = nota2;
    }

    public int getNota2(){
        return nota2;
    }
    public void setNota3(int nota3){
        this.nota3 = nota3;
    }

    public int getNota3(){
        return nota3;
    }

    public int promedio(int nota1, int nota2, int nota3){
        return (nota1+nota2+nota3)/3;
    }
}
