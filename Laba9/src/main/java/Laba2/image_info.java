package Laba2; //����� Java �������

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class image_info extends JComponent {
	private Image image;

	public image_info() {
			// �������� �����������.
		try {
			image = ImageIO.read(new File("src/main/resources/Images/�������.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void paintComponent(Graphics g) {
		
			if (image == null) { 
			return;
			
			}
			g.drawImage(image, 0, 0, null);

	}

}