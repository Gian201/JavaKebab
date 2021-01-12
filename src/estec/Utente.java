/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estec;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guagliumi.gianluca
 */
public class Utente implements Runnable {

    private boolean soddisfatto = false;
    private boolean stop = false;
    private Kebabbaro kebabbaro = new Kebabbaro();
    private int numero;
    
    public Utente(Kebabbaro kebabbaro, int numero){
        this.kebabbaro = kebabbaro;
        this.numero = numero;
    }
    
    @Override
    public void run() {
        while(!stop){
            while(!soddisfatto){
                soddisfatto = kebabbaro.sfornaKebab();
                if(soddisfatto) {
                    System.out.println("THREAD SODDISFATTO: "+numero);
                    notifyAll();
                }else{
                    try {
                        wait();
                    } catch (InterruptedException ex) { }
                }
            
            }
        }
    }
        
    
    public void termina() {
        stop = true;
        
    }
    
}
