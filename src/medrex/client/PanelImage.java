package medrex.client;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import medrex.client.constants.Global;

import com.sX.swing.JxPanel;

public class PanelImage extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2451172927727338262L;
	/**
	 * Create the panel
	 */
	public String imgFile;
	private GradientPaint gradientPaint;
	private int residentKey;
	private Image image;
	private boolean isDNR;

	public PanelImage() {
		super();
		super.setCurvedView(false);
	}

	public PanelImage(String filePath) {
		super();
		imgFile = filePath;
		// this.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
	}

	/**
	 * @param gradientPaint
	 *            the gradientPaint to set
	 */
	public void setGradientPaint(GradientPaint gradientPaint) {
		this.gradientPaint = gradientPaint;
	}

	/**
	 * @return the gradientPaint
	 */
	public GradientPaint getGradientPaint() {
		return gradientPaint;
	}

	/**
	 * @return the imgFile
	 */
	public String getBackgroundImage() {
		return imgFile;
	}

	/**
	 * @param imgFile
	 *            the imgFile to set
	 */
	public void setBackgroundImage(String imgFile) {
		this.imgFile = imgFile;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Image getImage() {
		return image;
	}

	/**
	 * @param residentKey
	 *            the residentKey to set
	 */
	public void setResidentKey(int residentKey) {
		this.residentKey = residentKey;
	}

	/**
	 * @return the residentKey
	 */
	public int getResidentKey() {
		return residentKey;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.clip(getShape());

		BufferedImage myimg = null;
		try {
			String s = "";
			if (Global.currentResidenceKey != 0) {
				s = "C:\\ImagesLTC\\" + Global.currentResidenceKey + ".jpg";
			}
			if (residentKey != 0) {
				s = "C:\\ImagesLTC\\" + residentKey + ".jpg";
			}
			if (imgFile != null) {
				s = imgFile;
			}
			if (image != null) {
				g2.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), 0,
						0, image.getHeight(this), image.getHeight(this), null);
				super.drawBorder(g2);
			} else if (new File(s).exists()) {
				myimg = ImageIO.read(new File(s));
				this.image = myimg;
				g2.drawImage(myimg, 0, 0, this.getWidth(), this.getHeight(), 0,
						0, myimg.getWidth(), myimg.getHeight(), null);
				super.drawBorder(g2);
				// g2.clip(getShape());
			} else {
				if (gradientPaint == null) {
					gradientPaint = new GradientPaint(new Point(0, 0),
							Color.WHITE, new Point(getWidth(), 0), new Color(
									129, 163, 176));
					// gradientPaint = new GradientPaint(new Point(0, 0),
					// getForeground().brighter(), new Point(getWidth(), 0),
					// getForeground().darker());
				}
				g2.setPaint(gradientPaint);
				g2.fill(getShape());

				int xF = (int) (getWidth() * 0.10);
				int yF = (int) (getHeight() * 0.10);
				g2.setColor(new Color(255, 255, 255, 70));
				g2.setPaint(new GradientPaint(new Point(xF, yF), new Color(255,
						255, 255, 100), new Point(xF, getHeight() - (2 * yF)),
						new Color(255, 255, 255, 10)));
				g2.fillOval(0 + xF, 0 + yF, getWidth() - (2 * xF), getHeight()
						- (2 * yF));
				g2.setColor(super.getBorderColor().darker());
				g2.drawOval(0 + xF, 0 + yF, getWidth() - (2 * xF), getHeight()
						- (2 * yF));

				myimg = ImageIO.read(new File("img/imgDef.png"));
				int x = (this.getWidth() - myimg.getWidth()) / 2;
				int y = (this.getHeight() - myimg.getHeight()) / 2;
				g2.setColor(getForeground());
				g2.drawImage(myimg, x, y, myimg.getWidth() + x, myimg
						.getHeight()
						+ y, 0, 0, myimg.getWidth(), myimg.getHeight(), null);

				if (isDNR) {
					g2.setColor(Color.RED);
					g2.drawString("DNR", 40, 98);
				}
				super.drawBorder(g2);
			}
		} catch (Exception e) {

		}
		// this.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		// paintChildren(g);
		// super.paint(g);
	}

	public boolean isDNR() {
		return isDNR;
	}

	public void setDNR(boolean isDNR) {
		this.isDNR = isDNR;
		System.out.println("DNR" + this.isDNR);

	}
}
