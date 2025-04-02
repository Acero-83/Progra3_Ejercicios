package Ejercicio_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Estudiante extends Persona {
String codigoSIS;

    public Estudiante(String nombre, String primerapellido, String segundoapellido,
                      Calendar fechaNacimiento, Integer ci, String complemento, String codigoSIS) {
        super(nombre, primerapellido, segundoapellido, fechaNacimiento, ci, complemento);
        this.codigoSIS = codigoSIS;
    }
    public void llenarSis(){
        Scanner codigo1 = new Scanner(System.in);
        System.out.println("Ingrese el codigo SIS: ");
        codigoSIS = codigo1.nextLine();
    }
}
