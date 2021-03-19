/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticos2021.pkg2;

import binario.GeneticoBinario;
import binario.Herramientas;
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
       
        GeneticoBinario gb = new GeneticoBinario(50, 12, 0.12,15);
        gb.evolucionar();
        System.out.println(Herramientas.mejorPoblacion(gb.getPoblacionActual()));
    }
    
}
