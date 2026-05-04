/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsandbox;

/**
 *
 * @author administrator
 */
public class OOPSandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Widget w1 = new Widget();
        Widget w2 = new Widget();
        
        w1.incrementSold(true);
        w2.incrementSold(false);
        
        w1.getSold();
        w1.getInsurance();
        w2.getSold();
        w2.getInsurance();
        
    }
    
}
