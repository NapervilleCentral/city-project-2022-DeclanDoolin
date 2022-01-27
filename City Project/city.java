
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
   private Building figure1,figure2, figure3, figure4, figure5, figure6;
   private Road r1;
   private sky s1;
   private Sun sun1;
   private cars c1, c2;
   
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public city() //init in applet is like constructor; runs only once
   {                   //Different than start.
      

      
      Color lb = new Color(173, 216, 230);
      figure1 = new Building (100, 300, Color.gray, 170);
      figure2 = new Building(190, 300, Color.gray, 220);
      figure3 = new Building(290, 300, Color.gray, 130);
      figure4 = new Building(390, 300, Color.gray, 300);
      figure5 = new Building(490, 300, Color.gray, 250);
      figure6 = new Building(0, 300, Color.gray, 190);
      r1 = new Road(0 ,400, Color.black, 100);
      s1= new sky(0,400, lb, 400);
      sun1 = new Sun(0, 200, Color.yellow, 0);
      c1 = new cars(20,305, Color.blue, 295);
      c2 = new cars(300, 305, Color.yellow, 295);
      
         
        
      

     

      Thread t1 = new Thread(c1);
      t1.start();
      Thread t2 = new Thread(sun1);
      t2.start();
      //Thread t3 = new Thread(figure3);
      //t3.start();

      
      //setSize (APPLET_WIDTH, APPLET_HEIGHT); //Sets up applet window

      
   }

   //-----------------------------------------------------------------
   //  
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       //page = this.page;
     
      s1.draw(page);
      sun1.draw(page);
      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      figure5.draw (page);
      figure6.draw(page);
      //ground.draw(page);
      r1.draw(page);
      
      c1.draw(page);
      c2.draw(page);

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
