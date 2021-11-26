/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capturar_informacion;

/**
 *
 * @author lenin
 */
public class Alumno extends Adulto {
    private int id_estudiante;

    public Alumno() {
    }

    public void capturar_informacion_alumno(){
        System.out.println("Ingrese el nombre");
        nombre = sc.next();
        System.out.println("Ingrese el apellido");
        apellido = sc.next();
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Ingrese el id del estudiante");
        id_estudiante = sc.nextInt();
        System.out.println("Ingrese el genero");
        genero = sc.next();
        System.out.println("¿Desea regresar al menú inicial?\nSí(1)\nNo(2)");
        variable_eleccion = sc.nextInt();
        if (variable_eleccion == 1){
            Ejecutor.menu();
        }
    }
    
    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    
    
}
