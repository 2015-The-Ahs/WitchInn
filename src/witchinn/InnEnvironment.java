/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import images.ResourceTools;
import java.awt.Image;


/**
 *
 * @author mayajones
 */
class InnEnvironment extends Environment {

    public InnEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("resources/back_ground_green.png").getScaledInstance(900, 580, Image.SCALE_FAST));
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
    
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
    
    }
    
}
