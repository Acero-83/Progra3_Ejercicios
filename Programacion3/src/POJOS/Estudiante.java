package POJOS;


import java.util.Date;

public class Estudiante extends Persona{
    String codigoSiss;

    public Estudiante(String nombre, String apellido1, String apellido2,
                      Date fechaNacimiento, Integer cedulaIdentidad, String complemento, String codigoSiss) {
        super(nombre, apellido1, apellido2, fechaNacimiento, cedulaIdentidad, complemento);
        this.codigoSiss = codigoSiss;
    }

    public String getCodigoSiss() {
        return codigoSiss;
    }

    public void setCodigoSiss(String codigoSiss) {
        this.codigoSiss = codigoSiss;
    }
}
