/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capturar_informacion;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Adulto {
    static Scanner sc = new Scanner(System.in);
    protected static String nombre;
    protected static String apellido;
    protected static int edad;
    protected static long dpi;
    protected static String genero;
    protected int variable_eleccion;

    public int getVariable_eleccion() {
        return variable_eleccion;
    }

    public void setVariable_eleccion(int variable_eleccion) {
        this.variable_eleccion = variable_eleccion;
    }
    public Adulto() {
    }
    
    public void capturar_informacion(){
        System.out.println("Ingrese el nombre");
        nombre = sc.next();
        System.out.println("Ingrese el apellido");
        apellido = sc.next();
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Ingrese el número de dpi");
        dpi = sc.nextLong();
        System.out.println("Ingrese el genero");
        genero = sc.next();
        System.out.println("¿Desea regresar al menú inicial?\nSí(1)\nNo(2)");
        variable_eleccion = sc.nextInt();
        if (variable_eleccion == 1){
            Ejecutor.menu();
        }
    }
    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Adulto.sc = sc;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Adulto.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Adulto.apellido = apellido;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Adulto.edad = edad;
    }

    public static long getDpi() {
        return dpi;
    }

    public static void setDpi(long dpi) {
        Adulto.dpi = dpi;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Adulto.genero = genero;
    }
    
    
}
