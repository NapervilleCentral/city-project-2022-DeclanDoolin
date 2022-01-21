
import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class city extends JComponent //implements Runnable
{
   private final int APPLET_WIDTH = 400;    //Size constants
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   Random generator = new Random();
   //Graphics page;

   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   private Building figure1,figure2, figure3, figure4;
   
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public city() //init in applet is like constructor; runs only once
   {                   //Different than start.
      int h1,h2,h3,h4;  // heights of stick figures

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);


      figure1 = new Building (100, 150, Color.gray, h2);
      //x, y, color, height
      
      figure2 = new Building(180, 150, Color.gray, h1);
      figure3 = new Building(280, 150, Color.gray, h4);
      figure4 = new Building(380, 150, Color.gray, h2);
      

     

      //Thread t1 = new Thread(ground);
      //t1.start();
      //Thread t2 = new Thread(figure2);
      //t2.start();
      //Thread t3 = new Thread(figure3);
      //t3.start();


      //setBackground (Color.black); //sets the color of background
      //setSize (APPLET_WIDTH, APPLET_HEIGHT); //Sets up applet window

      //figure2.draw(page);


   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       //page = this.page;
     
      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      //ground.draw(page);

      /*Thread t1 = new Thread(ground);
      t1.start();

      /*
      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure1.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure2.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure3.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure4.setHeight(newHeight);
      */
      //try{
          //pause program for quarter-sec (in miliseconds)
          //Thread.sleep(250);
        //}
      //catch(InterruptedException e){}

      

      //repaint(); //IMPORTANT LINE
   }

   public void nextFrame()
   {
       //figure1.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure2.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure3.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure4.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //running ++;
       //ground.setX(running);
       //Thread t1 = new Thread(ground);
       //t1.start();

       repaint();

   }

   public void run()
   {
    }
}
