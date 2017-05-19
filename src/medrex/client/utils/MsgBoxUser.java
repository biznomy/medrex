package medrex.client.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import medrex.client.utils.controls.IconizedCellRenderer;

import com.jgoodies.validation.Severity;
import com.jgoodies.validation.ValidationMessage;
import com.jgoodies.validation.ValidationResult;
import com.jgoodies.validation.util.DefaultValidationResultModel;
import com.jgoodies.validation.view.ValidationResultViewFactory;

public final class MsgBoxUser extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6773491400141430863L;

	// enum decalaration
	public static enum ScreenLayout {
		OKONLY, YESNO, YESNOCANCEL;
	}

	public static enum MsgBoxResponse {
		OK, YES, NO, CANCEL;
	}

	private enum MsgStyle {
		GREEN(new Color(34, 139, 34)), YELLOW(new Color(255, 204, 0)), RED(
				Color.RED), GRAY(Color.GRAY), DEFAULT(Color.BLACK), BLUE(
				Color.BLUE);

		private Color color = null;

		MsgStyle(Color c) {
			color = c;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
	}

	// variable decalration
	private JButton buttonArr[];
	private JPanel panel_1;
	private JPanel msgPanel;
	private JPanel panel;
	private static Font DEFAULT_FONT = new Font("", Font.BOLD, 16);
	private static final LineBorder DEFAULT_BORDER = new LineBorder(Color.GRAY,
			5, false);
	private static final Color DEFAULT_BACK = new Color(176, 224, 230);
	private MsgBoxResponse result;

	// accessors and mutators
	private MsgBoxResponse getResult() {
		return result;
	}

	private void setResult(MsgBoxResponse result) {
		this.result = result;
	}

	// constructors
	private MsgBoxUser() {
		super();
		getContentPane().setBackground(UIManager.getColor("Button.background"));
		constructLayout(ScreenLayout.OKONLY);
	}

	MsgBoxUser(Font defaultFont) {
		this();
		DEFAULT_FONT = defaultFont;
	}

	// event listeners
	public void actionPerformed(final ActionEvent e) {
		if (e.getActionCommand().equalsIgnoreCase("OK")) {
			this.setResult(MsgBoxResponse.OK);
			dispose();
		} else if (e.getActionCommand().equalsIgnoreCase("YES")) {
			this.setResult(MsgBoxResponse.YES);
			dispose();
		} else if (e.getActionCommand().equalsIgnoreCase("NO")) {
			this.setResult(MsgBoxResponse.NO);
			dispose();
		} else if (e.getActionCommand().equalsIgnoreCase("CANCEL")) {
			this.setResult(MsgBoxResponse.CANCEL);
			dispose();
		} else {
			dispose();
		}
	}

	// private member functions
	private void constructLayout(ScreenLayout s) {
		setUndecorated(true);
		getContentPane().setLayout(null);
		setPreferredSize(new Dimension(537, 189));
		setLocationRelativeTo(null);
		setBounds(0, 0, 529, 228);
		setModal(true);
		SwingUtils.center(this);

		panel = new JPanel();
		panel.setBorder(DEFAULT_BORDER);
		panel.setLayout(null);
		panel.setBounds(0, 0, 287, 133);
		this.getContentPane().setBounds(panel.getBounds());
		this.getBounds(panel.getBounds());
		panel.setBackground(DEFAULT_BACK);
		getContentPane().add(panel);

		msgPanel = new JPanel();
		msgPanel.setLayout(null);
		msgPanel.setBounds(10, 10, 269, 66);
		msgPanel.setBackground(Color.WHITE);
		panel.add(msgPanel);

		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(DEFAULT_BACK);
		panel_1.setBounds(10, 170, 509, 48);
		panel_1.setBounds(SwingUtils.centerRectangle(panel.getBounds(), panel_1
				.getBounds()));
		panel_1.setLocation(panel_1.getBounds().x, 170);

		panel.add(panel_1);
		changeLayout(ScreenLayout.OKONLY);
	}

	private void createButtons(Object[] buttons) {
		if (buttonArr != null) {
			for (int i = 0; i < buttonArr.length; i++) {
				buttonArr[i].setVisible(false);
				buttonArr[i] = null;
			}
			buttonArr = null;
		}

		buttonArr = new JButton[buttons.length];
		for (int i = 0; i < buttons.length; i++) {
			buttonArr[i] = new JButton();
			buttonArr[i].setFont(DEFAULT_FONT);
			buttonArr[i].setBorder(DEFAULT_BORDER);
			buttonArr[i].setText(buttons[i].toString());
			buttonArr[i].setBounds((105 + 10) * i, 0, 105, 48);
			buttonArr[i].addActionListener(this);
			buttonArr[i].repaint();
			panel_1.setSize((105 + 10) * (i + 1), panel_1.getSize().height);
			panel_1.add(buttonArr[i]);
			buttonArr[i].repaint(buttonArr[i].getBounds());
		}
		panel_1.setBounds(SwingUtils.centerRectangle(panel.getBounds(), panel_1
				.getBounds()));
		panel_1.setLocation(panel_1.getBounds().x, 170);
		panel_1.repaint();
		this.repaint();
	}

	private void changeLayout(ScreenLayout s) {
		switch (s) {
		default:
		case OKONLY:
			createButtons(new Object[] { "OK" });
			break;
		case YESNO:
			createButtons(new Object[] { "YES", "NO" });
			break;
		case YESNOCANCEL:
			createButtons(new Object[] { "YES", "NO", "CANCEL" });
			break;
		}
	}

	private ImageIcon getIcon(Severity s) {
		switch (s) {
		case ERROR:
			return ValidationResultViewFactory.getErrorIcon();
		case WARNING:
			return ValidationResultViewFactory.getWarningIcon();
		case OK:
			return ValidationResultViewFactory.getInfoIcon();
		default:
			return ValidationResultViewFactory.getCheckIcon();
		}
	}

	private Color getColor(Severity s) {
		switch (s) {
		case ERROR:
			return MsgStyle.RED.getColor();
		case WARNING:
			return MsgStyle.YELLOW.getColor();
		case OK:
			return MsgStyle.DEFAULT.getColor();
		default:
			return MsgStyle.DEFAULT.getColor();
		}
	}

	private JList createReportList(List<ValidationMessage> l, Font currentFont,
			Color currentColor) {
		Iterator i = l.iterator();
		ValidationMessage vm = null;
		Object[][] e = new Object[l.size()][4];
		int counter = 0;
		while (i.hasNext()) {
			vm = (ValidationMessage) i.next();
			e[counter][0] = vm.formattedText();
			e[counter][1] = getIcon(vm.severity());
			e[counter][2] = currentFont;
			// e[counter][3] = getColor(vm.severity());
			counter++;
		}
		JList msgList = new JList(e);
		msgList.setCellRenderer(new IconizedCellRenderer(currentFont));
		msgList.setVisible(true);
		return msgList;
	}

	private JComponent createPrompt(String message, Severity s) {
		JLabel promptIcon = new JLabel();
		promptIcon.setText("<html><body><p>" + message + "</p></body></html>");
		promptIcon.setIcon(getIcon(s));

		return promptIcon;
	}

	private void addPrompt(String prompt) {
		JLabel com = (JLabel) createPrompt(prompt, Severity.OK);
		com.setFont(DEFAULT_FONT);
		com.setBounds(new Rectangle(0, 0, msgPanel.getWidth(), msgPanel
				.getHeight()));
		com.setBackground(Color.WHITE);
		com.setHorizontalAlignment(SwingConstants.CENTER);
		msgPanel.add(com);
	}

	private void addError(String prompt) {
		JLabel com = (JLabel) createPrompt(prompt, Severity.ERROR);
		com.setFont(DEFAULT_FONT);
		com.setBounds(new Rectangle(0, 0, msgPanel.getWidth(), msgPanel
				.getHeight()));
		com.setBackground(Color.WHITE);
		com.setHorizontalAlignment(SwingConstants.CENTER);
		msgPanel.add(com);
	}

	private void addWarning(String prompt) {
		JLabel com = (JLabel) createPrompt(prompt, Severity.WARNING);
		com.setFont(DEFAULT_FONT);
		com.setBounds(new Rectangle(0, 0, msgPanel.getWidth(), msgPanel
				.getHeight()));
		com.setBackground(Color.WHITE);
		com.setHorizontalAlignment(SwingConstants.CENTER);
		msgPanel.add(com);
	}

	private void addValidationResult(ValidationResult vr) {
		DefaultValidationResultModel resModal = new DefaultValidationResultModel();
		resModal.setResult(vr);
		JList com = createReportList(vr.getMessages(), DEFAULT_FONT,
				Color.BLACK); // ValidationResultViewFactory.createReportList(resModal);
		com.setFont(DEFAULT_FONT);
		com.setBounds(new Rectangle(0, 0, msgPanel.getWidth(), msgPanel
				.getHeight()));
		com.setBackground(Color.WHITE);
		msgPanel.add(com);
	}

	// public Show functions
	public static void ShowValidation(ValidationResult vr, String title) {
		MsgBoxUser m = new MsgBoxUser();
		m.setTitle(title);
		m.addValidationResult(vr);
		m.setVisible(true);
	}

	public static void ShowPrompt(String prompt, String title) {
		MsgBoxUser m = new MsgBoxUser();
		m.setTitle(title);
		m.addPrompt(prompt);
		m.setVisible(true);
	}

	public static MsgBoxResponse ShowLayout(String prompt, String title,
			ScreenLayout s) {
		MsgBoxUser m = new MsgBoxUser();
		m.setTitle(title);
		m.changeLayout(s);
		m.addPrompt(prompt);
		m.setVisible(true);
		return m.getResult();
	}

	// main method
	public static void main(String[] a) {
		ShowPrompt(
				"Saved successfully!!!, very very very very very very very very very very very very long label text.",
				"Title");
		ValidationResult vr = new ValidationResult();
		vr.addError("This is an error!!!");
		vr.addWarning("This is warning!!!");
		ShowValidation(vr, "Title");
		System.out.println(ShowLayout("Do you want to add this entry?",
				"Title", MsgBoxUser.ScreenLayout.YESNOCANCEL));
	}
}
