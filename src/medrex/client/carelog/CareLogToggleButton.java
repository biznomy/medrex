/**
 * 
 */
package medrex.client.carelog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.commons.enums.ColorConstants;
import medrex.commons.enums.GuiModes;

import com.sX.awt.Direction;
import com.sX.swing.JxPanel;

/**
 * @author Administrator
 * 
 */
public class CareLogToggleButton<T extends JToggleButton> extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 823615046347324198L;
	private JTextArea txtResult;
	private JTextArea txtText;
	private JLabel lblCheck;
	private JPanel panelCheck;
	private JPanel panelResult;
	public int careLogNum;
	private T toggleComponent;
	private JLabel panelImg;

	public CareLogToggleButton(T component) {
		super();
		toggleComponent = component;
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireActionPerformed();
			}
		});
		setSize(195, 172);
		setPreferredSize(getSize());
		setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		// setBackground(new Color(231, 239, 242));
		setLinearGradient(
				ColorConstants.GradientDark/* new Color(171, 195, 203) */,
				ColorConstants.GradientBright, Direction.TOP_TO_BOTTOM);
		setLayout(null);

		final JPanel panelQ = new JPanel();
		panelQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				fireActionPerformed();
			}
		});
		panelQ.setBackground(new Color(231, 239, 242));
		panelQ.setLayout(null);
		panelQ.setOpaque(false);
		panelQ.setBounds(10, 10, 32, 30);
		add(panelQ);

		panelImg = new JLabel();
		panelImg.setHorizontalAlignment(SwingConstants.CENTER);
		panelImg.setHorizontalTextPosition(SwingConstants.CENTER);
		panelImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireActionPerformed();
			}
		});
		panelImg.setBackground(Color.WHITE);
		panelImg.setBounds(0, 0, 195, 140);
		add(panelImg);

		txtText = new JTextArea();
		txtText.setOpaque(false);
		txtText.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireActionPerformed();
			}
		});
		txtText.setFont(new Font("Dialog", Font.BOLD, 14));
		txtText.setWrapStyleWord(true);
		txtText.setBackground(new Color(231, 239, 242));
		txtText.setEditable(false);
		txtText.setFocusable(false);
		txtText.setLineWrap(true);
		txtText.setBounds(31, 145, 154, 19);
		add(txtText);

		panelResult = new JPanel();
		panelResult.setOpaque(false);
		panelResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireActionPerformed();
			}
		});
		panelResult.setLayout(null);
		panelResult.setBackground(new Color(231, 239, 242));
		panelResult.setBounds(10, 145, 230, 20);
		add(panelResult);

		panelCheck = new JPanel();
		panelCheck.setOpaque(false);
		panelCheck.setVisible(false);
		panelCheck.setLayout(null);
		panelCheck.setBackground(new Color(231, 239, 242));
		panelCheck.setBounds(0, 0, 20, 20);
		panelResult.add(panelCheck);

		lblCheck = new JLabel(new ImageIcon("img\\carelog\\tick_mark.png"));
		lblCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireActionPerformed();
			}
		});
		lblCheck.setBounds(0, 0, 20, 20);
		lblCheck.setBackground(new Color(231, 239, 242));
		panelCheck.add(lblCheck);

		toggleComponent.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				panelCheck.setVisible(toggleComponent.isSelected());
			}
		});

		txtResult = new JTextArea();
		txtResult.setOpaque(false);
		txtResult.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireActionPerformed();
			}
		});
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setFont(new Font("Dialog", Font.BOLD, 10));
		txtResult.setEditable(false);
		txtResult.setFocusable(false);
		txtResult.setBackground(new Color(231, 239, 242));
		txtResult.setBounds(24, 0, 136, 20);
		panelResult.add(txtResult);
	}

	private void fireActionPerformed() {
		toggle();
		ActionListener[] listeners = listenerList
				.getListeners(ActionListener.class);
		final ActionEvent event = new ActionEvent(this,
				ActionEvent.ACTION_PERFORMED, "CLICKED");
		for (ActionListener l : listeners) {
			l.actionPerformed(event);
		}
	}

	public void addActionListener(ActionListener l) {
		listenerList.add(ActionListener.class, l);
	}

	private void toggle() {
		if (toggleComponent instanceof JCheckBox) {
			toggleComponent.setSelected(!toggleComponent.isSelected());
		} else {
			toggleComponent.setSelected(true);
		}
	}

	public void setIcon(Icon icon) {
		panelImg.setIcon(icon);
	}

	public void setText(String text) {
		txtText.setText(text);
	}

	public void setResult(String result) {
		txtResult.setText(result);
	}
}
