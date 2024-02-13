import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	double pi = 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481;
	/* this method should recursive draw concentric rings */
	public void trig(Graphics g, int width, double degrees) {
		
		//if width is 1, too small
		if(degrees > 360.0) return;
		
		else {
			int sin = (int) Math.sin(degrees*pi/180);
			int cos = (int) Math.cos(degrees*pi/180);
			g.setColor(Color.blue);
			g.drawOval(sin*(width/2) + width, cos*(width/2) + width, width, width);
			trig(g, width, degrees + 1);
			
		}
	}
	
	
	public void squares(Graphics g) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		
		
	}
	
	
	
	
	public void clover(Graphics g, int width, int x, int y, int sub) { //What additional variables will you need to draw the shape?
		if(width/2 < 1) {
			return;
		}
		else {
		g.setColor(Color.blue);
		g.drawOval(x + sub, y + sub, width, width);
		g.drawOval(x + width, y + width, width, width);
		g.drawOval(x + width, y - sub, width, width);
		g.drawOval(x - sub, y + width, width, width);
		clover(g, width - 10, x, y, sub + 5);
		}
	}
	


	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		
		this.trig(g, 300, 0);
		this.clover(g, 100, 50, 50, 0);
	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
	Timer t = new Timer(16, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete