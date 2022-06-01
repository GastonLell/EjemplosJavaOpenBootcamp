
public class Main {

    public static void main(String[] args){

        Coche coche = new Coche(3, 180);

        System.out.println(coche.puertas);

        coche.setAcelerar(200);

        System.out.println(coche.getVelocidadActual());

    }

}

class Coche {
    int puertas = 4;
    int velocidadMaxima;
    private float velocidadActual;

    //sobrecarga de constructores
    public Coche(){
        System.out.println("constructor sin argumentos");
        this.puertas = 5;
        velocidadMaxima = 90;
    }

    public Coche(int puertas, int velocidad){
        System.out.println("constructor con argumentos");

        this.puertas = puertas;
        velocidadMaxima = velocidad;
    }

    public void setAcelerar(int value){
        if(value > this.velocidadMaxima){
            this.velocidadActual = this.velocidadMaxima;
        } else {
            this.velocidadActual += value;
        }
    }
    public void setDesacelerar(){
        this.velocidadActual -= 15;
    }
    public float getVelocidadActual(){
        return this.velocidadActual;
    }
}

