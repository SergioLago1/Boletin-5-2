/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg2;

/**
 *
 * @author slagogonzalez
 */
public class Boletin52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short numero, numero2;
        NumShort n= new NumShort();
        numero=n.setNumero();
        numero2=n.setNumero2();
        n.comprobacion(numero, numero2);
    }
    
}
