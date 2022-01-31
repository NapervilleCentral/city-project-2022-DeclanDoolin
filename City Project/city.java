//Declan Doolin
import java.awt.*;
    import java.util.*;
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class city extends JComponent //implements Runnable
{
   private final int APPLET_WIDTH = 400;    
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   Random generator = new Random();
  

   private Building figure1,figure2, figure3, figure4, figure5, figure6;
   private Road r1;
   private sky s1;
   private Sun sun1;
   private cars c1, c2, c3;
   
   
   private int running = 0;

   //-----------------------------------------------------------------
   //  Creates several cityscape pieces
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
      c1 = new cars(20,315, Color.blue, 10);
      c2 = new cars(175, 315, Color.yellow, 10);
      c3 = new cars(300, 315, Color.green, 10);
      //creates all parts of cityscape
      

      Thread t1 = new Thread(c1);
      t1.start();
      Thread t2 = new Thread(sun1);
      t2.start();
      Thread t3 = new Thread(c2);
      t3.start();
      Thread t4 = new Thread(c3);
      t4.start();
      //threads of each animated piece
      
   }

   //-----------------------------------------------------------------
   //  
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       
     
      s1.draw(page);
      sun1.draw(page);
      figure1.draw (page);
      figure2.draw (page);
      figure3.draw (page);
      figure4.draw (page);
      figure5.draw (page);
      figure6.draw(page);
      r1.draw(page);
      c1.draw(page);
      c2.draw(page);
      c3.draw(page);
      //draws each part of the cityscape
      
   }

   public void nextFrame()
   {
      

       repaint();

   }

   public void run()
   {
    }
}
