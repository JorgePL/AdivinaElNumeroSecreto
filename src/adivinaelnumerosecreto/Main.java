
package adivinaelnumerosecreto; 
import adivinaelnumerosecreto.model.Juego;
import java.util.Scanner;


/**
 * @author Jorge Perez
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean seAdivinoElNumeroSecreto = false;
        Juego juego = new Juego(1, 100, 5);
        while (juego.puedeIntentarDeNuevo() == true
            && !seAdivinoElNumeroSecreto) {
            System.out.print("Adivine el número secreto: ");
            numero = entrada.nextInt();
            seAdivinoElNumeroSecreto = juego.esElNumeroSecreto(numero);
            if (seAdivinoElNumeroSecreto) {
                System.out.println("Felicidades. Has adivinado el número secreto.");
            }
            else {
                System.out.println("Fallaste. El número secreto es "
                        + juego.getTextoDeAyuda(numero)
                        + " que el número propocionado");
                System.out.println("Intenta de nuevo.");
            }
        }
        System.out.println("El número secreto es " + juego.getNumeroSecreto());
    }
}
    

