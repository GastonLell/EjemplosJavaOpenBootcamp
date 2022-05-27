public class EstructuraDeControl {
    public static void main(String[] args){

        //if
        int numeroIf = 0;

        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }

        // while
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //do while
        int numeroDoWhile = 0;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);

        } while (numeroDoWhile > 3);

        // for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++ ){
            System.out.println(numeroFor);
        }

        //switch
        String estacion = "OTONIO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "OTONIO":
                System.out.println("Estamos en otonio");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            default:
                 System.out.println("No estamos en ninguna estacion");

        }

    }
}
