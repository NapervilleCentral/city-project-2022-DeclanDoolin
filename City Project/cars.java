
/**
 * Write a description of class cars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
public class cars extends JComponent implements Runnable
{
    private int baseX;     
    private int baseY;     
    private Color color;   
    private int height;    
    Random generator = new Random();
    
    public cars(int x, int y, Color c, int h){
        baseX = x;
        baseY = y;
        color = c;
        height = h; 
    }
    public void setHeight(int size){
        height = size;
        System.out.println(color);
    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        draw (g2);
    }
    public void draw (Graphics2D page)
       {
           
           page.setColor (color);
           int top = baseY - height;
           page.drawLine(baseX, baseY, baseX, top);
          page.drawLine(baseX, top, baseX+35, top);
          page.drawLine(baseX+35, top, baseX+35, baseY);
          page.drawLine(baseX+35, baseY, baseX, baseY);
          page.fillRect(baseX, baseY, 35, -height);
            //Creates the bodys of the cars
           page.setColor(color.gray);
           page.drawOval(baseX-1, baseY, 7, 7);
           page.fillOval(baseX-1, baseY, 7, 7);
           page.drawOval(baseX+32, baseY, 7, 7);
           page.fillOval(baseX+32, baseY, 7, 7);
           //creates the wheels
           
           if (baseX > 600){
               baseX=0;
               //resets the position after it goes out of frame
            }
           }
 
       
       public void run()
        {
        while(true){
            int newX = baseX+1;
            baseX = newX;
            //will keep the car moving forward on the x axis
            try{
                Thread.sleep(10);
            }catch (Exception e){}

            System.out.print(baseX);
        }

        }
        
}
