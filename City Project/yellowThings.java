
/**
 * Write a description of class yellowthingsintheroad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
public class yellowThings extends JComponent implements Runnable
{
    private int baseX;     
    private int baseY;     
    private Color color;   
    private int height;    
    Random generator = new Random();
    
    public  yellowThings (int x, int y, Color c, int h){
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
           page.drawLine(baseX, baseY-height, baseX+15, baseY-height);
           page.drawLine(baseX+15, baseY-height,baseX+15,baseY);
           page.drawLine(baseX+15, baseY, baseX, baseY);
           page.fillRect(baseX,baseY,15,-height);
           
          
          
          
          

       }
       public void run()
        {
        while(true){
            
            try{
                Thread.sleep(17);
            }catch (Exception e){}

            System.out.print(height);
        }

        }
        
}
