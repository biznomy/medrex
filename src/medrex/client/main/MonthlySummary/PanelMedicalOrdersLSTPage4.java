package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.intf.Form;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelMedicalOrdersLSTPage4 extends JxPanel implements Form {

	/**
	 * 
	 */
	private static final long serialVersionUID = 239196962994883164L;
	private JxLabel lblDOB;
	private JxLabel cxczxJxLabel_2;
	private JxLabel lblFirstName;
	private JxLabel lblLastName;
	Theme theme = new BlackOverWhiteTheme();

	private PanelToBeAddedDynamically[] rows;

	public PanelMedicalOrdersLSTPage4() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 1200));
		setLayout(null);

		final JxPanel jxPanel = new JxPanel();
		jxPanel.setTheme(theme);
		jxPanel.setBackground(Color.WHITE);
		jxPanel.setLayout(null);
		jxPanel.setBounds(0, 0, 930, 1200);
		add(jxPanel);

		final JxPanel jxPanel_1 = new JxPanel();
		jxPanel_1.setTheme(theme);
		jxPanel_1.setBackground(Color.WHITE);
		jxPanel_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_1.setLayout(null);
		jxPanel_1.setBounds(0, 0, 926, 106);
		jxPanel.add(jxPanel_1);

		final JxLabel lastNameJxLabel = new JxLabel();
		lastNameJxLabel.setTheme(theme);
		lastNameJxLabel.setText("LAST NAME");
		lastNameJxLabel.setBounds(10, 76, 73, 14);
		jxPanel_1.add(lastNameJxLabel);

		final JxLabel lastNameJxLabel_1 = new JxLabel();
		lastNameJxLabel_1.setTheme(theme);
		lastNameJxLabel_1.setText("FIRST NAME");
		lastNameJxLabel_1.setBounds(166, 76, 73, 14);
		jxPanel_1.add(lastNameJxLabel_1);

		final JxLabel lastNameJxLabel_2 = new JxLabel();
		lastNameJxLabel_2.setTheme(theme);
		lastNameJxLabel_2.setText("MIDDLE INITIAL OF PATIENT");
		lastNameJxLabel_2.setBounds(322, 77, 150, 14);
		jxPanel_1.add(lastNameJxLabel_2);

		final JxLabel jxLabel_1 = new JxLabel();
		jxLabel_1.setTheme(theme);
		jxLabel_1.setText("DATE OF BIRTH(MM/DD/YYYY)");
		jxLabel_1.setBounds(702, 76, 171, 20);
		jxPanel_1.add(jxLabel_1);

		final JxPanel jxPanel_2 = new JxPanel();
		jxPanel_2.setTheme(theme);
		jxPanel_2.setLayout(null);
		jxPanel_2.setBackground(Color.BLACK);
		jxPanel_2.setBounds(0, 0, 930, 31);
		jxPanel_1.add(jxPanel_2);

		final JxLabel jxLabel = new JxLabel();
		jxLabel.setTheme(theme);
		jxLabel.setForeground(new Color(255, 255, 255));
		jxLabel.setBackground(Color.BLACK);
		jxLabel
				.setText("THE PATIENT KEEPS THE ORIGINAL MOLST FROM DURING TRAVEL TO DIFFERENT CARE SETTINGS.THE PHYSICIAN KEEPS A COPY.");
		jxLabel.setBounds(0, 0, 930, 31);
		jxPanel_2.add(jxLabel);

		lblLastName = new JxLabel();
		lblLastName.setTheme(theme);
		lblLastName.setFontStyle(Font.BOLD);
		lblLastName.setText("");
		lblLastName.setBounds(10, 53, 100, 20);
		jxPanel_1.add(lblLastName);

		lblFirstName = new JxLabel();
		lblFirstName.setTheme(theme);
		lblFirstName.setFontStyle(Font.BOLD);
		lblFirstName.setText("");
		lblFirstName.setBounds(166, 54, 100, 20);
		jxPanel_1.add(lblFirstName);

		cxczxJxLabel_2 = new JxLabel();
		cxczxJxLabel_2.setTheme(theme);
		cxczxJxLabel_2.setText("");
		cxczxJxLabel_2.setBounds(322, 54, 100, 20);
		jxPanel_1.add(cxczxJxLabel_2);

		lblDOB = new JxLabel();
		lblDOB.setTheme(theme);
		lblDOB.setFontStyle(Font.BOLD);
		lblDOB.setText("");
		lblDOB.setBounds(702, 50, 100, 20);
		jxPanel_1.add(lblDOB);

		final JxPanel jxPanel_3 = new JxPanel();
		jxPanel_3.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_3.setLayout(null);
		jxPanel_3.setBounds(0, 121, 926, 33);
		jxPanel.add(jxPanel_3);

		final JxPanel jxPanel_4 = new JxPanel();
		jxPanel_4.setOpaque(true);
		jxPanel_4.setBackground(Color.WHITE);
		jxPanel_4.setLayout(null);
		jxPanel_4.setBounds(0, 0, 174, 33);
		jxPanel_3.add(jxPanel_4);

		final JxLabel jxLabel_2 = new JxLabel();
		jxLabel_2.setTheme(theme);
		jxLabel_2.setOpaque(true);
		jxLabel_2.setBackground(Color.BLACK);
		jxLabel_2.setForeground(Color.WHITE);
		jxLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		jxLabel_2.setFontSize(12);
		jxLabel_2.setText("SECTION F");
		jxLabel_2.setBounds(0, 0, 174, 33);
		jxPanel_4.add(jxLabel_2);

		final JxPanel jxPanel_5 = new JxPanel();
		jxPanel_5.setTheme(theme);
		jxPanel_5.setBackground(Color.WHITE);
		jxPanel_5.setLayout(null);
		jxPanel_5.setBounds(174, 1, 756, 31);
		jxPanel_3.add(jxPanel_5);

		final JxLabel jxLabel_3 = new JxLabel();
		jxLabel_3.setTheme(theme);
		jxLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		jxLabel_3
				.setText("<html><body><b>     Review and Renewal of MOLST Orders on This MOLST Form </b> <i>Continued from page3 </i> </body></html>");
		jxLabel_3.setBounds(10, 0, 746, 33);
		jxPanel_5.add(jxLabel_3);

		final JxPanel jxPanel_7 = new JxPanel();
		jxPanel_7.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_7.setBackground(Color.WHITE);
		jxPanel_7.setLayout(null);
		jxPanel_7.setBounds(0, 175, 926, 1015);
		jxPanel.add(jxPanel_7);

		final JxPanel jxPanel_8 = new JxPanel();
		jxPanel_8.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_8.setBackground(Color.WHITE);
		jxPanel_8.setLayout(null);
		jxPanel_8.setBounds(1, 0, 930, 48);
		jxPanel_7.add(jxPanel_8);

		final JxPanel jxPanel_9 = new JxPanel();
		jxPanel_9.setTheme(theme);
		jxPanel_9.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_9.setBackground(Color.WHITE);
		jxPanel_9.setLayout(null);
		jxPanel_9.setBounds(0, 1, 110, 47);
		jxPanel_8.add(jxPanel_9);

		final JxLabel jxLabel_5 = new JxLabel();
		jxLabel_5.setTheme(theme);
		jxLabel_5.setText("<html><body><b>        Date/Time</b>");

		jxLabel_5.setBounds(26, 10, 84, 30);
		jxPanel_9.add(jxLabel_5);

		final JxPanel jxPanel_10 = new JxPanel();
		jxPanel_10.setTheme(theme);
		jxPanel_10.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_10.setLayout(null);
		jxPanel_10.setBackground(Color.WHITE);
		jxPanel_10.setBounds(110, 0, 282, 50);
		jxPanel_8.add(jxPanel_10);

		final JxLabel jxLabel_6 = new JxLabel();
		jxLabel_6.setTheme(theme);
		jxLabel_6.setBounds(78, 0, 144, 50);
		jxLabel_6.setText("<html><body><b>Reviewer's Name <br>and Signature");
		jxPanel_10.add(jxLabel_6);

		final JxPanel jxPanel_10_1 = new JxPanel();
		jxPanel_10_1.setTheme(theme);
		jxPanel_10_1.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_10_1.setBackground(Color.WHITE);
		jxPanel_10_1.setLayout(null);
		jxPanel_10_1.setBounds(391, 0, 282, 50);
		jxPanel_8.add(jxPanel_10_1);

		final JxLabel jxLabel_6_1 = new JxLabel();
		jxLabel_6_1.setVerticalAlignment(SwingConstants.TOP);
		jxLabel_6_1.setTheme(theme);
		jxLabel_6_1
				.setText("<html><body><b>Location of Review<br>(e.g. Hospital, NH, Physician's Office)");
		jxLabel_6_1.setBounds(52, 0, 197, 50);
		jxPanel_10_1.add(jxLabel_6_1);

		final JxPanel jxPanel_10_2 = new JxPanel();
		jxPanel_10_2.setTheme(theme);

		jxPanel_10_2.setBorder(new LineBorder(Color.black, 1, false));
		jxPanel_10_2.setBackground(Color.WHITE);
		jxPanel_10_2.setLayout(null);
		jxPanel_10_2.setBounds(672, 0, 258, 50);
		jxPanel_8.add(jxPanel_10_2);

		final JxLabel jxLabel_6_2 = new JxLabel();
		jxLabel_6_2.setTheme(theme);
		jxLabel_6_2.setText("<html><body><b>Outcome Of Review");
		jxLabel_6_2.setBounds(78, 0, 144, 50);
		jxPanel_10_2.add(jxLabel_6_2);

		final JxPanel dynamicpanel = new JxPanel();
		dynamicpanel.setTheme(theme);
		dynamicpanel.setLayout(null);
		dynamicpanel.setOpaque(true);
		dynamicpanel.setBackground(Color.WHITE);
		dynamicpanel.setBounds(0, 47, 930, 945);
		jxPanel_7.add(dynamicpanel);

		rows = new PanelToBeAddedDynamically[11];
		for (int i = 0; i < 11; i++) {
			rows[i] = new PanelToBeAddedDynamically();
			rows[i].setBounds(0, i * 78, 930, 78);
			dynamicpanel.add(rows[i]);

		}

	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelMedicalOrdersLSTPage4 panel = new PanelMedicalOrdersLSTPage4();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);

	}

	@Override
	public void doLoad() {

	}

	@Override
	public int doSave() {

		return 0;
	}

	@Override
	public void doUpdate() {
		int resID = Global.currentResidenceKey;
		ResidentMain rm = null;

		try {
			rm = MedrexClientManager.getInstance().getResident(resID);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		lblLastName.setText(rm.getUserPass());
		lblFirstName.setText(rm.getUserName());

		SimpleDateFormat sdf = new SimpleDateFormat();
		lblDOB.setText(sdf.format(rm.getDob()));

	}

	@Override
	public boolean doValidate() {

		return false;
	}

}
