package medrex.client.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import medrex.client.PanelImage;
import medrex.commons.enums.GuiModes;

import com.blogofbug.swing.components.DockPanel;
import com.sX.swing.JxPanel;

public class ThumbnailAnimation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5384157119151976101L;
	private String[] imgPath;
	private String[] formName;

	public ThumbnailAnimation(final String[] imgPath, final String[] formName) {
		super();
		this.imgPath = imgPath;
		this.formName = formName;

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.CENTER);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setArc(1.0f);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 649, 193);
		panel_1.setBackground(GuiModes.DESIGNER_SCREEN
				.getDefaultBackgroundColor());
		panel.add(panel_1);

		final DockPanel thumbComp = new DockPanel(64, 256);
		thumbComp.setNormalSize(100);
		thumbComp.setForeground(GuiModes.DESIGNER_SCREEN
				.getDefaultForegroundColor());
		thumbComp.setFont(new Font("Arial", Font.BOLD, 10));
		thumbComp.setEnlargedSize(200);
		thumbComp.setAutoscrolls(true);
		thumbComp.setBackground(GuiModes.DESIGNER_SCREEN
				.getDefaultBackgroundColor());
		thumbComp.setBounds(10, 10, 629, 170);
		thumbComp.setOpaque(true);
		panel_1.add(thumbComp);

		// final JxPanel panel_2 = new JxPanel();
		// panel_2.setLayout(null);
		// panel_2.setBounds(10, 265, 629, 330);
		// panel_2.setBackground(GuiModes.DESIGNER_SCREEN.getDefaultBackgroundColor());
		// panel.add(panel_2);
		//
		// final JCarosel thumbComp2 = new JCarosel();
		// thumbComp2.setBackground(GuiModes.DESIGNER_SCREEN.getDefaultBackgroundColor());
		// thumbComp2.setContentWidth(125);
		// thumbComp2.setBounds(10, 10, 609, 310);
		// panel_2.add(thumbComp2);

		for (int i = 0; i < 4; i++) {
			final int index = i;
			BufferedImage img = new BufferedImage(100, 100,
					BufferedImage.TYPE_INT_RGB);
			try {
				img = ImageIO.read(new File(imgPath[i]));
				// Component com = thumbComp.add(img,
				// "Nurse Medication Notes Form " + i);
				PanelImage com = new PanelImage();
				com.setArc(1.f);
				com.setSize(64, 64);
				com.setCurvedView(true);
				com.setImage(img);
				thumbComp.addDockElement(com, formName[i]);
				// Component com2 = thumbComp2.add(img,
				// "Nurse Medication Notes Form " + i);
				com.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println(formName[index]);
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//		
		// final JxPanel panel_3 = new JxPanel();
		// panel_3.setLayout(null);
		// panel_3.setBounds(10, 10, 673, 207);
		// panel_3.setBackground(GuiModes.DESIGNER_SCREEN.getDefaultBackgroundColor());
		// panel.add(panel_3);

	}

	public static void main(String[] args) {
		String[] imgPath = new String[] { "img/human2/0.gif",
				"img/human2/1.png", "img/human2/2.png", "img/human2/3.png",
				"img/human2/4.png", "img/human2/5.png", "img/human2/6.png",
				"img/human2/7.png", "img/human2/8.png", "img/human2/9.png",
				"img/human2/10.png", };
		String[] formName = new String[] { "Nurse Medication Notes Form 0",
				"Nurse Medication Notes Form 1",
				"Nurse Medication Notes Form 2",
				"Nurse Medication Notes Form 3",
				"Nurse Medication Notes Form 4",
				"Nurse Medication Notes Form 5",
				"Nurse Medication Notes Form 6",
				"Nurse Medication Notes Form 7",
				"Nurse Medication Notes Form 8",
				"Nurse Medication Notes Form 9",
				"Nurse Medication Notes Form 10", };

		ThumbnailAnimation frame = new ThumbnailAnimation(imgPath, formName);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setVisible(true);
	}
}
