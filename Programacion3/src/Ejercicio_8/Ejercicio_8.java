package Ejercicio_8;

public class Ejercicio_8 {
    int filas = 8;
    int columnas = 8;
    Integer matriz[][] = new Integer[filas][columnas];

    public void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == null) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" " + matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void crearPosicion() {
        for (int i = 0; i < 10; i++) {
            int filaAleatoria = (int) (Math.random() * 7);
            int columnaAleatoria = (int) (Math.random() * 7);
            matriz[filaAleatoria][columnaAleatoria] = 0;
        }
    }

    public void llenarPistas() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int contador = 0;
                if (matriz[i][j] == null && i>0 && j>0 && i<7 && j<7) {
                    for (int k = -1; k <=1 ; k++) {
                        for (int l = -1; l <=1 ; l++) {
                            if (k!=0 && k!=0) {
                                int sumFila= i+k;
                                int sumColumna= j+l;
                                if (matriz[sumFila][sumColumna] == 0 && matriz[sumFila][sumColumna] != null && sumFila>0 && sumColumna>0 && sumFila<filas && sumColumna<columnas) {
                                    contador++;
                                }
                            }
                        }
                    }
                }
                matriz[i][j] = contador;
            }
        }
    }
}





