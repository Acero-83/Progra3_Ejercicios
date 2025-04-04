package POJOS;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    private Integer cedulaIdentidad;
    private String complemento;

    // Constructor
    public Persona(String nombre, String apellido1, String apellido2,
                   Date fechaNacimiento, Integer cedulaIdentidad, String complemento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.cedulaIdentidad = cedulaIdentidad;
        this.complemento = complemento;
    }

    // Método para calcular la edad
    public int calcularEdad() {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
