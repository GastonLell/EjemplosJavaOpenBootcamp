public class Main {

    public static void main(String[] args){
        Cliente cliente1 = new Cliente();

        cliente1.setEdad(20);
        cliente1.setNombre("Tomasito");
        cliente1.setTelefono("234234234");
        cliente1.setCredito(20000.00);

        System.out.println("----Persona1----");

        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());


        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(26);
        trabajador1.setNombre("Gaston");
        trabajador1.setTelefono("234234234");
        trabajador1.setSalario(130000);

        System.out.println("----Trabajador1----");

        System.out.println(trabajador1.getEdad());
        System.out.println(trabajador1.getNombre());
        System.out.println(trabajador1.getTelefono());
        System.out.println(trabajador1.getSalario());
    }

}

class Persona{
    int edad;
    String nombre;
    String telefono;

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

class Cliente extends Persona{
     double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}