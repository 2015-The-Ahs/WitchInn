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
import java.awt.Point;


/**
 *
 * @author mayajones
 */
class InnEnvironment extends Environment {
    private Cupboard cupboard;
    
    
    public InnEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("resources/back_ground_green.png").getScaledInstance(900, 580, Image.SCALE_FAST));
        
        cupboard = new Cupboard();
        cupboard.setPosition(new Point(100, 100));
    
    }

    public void DragDrop(){
      
        
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
        System.out.println("Meese - click" + e.getX() + " , " + e.getY());
        
        
        for (Ingredient ingredient : cupboard.getIngredientList()){
            if (ingredient != null){
                if (ingredient.contains(e.getPoint())){
                    System.out.println("Selected : " + ingredient.getName() + ingredient.getObjectBoundary().toString());
                    this.DragDrop();
                }
            }
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (cupboard != null){
            cupboard.paint(graphics);
        }
    }
    
}
