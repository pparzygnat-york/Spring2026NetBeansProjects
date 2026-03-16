/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameexampleworkspace1;

/**
 *
 * @author administrator
 */
public class GameExampleWorkspace1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Number n = 0;
        System.out.println(n.toString());
        
        Class<? extends Number> c = n.getClass();
        
        
        Number m = c.cast(n);
        System.out.println(m.toString());
        
        System.out.println(m.doubleValue());
        
    }
    
}
