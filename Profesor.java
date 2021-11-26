/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capturar_informacion;

/**
 *
 * @author lenin
 */
public class Profesor extends Adulto {
    protected String curso;
    protected int id_profesor;

    public Profesor() {
    }

    public void capturar_informacion_profesor(){
        System.out.println("Ingrese el nombre");
        nombre = sc.next();
        System.out.println("Ingrese el apellido");
        apellido = sc.next();
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Ingrese el id de profesor");
        id_profesor = sc.nextInt();
        System.out.println("Ingrese el curso que imparte");
        curso = sc.next();
        System.out.println("Ingrese el genero");
        genero = sc.next();        
        System.out.println("¿Desea regresar al menú inicial?\nSí(1)\nNo(2)");
        variable_eleccion = sc.nextInt();
        if (variable_eleccion == 1){
            Ejecutor.menu();
        }
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
    
}
