package tmp;

import javax.swing.SwingUtilities;

public class Main
{
	public void tmp()
	{
		Finestra f=new Finestra();
		f.setResizable(false);
		f.setLocationRelativeTo(null);
	}
	
	public void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				tmp();
			}
		});
	}
}