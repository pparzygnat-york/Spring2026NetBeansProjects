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
public class Widget {
    private
       static int sold;
       boolean insurance;
    public
        void incrementSold(boolean insurance) {
           sold++;
           this.insurance = insurance;
        }
        
        void getSold() {
            System.out.println("Number of widgets sold: " + sold);
        }
        
        void getInsurance() {
            if(insurance) {
                System.out.println("Insurance was purchased.");
            } else {
                System.out.println("Insurance was not purchased.");
            }
        }
    

    
}
