package tmp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pannello extends JPanel implements ActionListener, KeyListener
{
	JLabel lblMoneta;
	
	public Pannello()
	{
		setLayout(null);
		
		lblMoneta = new JLabel("moneta");
		lblMoneta.setBounds(330, 23, 45, 13);
		lblMoneta.setIcon(new ImageIcon("progetto informatica\\denaro.png"));
		add(lblMoneta);
		
	}
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	
}