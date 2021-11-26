/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capturar_informacion;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    static Adulto adulto = new Adulto();
    static Alumno alumno = new Alumno();
    static Profesor profesor = new Profesor();
    static Futbolista futbolista = new Futbolista();
    static Scanner sc = new Scanner(System.in);
    static int variable_eleccion;
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("Seleccione como desea ingresar\nAdulto(1)\nAlumno(2)\nProfesor(3)\nFutbolista(4)");
        variable_eleccion = sc.nextInt();
        switch (variable_eleccion){
            case 1: adulto.capturar_informacion();
            break;
            case 2: alumno.capturar_informacion_alumno();
            break;
            case 3: profesor.capturar_informacion_profesor();
            break;
            case 4: futbolista.capturar_informacion_futbolistas();
            break;
            case 5: default: break;
        }
    }
}
