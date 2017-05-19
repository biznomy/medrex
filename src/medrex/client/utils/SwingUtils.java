package medrex.client.utils;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

import medrex.commons.intf.PopUpView;

public class SwingUtils {

	public static void center(Window jd) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		jd.setLocation(new Double((dim.getWidth() - jd.getWidth()) / 2)
				.intValue(), new Double((dim.getHeight() - jd.getHeight()) / 2)
				.intValue());

	}

	public static void disableComponents(JComponent comp, boolean isEnabled) {
		if (comp != null && comp instanceof JPanel) {
			JPanel panel = (JPanel) comp;
			Component[] comps = panel.getComponents();
			for (Component com : comps) {
				com.setEnabled(isEnabled);
			}
		}
	}

	public static Rectangle centerRectangle(Rectangle viewPort,
			Rectangle toBeCentered) {
		Rectangle result = new Rectangle();
		result.x = (viewPort.width - toBeCentered.width) / 2;
		result.y = (viewPort.height - toBeCentered.height) / 2;
		result.width = toBeCentered.width;
		result.height = toBeCentered.height;
		return result;
	}

	/* for testing & debugging phase only */
	public static JFrame wrapInFrame(JComponent com) {
		return wrapInFrame(com, "Test Window");
	}

	public static JFrame wrapInFrame(JComponent com, String title) {
		JFrame f = new JFrame(title);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Dimension size = getComponentSize(com);
		f.setSize(size.width + 10, size.height + 30);
		f.getContentPane().add(com);
		return f;
	}

	public static JDialog wrapInDialog(JComponent com) {
		return wrapInDialog(com, "Test Window");
	}

	public static JDialog wrapInDialog(JComponent com, String title) {
		JDialog f = new JDialog();
		f.setTitle(title);
		f.setModal(true);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Dimension size = getComponentSize(com);
		f.setSize(size.width + 10, size.height + 30);
		f.getContentPane().add(com);
		center(f);
		return f;
	}

	public static Dimension getComponentSize(JComponent com) {
		Dimension retSize = new Dimension();
		Dimension exSize, prSize;
		exSize = com.getSize();
		prSize = com.getPreferredSize();
		retSize.width = (exSize.width != 0) ? exSize.width : prSize.width;
		retSize.height = (exSize.height != 0) ? exSize.height : prSize.height;
		return retSize;
	}

	/*
	 * public static void focusChild() { try {
	 * Global.frameResidentInfoPayerAdd.requestFocus(); } catch (Exception e) {
	 * } try { Global.frameResidentInfoContactAdd.requestFocus(); } catch
	 * (Exception e) { } try {
	 * Global.frameResidentContactPhoneAdd.requestFocus(); } catch (Exception e)
	 * { } try { //Global.frameAdmissionRecordAdd.requestFocus(); } catch
	 * (Exception e) { } try { //Global.frameActivitysRecordAdd.requestFocus();
	 * } catch (Exception e) { } try {
	 * Global.frameMedicationTreatmentFormAdd.requestFocus(); } catch (Exception
	 * e) { }
	 * 
	 * }
	 */

	public static void setSelectedButton(ButtonGroup bgButtons,
			int actionCommand) {
		Enumeration<AbstractButton> enumBtns = bgButtons.getElements();
		while (enumBtns.hasMoreElements()) {
			AbstractButton rb = enumBtns.nextElement();
			if (rb.getActionCommand().equalsIgnoreCase(actionCommand + ""))
				rb.setSelected(true);
			else
				rb.setSelected(false);
		}

	}

	public static int getSelectedButton(ButtonGroup bgButtons) {
		if (bgButtons.getSelection() != null) {
			return (new Integer(bgButtons.getSelection().getActionCommand())
					.intValue());
		} else {
			return (0);
		}
	}

	public static AbstractButton getButton(ButtonGroup bgButtons,
			int actionCommand) {
		Enumeration<AbstractButton> enumBtns = bgButtons.getElements();

		while (enumBtns.hasMoreElements()) {
			AbstractButton rb = enumBtns.nextElement();
			if (rb.getActionCommand().equalsIgnoreCase(actionCommand + "")) {
				return rb;
			}
		}

		return null;
	}

	public static void setEnabled(ButtonGroup bgButtons, boolean enabled) {
		Enumeration<AbstractButton> enumBtns = bgButtons.getElements();

		while (enumBtns.hasMoreElements()) {
			AbstractButton rb = enumBtns.nextElement();
			rb.setEnabled(enabled);
		}
	}

	public static int getComboBoxValue(JComboBox cmbField) {
		int temp = 0;

		try {
			temp = new Integer((String) cmbField.getSelectedItem()).intValue();
			// temp = cmbField.getSelectedIndex();
		} catch (Exception e) {

		}

		return (temp);

	}

	public static JDialog openInDialog(PopUpView popUpView) {
		return openInDialog(popUpView, null);
	}

	public static JDialog openInDialog(PopUpView popUpView, final Window owner) {
		JDialog dialog = new JDialog() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -8797982831841611449L;
			// public void dispose() {
			// super.dispose();
			// if(owner != null) {
			// if(Global.frameMainOptions != null) {
			// Global.frameMainOptions.setFocusable(false);
			// Global.frameMainOptions.setFocusableWindowState(false);
			// }
			// owner.requestFocus();
			// }
			// }
		};
		// if(owner != null) {
		// owner.setFocusCycleRoot(true);
		// owner.setFocusableWindowState(true);
		// dialog.addWindowListener(new WindowAdapter() {
		// public void windowClosing(WindowEvent e) {
		// if(Global.frameMainOptions != null) {
		// Global.frameMainOptions.setFocusable(false);
		// Global.frameMainOptions.setFocusableWindowState(false);
		// }
		// owner.requestFocus();
		// }
		// public void windowClosed(WindowEvent e) {
		// owner.requestFocus();
		// if(Global.frameMainOptions != null) {
		// Global.frameMainOptions.setFocusable(true);
		// Global.frameMainOptions.setFocusableWindowState(true);
		// }
		// owner.requestFocus();
		// }
		// });
		// }
		dialog.setTitle(popUpView.getTitle());

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = popUpView.getWidth();
		int height = popUpView.getHeight() + 40;
		dialog.setBounds(
				new Integer((((int) dimension.getWidth() - width) / 2))
						.intValue(),
				((int) dimension.getHeight() - height) / 2, width, height);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		dialog.getContentPane().add(popUpView, BorderLayout.CENTER);
		popUpView.setDialog(dialog);
		dialog.setVisible(true);

		return dialog;

	}

	public static JDialog openInDialogUnDecorated(PopUpView popUpView,
			final Window owner) {
		JDialog dialog = new JDialog();
		dialog.setTitle(popUpView.getTitle());
		dialog.setUndecorated(true);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = popUpView.getWidth();
		int height = popUpView.getHeight();
		dialog.setBounds(
				new Integer((((int) dimension.getWidth() - width) / 2))
						.intValue(),
				((int) dimension.getHeight() - height) / 2, width, height);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		dialog.getContentPane().add(popUpView, BorderLayout.CENTER);
		popUpView.setDialog(dialog);
		dialog.setVisible(true);

		return dialog;

	}

	public static JDialog openInDialogforJPanel(JPanel popUpView) {
		JDialog dialog = new JDialog();

		// dialog.setTitle(popUpView.getTitle());
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = popUpView.getWidth();
		int height = popUpView.getHeight();
		dialog.setBounds(
				new Integer((((int) dimension.getWidth() - width) / 2))
						.intValue(),
				((int) dimension.getHeight() - height) / 2, width, height);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		dialog.getContentPane().add(popUpView, BorderLayout.CENTER);

		dialog.setVisible(true);

		return dialog;

	}

	public static boolean isInButtonGroup(ButtonGroup obj, Object radioButton) {
		ButtonGroup bgGroup = obj;
		Enumeration<AbstractButton> rbuttons = bgGroup.getElements();
		int length = 0;
		while (rbuttons.hasMoreElements()) {
			rbuttons.nextElement();
			length++;
		}
		int k = 0;
		rbuttons = bgGroup.getElements();
		JRadioButton radioOptions[] = new JRadioButton[length];

		while (rbuttons.hasMoreElements()) {

			radioOptions[k] = (JRadioButton) rbuttons.nextElement();
			if (radioOptions[k].equals(radioButton)) {
				return true;
			}
			k++;
		}
		return false;
	}

	public static String getSelectedButtonName(ButtonGroup bgButtons,
			int actionCommand) {
		Enumeration<AbstractButton> enumBtns = bgButtons.getElements();

		while (enumBtns.hasMoreElements()) {
			AbstractButton rb = enumBtns.nextElement();
			if (rb.getActionCommand().equalsIgnoreCase(actionCommand + "")) {
				return rb.getText();
			}
		}
		return "";
	}

}
