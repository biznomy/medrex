package com.sX.swing.widgets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.SwingUtils;
import medrex.commons.intf.PopUpView;

import com.sX.swing.JxButton;

public class PanelFaceScale extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3401745231485872595L;
	public static Color selectedColor = new Color(194, 194, 194);
	private int score;

	public PanelFaceScale() {
		super();
		setLayout(new BorderLayout());
		setSize(new Dimension(750, 249));
		final JPanel panel = new JPanel();
		setBorder(new LineBorder(selectedColor, 4));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel);

		final JLabel wongBakerLabel = new JLabel();
		wongBakerLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		wongBakerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wongBakerLabel.setText("Wong - Baker FACES Pain Rating Scale");
		wongBakerLabel.setBounds(83, 10, 571, 35);
		panel.add(wongBakerLabel);

		final JLabel smiley1 = new JLabel(new ImageIcon(
				"img//widgets//smiley1.png"));
		smiley1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					doSave(0);
				}
			}
		});
		smiley1.setText("");
		smiley1.setBounds(23, 65, 91, 73);
		panel.add(smiley1);

		final JLabel smiley2 = new JLabel(new ImageIcon(
				"img//widgets//smiley2.png"));
		smiley2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					doSave(2);
				}
			}
		});
		smiley2.setText("");
		smiley2.setBounds(138, 65, 91, 73);
		panel.add(smiley2);

		final JLabel smiley3 = new JLabel(new ImageIcon(
				"img//widgets//smiley3.png"));
		smiley3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					doSave(4);
				}
			}
		});
		smiley3.setText("");
		smiley3.setBounds(266, 65, 91, 73);
		panel.add(smiley3);

		final JLabel smiley4 = new JLabel(new ImageIcon(
				"img//widgets//smiley4.png"));
		smiley4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					doSave(6);
				}
			}
		});
		smiley4.setText("");
		smiley4.setBounds(389, 65, 91, 73);
		panel.add(smiley4);

		final JLabel smiley5 = new JLabel(new ImageIcon(
				"img//widgets//smiley5.png"));
		smiley5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					doSave(8);
				}
			}
		});
		smiley5.setText("");
		smiley5.setBounds(507, 65, 91, 73);
		panel.add(smiley5);

		final JLabel smiley6 = new JLabel(new ImageIcon(
				"img//widgets//smiley6.png"));
		smiley6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				if (e.getClickCount() == 2) {
					doSave(10);
				}
			}
		});
		smiley6.setText("");
		smiley6.setBounds(623, 65, 91, 73);
		panel.add(smiley6);

		final JLabel noHurtLabel = new JLabel();
		noHurtLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		noHurtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		noHurtLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		noHurtLabel.setText("<Html><body><center>0<br>No Hurt");
		noHurtLabel.setBounds(23, 158, 91, 47);
		panel.add(noHurtLabel);

		final JLabel hurtsLabel = new JLabel();
		hurtsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hurtsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hurtsLabel
				.setText("<html><Body><center>2<br>Hurts Little<br> Bit</body></html>");
		hurtsLabel.setBounds(138, 158, 105, 63);
		panel.add(hurtsLabel);

		final JLabel hurtsLittleMoreLabel = new JLabel();
		hurtsLittleMoreLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hurtsLittleMoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hurtsLittleMoreLabel
				.setText("<html><body><center>4<br>Hurts Little <br>More</body></html>");
		hurtsLittleMoreLabel.setBounds(249, 144, 124, 87);
		panel.add(hurtsLittleMoreLabel);

		final JLabel hurtsEvenMoreLabel = new JLabel();
		hurtsEvenMoreLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hurtsEvenMoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hurtsEvenMoreLabel
				.setText("<html><body><center>6<br>Hurts Even <br>More");
		hurtsEvenMoreLabel.setBounds(379, 158, 124, 62);
		panel.add(hurtsEvenMoreLabel);

		final JLabel hurtsWholeLotLabel = new JLabel();
		hurtsWholeLotLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hurtsWholeLotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hurtsWholeLotLabel
				.setText("<html><body><center>8<br>Hurts Whole <br>Lot");
		hurtsWholeLotLabel.setBounds(507, 158, 96, 62);
		panel.add(hurtsWholeLotLabel);

		final JLabel hurtsWorstLabel = new JLabel();
		hurtsWorstLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		hurtsWorstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hurtsWorstLabel.setText("<html><body><center>10<br>Hurts Worst");
		hurtsWorstLabel.setBounds(623, 158, 105, 47);
		panel.add(hurtsWorstLabel);

		final JxButton button = new JxButton();
		button.setArc(0.4f);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		button.setBackground(Color.WHITE);
		button.setText("X");
		button.setBounds(705, 10, 23, 20);
		panel.add(button);
	}

	protected void doSave(int painValue) {

		setScore(painValue);
		close();

	}

	public static void main(String[] args) {
		SwingUtils.wrapInDialog(new PanelFaceScale()).setVisible(true);

	}

	public static Color getSelectedColor() {
		return selectedColor;
	}

	public static void setSelectedColor(Color selectedColor) {
		PanelFaceScale.selectedColor = selectedColor;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String getTitle() {

		return "Face Scale - Wong";
	}

}
