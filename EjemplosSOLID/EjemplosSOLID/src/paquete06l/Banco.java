/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class Banco {
    private String nombre;
    
    public Banco(String b){
        nombre = b;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
}
