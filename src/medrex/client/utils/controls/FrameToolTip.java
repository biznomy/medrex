package medrex.client.utils.controls;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import medrex.commons.enums.GuiModes;

import com.blogofbug.swing.components.ImageLabel;

public class FrameToolTip extends JDialog {
	private static final long serialVersionUID = 1L;

	private JLabel lblThumbnail;
	private ImageLabel btnClose;
	private ActionListener actionListener;

	private String heading;
	private ImageIcon previewImage;

	private JLabel lblHeading;

	public FrameToolTip(String heading, ImageIcon icon,
			final ActionListener actionListener) {
		super();
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(final FocusEvent e) {
				FrameToolTip.this.dispose();
			}
		});
		setAlwaysOnTop(true);
		setSize(400, 275);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(
				GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setTitle("Long Term Care");
		setUndecorated(true);
		setModal(true);

		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Double xx = new Double((screen.getWidth() - 400) / 2);
		Double yy = new Double((screen.getHeight() - 275) / 2);

		setLocation(xx.intValue(), yy.intValue());

		final JPanel panel = new JPanel();
		panel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		panel
				.setBackground(GuiModes.DESIGNER_FORMS
						.getDefaultBackgroundColor());
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1024, 768));
		getContentPane().add(panel);

		lblHeading = new JLabel();
		lblHeading.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblHeading.setFont(new Font("Arial", Font.BOLD, 22));
		lblHeading.setBounds(10, 10, 346, 26);
		panel.add(lblHeading);

		btnClose = new ImageLabel(new ImageIcon("img/close.jpg"));
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameToolTip.this.dispose();
			}
		});
		btnClose.setBounds(362, 10, 28, 28);
		panel.add(btnClose);

		lblThumbnail = new JLabel();
		lblThumbnail.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(18f));
		lblThumbnail.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblThumbnail.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		lblThumbnail.setBounds(10, 42, 380, 223);
		lblThumbnail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				System.out.println("clicked");
				// if(event.getClickCount() > 1) {
				if (FrameToolTip.this.actionListener != null) {
					FrameToolTip.this.setVisible(false);
					FrameToolTip.this.actionListener
							.actionPerformed(new ActionEvent(lblThumbnail,
									ActionEvent.ACTION_PERFORMED,
									"ThumbnailDblClicked"));
					FrameToolTip.this.dispose();
				}
				// }
			}
		});

		panel.add(lblThumbnail);

		setHeading(heading);
		setPreviewImage(icon);
		setActionListener(actionListener);

	}

	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	}

	public void setHeading(String heading) {
		this.heading = heading;
		lblHeading.setText(heading);
	}

	public void setPreviewImage(ImageIcon previewImage) {
		this.previewImage = previewImage;
		lblThumbnail.setIcon(previewImage);
	}
}
