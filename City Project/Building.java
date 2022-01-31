
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
    private int baseX;     
    private int baseY;    
    private Color color;  
    private int height;   
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
          int top = baseY - height;      
          page.setColor (color);
          page.drawLine(baseX, baseY, baseX, top);
          page.drawLine(baseX, top, baseX+80, top);
          page.drawLine(baseX+80, top, baseX+80, baseY);
          page.drawLine(baseX+80, baseY, baseX, baseY);
          page.fillRect(baseX, baseY, 80, -height);
          //draws each building
          Color window = new Color(87, 126, 189);
          Color night = new Color(250, 255, 51);
          //Sets up the different window colors

          for(int i = 40; i < height-8; i+=15){//loop for y
              for(int j = 5; j < 70; j += 15){//loop for x
                  int ran = generator.nextInt(2)+1;//to choose colors
                  if (ran == 1){
                      page.setColor(window);//1 = light
                    }
                  if (ran == 2){
                      page.setColor(night);//2 = yellow
                    }
                  
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
