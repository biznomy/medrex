package medrex.client.test;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TestImg {

	public static void main(String args[]) {
		try {
			Image a = ImageIO.read(new File("c:\\a.jpg"));
			new ImageIcon(a);

		}

		catch (Exception e) {

		}

	}

}
