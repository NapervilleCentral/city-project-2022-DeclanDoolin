
/**
 * Write a description of class Sun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
public class Sun extends JComponent implements Runnable
{
    private int baseX;     
    private int baseY;     
    private Color color;   
    private int height;    
    Random generator = new Random();
    
    public Sun(int x, int y, Color c, int h){
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
           Color s = new Color(255,255,255);

           page.drawOval(baseX, baseY, 50 , 40); 
           page.fillOval(baseX, baseY, 50, 40);
           //draws and colors the sun
           if(baseY<0){
               baseY=200;
               baseX=0;
               page.setColor(s);
               //resets when out of frame
            }
           }
       
       public void run()
        {
        while(true){
            int newX = baseX+2;
            int newY = baseY-1;
            baseX = newX;
            baseY = newY;
            //keeps the sun moving up and to the right

            try{
                Thread.sleep(30);
            }catch (Exception e){}
            System.out.print(baseX);
            System.out.print(baseY);
        }
        }
        
}