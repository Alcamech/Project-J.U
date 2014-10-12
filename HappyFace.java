Lawton C Mizell
/*
 * 

 * Verison 1.0 ,October 12 2014

 * 

 * Simple program that draws

 * a smiley face with a red nose

 * cheers :D

 * 

 */

import javax.swing.JApplet;

import java.awt.Graphics;

import java.applet.*;

import java.awt.*;



public class HappyFace extends JApplet {

	

		public void paint(Graphics canvas)

		{

			super.paint(canvas); //apply default drawing operations

			canvas.drawArc(150, 160, 100, 50, 180, 180); // draws mouth

			canvas.drawOval(100,50,200,200); // draws a circle

			canvas.setColor(Color.red); //sets eye color to red

			canvas.fillOval(155, 100, 10, 20); // draws first eye

			canvas.fillOval(230, 100, 10, 20); // draws second eye 

			canvas.setColor(Color.red); //sets nose color to red

			canvas.fillOval(190,150,20,20); // draw nose

	 

		

		}



	}




