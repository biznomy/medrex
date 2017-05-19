package medrex.client.utils.controls;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.utils.FieldFormatter;

public class SsnField extends JPanel {

	private JFormattedTextField txtField03;
	private JLabel lblSeparator02;
	private JFormattedTextField txtField02;
	private JLabel lblSeparator01;
	private JFormattedTextField txtField01;
	private String separator;

	private String text1 = "";
	private String text2 = "";
	private String text3 = "";

	private static final long serialVersionUID = 1L;

	public SsnField() {
		super();

		setLayout(null);
		setBackground(Color.WHITE);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resize();
			}
		});

		txtField01 = new JFormattedTextField(FieldFormatter.MAX3);
		txtField02 = new JFormattedTextField(FieldFormatter.MAX2);
		txtField03 = new JFormattedTextField(FieldFormatter.MAX4);
		separator = "-";

		txtField01.setBackground(Color.WHITE);
		txtField01.setHorizontalAlignment(SwingConstants.CENTER);
		txtField01.setText("");
		txtField01.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtField01.setBounds(3, 1, 23, 20);
		txtField01.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent arg0) {
				if (txtField01.getText().length() <= 2) {
					txtField01.requestFocus();
					text1 = txtField01.getText();
				} else if (txtField01.getText().length() == 3) {
					text1 = txtField01.getText();
					txtField02.requestFocus();
				} else {
					txtField01.setText(text1);
					txtField02.requestFocus();
				}
				fireKeyReleased(arg0);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				fireKeyPressed(e);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				fireKeyTyped(e);
			}

		});

		txtField01.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				fireFocusGained(e);
			}

			public void focusLost(FocusEvent e) {
				fireFocusLost(e);
			}
		});
		add(txtField01);

		lblSeparator01 = new JLabel();
		lblSeparator01.setFont(new Font("", Font.PLAIN, 16));
		lblSeparator01.setText(separator);
		lblSeparator01.setBounds(26, 0, 5, 14);
		lblSeparator01.setOpaque(true);
		add(lblSeparator01);

		txtField02.setBackground(Color.WHITE);
		txtField02.setHorizontalAlignment(SwingConstants.CENTER);
		txtField02.setText("");
		txtField02.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtField02.setBounds(35, 1, 23, 20);
		txtField02.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				if (txtField02.getText().length() <= 1) {
					txtField02.requestFocus();
					text2 = txtField02.getText();
				} else if (txtField02.getText().length() == 2) {
					text2 = txtField02.getText();
					txtField03.requestFocus();
				} else {
					txtField02.setText(text2);
					txtField03.requestFocus();
				}
				fireKeyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				fireKeyPressed(e);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				fireKeyTyped(e);
			}
		});

		txtField02.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				fireFocusGained(e);
			}

			public void focusLost(FocusEvent e) {
				fireFocusLost(e);
			}
		});
		add(txtField02);

		lblSeparator02 = new JLabel();
		lblSeparator02.setFont(new Font("", Font.PLAIN, 16));
		lblSeparator02.setText(separator);
		lblSeparator02.setBounds(58, 0, 5, 14);
		lblSeparator02.setOpaque(true);
		add(lblSeparator02);

		txtField03.setBackground(Color.WHITE);
		txtField03.setHorizontalAlignment(SwingConstants.CENTER);
		txtField03.setText("");
		txtField03.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtField03.setBounds(67, 1, 27, 20);
		txtField03.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(final KeyEvent e) {
				if (txtField03.getText().length() <= 3) {
					txtField03.requestFocus();
					text3 = txtField03.getText();
				} else if (txtField03.getText().length() == 4) {
					text3 = txtField03.getText();

				} else {
					txtField03.setText(text3);

				}
				fireKeyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				fireKeyPressed(e);
			}

			@Override
			public void keyTyped(KeyEvent e) {
				fireKeyTyped(e);
			}
		});

		txtField03.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				fireFocusGained(e);
			}

			public void focusLost(FocusEvent e) {
				fireFocusLost(e);
			}
		});
		add(txtField03);

		setBackground(getBackground());
		setForeground(getForeground());
		setFont(getFont());
		resize();
	}

	protected void resize() {
		int w = getWidth();
		int h = getHeight();
		int bW = getBorderWidth();
		w -= 2 * bW;
		h -= 2 * bW;
		int sepW = lblSeparator01.getPreferredSize().width;
		w -= 2 * sepW;
		float wh = (float) w / 9;

		txtField01.setBounds(bW, bW, (int) (wh * 3), h);
		lblSeparator01.setBounds((int) (bW + wh * 3), bW * 2, sepW, h - 3 * bW);
		txtField02.setBounds((int) (bW + wh * 3) + sepW, bW, (int) (wh * 2), h);
		lblSeparator02.setBounds((int) (bW + wh * 5) + sepW, bW * 2, sepW, h
				- 3 * bW);
		txtField03.setBounds((int) (bW + wh * 5 + sepW * 2), bW,
				(int) (wh * 4), h);
	}

	private int getBorderWidth() {
		Border b = getBorder();
		if (b instanceof LineBorder) {
			return ((LineBorder) b).getThickness() + 1;
		}
		return 1;
	}

	@Override
	public void paint(Graphics g) {
		super.setOpaque(true);
		super.paint(g);
		Border b = this.getBorder();
		if (b != null) {
			b.paintBorder(this, g, 0, 0, getWidth(), getHeight());
		}
	}

	public void setSeparator(String separator) {
		this.separator = separator;
		lblSeparator01.setText(this.separator);
		lblSeparator02.setText(this.separator);
	}

	public String getSeparator() {
		return separator;
	}

	public String getNumber() {
		String phoneno = txtField01.getText() + txtField02.getText()
				+ txtField03.getText();
		return phoneno;
	}

	public void setNumber(String phoneNum) {
		try {
			txtField01.setText(phoneNum.substring(0, 3));
			txtField02.setText(phoneNum.substring(3, 5));
			txtField03.setText(phoneNum.substring(5, 9));

		} catch (Exception e) {
			// e.printStackTrace();
			txtField01.setText("");
			txtField02.setText("");
			txtField03.setText("");
		}

		text1 = txtField01.getText();
		text2 = txtField02.getText();
		text3 = txtField03.getText();

	}

	public boolean setEditable(boolean test) {
		if (test == true) {
			txtField01.setEditable(true);
			txtField02.setEditable(true);
			txtField03.setEditable(true);
			return true;
		} else {
			txtField01.setEditable(false);
			txtField02.setEditable(false);
			txtField03.setEditable(false);
			return false;
		}
	}

	// public static void main(String a[]) {
	// JDialog jd = new JDialog();
	// jd.setLayout(null);
	// PhoneField pf = new PhoneField();
	// pf.setBounds(10, 10, 470, 240);
	// jd.add(pf);
	//
	// jd.setBounds(0, 0, 500, 300);
	// SwingUtils.center(jd);
	// jd.setModal(true);
	// jd.setVisible(true);
	// }

	@Override
	public void setBackground(Color color) {
		super.setBackground(color);
		if (color != null && txtField01 != null && txtField02 != null
				&& txtField02 != null) {
			txtField01.setBackground(color);
			lblSeparator01.setBackground(color);
			txtField02.setBackground(color);
			lblSeparator02.setBackground(color);
			txtField03.setBackground(color);
		}
	}

	@Override
	public void setForeground(Color color) {
		super.setForeground(color);
		if (color != null && txtField01 != null && txtField02 != null
				&& txtField02 != null) {
			txtField01.setForeground(color);
			lblSeparator01.setForeground(color);
			txtField02.setForeground(color);
			lblSeparator02.setForeground(color);
			txtField03.setForeground(color);
		}
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		if (font != null && txtField01 != null && txtField02 != null
				&& txtField02 != null) {
			txtField01.setFont(font);
			lblSeparator01.setFont(font);
			txtField02.setFont(font);
			lblSeparator02.setFont(font);
			txtField03.setFont(font);
		}
	}

	protected void fireFocusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		FocusListener[] listeners = this.getFocusListeners();
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].focusGained(e);
		}
	}

	protected void fireFocusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		FocusListener[] listeners = this.getFocusListeners();
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].focusLost(e);
		}
	}

	protected void fireKeyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		KeyListener[] listeners = this.getKeyListeners();
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].keyReleased(e);
		}
	}

	protected void fireKeyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		KeyListener[] listeners = this.getKeyListeners();
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].keyPressed(e);
		}
	}

	protected void fireKeyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		KeyListener[] listeners = this.getKeyListeners();
		for (int i = 0; i < listeners.length; i++) {
			listeners[i].keyTyped(e);
		}
	}
}
