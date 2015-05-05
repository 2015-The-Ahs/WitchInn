/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import environment.Environment;
import environment.Velocity;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import images.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseMotionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author mayajones
 */
class InnEnvironment extends Environment implements MouseMotionListener {

    private Cupboard cupboard;
    int mx, my;
    
    Ingredient selected;
    Cauldron cauldron;

    public InnEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("resources/back_ground_green.png").getScaledInstance(900, 580, Image.SCALE_FAST));

        cupboard = new Cupboard();
        cupboard.setPosition(new Point(100, 100));
        addMouseMotionListener(this);
        cauldron = new Cauldron(new Point(350,350), new Velocity(0,0));
        this.getActors().add(cauldron);

    }

    public static void main(String[] arg) {
        witchinn.Mouse Mouse = new Mouse();
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

        for (Ingredient ingredient : cupboard.getIngredientList()) {
            if (ingredient != null) {
                if (ingredient.contains(e.getPoint())) {
                    System.out.println("Selected : " + ingredient.getName() + ingredient.getObjectBoundary().toString());
                    
                    try {
                        selected = ingredient.clone();
                        System.out.println("unga bunga");
                        
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(InnEnvironment.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (cupboard != null) {
            cupboard.paint(graphics);
        }
        
        if (selected != null){
            selected.paint(graphics);
            System.out.println("pict ");
        }
        
//        if (cauldron != null){
//            cauldron.paint(graphics);
//        }
    }

    private void setResizable(boolean b) {

    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {

    }

//<editor-fold defaultstate="collapsed" desc="MouseMotionListener">
    @Override
    public void mouseDragged(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
      
        if (selected != null){
            selected.setPosition(e.getPoint());
        }
        
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
    }
//</editor-fold>

}
