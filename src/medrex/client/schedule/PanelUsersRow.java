package medrex.client.schedule;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.schedule.ScheduleConstants.ScheduleMode;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;

import com.sX.swing.JxLabel;

public class PanelUsersRow extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6486971843135015440L;

	public static final Color scheduled = GuiModes.DESIGNER_FORMS
			.getControlForegroundColor();
	public static final Color available = Color.RED;
	public static final Color notAvailable = Color.GREEN;
	public static final Color overtime = Color.ORANGE;
	
	public  HashMap<Integer,String> totalMap[] = new HashMap[28];

	public JLabel lblNurseSerial;

	private Object nurseNameObject;
	public Object nurseIdObject;
	public JxLabel[] nurseLabelRecord;
	// public JxLabel[] nurseSecondLabelRecord;
	public JLabel[] dateCount;
	public JLabel nurseIdLabel;
	public int serials[];
	public JLabel serialCount[];
	private Date fromDate;
	private GregorianCalendar cal;
	private PanelTotals panelTotals;

	private JxLabel nurseLabelRecordTotal;

	public PanelUsersRow(Object objectName, Object ObjectID, Date fromDate,PanelTotals panelTotal) {
		setSize(1137,
				PanelScheduleAdd.CELL_HEIGHT);
		// setBorder(new LineBorder(Color.GREEN,1,false));
		setLayout(null);

		this.nurseNameObject = objectName;
		this.nurseIdObject = ObjectID;
		this.panelTotals = panelTotal;
		// this.serial=serial;

		this.cal = new GregorianCalendar();
		this.fromDate = fromDate;
		this.cal.setTime(fromDate);

		// Now i am set NurseRowStatic after this it will be set dynamically

		JPanel nurseIdPanel = new JPanel();
		nurseIdPanel.setBackground(Color.WHITE);
		nurseIdLabel = new JLabel();
		nurseIdLabel.setFont(new Font("Arial", Font.BOLD, 12));
		nurseIdPanel.setBounds(0, 0, 2, PanelScheduleAdd.CELL_HEIGHT);
		nurseIdPanel.setLayout(null);
		// nurseIdPanel.setBorder(new LineBorder(Color.black,1));
		add(nurseIdPanel);
		nurseIdLabel.setText("" + nurseIdObject);
		nurseIdLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		nurseIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nurseIdLabel.setBounds(0, 0, 2, PanelScheduleAdd.CELL_HEIGHT);
		nurseIdLabel.setVisible(false);
		nurseIdPanel.add(nurseIdLabel);

		JPanel nurseRowCountPanel = new JPanel();
		nurseRowCountPanel.setBackground(Color.WHITE);
		JLabel nurseRowCountLabel = new JLabel();
		nurseRowCountPanel.setBounds(0, 0, 120, PanelScheduleAdd.CELL_HEIGHT);
		nurseRowCountPanel.setLayout(null);
		nurseRowCountLabel.setFont(new Font("Arial", Font.BOLD, 12));
		nurseRowCountPanel.setBorder(new LineBorder(Color.black, 1));
		add(nurseRowCountPanel);
		nurseRowCountLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		nurseRowCountLabel.setText("" + nurseNameObject);

		nurseRowCountLabel.setHorizontalAlignment(SwingConstants.LEFT);
		nurseRowCountLabel.setBounds(2, 0, 120, PanelScheduleAdd.CELL_HEIGHT);
		nurseRowCountPanel.add(nurseRowCountLabel);

		final JPanel nurseIdPanel_1 = new JPanel();
		nurseIdPanel_1.setBackground(Color.WHITE);
		// nurseIdPanel_1.setBorder(new LineBorder(Color.black, 1, false));
		nurseIdPanel_1.setLayout(null);
		nurseIdPanel_1.setBounds(0, 0, 2, 25);
		add(nurseIdPanel_1);

		lblNurseSerial = new JLabel();
		lblNurseSerial.setFont(new Font("Arial", Font.BOLD, 12));
		// lblNurseSerial.setText(serial+"");
		lblNurseSerial.setBounds(0, 0, 20, 50);
		lblNurseSerial.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		lblNurseSerial.setVisible(false);
		nurseIdPanel_1.add(lblNurseSerial);

		nurseLabelRecord = new JxLabel[28];

		// nurseSecondLabelRecord=new JxLabel[28];
		dateCount = new JLabel[28];
		serialCount = new JLabel[28];
		serials = new int[28];
		for (int i = 0, j = 2, k = cal.get(Calendar.DATE); i < 28; i++, j++, k++) {
			final int index = i;
			JPanel panelCount = new JPanel();
			nurseLabelRecord[i] = new JxLabel(/* PanelMasterScheduleMain.vals */);

			// nurseLabelRecord[i].setArc(0.0f);

			/*
			 * serialCount[i]=new JLabel(); //serialCount[i].setText(serial+"");
			 * 
			 * panelCount.add(serialCount[i]); serialCount[i].disable();
			 */
			serials[i] = 0;

			dateCount[i] = new JLabel();
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			String dateString = dateFormat.format(cal.getTime());
			dateCount[i].setText(dateString);

			System.out.println("dateCount[i].getText()==="
					+ dateCount[i].getText());

			// panelCount.add(dateCount[i]);
			dateCount[i].disable();
			
			
			//nurseLabelRecord[i].setText("Hello");

			nurseLabelRecord[i].setBackground(PanelScheduleAdd
					.getBackgroundColor(i));

			// nurseLabelRecord[i].setIconized(false);
			nurseLabelRecord[i].setFont(new Font("Arial", Font.BOLD, 11));
			nurseLabelRecord[i].setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			nurseLabelRecord[i]
					.setBorder(new LineBorder(Color.BLACK, 1, false));

			panelCount.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent me) {
					doShiftClick(index);
				}
			});

			panelCount.setBounds((j * PanelScheduleAdd.CELL_WIDTH)
					+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH), 0,
					PanelScheduleAdd.CELL_WIDTH, PanelScheduleAdd.CELL_HEIGHT);
			panelCount.setPreferredSize(panelCount.getSize());
			panelCount.setBackground(PanelScheduleAdd.getBackgroundColor(i));
			panelCount.setLayout(new GridLayout(1, 1));
			panelCount.add(nurseLabelRecord[i]);
			// panelCount.add(nurseSecondLabelRecord[i]);
			add(panelCount);
			// add(panelCount);
			cal.add(Calendar.DATE, 1);
			// cal.add(Calendar.MONTH,1);
		}

		JPanel panelCount = new JPanel();
		nurseLabelRecordTotal = new JxLabel(/* PanelMasterScheduleMain.vals */);
		
	   // nurseLabelRecordTotal.setText("Hello");

		nurseLabelRecordTotal.setBackground(Color.WHITE);
		// nurseLabelRecord[i].setIconized(false);
		nurseLabelRecordTotal.setFont(new Font("Arial", Font.PLAIN, 11));
		nurseLabelRecordTotal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		nurseLabelRecordTotal.setBorder(new LineBorder(Color.BLACK, 1, false));

		panelCount.setBounds((30 * PanelScheduleAdd.CELL_WIDTH)
				+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH), 0,
				PanelScheduleAdd.CELL_WIDTH, PanelScheduleAdd.CELL_HEIGHT);
		panelCount.setPreferredSize(panelCount.getSize());
		panelCount.setBackground(Color.WHITE);
		panelCount.setLayout(new GridLayout(1, 1));
		panelCount.add(nurseLabelRecordTotal);
		add(panelCount);
	}

	public void doShiftClick(int index) {
		// PanelMasterScheduleMain.updateTotal();

		PanelShifts panelShifts = null;

		ScheduleConstants.mode = ScheduleMode.USER_SCHEDULE;

		String shift = "";
		shift = nurseLabelRecord[index].getText();
		panelShifts = new PanelShifts("", "");
		SwingUtils.openInDialog(panelShifts);		
		if (panelShifts.getShift != null  ){
			System.out.println("panelShifts.getShift==:"+panelShifts.getShift);			
			setShift(index, panelShifts.getShift);
		}
	}

	public void setShift(int index, String shift) {

		int startindex = index - index % 7;
		int shiftsthisweek = 0;
		for (int i = startindex; i < startindex + 7; i++) {

		String tempShift ="";// nurseLabelRecord[i].getText();
			if (i == index)
				tempShift = shift;
			tempShift = tempShift.trim();
			tempShift = tempShift.replaceAll("<HTML>", "");
			tempShift = tempShift.replaceAll("<BR>", "");
			if (tempShift.length() == 3)
				shiftsthisweek = shiftsthisweek + 1;
			else if (tempShift.length() == 6)
				shiftsthisweek = shiftsthisweek + 2;
			if (shiftsthisweek > 5) {
				nurseLabelRecord[i].setForeground(overtime);
			} else {
				setNonOvertimeColors(i, tempShift);
			}
		}
		
		System.out.println("shift.shift==:"+shift);
		
		if (shift.length() == 6) {
			nurseLabelRecord[index].setText("<HTML>" + shift.substring(0, 3)
					+ "<BR>" + shift.substring(3, 6));
		} else {
			nurseLabelRecord[index].setText(" " + shift);
		}
		setTotalHours();
		panelTotals.setTotalHours(index, (Integer)nurseIdObject, shift);

	}
	
	
	public  void setTotalHours(){
		int d1n=0;
		int d2n=0;
		int d1s=0;
		int d2s=0;
		int e1n=0;
		int e2n=0;
		int e1s=0;
		int e2s=0;
		int n1n=0;
		int n2n=0;
		int n1s=0;
		int n2s=0;
		
		
	String shift ="";
		for(int i=0;i<28;i++){

			shift = nurseLabelRecord[i].getText();
			if (shift.contains("D1N")) d1n=d1n+1;
			if (shift.contains("D2N")) d2n=d2n+1;
			if (shift.contains("D1S")) d1s=d1s+1;
			if (shift.contains("D2S")) d2s=d2s+1;
			if (shift.contains("E1N")) e1n=e1n+1;
			if (shift.contains("E2N")) e2n=e2n+1;
			if (shift.contains("E1S")) e1s=e1s+1;
			if (shift.contains("E2S")) e2s=e2s+1;
			if (shift.contains("N1N")) n1n=n1n+1;
			if (shift.contains("N2N")) n2n=n2n+1;
			if (shift.contains("N1S")) n1s=n1s+1;
			if (shift.contains("N2S")) n2s=n2s+1;
		}
		
		nurseLabelRecordTotal.setText(d1n+d2n+d1s+d2s+e1n+e2n+e1s+e2s+n1n+n2n+n1s+n2s+"");
		nurseLabelRecordTotal.setToolTipText("<HTML> Day - 1st Floor - North "+d1n+
				"<BR> Day - 2nd Floor -North"+d2n+
				"<BR> Day - 1st Floor -South"+d1s+
				"<BR> Day - 2nd Floor -South"+d2s+
				"<BR> Evening - 1st Floor - North "+e1n+
				"<BR> Evening - 2nd Floor -North"+e2n+
				"<BR> Evening - 1st Floor -South"+e1s+
				"<BR> Evening - 2nd Floor -South"+e2s+
				"<BR> Night - 1st Floor - North "+n1n+
				"<BR> Night - 2nd Floor -North"+n2n+
				"<BR> Night - 1st Floor -South"+n1s+
				"<BR> Night - 2nd Floor -South"+n2s
				);
		/*System.out.println("<HTML> Day - 1st Floor - North "+d1n+
				"<BR> Day - 2nd Floor -North"+d2n+
				"<BR> Day - 1st Floor -South"+d1s+
				"<BR> Day - 2nd Floor -South"+d2s+
				"<BR> Evening - 1st Floor - North "+e1n+
				"<BR> Evening - 2nd Floor -North"+e2n+
				"<BR> Evening - 1st Floor -South"+e1s+
				"<BR> Evening - 2nd Floor -South"+e2s+
				"<BR> Night - 1st Floor - North "+n1n+
				"<BR> Night - 2nd Floor -North"+n2n+
				"<BR> Night - 1st Floor -South"+n1s+
				"<BR> Night - 2nd Floor -South"+n2s		);*/
	}
	
	
	
	

	public void setNonOvertimeColors(int index, String shift) {
		if (shift.equalsIgnoreCase("V") || shift.equalsIgnoreCase("B")
				|| shift.equalsIgnoreCase("O") || shift.equalsIgnoreCase("P")
				|| shift.equalsIgnoreCase("R")) {
			nurseLabelRecord[index].setForeground(notAvailable);
		}
		if (shift.equalsIgnoreCase("D") || shift.equalsIgnoreCase("E")
				|| shift.equalsIgnoreCase("N")) {
			nurseLabelRecord[index].setForeground(available);
		}
		if (shift.length() == 3) {
			nurseLabelRecord[index].setForeground(scheduled);
		}
		if (shift.length() == 6) {
			nurseLabelRecord[index].setForeground(scheduled);
		}
	}

}
