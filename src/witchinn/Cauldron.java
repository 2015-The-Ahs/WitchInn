/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import environment.Actor;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author Shayla
 */
public class Cauldron extends Actor {
    private Dimension preferredSize;
       
    public static Image loadImage(String path) {
        return ResourceTools.loadImageFromResource(path);
    }

    {


        setImage(ResourceTools.loadImageFromResource("resources/EmptyC.PNG").getScaledInstance(400, 150, Image.SCALE_FAST));

    }
    
    public Cauldron(Point position, Velocity velocity) {
        super(position, velocity);
    }

  
  

    private Image getScaledImage() {
        return super.getImage().getScaledInstance(preferredSize.width, preferredSize.height, Image.SCALE_FAST);
       
  }

     public Dimension getPreferredSize() {
         
       
        Dimension preferredSize = null;
        return preferredSize;
       
    }

    /**
     * @param preferredSize the preferredSize to set
     */
    public void setPreferredSize(Dimension preferredSize) {
        this.preferredSize = preferredSize;
    }


}
