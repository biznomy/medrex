package medrex.client.MedicationAndTreatment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.medicationcart.PanelMedication;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.server.dao.medicationCart.MedicationsDAO;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMedicationDao;

import com.sX.swing.calender.JCalendar;

public class PanelMedicationScheduler extends JPanel {

	/**@author Mayank Chandela
	 * @param args
	 */
	
	private JButton[] btnDate;
	private GregorianCalendar cal;
	private GregorianCalendar maxDateOfMonth;
	private GregorianCalendar minDateOfMonth;
	private JLabel yearLabel;
	private JPanel scrollPanel;
	private int panelNo =0 ;
	private JScrollPane scrollPane_1;
	private int temp;
	private int click = 0;
	public PanelMedicationScheduler() {
		super();
		setOpaque(true);
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());

		final JPanel panelDays = new JPanel();
		panelDays.setBackground(Color.WHITE);
		panelDays.setOpaque(false);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelDays.setLayout(flowLayout);
		panelDays.setPreferredSize(new Dimension(0, 30));
		add(panelDays, BorderLayout.NORTH);

		final JButton medicationButton = new JButton();
		medicationButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		medicationButton.setBackground(Color.WHITE);
		medicationButton.setPreferredSize(new Dimension(155, 28));
		medicationButton.setHorizontalAlignment(SwingConstants.CENTER);
		medicationButton.setText("Medication");
		panelDays.add(medicationButton);

		final JButton hourButton = new JButton();
		hourButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		hourButton.setPreferredSize(new Dimension(50, 28));
		hourButton.setBackground(Color.WHITE);
		hourButton.setText("Hour");
		panelDays.add(hourButton);

		final JButton mButton = new JButton();
		mButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		mButton.setPreferredSize(new Dimension(50, 28));
		mButton.setBackground(Color.WHITE);
		mButton.setText("Mon");
		panelDays.add(mButton);

		final JButton tueButton = new JButton();
		tueButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		tueButton.setBackground(Color.WHITE);
		tueButton.setPreferredSize(mButton.getPreferredSize());
		tueButton.setText("Tue");
		panelDays.add(tueButton);

		final JButton wButton = new JButton();
		wButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		wButton.setBackground(Color.WHITE);
		wButton.setPreferredSize(mButton.getPreferredSize());
		wButton.setText("Wed");
		panelDays.add(wButton);

		final JButton thButton = new JButton();
		thButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		thButton.setBackground(Color.WHITE);
		thButton.setPreferredSize(mButton.getPreferredSize());
		thButton.setText("Thu");
		panelDays.add(thButton);

		final JButton fButton = new JButton();
		fButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		fButton.setBackground(Color.WHITE);
		fButton.setPreferredSize(mButton.getPreferredSize());
		fButton.setText("Fri");
		panelDays.add(fButton);

		final JButton sButton = new JButton();
		sButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		sButton.setBackground(Color.WHITE);
		sButton.setPreferredSize(mButton.getPreferredSize());
		sButton.setText("Sat");
		panelDays.add(sButton);

		final JButton sButton_1 = new JButton();
		sButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		sButton_1.setBackground(Color.WHITE);
		sButton_1.setPreferredSize(mButton.getPreferredSize());
		sButton_1.setText("Sun");
		panelDays.add(sButton_1);

		final JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setOpaque(false);
		centerPanel.setLayout(new BorderLayout());
		add(centerPanel, BorderLayout.CENTER);

		final JPanel panelDate = new JPanel();
		panelDate.setBackground(Color.WHITE);
		panelDate.setOpaque(true);
		panelDate.setLayout(new BorderLayout());
		panelDate.setPreferredSize(new Dimension(0, 30));
		centerPanel.add(panelDate,BorderLayout.NORTH);

		final JPanel panelDates = new JPanel();
		panelDates.setOpaque(false);
		panelDates.setPreferredSize(new Dimension(0, 30));
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		panelDates.setLayout(flowLayout_2);
		panelDate.add(panelDates);

		final JLabel label = new JLabel();
		label.setPreferredSize(new Dimension(medicationButton.getPreferredSize().width+hourButton.getPreferredSize().width,30));

		final JLabel label_1 = new JLabel();
		label_1.setPreferredSize(new Dimension(10, 0));
		label_1.setText("");
		panelDays.add(label_1);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension(200, 30));
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(10);
		panel_1.setLayout(flowLayout_1);
		panelDays.add(panel_1);

		final JButton btnPrev = new JButton();
		btnPrev.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPrev.setBackground(Color.WHITE);
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				
				cal.set(Calendar.DATE,cal.get(Calendar.DATE)-7);
				
				updateDate();
			}
		});
		btnPrev.setText("<<");
		panel_1.add(btnPrev);

		final JButton btnNext = new JButton();
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNext.setBackground(Color.WHITE);
		btnNext.addActionListener(new ActionListener() {

			public void actionPerformed(final ActionEvent e) {
				click ++;
				if(click > 1){
					cal.set(Calendar.DATE,cal.get(Calendar.DATE)+7);
					updateDate();
				}
				else{
					updateDate();
				}
			}
		});
		btnNext.setText(">>");
		panel_1.add(btnNext);
		panelDates.add(label);

		

		final JPanel panelMedications = new JPanel();
		panelMedications.setOpaque(true);
		panelMedications.setBackground(Color.WHITE);
		panelMedications.setLayout(new BorderLayout());
		centerPanel.add(panelMedications, BorderLayout.CENTER);

		btnDate = new JButton[7];
		
		for(int i=0; i<7 ;i++){
			btnDate[i] = new JButton();
			btnDate[i].setText("1");
			btnDate[i].setFont(new Font("Tahoma",Font.BOLD,12));
			btnDate[i].setBackground(Color.WHITE);
			btnDate[i].setPreferredSize(mButton.getPreferredSize());
			panelDates.add(btnDate[i]);
		}
		
		GregorianCalendar calendar = new GregorianCalendar();
		cal = calendar;

		final JLabel label_2 = new JLabel();
		label_2.setPreferredSize(new Dimension(10, 0));
		label_2.setText("");
		panelDates.add(label_2);
		
		yearLabel = new JLabel();
		yearLabel.setFont(new Font("Tahoma",Font.BOLD,12));
		yearLabel.setText(cal.get(Calendar.YEAR)+" - "+getMonthInString(cal.get(Calendar.MONTH)));
		panelDates.add(yearLabel);
		
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setOpaque(false);
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setBackground(Color.WHITE);
		
		panelMedications.add(scrollPane_1);

		scrollPanel = new JPanel();
		scrollPanel.setOpaque(true);
		scrollPanel.setBackground(Color.WHITE);
		scrollPanel.setLayout(null);
		
		
		doSetCurrentDates();
		showMedicationPanel();
		
	}
	
	public void showMedicationPanel() {
		List<PhysicianOrderMedication> list = new ArrayList<PhysicianOrderMedication>();
//		int currentResidentId = 213;
//		int totalRecord=0;
		try {
//			totalRecord = PhysicianOrderMedicationDao.getInstance().getTotalPhysicianOrderMedication(currentResidentId);
			list = PhysicianOrderMedicationDao.getInstance().getPhysicianOrderMedicationList();
		} catch (Exception e) {
		e.printStackTrace();
	}
		int size = list.size();

		PanelMedicationHistory RunTimepanel[] = new PanelMedicationHistory[size];
    	Iterator<PhysicianOrderMedication> it = list.iterator();
		int prevFrequency = 0;
		while(it.hasNext()){
			PhysicianOrderMedication medView = new PhysicianOrderMedication(); 
			medView = it.next();
			System.out.println("frequency"+medView.getFrequency1());
			int frequency = medView.getFrequency1();
			//int frequency = 5;
			
			RunTimepanel[panelNo] = new PanelMedicationHistory(medView);
			
			RunTimepanel[panelNo].setBounds(0, panelNo * (30 * prevFrequency), 1400,(30*frequency));
			//System.out.println("Bounds:"+0+","+panelNo * (30 * prevFrequency)+","+1400+","+(30*frequency));
			scrollPanel.add(RunTimepanel[panelNo]);
			scrollPanel.setPreferredSize(new Dimension(100,100));
			scrollPane_1.setViewportView(scrollPanel);
			panelNo ++;
			prevFrequency = frequency;
		}
	}
	
	
	
	/*public void showMedicationPanel() {
//		List<MedicationView> list = new ArrayList<MedicationView>();
//		try {
//			list = MedrexClientManager.getInstance().getMedicationsList(213);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		int size = list.size();

		PanelMedicationHistory RunTimepanel[] = new PanelMedicationHistory[2];
//		Iterator<MedicationView> it = list.iterator();
		int prevFrequency = 0;
		for(int i= 0 ;i<1 ;i++){
			MedicationView medView = new MedicationView(); 
//			medView = it.next();
//			System.out.println("frequency"+medView.getFrequency());

			int frequency = 5;
			
			RunTimepanel[panelNo] = new PanelMedicationHistory(null);
			
			RunTimepanel[panelNo].setBounds(0, panelNo * (30 * prevFrequency), 1400,(30*frequency));
//			System.out.println("Bounds:"+0+","+panelNo * (30 * prevFrequency)+","+1400+","+(30*frequency));
			scrollPanel.add(RunTimepanel[panelNo]);
			scrollPanel.setPreferredSize(new Dimension(100,100));
			scrollPane_1.setViewportView(scrollPanel);
			panelNo ++;
			prevFrequency = frequency;
		}
	}*/
	
	
	
	private void updateDate(){

		int maxDate = cal.getActualMaximum(Calendar.DATE);

		for(int j = 0; j < 7 ; j++){
			btnDate[j].setText("");
		}
		int date  = cal.get(Calendar.DATE);
		for(int i=0; i<7 ;i++){
			if(date <= maxDate){
				btnDate[i].setText(date+"");
				date++;
			}
			else{
				date = 1;
				btnDate[i].setText(date+"");
				date++;
			}
		}
		yearLabel.setText(cal.get(Calendar.YEAR)+" - "+getMonthInString(cal.get(Calendar.MONTH)));
	}
	private void doSetCurrentDates() {
		
		cal = (GregorianCalendar) GregorianCalendar.getInstance();
//		System.out.println("date:"+calendar.get(Calendar.MONDAY));
		System.out.println("day of week"+cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("first day of week"+cal.get(Calendar.MONDAY));
		temp = cal.get(Calendar.DAY_OF_WEEK)-2;
		cal.set(Calendar.DATE,cal.get(Calendar.DATE)-temp);
//		System.out.println("calendar date"+cal.get(Calendar.DATE));
		for(int j=0; j<7; j++){
			btnDate[j].setText("");
		}
		for(int i = 0 ; i<7 ;i++){
			
			btnDate[i].setText(""+cal.get(Calendar.DATE));
			cal.set(Calendar.DATE, cal.get(Calendar.DATE)+1);
		}
		System.out.println("calendar date"+cal.get(Calendar.DATE));
	}
	private String getMonthInString(int month) {
		switch(month+1){
			case 1 : return "JANUARY";
			case 2 : return "FEBRUARY";
			case 3 : return "MARCH";
			case 4 : return "APRIL";
			case 5 : return "MAY";
			case 6 : return "JUNE";
			case 7 : return "JULY";
			case 8 : return "AUGUST";
			case 9 : return "SEPTEMBER";
			case 10 : return "OCTOBER";
			case 11 : return "NOVEMBER";
			case 12 : return "DECEMBER";
		}
		return null;
	}
	public static void main(String[] args) {
		JFrame frm =new JFrame("Medication");
		
		frm.getContentPane().add(new PanelMedicationScheduler());
		frm.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
