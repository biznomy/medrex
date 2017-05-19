package com.sX.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

public class JxDrawPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5416949076284927586L;

	public enum PenMode {
		PENCIL, ERASER;
	}

	private boolean drawMode;
	private PenMode penMode;
	private Graphics2D g;
	private int x;
	private int y;
	private int w;
	private int h;
	private int eraserLength = 1;
	private int eraserWH = 30;
	private Toolkit tk = Toolkit.getDefaultToolkit();
	private BufferedImage image = null;
	private JPopupMenu popup;
	private JMenuItem penmenu;
	private JMenuItem erasemenu;
	private JMenuItem savemenu;
	private JMenuItem openmenu;
	private JMenuItem newmenu;

	private int width;
	private int height;
	private JPanel panel;

	public JxDrawPanel(int width, int height) {
		super();
		setLayout(null);
		this.width = width;
		this.height = height;

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, width, height);
		add(panel);

		final JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(0, 0, width, height);
		add(scrollpane);
		scrollpane.setViewportView(panel);

		penMode = PenMode.PENCIL;

		panel.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(final MouseEvent e) {
				if (drawMode == true && JxDrawPanel.this.isEnabled()) {
					if (penMode == PenMode.PENCIL) {
						g.setColor(Color.BLACK);
						g.drawLine(x, y, e.getX(), e.getY());
						x = e.getX();
						y = e.getY();

					} else if (penMode == PenMode.ERASER) {
						g.setColor(Color.WHITE);
						g.drawRect(x - eraserLength, y - eraserLength,
								eraserWH, eraserWH);
						x = e.getX();
						y = e.getY();
						g.setColor(Color.WHITE);
						g.fillRect(x - eraserLength, y - eraserLength,
								eraserWH, eraserWH);
					}
				}
				repaint();
			}
		});

		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(final MouseEvent e) {
				drawMode = true;
				if (penMode == PenMode.PENCIL) {
					panel.setCursor(Cursor.getDefaultCursor());
				} else if (penMode == PenMode.ERASER) {
					g.setColor(Color.WHITE);
					g.fillRect(e.getX(), e.getY(), eraserWH, eraserWH);
					BufferedImage imgCursor = new BufferedImage(eraserWH,
							eraserWH, BufferedImage.TYPE_INT_RGB);
					imgCursor.getGraphics().setColor(Color.BLACK);
					imgCursor.getGraphics().fillRect(1, 1, eraserWH - 2,
							eraserWH - 2);
					Cursor transparentCursor = tk.createCustomCursor(imgCursor,
							new Point(0, 0), "eraser");
					panel.setCursor(transparentCursor);
				}
				x = e.getX();
				y = e.getY();
			}

			@Override
			public void mouseReleased(final MouseEvent e) {
				if (penMode == PenMode.ERASER) {
					g.setColor(Color.WHITE);
					g.drawRect(x - eraserLength, y - eraserLength, eraserWH,
							eraserWH);
					repaint();
				}
				drawMode = false;
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});

		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		g = image.createGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, width, height);

		popup = new JPopupMenu();
		loadPopupMenu();
		enableMenu(true);
	}

	private void loadPopupMenu() {
		// penmenu = new JMenuItem("Pen");
		// penmenu.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// penMode = PenMode.PENCIL;
		// }
		// });
		// popup.add(penmenu);
		//
		// erasemenu = new JMenuItem("Erase");
		// erasemenu.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// penMode = PenMode.ERASER;
		// }
		// });
		// popup.add(erasemenu);
		//
		// savemenu = new JMenuItem("Save");
		// savemenu.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// final JFileChooser fc = new JFileChooser();
		// int option = fc.showSaveDialog(JxDrawPanel.this);
		// try {
		// File saveFile = new File(fc.getSelectedFile() + "/");
		// ImageIO.write(image, "jpg", saveFile);
		// } catch (IOException ex) {
		// System.out.print(ex.getMessage());
		// }
		// }
		// });
		// popup.add(savemenu);
		//
		// openmenu = new JMenuItem("Open");
		// openmenu.addActionListener(new ActionListener() {
		// public void actionPerformed(final ActionEvent e) {
		// final JFileChooser fc = new JFileChooser();
		// int option = fc.showOpenDialog(JxDrawPanel.this);
		// if (fc.getSelectedFile() != null) {
		// try {
		// BufferedImage tempimage = null;
		// tempimage = ImageIO.read(fc.getSelectedFile());
		// w = tempimage.getWidth(null);
		// h = tempimage.getHeight(null);
		// if (tempimage.getType() != BufferedImage.TYPE_INT_RGB) {
		// BufferedImage bmg = new BufferedImage(w, h,
		// BufferedImage.TYPE_INT_RGB);
		// g = (Graphics2D) bmg.getGraphics();
		// g.drawImage(tempimage, 0, 0, null);
		// image = tempimage = bmg;
		// }
		// repaint();
		// } catch (IOException e1) {
		// e1.printStackTrace();
		// }
		// }
		// }
		// });
		// popup.add(openmenu);

		newmenu = new JMenuItem("Clear All");
		newmenu.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, image.getWidth(), image.getHeight());
				repaint();
			}
		});
		popup.add(newmenu);
		// popup.setVisible(true);
		// popup.dispose();
	}

	private void enableMenu(boolean enabled) {
		if (enabled) {
			panel.setComponentPopupMenu(popup);
		}
	}

	@Override
	public void paint(Graphics gg) {
		gg.drawImage(image, 0, 0, width, height, null);
	}

	public ImageIcon getImageIcon() {
		return (new ImageIcon(image));
	}

	public void setImagefromImageIcon(ImageIcon ic) {
		BufferedImage tempimage = null;
		Image img;
		if (ic != null) {
			img = ic.getImage();

			tempimage = new BufferedImage(img.getWidth(null), img
					.getHeight(null), BufferedImage.TYPE_INT_RGB);
			tempimage.getGraphics().drawImage(img, 0, 0, null);
			w = tempimage.getWidth(null);
			h = tempimage.getHeight(null);
			width = w;
			height = h;
			if (tempimage.getType() == BufferedImage.TYPE_INT_RGB) {
				BufferedImage bmg = new BufferedImage(w, h,
						BufferedImage.TYPE_INT_RGB);
				g = (Graphics2D) bmg.getGraphics();
				g.drawImage(tempimage, 0, 0, null);
				image = tempimage = bmg;
			}
		}
	}
}
