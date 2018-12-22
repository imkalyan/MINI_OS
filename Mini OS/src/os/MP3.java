/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author pawankalyan
 */
public class MP3 {
   private String filename;
   private Player player;
   
   public MP3(String filename){
       this.filename = filename;
   }
   public void close() {
       if(player != null)  player.close();
    }
   public void play(){
       try{
           FileInputStream fis = new FileInputStream(filename);
           BufferedInputStream bis = new BufferedInputStream(fis);
           player = new Player(bis);
        }
       catch (Exception e) {
           System.out.println("problem playing file " + filename);
           System.out.println(e);
        }
       new Thread(){
           public void run(){
               try{ player.play();
               }
               catch (Exception e){ System.out.println(e);
               }
            }
  
               
       }.start();
               
      }
               
   }
   

   

