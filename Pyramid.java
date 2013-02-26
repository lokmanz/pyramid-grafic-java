/*
 * File: Pyramid.java
 * ------------------
 * This program is a stub for the Pyramid problem, which draws
 * a brick pyramid.
 */

import acm.program.*;
import acm.graphics.*;

public class Pyramid extends GraphicsProgram {

	// Name:
	// Section Leader:
	
	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 22;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 10;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 30;
	
	public void run() {
		int x = (getWidth() - (BRICKS_IN_BASE * BRICK_WIDTH))/ 2;
		int y = 2*(getHeight() /2) - BRICK_HEIGHT;
		GLabel label = new GLabel("PYRAMID");
		double p = (getWidth() - label.getWidth())/2;
		label.setFont("SansSerif-50");
		add(label,p-80,120);

		for (int j = BRICKS_IN_BASE,h=1; j>= 1; j--,h++){
			for ( int i = j; i >= 1; i--,x+=BRICK_WIDTH ){
				GRect r1 = new GRect (x,y,BRICK_WIDTH,BRICK_HEIGHT);
				add (r1);			
			}
			x = (getWidth() - (BRICKS_IN_BASE * BRICK_WIDTH))/ 2 + ((h*BRICK_WIDTH)/2);
			y-=BRICK_HEIGHT;
		}

		// You fill this in
	}
}
