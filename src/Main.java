public class Main {

    public static void main(String[] args){
        suma(1,2,3);

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas();

        System.out.println(miCoche.puertas);
    }

    public static void suma (int a, int b, int c){
        System.out.println(a + b + c);
    }
}

class Coche {
    int puertas = 4;

    public void incrementarPuertas(){
        this.puertas++;
    }
}