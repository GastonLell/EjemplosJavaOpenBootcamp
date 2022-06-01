
public class Main {

    public static void main(String[] args){
        Persona user = new Persona();

        user.setEdad(20);
        user.setNombre("Pedro");
        user.setTelefono("3434543543");

        System.out.println(user.getEdad());
        System.out.println(user.getNombre());
        System.out.println(user.getTelefono());

    }

}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}

