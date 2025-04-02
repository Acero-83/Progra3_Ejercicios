package Ejercicio_4;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Persona {
    String nombre;
    String Primerapellido;
    String Segundoapellido;
    Calendar fechaNacimiento;
    Integer ci;
    String complemento;
    Scanner sc = new Scanner(System.in);
    Scanner intsc = new Scanner(System.in);

    public Persona(String nombre, String primerapellido, String segundoapellido, Calendar fechaNacimiento, Integer ci, String complemento) {
        this.nombre = nombre;
        Primerapellido = primerapellido;
        Segundoapellido = segundoapellido;
        this.fechaNacimiento = fechaNacimiento;
        this.ci = ci;
        this.complemento = complemento;
    }

    public void calcularEdad(){
        System.out.println("Ingrese la fecha de nacimiento en NUMEROS: ");
        System.out.print ("DIA: ");
        int dia = intsc.nextInt();
        System.out.print("MES: ");
        int mes = intsc.nextInt();
        System.out.println("AÑO: ");
        int año= intsc.nextInt();
        fechaNacimiento= new GregorianCalendar();
        Calendar fechahoy = Calendar.getInstance();

        int añoNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int añoActual= fechahoy.get(Calendar.YEAR);
        int edad= añoActual-añoNacimiento;
        System.out.println("EDAD: "+edad);

    }
    public void CIconComplemento(){
        System.out.println("Ingrese su CI: ");
        ci = intsc.nextInt();
        System.out.println("¿Su CI cuenta con Complemento? Si/No");
        String respuesta = sc.nextLine();
        String mayusculas= respuesta.toUpperCase();
        if(mayusculas.equals("SI")){
            System.out.println("Introduzca el complemento que lleva: ");
            complemento = sc.nextLine();
            System.out.println("CI: "+ci+complemento);
        } else if(mayusculas.equals("No")){
            complemento = null;
            System.out.println("CI: "+ci);
        } else {
            System.out.println("Respuesta no válida");
        }
    }
    public void  Registro (){
      System.out.println("Ingrese su nombre: ");
      nombre = sc.nextLine();
      System.out.println("Ingrese su primerapellido: ");
      Primerapellido = sc.nextLine();
      System.out.println("Ingrese su segundoapellido: ");
      Segundoapellido = sc.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerapellido() {
        return Primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        Primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return Segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        Segundoapellido = segundoapellido;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
