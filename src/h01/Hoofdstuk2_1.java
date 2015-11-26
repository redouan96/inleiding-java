package h01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Hoofdstuk2_1 extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
	    setBackground(Color.white);
	  }

	  

	public void paint(Graphics g) {
	    g.setColor(Color.BLUE);
	    g.drawString("Redouane", 50, 60 );
	    g.setColor(Color.red);
	    g.drawString("Abouzakariae", 50, 100 );
	  }
}
