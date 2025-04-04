package Ejercicio_4;


import POJOS.Estudiante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio_4 {
    private Estudiante[] estudiantes;

    public Ejercicio_4() throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Inicializar el arreglo con 20 estudiantes
        estudiantes[0] = new Estudiante("Miguel Angel", "Acero", "Valencia", formato.parse("6/05/2002"), 12345601, null, "202006876");

    }

        public void ejecutar () {
            // Ordenar estudiantes por edad (mayor a menor)
            Arrays.sort(estudiantes, new Comparator<Estudiante>() {
                @Override
                public int compare(Estudiante e1, Estudiante e2) {
                    return Integer.compare(e2.calcularEdad(), e1.calcularEdad());
                }
            });

            // Imprimir estudiantes ordenados
            System.out.println("Estudiantes ordenados por edad (mayor a menor):\n");
            for (Estudiante e : estudiantes) {
                System.out.println(e.getNombre() + " " + e.getApellido1() + " (" + e.calcularEdad() + " años) - Código: " + e.getCodigoSiss());
            }
        }

    }



