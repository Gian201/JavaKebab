/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estec;

/**
 *
 * @author guagliumi.gianluca
 */
public class EsTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //applicativo ove dichiarato un array di 20 istanze di thread (elementi) che tentino di accedere simultaneamente ad una risora kebab condivisa
         //il kebabbaro può soddisfare solo una richiesta per volta, visualizzare a schermo in che ordine vengono soddisfatti i 20 clienti
         //il kebabbaro consegn aun kebab ogni 5 secondi
         
         Kebabbaro kebabbaro = new Kebabbaro();
         Thread t[] = new Thread[20];
         for(int i = 0; i<20; i++){
             t[i] = new Thread(new Utente(kebabbaro, i));
             
         }
         
         for(int i = 0; i<20; i++){
             t[i].start();
         }
         

    }
    
}
