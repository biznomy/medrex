package medrex.client.newform;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import com.sX.swing.JxCheckBox;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelToBeAddedDynamically extends JxPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 263934498501411326L;
	Theme theme = new BlackOverWhiteTheme();

	public PanelToBeAddedDynamically() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setPreferredSize(new Dimension(926, 78));
		setLayout(null);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setOpaque(true);
		jxPanel.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);
		jxPanel.setBounds(0, 0, 926, 78);
		add(jxPanel);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setTheme(theme);
		jxPanel_2.setOpaque(true);
		jxPanel_2.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_2.setLayout(null);
		jxPanel_2.setBackground(Color.WHITE);
		jxPanel_2.setBounds(110, 0, 283, 78);
		jxPanel.add(jxPanel_2);

		final JxPanel jxPanel_2_1 = new JxPanel();
		jxPanel_2_1.setTheme(theme);
		jxPanel_2_1.setOpaque(true);
		jxPanel_2_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_2_1.setLayout(null);
		jxPanel_2_1.setBackground(Color.WHITE);
		jxPanel_2_1.setBounds(391, 0, 283, 78);
		jxPanel.add(jxPanel_2_1);

		final JxPanel jxPanel_2_1_1 = new JxPanel();
		jxPanel_2_1_1.setTheme(theme);

		jxPanel_2_1_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_2_1_1.setLayout(null);
		jxPanel_2_1_1.setBackground(Color.WHITE);
		jxPanel_2_1_1.setBounds(673, 0, 257, 78);
		jxPanel.add(jxPanel_2_1_1);

		final JxCheckBox jxCheckBox = new JxCheckBox();
		jxCheckBox.setTheme(theme);
		jxCheckBox.setOpaque(true);
		jxCheckBox.setBackground(Color.WHITE);
		jxCheckBox.setBounds(10, 10, 193, 18);
		jxCheckBox.setText("NO change");
		jxPanel_2_1_1.add(jxCheckBox);

		final JxCheckBox jxCheckBox_1 = new JxCheckBox();
		jxCheckBox_1.setTheme(theme);
		jxCheckBox_1.setOpaque(true);
		jxCheckBox_1.setBackground(Color.WHITE);
		jxCheckBox_1.setText("from voided,new form completed");
		jxCheckBox_1.setBounds(10, 31, 193, 18);
		jxPanel_2_1_1.add(jxCheckBox_1);

		final JxCheckBox jxCheckBox_2 = new JxCheckBox();
		jxCheckBox_2.setTheme(theme);
		jxCheckBox_2.setOpaque(true);
		jxCheckBox_2.setBackground(Color.WHITE);
		jxCheckBox_2.setText("<html><body>from voided,<b>no</b> new form");
		jxCheckBox_2.setBounds(10, 52, 193, 18);
		jxPanel_2_1_1.add(jxCheckBox_2);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setBounds(0, 0, 111, 78);
		jxPanel.add(jxPanel_1);
		jxPanel_1.setOpaque(true);
		jxPanel_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_1.setLayout(null);
		jxPanel_1.setBackground(Color.WHITE);
	}

}
