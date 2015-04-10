/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import environment.ApplicationStarter;

/**
 *
 * @author mayajones
 */
public class WitchInn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Witch Inn", new InnEnvironment());
    }
    
}
