package toets;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class toets extends Applet  {

	float huidigbestelling;
	float dagomzet;
	Button fris;
	Button bier;
	Button wijn;
	Button koffie;
	Button binngedist;
	Button buitgedist;
	Button nieuweBestelling;
	
	
	
	public void init() {
		fris.addActionListener( new FrisListener() );
		bier.addActionListener( new BierListener() );
		wijn.addActionListener( new WijnListener() );
		koffie.addActionListener( new KoffieListener() );
		binngedist.addActionListener( new BinngedistListener() );
		buitgedist.addActionListener( new BuitgedistListener() );
		nieuweBestelling.addActionListener( new NieuwBestellingListener() );
	  }

	  public void paint(Graphics g) {
	    
	    g.drawString("Huidige bestelling:", 50, 60 );
	  }
	  
	  class FrisListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }
	  class BierListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }
	  class WijnListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }
	  class KoffieListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }
	  class BinngedistListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }
	  class BuitgedistListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }
	  class NieuwBestellingListener implements ActionListener	{
	        public void actionPerformed( ActionEvent e ) {
	            repaint();
	        }
	   }


}
