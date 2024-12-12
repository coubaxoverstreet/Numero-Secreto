import java.util.Scanner;
import java.util.Random;

public class Adivinanza {
    public static void main(String[] args) {
        //Crear el objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        //Generar un numero aleatorio entre 0 y 99
        int numeroSecreto = new Random().nextInt(100);

        //Numero Maximo de intentos
        int maxIntentos = 5;

        //Contador de intentatos
        int intentos = 0;

        System.out.println("Bienvenido al Juego de las Adivinanzas");
        System.out.println("Estoy pensando en un numero entre 0 y 99");
        System.out.println("Tienes"+maxIntentos+"intentos para adivinarlo");

        //Bucle para los intentos
        while(intentos < maxIntentos){
            System.out.println("Intento"+(intentos+1)+":Introduce tu numero:");
            int adivinanza = scanner.nextInt();
            intentos++;//Incrementa el contador de intentos

            if (adivinanza == numeroSecreto){
                System.out.println("Felicidades Adiviniaste el numero");
                break;
            }else if (adivinanza < numeroSecreto){
                System.out.println("El numero es mayor");
            }else{
                System.out.println("El numero es menor");
            }

            if(intentos == maxIntentos){
                System.out.println("Lo siento pero se acabaron tus intentos. El numero secreto era:"+(numeroSecreto));
            }


        }



    }
}
