package medrex.client.utils;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.PixelGrabber;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ComponentPrintable implements Printable {
	private Component mComponent;

	public ComponentPrintable(Component c) {
		mComponent = c;
	}

	public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
		if (pageIndex < 0)
			return NO_SUCH_PAGE;
		Graphics2D g2 = (Graphics2D) g;
		g2.translate(pageFormat.getPaper().getImageableX(), pageFormat
				.getPaper().getImageableY());

		mComponent.repaint();
		BufferedImage bi = new BufferedImage(mComponent.getWidth(), mComponent
				.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D gg = bi.createGraphics();
		mComponent.paint(gg);

		boolean wasBuffered = disableDoubleBuffering(mComponent);

		double maxW = (pageFormat.getPaper().getImageableWidth());
		double maxH = (pageFormat.getPaper().getImageableHeight());
		double comW = mComponent.getWidth();
		double comH = mComponent.getHeight();
		// System.out.println("h and w are :" + maxH +";"+ maxW +";"+ comH +";"+
		// comW);
		double rPage = maxW / maxH;
		double rCom = comW / comH;
		double rHeight = (rPage / comH);
		final int biW = bi.getWidth(), biH = bi.getHeight();

		// System.out.println("ratio is :" + rPage + "com ratio :" + rCom);
		// System.out.println("isPortrait: " + (rPage > rCom) +
		// ", isLandscape: " + !(rPage > rCom));
		// System.out.println("W: " + bi.getWidth() + ", H: " + bi.getHeight());
		// System.out.println("width is :" + rWidth + "height :" + rHeight);

		if (rCom < 1.5) {
			bi = rotateImage(bi, 0);
			if (rHeight > 7.00E-4) {
				if (biH > maxH) {
					g2.drawImage(bi, 0, 0, new Double(pageFormat.getPaper()
							.getImageableWidth()).intValue(), new Double(
							pageFormat.getPaper().getImageableHeight())
							.intValue(), 0, 0, biW, biH, null);
				} else {
					g2.drawImage(bi, 0, 0, new Double(pageFormat.getPaper()
							.getImageableWidth()).intValue(), biH, 0, 0, biW,
							biH, null);
				}
			} else {
				g2.drawImage(bi, 0, 0, new Double(pageFormat.getPaper()
						.getImageableWidth()).intValue(), new Double(pageFormat
						.getPaper().getImageableHeight()).intValue(), 0, 0,
						biW, biH, null);
			}
		} else {
			bi = rotateImage(bi, -90);
			g2.drawImage(bi, 0, 0, new Double(pageFormat.getPaper()
					.getImageableWidth()).intValue(), new Double(pageFormat
					.getPaper().getImageableHeight()).intValue(), 0, 0, biH,
					biW, null);
		}
		restoreDoubleBuffering(mComponent, wasBuffered);
		return PAGE_EXISTS;
	}

	// public static BufferedImage resize(final BufferedImage image, int
	// newWidth,
	// int newHeight, final boolean maintainAspectRatio) {
	// if (image == null) {
	// throw new IllegalArgumentException(
	// "\"image\" param cannot be null.");
	// }
	// final int imageWidth = image.getWidth();
	// final int imageHeight = image.getHeight();
	// if (maintainAspectRatio) {
	// final double newRatio = (double) newWidth / (double) newHeight;
	// final double imageRatio = (double) imageWidth
	// / (double) imageHeight;
	// if (newRatio < imageRatio) {
	// newHeight = (int) (newWidth / imageRatio);
	// } else {
	// newWidth = (int) (newHeight * imageRatio);
	// }
	// }
	// final BufferedImage dimg = new BufferedImage(newWidth, newHeight, image
	// .getType());
	// final Graphics2D g = dimg.createGraphics();
	// g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	// RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	// g.drawImage(image, 0, 0, newWidth, newHeight, 0, 0, imageWidth,
	// imageHeight, null);
	// g.dispose();
	// return dimg;
	// }

	public BufferedImage rotateImage(BufferedImage img, double degree) {
		BufferedImage bufImg = toBufferedImage(img);
		double angle = Math.toRadians(degree);
		return tilt(bufImg, angle);
	}

	public BufferedImage tilt(BufferedImage image, double angle) {
		double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
		int w = image.getWidth(), h = image.getHeight();
		int neww = (int) Math.floor(w * cos + h * sin), newh = (int) Math
				.floor(h * cos + w * sin);
		GraphicsConfiguration gc = getDefaultConfiguration();
		BufferedImage result = gc.createCompatibleImage(neww, newh,
				Transparency.TRANSLUCENT);
		Graphics2D g = result.createGraphics();
		g.translate((neww - w) / 2, (newh - h) / 2);
		g.rotate(angle, w / 2, h / 2);
		g.drawRenderedImage(image, null);
		g.dispose();
		return result;
	}

	public static BufferedImage toBufferedImage(Image image) {
		// This code ensures that all the pixels in the image are loaded
		image = new ImageIcon(image).getImage();

		// Determine if the image has transparent pixels; for this method's
		// implementation, see e661 Determining If an Image Has Transparent
		// Pixels
		boolean hasAlpha = hasAlpha(image);

		// Create a buffered image with a format that's compatible with the
		// screen
		BufferedImage bimage = null;
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		try {
			// Determine the type of transparency of the new buffered image
			int transparency = Transparency.OPAQUE;
			if (hasAlpha) {
				transparency = Transparency.BITMASK;
			}

			// Create the buffered image
			GraphicsDevice gs = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gs.getDefaultConfiguration();
			bimage = gc.createCompatibleImage(image.getWidth(null), image
					.getHeight(null), transparency);
		} catch (HeadlessException e) {
			// The system does not have a screen
		}

		if (bimage == null) {
			// Create a buffered image using the default color model
			int type = BufferedImage.TYPE_INT_RGB;
			if (hasAlpha) {
				type = BufferedImage.TYPE_INT_ARGB;
			}
			bimage = new BufferedImage(image.getWidth(null), image
					.getHeight(null), type);
		}

		// Copy image to buffered image
		Graphics g = bimage.createGraphics();

		// Paint the image onto the buffered image
		g.drawImage(image, 0, 0, null);
		g.dispose();

		return bimage;
	}

	public static GraphicsConfiguration getDefaultConfiguration() {
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		return gd.getDefaultConfiguration();
	}

	public static boolean hasAlpha(Image image) {
		// If buffered image, the color model is readily available
		if (image instanceof BufferedImage) {
			BufferedImage bimage = (BufferedImage) image;
			return bimage.getColorModel().hasAlpha();
		}

		// Use a pixel grabber to retrieve the image's color model;
		// grabbing a single pixel is usually sufficient
		PixelGrabber pg = new PixelGrabber(image, 0, 0, 1, 1, false);
		try {
			pg.grabPixels();
		} catch (InterruptedException e) {
		}

		// Get the image's color model
		ColorModel cm = pg.getColorModel();
		return cm.hasAlpha();
	}

	private boolean disableDoubleBuffering(Component c) {
		if (c instanceof JComponent == false)
			return false;
		JComponent jc = (JComponent) c;
		boolean wasBuffered = jc.isDoubleBuffered();
		jc.setDoubleBuffered(false);
		return wasBuffered;
	}

	private void restoreDoubleBuffering(Component c, boolean wasBuffered) {
		if (c instanceof JComponent)
			((JComponent) c).setDoubleBuffered(wasBuffered);
	}
}
