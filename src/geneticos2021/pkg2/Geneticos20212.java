/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticos2021.pkg2;

import binario.Individuo;

/**
 *
 * @author working
 */
public class Geneticos20212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = new int[]{1,0,0,0,0};
        Individuo i = new Individuo(arreglo);
        System.out.println(i.getFenotipo()+" "+i.getFitness());
    }
    
}
