package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    String [] vectorOriginal;
    String [] vectorFinal;
    Scanner sc;
    public Ejercicio_2() {
        vectorOriginal= new String[5];
        vectorFinal = new String[5];
        sc = new Scanner(System.in);
    }

    //Metodo que ejecuta el ejercicio
    public void execute (){
        // Llenar el vector original
        for (int i = 0; i < vectorOriginal.length ; i++) {
            System.out.print("Introduce el caracter que va en la posicion ["
            +i+"]: ");
            String caracter = sc.nextLine();
            vectorOriginal[i] = caracter;
        }
        // Invertir original
        int indiceOriginal=0;
        int indiceFinal=4;
        while (indiceOriginal<vectorOriginal.length){
            vectorFinal[indiceFinal]=vectorOriginal[indiceOriginal];
            indiceOriginal++;
            indiceFinal--;
        }
        for (int i = 0; i < vectorFinal.length; i++) {
            System.out.println("Vector Inverso en [ "+i+"]: "+vectorFinal[i]);

        }
    }
}
