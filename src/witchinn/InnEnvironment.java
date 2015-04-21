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
<<<<<<< HEAD
=======
import images.ResourceTools;
import java.awt.Image;
import java.awt.Point;

>>>>>>> origin/smg-dragdrop-02

/**
 *
 * @author mayajones
 */
class InnEnvironment extends Environment {
<<<<<<< HEAD

    public InnEnvironment() {
=======
    private Cupboard cupboard;
    
    
    public InnEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("resources/back_ground_green.png").getScaledInstance(900, 580, Image.SCALE_FAST));
        
        cupboard = new Cupboard();
        cupboard.setPosition(new Point(100, 100));
    
>>>>>>> origin/smg-dragdrop-02
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
<<<<<<< HEAD
    
=======
        if (cupboard != null){
            cupboard.paint(graphics);
        }
>>>>>>> origin/smg-dragdrop-02
    }
    
}
