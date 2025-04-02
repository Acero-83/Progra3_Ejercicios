package Ejercicio_5;

public class Ejercicio_5 {
    int[] vector;

    public Ejercicio_5() {
       vector = new int [10];
    }
    public void ejecutar() {
        for (int i = 0; i < vector.length; i++) {
            int ramdom= (int) (Math.random()*100+1);
            vector[i] = ramdom;
        }
        System.out.println("Vector Original");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector ["+i+"]: " + vector[i]);
        }
        // burbuja
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 -i; j++) {
                if (vector[j] > vector[j+1]) {
                    int auxiliar = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("Vector Final");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector ["+i+"]" + vector[i]);
        }
    }
}
