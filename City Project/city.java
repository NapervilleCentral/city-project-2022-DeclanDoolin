
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
   private yellowThings y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, y11, y12, y13;
   private sky s1;
   private Sun sun1;
   
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public city() //init in applet is like constructor; runs only once
   {                   //Different than start.
      

      

      figure1 = new Building (100, 300, Color.gray, 170);
      //x, y, color, height
      Color lb = new Color(173, 216, 230);
      figure2 = new Building(190, 300, Color.gray, 220);
      figure3 = new Building(290, 300, Color.gray, 130);
      figure4 = new Building(390, 300, Color.gray, 300);
      figure5 = new Building(490, 300, Color.gray, 250);
      figure6 = new Building(0, 300, Color.gray, 190);
      r1 = new Road(0 ,400, Color.black, 100);
      y1 = new yellowThings(0, 330, Color.yellow, 5);
      y2 = new yellowThings(50, 330, Color.yellow, 5);
      y3 = new yellowThings(100, 330, Color.yellow, 5);
      y4 = new yellowThings(150, 330, Color.yellow, 5);
      y5 = new yellowThings(200, 330, Color.yellow, 5);
      y6 = new yellowThings(250, 330, Color.yellow, 5);
      y7 = new yellowThings(300, 330, Color.yellow, 5);
      y8 = new yellowThings(350, 330, Color.yellow, 5);
      y9 = new yellowThings(400, 330, Color.yellow, 5);
      y10 = new yellowThings(450, 330, Color.yellow, 5);
      y11= new yellowThings(500, 330, Color.yellow, 5);
      y12 = new yellowThings(550, 330, Color.yellow, 5);
      y13= new yellowThings(600, 330, Color.yellow, 5);
      s1= new sky(0,400, lb, 400);
      
      
         
        
      

     

      //Thread t1 = new Thread(ground);
      //t1.start();
      //Thread t2 = new Thread(figure2);
      //t2.start();
      //Thread t3 = new Thread(figure3);
      //t3.start();

      setBackground(Color.blue);
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
     
      s1.draw(page);
      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      figure5.draw (page);
      figure6.draw(page);
      //ground.draw(page);
      r1.draw(page);
      y1.draw(page);
      y2.draw(page);
      y3.draw(page);
      y4.draw(page);
      y5.draw(page);
      y6.draw(page);
      y7.draw(page);
      y8.draw(page);
      y9.draw(page);
      y10.draw(page);
      y11.draw(page);
      y12.draw(page);
      y13.draw(page);
      

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
