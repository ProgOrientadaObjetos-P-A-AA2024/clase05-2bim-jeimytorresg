/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author utpl
 */
public class TarjetaCredito {
    private String nombre;
    private String numero;
    private Banco banco;

    public TarjetaCredito(String n, String num, Banco b) {
        nombre = n;
        numero = num;
        banco = b;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumero(String num) {
        numero = num;
    }
    
    public void establecerBanco(Banco b) {
        banco = b;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNumero() {
        return numero;
    }
    
    public Banco obtenerBanco(){
        return banco;
    }
    
    
    
    
}
