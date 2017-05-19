package medrex.client.carelog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import medrex.client.utils.events.LtcButtonClickedEvent;
import medrex.client.utils.events.LtcButtonListener;
import medrex.commons.enums.GuiModes;

import com.sX.swing.JxPanel;

public class PanelCareLogButton extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 736843530379417291L;
	private JTextArea txtResult;
	private JTextArea txtText;
	private JLabel lblCheck;
	private JPanel panelCheck;
	private JPanel panelResult;
	public int careLogNum;

	protected javax.swing.event.EventListenerList listenerList = new javax.swing.event.EventListenerList();

	public void addLtcButtonListener(LtcButtonListener listener) {
		listenerList.add(LtcButtonListener.class, listener);
	}

	public void removeLtcButtonListener(LtcButtonListener listener) {
		listenerList.remove(LtcButtonListener.class, listener);
	}

	void fireMyEvent(LtcButtonClickedEvent ltcEvent) {
		Object[] listeners = listenerList.getListenerList();
		// Each listener occupies two elements - the first is the listener class
		// and the second is the listener instance
		for (int i = 0; i < listeners.length; i += 2) {
			// if (listeners[i]==LtcButtonClickedEvent.class) {
			((LtcButtonListener) listeners[i + 1]).ltcButtonClicked(ltcEvent);
			// }
		}
	}

	public PanelCareLogButton(String img, final int level) {
		super();
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		setPreferredSize(new Dimension(200, 150));
		setBorder(GuiModes.CHANGE_SCREEN.getControlBorder());
		setBackground(new Color(231, 239, 242));
		setLayout(null);

		final JPanel panelQ = new JPanel();
		panelQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent arg0) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		panelQ.setBackground(new Color(231, 239, 242));
		panelQ.setLayout(null);
		panelQ.setBounds(10, 10, 32, 30);
		add(panelQ);

		JLabel panelImg = null;
		if (img.equalsIgnoreCase("")) {
			panelImg = new JLabel();
		} else {
			panelImg = new JLabel(new ImageIcon(img));
		}

		panelImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		panelImg.setBackground(Color.WHITE);
		panelImg.setBounds(48, 5, 130, 90);
		add(panelImg);

		txtText = new JTextArea();
		txtText.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		txtText.setFont(new Font("Dialog", Font.BOLD, 16));
		txtText.setWrapStyleWord(true);
		txtText.setBackground(new Color(231, 239, 242));
		txtText.setEditable(false);
		txtText.setLineWrap(true);
		txtText.setBounds(15, 84, 163, 30);
		add(txtText);

		panelResult = new JPanel();
		panelResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		panelResult.setLayout(null);
		panelResult.setBackground(new Color(231, 239, 242));
		panelResult.setBounds(10, 116, 180, 27);
		add(panelResult);

		panelCheck = new JPanel();
		panelCheck.setLayout(null);
		panelCheck.setBackground(new Color(231, 239, 242));
		panelCheck.setBounds(0, 0, 20, 20);
		panelResult.add(panelCheck);

		lblCheck = new JLabel(new ImageIcon("img\\carelog\\tick_mark.png"));
		lblCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		lblCheck.setBounds(0, 0, 20, 20);
		lblCheck.setBackground(new Color(231, 239, 242));
		panelCheck.add(lblCheck);

		txtResult = new JTextArea();
		txtResult.setForeground(GuiModes.CHANGE_SCREEN
				.getControlForegroundColor());
		txtResult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				fireMyEvent(new LtcButtonClickedEvent(this, careLogNum, level));
			}
		});
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		txtResult.setFont(new Font("Dialog", Font.BOLD, 10));
		txtResult.setEditable(false);
		txtResult.setBackground(new Color(231, 239, 242));
		txtResult.setBounds(24, 0, 146, 27);
		panelResult.add(txtResult);
		hideResults();
	}

	public void setTitleText(String text) {
		txtText.setText(text);
	}

	public void hideResults() {
		panelResult.setVisible(false);
	}

	public void showResults(String text) {
		txtResult.setText(text);
		panelResult.setVisible(true);
	}

}
