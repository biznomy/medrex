package com.sX.swing.calender;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import medrex.client.dietary.PanelDietryView;
import medrex.commons.enums.ColorConstants;

public class JCalendar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5668357543113556110L;

	class JCalendarComp extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -5419911425488306237L;
		private JComponent viewComp;
		private JPanel defaultPanel;
		private final JLabel label;
		private JRootPane rootPane;
		private JPanel labelPanel;

		public JCalendarComp() {
			super();
			setLayout(new BorderLayout());
			setBorder(new LineBorder(Color.BLACK));
			setBackground(Color.WHITE);
			// setOpaque(false);

			rootPane = new JRootPane();
			super.add(rootPane);
			// rootPane.setOpaque(false);
			rootPane.setBackground(Color.WHITE);

			final FlowLayout layout = new FlowLayout();
			layout.setHgap(5);
			layout.setVgap(2);
			layout.setAlignment(FlowLayout.LEFT);

			final JLayeredPane layeredPane = rootPane.getLayeredPane();
			// layeredPane.setOpaque(false);
			layeredPane.setBackground(Color.WHITE);
			layeredPane.setLayout(new BorderLayout());
			layeredPane.setVisible(true);

			rootPane.setVisible(true);
			rootPane.getContentPane().setVisible(true);

			defaultPanel = new JPanel();
			// defaultPanel.setOpaque(false);
			defaultPanel.setBackground(Color.WHITE);
			defaultPanel.setLayout(new BorderLayout());

			rootPane.getContentPane().setLayout(new BorderLayout());
			rootPane.getContentPane().add(defaultPanel, BorderLayout.CENTER);

			labelPanel = new JPanel();
			labelPanel.setLayout(layout);
			labelPanel.setBackground(Color.WHITE);
			// labelPanel.setOpaque(false);
			layeredPane.add(labelPanel, BorderLayout.NORTH);
			rootPane.setComponentZOrder(layeredPane, 0);

			label = new JLabel();
			label.setText("New JLabel");
			label.setBackground(Color.WHITE);
			label.setForeground(ColorConstants.DEF_COLOR);
			// label.setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
			// false));
			label.setFont(new Font("", Font.BOLD, 12));
			// label.setFont(new Font("Times New Roman", Font.PLAIN, 11));
			labelPanel.add(label);

			defaultPanel.setBorder(new EmptyBorder(labelPanel
					.getPreferredSize().height, 0, 0, 0));
		}

		@Override
		public JRootPane getRootPane() {
			return rootPane;
		}

		public Container getContentPane() {
			return rootPane.getContentPane();
		}

		public Component getGlassPane() {
			return rootPane.getGlassPane();
		}

		public JLayeredPane getLayeredPane() {
			return rootPane.getLayeredPane();
		}

		public void setContentPane(Container arg0) {
			rootPane.setContentPane(arg0);
		}

		public void setGlassPane(Component arg0) {
			rootPane.setGlassPane(arg0);
		}

		public void setLayeredPane(JLayeredPane arg0) {
			rootPane.setLayeredPane(arg0);
		}

		@Override
		protected void addImpl(Component comp, Object constraints, int index) {
			if (comp == rootPane) {
				super.addImpl(comp, constraints, index);
			} else {
				getContentPane().add(comp, constraints, index);
			}
		}

		@Override
		public Component add(Component comp, int index) {
			return rootPane.getContentPane().add(comp, index);
		}

		@Override
		public void add(Component comp, Object constraints, int index) {
			rootPane.getContentPane().add(comp, constraints, index);
		}

		@Override
		public void add(Component comp, Object constraints) {
			rootPane.getContentPane().add(comp, constraints);
		}

		@Override
		public Component add(Component comp) {
			return rootPane.getContentPane().add(comp);
		}

		@Override
		public Component add(String name, Component comp) {
			return rootPane.getContentPane().add(name, comp);
		}

		public void setDate(int date) {
			label.setText(date + "");
		}

		public void setBlankDate() {
			label.setText("");
		}

		public void setComponent(JComponent com) {
			if (viewComp != null) {
				defaultPanel.remove(viewComp);
			}
			viewComp = com;
			if (viewComp != null) {
				defaultPanel.add(viewComp, BorderLayout.CENTER);
			}
		}

		public void setTextPosition() {
			label.setVerticalAlignment(JLabel.CENTER);
			label.setHorizontalAlignment(JLabel.CENTER);
		}

		@Override
		public void setEnabled(boolean enabled) {
			// System.out.println("JCalendar setEnabled Called");
			super.setEnabled(enabled);
			label.setEnabled(enabled);
			defaultPanel.setEnabled(enabled);
			if (viewComp != null) {
				viewComp.setEnabled(enabled);
			}
		}

		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			label.setVisible(visible);
			defaultPanel.setVisible(visible);
			if (viewComp != null) {
				viewComp.setVisible(visible);
			}
		}
	}

	private JComboBox cmbMonth;
	private GregorianCalendar cal;
	Object data[][];
	final JCalendarComp[] button;
	final JButton[] weekDays;
	protected int selectedMonth;
	protected boolean initialized = false;

	private JSpinner spinner;
	private SpinnerDateModel spinnerModel;
	private JPanel panel_1;
	private JPanel panel_2;
	private GregorianCalendar maxDateOfMonth;
	private GregorianCalendar minDateOfMonth;

	public JCalendar() {
		super();
		setLayout(null);
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setOpaque(false);
		setBorder(new EmptyBorder(3, 3, 3, 3));
		// setBorder(new CompoundBorder(new LineBorder(Color.BLACK, 1, false),
		// new EmptyBorder(3, 3, 3, 3)));

		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 10));
		// panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setOpaque(false);
		// panel.setBounds(10, 10, 361, 355);
		add(panel, BorderLayout.CENTER);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(new BorderLayout(0, 5));
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel_3.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3));
		panel_1.setBackground(Color.WHITE);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_3.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(1, 7));

		final JPanel panel_4 = new JPanel();
		final GridLayout gridLayout = new GridLayout(1, 0);
		gridLayout.setHgap(400);
		panel_4.setLayout(gridLayout);
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4, BorderLayout.NORTH);

		cmbMonth = new JComboBox();
		cmbMonth.setBackground(Color.WHITE);
		cmbMonth.setForeground(ColorConstants.DEF_COLOR);
		cmbMonth.setFont(new Font("", Font.BOLD, 12));
		cmbMonth.setSelectedItem(Calendar.MONTH);
		// cmbMonth.addItemListener(new ItemListener() {
		// public void itemStateChanged(final ItemEvent e) {
		// monthChanged();
		// }
		// });
		cmbMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (initialized) {
					updateValues();
				}
			}
		});
		cmbMonth.setModel(new DefaultComboBoxModel(new String[] { "January",
				"February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" }));
		cmbMonth.setBorder(new LineBorder(Color.black, 1, false));
		panel_4.add(cmbMonth);

		spinnerModel = new SpinnerDateModel();
		spinnerModel.setCalendarField(Calendar.YEAR);
		spinner = new JSpinner(spinnerModel);
		spinner.setBackground(Color.WHITE);
		spinner.setForeground(ColorConstants.DEF_COLOR);
		spinner.setBorder(new LineBorder(ColorConstants.BORDER_COL, 2, false));
		spinner.setFont(new Font("", Font.BOLD, 12));

		JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "yyyy");
		spinner.setEditor(de);
		spinner.addChangeListener(new ChangeListener() {
			@SuppressWarnings("deprecation")
			public void stateChanged(final ChangeEvent e) {
				if (cal.get(Calendar.YEAR) + 1 == spinnerModel.getDate()
						.getYear() + 1900) {
					cal.set(Calendar.YEAR,
							(spinnerModel.getDate().getYear() + 1900));
					cal.set(Calendar.MONTH, cmbMonth.getSelectedIndex());
					updateValues();
				}
				if (cal.get(Calendar.YEAR) - 1 == spinnerModel.getDate()
						.getYear() + 1900) {
					cal.set(Calendar.YEAR,
							(spinnerModel.getDate().getYear() + 1900));
					cal.set(Calendar.MONTH, cmbMonth.getSelectedIndex());
					updateValues();
				}
			}
		});
		panel_4.add(spinner);
		weekDays = new JButton[7];
		for (int i = 0; i < weekDays.length; i++) {
			weekDays[i] = new JButton();
			weekDays[i].setMargin(new Insets(1, 1, 1, 1));
			weekDays[i].setText("");
			weekDays[i].setBackground(Color.WHITE);
			weekDays[i].setForeground(ColorConstants.DEF_COLOR);
			weekDays[i].setBorder(new LineBorder(ColorConstants.BORDER_COL, 1,
					false));
			weekDays[i].setFont(new Font("", Font.BOLD, 12));
			panel_2.add(weekDays[i]);
		}

		button = new JCalendarComp[42];
		for (int i = 0; i < button.length; i++) {
			button[i] = new JCalendarComp();
			button[i].setTextPosition();
			button[i].setBlankDate();
			button[i].setOpaque(false);
			panel_1.add(button[i]);
		}
		GregorianCalendar calendar = new GregorianCalendar();
		// System.out.println("server time is:"+MedrexClientManager.getServerTime());
		// calendar.setTime(MedrexClientManager.getServerTime());
		cal = calendar;
		cmbMonth.setSelectedIndex(cal.get(GregorianCalendar.MONTH));
		updateValues();
		initialized = true;
	}

	public static void main(String arg[]) {
		JFrame frm = new JFrame("My Annual Planner");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCalendar myCal = new JCalendar() {
			@Override
			public JComponent getComponentAt(int date) {
				JPanel panel = new JPanel();
				panel.setLayout(new BorderLayout());

				// JxButton viewButton = new JxButton(0.4f);
				// viewButton.addActionListener(new ActionListener() {
				// public void actionPerformed(final ActionEvent e) {
				// // SwingUtils.openInDialog(new
				// PanelViewDiet(dateLabel.getText()));
				// // doUpdateDietInfo(new Date(dateLabel.getText()));
				// }
				// });
				// viewButton.setBackground(Color.WHITE);
				// viewButton.setForeground(ColorConstants.DEF_COLOR);
				// viewButton.setBorder(new
				// LineBorder(ColorConstants.BORDER_COL, 1, false));
				// viewButton.setFont(new Font("", Font.BOLD, 12));
				// viewButton.setText("View");
				// viewButton.setBounds(488, 12, 89, 34);
				JPanel viewPannel = new PanelDietryView(new Date());
				// viewPannel.setOpaque(false);
				// panel.setOpaque(false);
				panel.add(viewPannel);
				return panel;
			}

		};
		myCal.setHorizontalAndVerticalGap(3, 3);
		// myCal.setMinimumDate(new GregorianCalendar(2009, 11, 5).getTime());
		// myCal.setMaximumDate(new GregorianCalendar(2012, 0, 10).getTime());
		frm.getContentPane().add(myCal);
		frm.getContentPane().setBackground(Color.WHITE);
		frm.setVisible(true);
		frm.setSize(570, 560);
	}

	private void flush() {
		for (int i = 0; i < button.length; i++) {
			button[i].setBackground(Color.WHITE);
			button[i].setBlankDate();
			button[i].setEnabled(false);
			// button[i].setVisible(false);
			button[i].setComponent(null);
		}
	}

	// public void monthChanged() {
	// cal.set(Calendar.YEAR, spinnerModel.getDate().getYear()+1900);
	// cal.set(Calendar.MONTH, cmbMonth.getSelectedIndex());
	// System.out.println("monthChanged call updateValues");
	// updateValues();
	// }

	public void updateValues() {
		flush();
		weekDays[0].setText("S");
		weekDays[1].setText("M");
		weekDays[2].setText("T");
		weekDays[3].setText("W");
		weekDays[4].setText("T");
		weekDays[5].setText("F");
		weekDays[6].setText("S");

		cal.set(Calendar.YEAR, spinnerModel.getDate().getYear() + 1900);
		cal.set(Calendar.MONTH, cmbMonth.getSelectedIndex());
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1);

		int minDate = cal.getActualMinimum(Calendar.DATE);
		int maxDate = cal.getActualMaximum(Calendar.DATE);
		int curMon = cal.get(Calendar.MONTH);
		int curYear = cal.get(Calendar.YEAR);
		cmbMonth.setSelectedItem(cal.get(Calendar.MONTH));
		for (int i = cal.get(Calendar.DAY_OF_WEEK) - 1; i < (button.length); i++) {
			Calendar CurrDate = Calendar.getInstance();
			button[cal.get(Calendar.DAY_OF_WEEK)
					+ (CurrDate.get(Calendar.DATE) - 2)]
					.setBackground(Color.LIGHT_GRAY);
			// button[i].label.setEnabled(false);
			// button[i].setEnabled(false);
			JComponent com = getComponentAt(minDate);
			button[i].setComponent(com);
			button[i].setDate(minDate);
			Calendar cur = new GregorianCalendar(curYear, curMon, minDate);
			if (minDateOfMonth != null && maxDateOfMonth != null) {
				if ((minDateOfMonth.before(cur) && maxDateOfMonth.after(cur))
						|| minDateOfMonth.equals(cur)
						|| maxDateOfMonth.equals(cur)) {
					button[i].setEnabled(true);
					button[i].setVisible(true);
					// System.out.println("JCalendar setEnabled Called for date"+minDate+"-"+this.getCurrentMonth()+1+"-"+this.getCurrentYear()+"enabled true");

				}
			}
			if (minDateOfMonth != null && maxDateOfMonth == null) {
				if ((minDateOfMonth.before(cur) || minDateOfMonth.equals(cur))) {
					button[i].setEnabled(true);
					button[i].setVisible(true);
					// System.out.println("JCalendar setEnabled Called for date"+minDate+"-"+this.getCurrentMonth()+1+"-"+this.getCurrentYear()+"enabled true");
				}
			}
			if (maxDateOfMonth != null && minDateOfMonth == null) {
				if ((maxDateOfMonth.after(cur)) || maxDateOfMonth.equals(cur)) {
					button[i].setEnabled(true);
					button[i].setVisible(true);
					// System.out.println("JCalendar setEnabled Called for date"+minDate+"-"+this.getCurrentMonth()+1+"-"+this.getCurrentYear()+"enabled true");
				}
			}
			if (maxDateOfMonth == null && minDateOfMonth == null) {
				button[i].setEnabled(true);
				button[i].setVisible(true);
				// System.out.println("JCalendar setEnabled Called for date"+minDate+"-"+this.getCurrentMonth()+1+"-"+this.getCurrentYear()+"enabled true");
			}
			minDate++;
			if (minDate > maxDate) {
				break;
			}
		}
	}

	public JComponent getComponentAt(int date) {
		return new JLabel("");
	}

	// Horizontal And Vertical Gaps in Buttons
	public void setVerticalGap(int vGap) {
		panel_1.setLayout(new GridLayout(6, 7, 0, vGap));
		panel_2.setLayout(new GridLayout(0, 7, 0, vGap));
	}

	public void setHorizontalGap(int hGap) {
		panel_1.setLayout(new GridLayout(6, 7, hGap, 0));
		panel_2.setLayout(new GridLayout(0, 7, hGap, 0));
	}

	public void setHorizontalAndVerticalGap(int hGap, int vGap) {
		panel_1.setLayout(new GridLayout(6, 7, hGap, vGap));
		panel_2.setLayout(new GridLayout(0, 7, hGap, vGap));
	}

	// top,left ,Bottom,Right Margins.
	// public void setVerticalMargin(int top,int bottom){
	// for(int i=0;i<button.length;i++){
	// button[i].setMargin(new Insets(top,0,bottom,0));
	// }
	// }
	// public void setHorizontalMargin(int left,int right){
	// for(int i=0;i<button.length;i++){
	// button[i].setMargin(new Insets(0,left,0,right));
	// }
	// }
	// public void setCustomMargin(int top,int left,int bottom,int right){
	// for(int i=0;i<button.length;i++){
	// button[i].setMargin(new Insets(top,left,bottom,right));
	// }
	// }
	public void setMaximumDate(Date maxDate) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(maxDate);
		this.maxDateOfMonth = cal;
		updateValues();
	}

	public void setMinimumDate(Date minDate) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(minDate);
		this.minDateOfMonth = cal;
		updateValues();
	}

	public int getCurrentYear() {
		return (spinnerModel.getDate().getYear() + 1900);

	}

	public int getCurrentMonth() {
		return (cmbMonth.getSelectedIndex());
	}

}
