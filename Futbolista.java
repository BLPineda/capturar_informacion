/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capturar_informacion;

/**
 *
 * @author lenin
 */
public class Futbolista extends Adulto {
    protected String posicion;
    protected int dorsal;

    public Futbolista() {
    }
    
    public void capturar_informacion_futbolistas(){
        System.out.println("Ingrese el nombre");
        nombre = sc.next();
        System.out.println("Ingrese el apellido");
        apellido = sc.next();
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        System.out.println("Ingrese el dorsal que porta");
        dorsal = sc.nextInt();
        System.out.println("Ingrese la posicion que ocupa");
        posicion = sc.next();        
        System.out.println("¿Desea regresar al menú inicial?\nSí(1)\nNo(2)");
        variable_eleccion = sc.nextInt();
        if (variable_eleccion == 1){
            Ejecutor.menu();
        }
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
}
