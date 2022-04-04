package tmp;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Denaro
{
	private BufferedImage img;
	private Point point;
	
	public Denaro(int x, int y)
	{
		
	}
	
	private void caricaImg() throws IOException
	{
		img=ImageIO.read(new File("progetto informatica/soldi.png"));
	}
}