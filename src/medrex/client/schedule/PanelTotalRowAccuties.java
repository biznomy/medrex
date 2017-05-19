package medrex.client.schedule;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.GuiModes;

public class PanelTotalRowAccuties extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6944734702174334919L;
	private static int tothours = 0;
	public JLabel lbltotal;
	public static JTextField txtTotCount[] = new JTextField[28];
	private Date fromDate;
	public JLabel dateCount[];
	private GregorianCalendar cal;
	private String gettotacciuites = null;
	private JProgressBar jProgBar;

	/*
	 * static JFrame frmMain; static Container pane; static JButton btnDo;
	 * static JProgressBar barDo;
	 */
	PanelTotalRowAccuties(/* int tothours, */Date fromDate) {

		this.cal = new GregorianCalendar();
		this.fromDate = fromDate;
		this.cal.setTime(fromDate);

		// *****************************************************************************************************

		/*
		 * //Set Look and Feel try
		 * {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName
		 * ());} catch (Exception e) {}
		 * 
		 * //Create all components frmMain = new
		 * JFrame("Sample progress bar application"); frmMain.setSize(300, 100);
		 * //Window size 300x100 pixels pane = frmMain.getContentPane();
		 * pane.setLayout(null); //Use the null layout
		 * frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit when X
		 * is clicked btnDo = new JButton("Go!"); barDo = new JProgressBar(0,
		 * 100); //Min value: 0 Max value: 100
		 * 
		 * //Add components to pane pane.add(btnDo); pane.add(barDo);
		 * 
		 * //Position controls (X, Y, width, height) barDo.setBounds(10, 10,
		 * 280, 20); btnDo.setBounds(100, 35, 100, 25);
		 * 
		 * //Make frame visible frmMain.setResizable(false); //No resize
		 * frmMain.setVisible(true); btnDo.addActionListener(new btnDoAction());
		 * //Add the button's action
		 */

		// *****************************************************************************************************
		setSize(PanelScheduleAdd.CELL_WIDTH * 28
				+ PanelScheduleAdd.LEFT_CELL_WIDTH,
				PanelScheduleAdd.CELL_HEIGHT);
		setLayout(null);
		setBorder(new LineBorder(Color.black, 1, false));

		JPanel panelTotal = new JPanel();
		panelTotal.setBackground(Color.WHITE);
		panelTotal.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);
		panelTotal.setLayout(null);
		panelTotal.setBorder(new LineBorder(Color.black, 1));
		add(panelTotal);

		lbltotal = new JLabel();
		lbltotal.setHorizontalAlignment(SwingConstants.CENTER);
		lbltotal.setText("Accuties Total");
		lbltotal.setFont(new Font("Arial", Font.BOLD, 12));
		lbltotal.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		panelTotal.add(lbltotal);
		lbltotal.setBounds(0, 0, PanelScheduleAdd.LEFT_CELL_WIDTH, 25);
		dateCount = new JLabel[28];

		getCode();

		// jProgBar=new JProgressBar();

		// PanelProgress.main(new String[]{});
		// getCode();

		// updateProgressBar();
		// Add action listeners

	}

	/*
	 * //The action public class btnDoAction implements ActionListener{ public
	 * void actionPerformed (ActionEvent e){ new Thread(new thread1()).start();
	 * //Start the thread } }
	 * 
	 * //The thread public class thread1 implements Runnable{ public void run(){
	 * getCode(); //for (int i=0; i<=100; i++){ //Progressively increment
	 * variable i //barDo.setValue(i); //Set value barDo.repaint(); //Refresh
	 * graphics try{Thread.sleep(50);} //Sleep 50 milliseconds catch
	 * (InterruptedException err){} // } } }
	 */

	private void updateProgressBar() {
		try {
			jProgBar.setIndeterminate(true);
			jProgBar.setStringPainted(true);
			jProgBar.setBorderPainted(true);
			new Thread(new Runnable() {
				public void run() {
					getCode();
					jProgBar.setStringPainted(false);
					jProgBar.setBorderPainted(true);
					jProgBar.setIndeterminate(false);
				}
			}).start();
		} catch (IllegalStateException ex) {
			// some code
		}

		/*
		 * Thread t=new Thread(new Runnable(){ public void run(){ int i=1;
		 * jProgBar.setMinimum(0); jProgBar.setMaximum(100); try { while(i<=100
		 * || true){ jProgBar.setValue(i); i++; Thread.sleep(50); } } catch
		 * (InterruptedException ex){ jProgBar.setValue(jProgBar.getMaximum());
		 * } } }); t.start(); getCode(); t.interrupt();
		 */

	}

	private String getAccuitesTotal() {
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String dateString = dateFormat.format(cal.getTime());
			Map<String, Object> parameter1 = MedrexClientManager.getInstance()
					.getAccutiesByDate(dateString);
			String abc = (String) parameter1.get("allTotal");
			gettotacciuites = abc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gettotacciuites;

	}

	public void getCode() {

		/*
		 * DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); String
		 * dateString = dateFormat.format(cal.getTime());
		 */
		gettotacciuites = getAccuitesTotal();
		for (int i = 0, j = 1; i < 28; i++, j++) {
			JPanel panelTotCount = new JPanel();
			txtTotCount[i] = new JTextField();
			dateCount[i] = new JLabel();
			// dateCount[i].setText(dateString);
			panelTotCount.add(dateCount[i]);
			dateCount[i].disable();
			txtTotCount[i].setText(gettotacciuites);
			panelTotCount.add(txtTotCount[i]);
			txtTotCount[i].setBackground(PanelScheduleAdd
					.getBackgroundColor(i));
			txtTotCount[i].setBorder(null);
			txtTotCount[i].setFont(new Font("Arial", Font.PLAIN, 9));
			// labelTotCount.setBorder(new LineBorder(Color.black,1,false));
			txtTotCount[i]
					.setBounds(
							j
									* (PanelScheduleAdd.CELL_WIDTH)
									+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH),
							0, PanelScheduleAdd.CELL_WIDTH,
							PanelScheduleAdd.CELL_HEIGHT);

			// labelTotCount[i].setBounds(j*(PanelMasterScheduleMain.CELL_WIDTH)+(PanelMasterScheduleMain.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH),
			// 0,PanelMasterScheduleMain.CELL_WIDTH ,
			// PanelMasterScheduleMain.CELL_HEIGHT);
			panelTotCount.setBorder(new LineBorder(Color.black, 1, false));
			panelTotCount
					.setBounds(
							PanelScheduleAdd.CELL_WIDTH
									+ (j * (PanelScheduleAdd.CELL_WIDTH))
									+ (PanelScheduleAdd.LEFT_CELL_ToDYNAMIC_PANEL_WIDTH),
							0, PanelScheduleAdd.CELL_WIDTH,
							PanelScheduleAdd.CELL_HEIGHT);
			panelTotCount.setBackground(PanelScheduleAdd
					.getBackgroundColor(i));
			txtTotCount[i].setForeground(GuiModes.DESIGNER_FORMS
					.getControlForegroundColor());
			panelTotCount.setBackground(PanelScheduleAdd
					.getBackgroundColor(i));
			// panelCount.setOpaque(false);
			// panelCount.setBackground(Color.WHITE);

			add(panelTotCount);
			// cal.add(Calendar.DATE, 1);

		}
	}

}
