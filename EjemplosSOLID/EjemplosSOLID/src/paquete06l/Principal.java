/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TarjetaCredito tarjeta = new TarjetaCredito("Visa", "110011001100");
        // tarjeta.establecerNombre("Visa");
        // tarjeta.establecerNumero("110011001100");
        MayorEdad representante = new MayorEdad("José", tarjeta);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero());
        
    }
}
