package medrex.client.mds3.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.sX.swing.JxButton;

public class PanelMds3Page extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7438860482371165455L;
	/**
	 * Create the panel
	 */

	public static final String PAGE_BUTTON_CLICKED = "PAGE_BUTTON_CLICKED";
	private int pageCount;
	private JxButton btnArr[];
	private int oldButtonIndex;

	public static Color DEFAULT_FORE = new Color(8, 68, 95);
	public static Color DEFAULT_BACK = new Color(130, 163, 175);
	public static final LineBorder DEFAULT_BORDER = new LineBorder(
			DEFAULT_FORE, 1, false);
	public static final Color ACTIVATED_FORE = Color.RED;
	public static final Color ACTIVATED_BACK = Color.WHITE;
	public static final LineBorder ACTIVATED_BORDER = new LineBorder(
			ACTIVATED_FORE, 1, false);

	public PanelMds3Page() {
		super();
		pageCount = 0;
		setPreferredSize(new Dimension(935, 35));
		setLayout(new FlowLayout(FlowLayout.CENTER, 2, 6));
		setOpaque(false);

		// final JButton tmpButton = new JButton();
		// DEFAULT_FORE = tmpButton.getForeground();
		// DEFAULT_BACK = tmpButton.getBackground();

		resetPageButtons();
		resetButtons(1);
	}

	public void resetButtons(int index) {
		if (btnArr != null) {
			if (index - 1 < btnArr.length) {
				for (int i = 0; i < btnArr.length; i++) {
					btnArr[i].setForeground(DEFAULT_FORE);
					btnArr[i].setBackground(DEFAULT_BACK);
					btnArr[i].setBorder(DEFAULT_BORDER);
				}
				btnArr[index].setBackground(ACTIVATED_BACK);
				btnArr[index].setBorder(ACTIVATED_BORDER);
				btnArr[index].setForeground(ACTIVATED_FORE);
			}
		}
	}

	private void resetPageButtons() {
		this.removeAll();
		int max = getPageCount();
		if (max > 1) {
			btnArr = new JxButton[max];
			for (int i = 0; i < max; i++) {
				final int index = i;
				btnArr[i] = new JxButton(0.4f);
				btnArr[i].setText("" + (i + 1));
				btnArr[i].setPreferredSize(new Dimension(20, 20));
				btnArr[i].setForeground(DEFAULT_FORE);
				btnArr[i].setBackground(DEFAULT_BACK);
				btnArr[i].setBorder(DEFAULT_BORDER);
				btnArr[i].setSize(20, 20);

				add(btnArr[i]);

				btnArr[i].addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent arg0) {
						firePropertyChange(PAGE_BUTTON_CLICKED,
								oldButtonIndex + 1, index + 1);
						resetButtons(index);
						oldButtonIndex = index;
					}
				});
			}
		}
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
		resetPageButtons();
	}
}
