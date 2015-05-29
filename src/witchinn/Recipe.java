/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author mayajones
 */
public class Recipe {
   private Image book;
    private String text = "";
    private String text2 = "";
    private String text3 = "";
    private String text4 = "";
    private Color color;
    
    public Recipe(){
        book = ResourceTools.loadImageFromResource("resources/old_book.png");
        text = "swaggygswaygwysgsway";
        text2 = "mr. lawrence can't kobe";
        text3 = "but maya can";
        text4= "this spacing is bomb";
        
    }

    void draw(Graphics graphics) {
        graphics.drawImage(book, 140, 90, null);
        graphics.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        graphics.setColor(Color.RED);
        graphics.drawString(text, 250, 140);
        graphics.drawString(text2, 250, 160);
        graphics.drawString(text3, 250, 180);
        graphics.drawString(text4, 250, 200);


        
        
    }
 
    
}

//Change font
//Color of text
//Format the ingredients (into lines)
//Pictures
