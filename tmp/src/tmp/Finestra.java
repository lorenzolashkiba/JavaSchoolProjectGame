package tmp;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Finestra extends JFrame implements WindowListener
{
	private Pannello p;
	
	public Finestra()
	{
		p=new Pannello();
		this.setTitle("Miiari ace");
		this.setContentPane(p);
		this.setBounds(50, 50, 980, 600);
		this.setVisible(true);
		this.addWindowListener(this);
	}
	
	
	
	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}	
}