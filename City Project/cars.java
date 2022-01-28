
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
           //page.drawLine(baseX, baseY, baseY-height, baseX);
           page.fillRect(baseX, baseY, baseX, baseY-height);
           page.setColor(color.gray);
           page.drawOval(baseX-1, baseY+10, 9, 9);
           page.fillOval(baseX-1, baseY+10, 9, 9);
           page.drawOval(baseX+32, baseY+10, 9, 9);
           page.fillOval(baseX+32, baseY+10, 9, 9);
 
       }
       public void run()
        {
        while(true){
            int newX = baseX+1;
            baseX = newX;
            try{
                Thread.sleep(40);
            }catch (Exception e){}

            System.out.print(baseX);
        }

        }
        
}
