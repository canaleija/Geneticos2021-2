/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.util.Random;

/**
 *
 * @author working
 */
public class Muta {
    
    public static void mutaSimple(Individuo ind){
        Random ran = new Random();
        int pos = ran.nextInt(ind.getGenotipo().length);
        if(ind.getGenotipo()[pos]==1){
           ind.getGenotipo()[pos]=0; 
        }else{
           ind.getGenotipo()[pos]=1;  
        }
        ind.calcularFitness();
    }
    
}
