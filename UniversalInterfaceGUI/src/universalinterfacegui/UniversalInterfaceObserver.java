/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universalinterfacegui;

import  java.util.Objects;
import java.util.Observable;

/**
 *
 * @author administrator
 */
public class UniversalInterfaceObserver implements java.util.Observer {
            UniversalInterfaceObserver(Object arg) {
                arg.toString();
            }
            
            public void update(Observable o, Object arg) {
                System.out.println("Update Occured");
            }
}
