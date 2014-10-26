/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Alcamech
 * @Version 1.0 October 26 2014
 * 
 * Moving Ball Animation 
 * Screen Size: 400x400
 * Start location: Random
 * Ball Size:30x30 
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
public class JavaApplication10 extends JPanel {
    //declare variables
    Random r = new Random();
    int x = r.nextInt(400);  //random x coord
    int y = r.nextInt(400); //random y coord
    int xS = 2;//x speed
    int yS = 2;// y speed
    private void moveBall()
    {                        
        if(x + xS < 0) //if statement to check 
        {               //and see if circle goes out of bounds
            xS = 2;
        }
        if(x + xS > getWidth()-30) 
        {   
            xS = -2;
        }
        if(y + yS < 0)
        {
            yS = 2;
        }
        if(y + yS > getHeight()-30)
        {
            yS = -2;
        }
        
        x = x + xS; //increasing movement of X and Y coord
        y = y + yS;
    }
    
    @Override
    public void paint(Graphics g) //renders 2D graphics
    {
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.fillOval(x, y, 30, 30); //creates circle
    }
    
    public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Bouncing Ball Demo"); //title for frame
		JavaApplication10 game = new JavaApplication10();
		frame.add(game);
		frame.setSize(400, 400); //frame size
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows exit
		
		while (true) { //while loop to keep the animation going
			game.moveBall();
			game.repaint();
			Thread.sleep(10); //
		}
	}
}
    
    
