/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package witchinn;

import audio.Audio;
import audio.AudioEvent;
import audio.AudioEventListenerIntf;
import audio.Playlist;
import audio.SoundManager;
import audio.Source;
import audio.Track;
import environment.Environment;
import environment.Velocity;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import images.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mayajones
 */
class InnEnvironment extends Environment implements MouseMotionListener {

    private Cupboard cupboard;
    int mx, my;

    Ingredient selected;
    Cauldron cauldron;
    private Ingredient ingredient;
    private Recipe recipe;
    
    
    private boolean showRecipe = false;

    public InnEnvironment() {
        this.setBackground(ResourceTools.loadImageFromResource("resources/background.PNG").getScaledInstance(900, 580, Image.SCALE_FAST));
        cupboard = new Cupboard();
        cupboard.setPosition(new Point(100, 100));
        addMouseMotionListener(this);
        cauldron = new Cauldron(new Point(350, 350), new Velocity(0, 0));
        this.getActors().add(cauldron);

        this.recipe = new Recipe();
        
    }

    public static void main(String[] arg) {
        witchinn.Mouse Mouse = new Mouse();
    }

    @Override

    public void initializeEnvironment() {
        Playlist myPlaylist = new Playlist(getTracks());

        soundManager = new SoundManager(myPlaylist, new AudioEventListener());

    }
    private SoundManager soundManager;
    private static final String Magic_Music = "Magic";

    private ArrayList<Track> getTracks() {
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track(Magic_Music, Source.RESOURCE, "/resources/witch_music.wav"));

        return tracks;
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode()== KeyEvent.VK_1){
            soundManager.play(Magic_Music);
            } else if (e.getKeyCode() == KeyEvent.VK_0){
            soundManager.play(Magic_Music, Audio.LOOP_INFINITE);
        } else if (e.getKeyCode() == KeyEvent.VK_R){
            showRecipe = !showRecipe;
        }
    }

    private class AudioEventListener implements AudioEventListenerIntf {

        @Override
        public void onAudioEvent(AudioEvent event, String trackName) {
            System.out.printf("Audio Event %s on track %s/n", event, trackName);
        }
    }

    public void timerTaskHandler() {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
//        System.out.println("Meese - click" + e.getX() + " , " + e.getY());

        for (Ingredient myIngredient : cupboard.getIngredientList()) {
            if (myIngredient != null) {
                if (myIngredient.contains(e.getPoint())) {
//                    System.out.println("Selected : " + ingredient.getName() + ingredient.getObjectBoundary().toString());

                    try {
                        selected = myIngredient.clone();
                        selected.setPosition(e.getPoint());
//                        System.out.println("unga bunga");
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

        if (selected != null) {
            selected.paint(graphics);
//            System.out.println("pict ");
        }
        
        if ((recipe != null) && (showRecipe)){
            recipe.draw(graphics);
        }

    }

    
    private void dissapear() {
        if (true) {
            ingredient.setPosition(100_000, 100_000);
        }
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

        if (selected != null) {
            selected.setPosition(e.getPoint());
            if (selected.intersects(cauldron)){
                System.out.println("qwertyurtyusdfgh");
                // make a sound
                // set selected to null
                // check things off the receipe
            }
            
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
    }
//</editor-fold>
}
