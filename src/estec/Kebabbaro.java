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
public class Kebabbaro {
    
    public boolean kebab;
    
    public synchronized boolean sfornaKebab() {
        kebab = false;
        prepara();
        return kebab;
    }
    
    public void prepara() {
         try {
            Thread.sleep(3000);
            kebab = true;
        } catch (InterruptedException ex) { }
         
    }
}
