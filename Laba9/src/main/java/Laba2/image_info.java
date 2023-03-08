package Laba2; //пакет Java классов

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class image_info extends JComponent {
	private Image image;

	public image_info() {
			// Загрузка изображения.
		try {
			//image = ImageIO.read(new File("src/main/resources/Images/Логотип.png"));
			Path path = Paths.get("Логотип.png");
			BufferedImage buf = ImageIO.read(path.toFile());
			ByteArrayOutputStream bytear = new ByteArrayOutputStream();
	        ImageIO.write(buf, "png", bytear);
	        byte[] bytes = bytear.toByteArray();
	        InputStream is = new ByteArrayInputStream(bytes);
	        image = ImageIO.read(is);
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