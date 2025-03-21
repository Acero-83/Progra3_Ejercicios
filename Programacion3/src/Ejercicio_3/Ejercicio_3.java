package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
    //Definimos el arreglo
    int [] notas;
    Scanner sc;
    //Creamso un constructor
    Ejercicio_3() {
        notas=new int[5];
        sc=new Scanner(System.in);
    }
    //creamos el metodo ejecutar
    public void executable(){
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota en la posicion ["+i+"]: ");
            int nota= sc.nextInt();
            notas[i]=nota;
        }
        //mostrar el contenido de las notas
        int suma = 0;
        double promedio;
        int minimo = 0;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma+notas [i];
            System.out.println("notas ["+i+"]" + notas[i]);
            if (notas[i]> maximo){
                maximo=notas[i];
            }
            if (notas[i]<minimo){
                minimo=notas[i];
            }

        }
        promedio=suma/ notas.length;
        System.out.println("Promedio "+promedio);
        System.out.println("Valor maximo "+maximo);
        System.out.println("Valor minimo "+minimo);
    }
}
