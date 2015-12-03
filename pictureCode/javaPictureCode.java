// back ground image
try {
    mBackground = ImageIO.read(getClass().getClassLoader().getResourceAsStream("universe_background.jpg"));

    // load the space craft image
    mSpacecraft1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("spaceship1.png"));
    mSpacecraft2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("spaceship2.png"));
    mSpacecraft3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("spaceship3.png"));
    mSpacecraft4 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("spaceship4.png"));
} catch (IOException e) {
    e.printStackTrace();
		}

// draw falcon
public void drawCraft(Graphics g) {
		Graphics2D g2d=(Graphics2D)g; // Create a Java2D version of g.
		g2d.translate(getCenterXImage(),getCenterYImage()); // Translate the center of our coordinates.
		g2d.rotate(Math.toRadians(getRotationImage()));  // Rotate the image by 1 radian.
		g2d.drawImage(mImage, -getImageWidth()/2, -getImageHeight()/2, getImageWidth(), getImageHeight(), null);
		g2d.setColor(Color.WHITE);
		//g2d.drawLine(50,0,-50,0);
		//g2d.drawLine(0,50,0,-50);
		g2d.rotate(Math.toRadians(-getRotationImage()));
		g2d.translate(-getCenterXImage(),-getCenterYImage());
}

