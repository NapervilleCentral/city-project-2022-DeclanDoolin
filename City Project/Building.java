
/**
 * Write a description of class Buildings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
 
public class Building extends JComponent implements Runnable
{
    private int baseX;     // center of figure
    private int baseY;     // floor (bottom of feet)
    private Color color;   // color of stick figure
    private int height;    // height of stick figure
    Random generator = new Random();
    
    public Building(int x, int y, Color c, int h){
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
          int top = baseY - height;  // top of head
                                     //y needs to move, not height.

          page.setColor (color);
          //                 x     y    h  w x,y is the starting point H,w is how big the shape is
          

          
                                    //remember, increase y actually moves closer to bottom

          page.drawLine(baseX, baseY, baseX, top);
          page.drawLine(baseX, top, baseX+80, top);
          page.drawLine(baseX+80, top, baseX+80, baseY);
          page.drawLine(baseX+80, baseY, baseX, baseY);
          page.fillRect(baseX, baseY, 80, -height);
          
          Color window = new Color(87, 126, 189);
          for(int i = 40; i < height-8; i+=15){
              for(int j = baseX+5; j < baseX+70; j += 15){
                  
                  page.setColor(window);
                  page.fillRect(baseX+j, baseY-i, 10, 10);
                  
                }
            }
            
          
          

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
