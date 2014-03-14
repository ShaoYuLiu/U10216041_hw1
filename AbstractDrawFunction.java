import java.awt.*;
import javax.swing.JPanel;

public  abstract class AbstractDrawFunction extends JPanel{
	/** Polygon to hold the points*/
	private Polygon p = new Polygon();
	protected AbstractDrawFunction(){
		drawFunction();
	}
	
	/** Return the y-coordinate*/
	abstract double f(double x);
	
	/** Obtain points for x-coordunates 100, 101, ..., 300*/
	public void drawFunction(){
		for(int x = -100; x <= 100; x++){
			p.addPoint(x + 200, 200 - (int)f(x));
		}
	}
	
	@Override /** Draw axes, labels and connect points*/
	protected void paintComponent(Graphics g){
		// To be completed by you		
	}
}
