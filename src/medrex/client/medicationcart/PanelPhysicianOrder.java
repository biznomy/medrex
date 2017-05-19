package medrex.client.medicationcart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import medrex.client.PanelImage;
import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.controls.TouchscreenList;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.medication.NurseMedicationNotesForm;
import medrex.commons.vo.medication.NurseMedicationNotesFormRow;
import medrex.commons.vo.medicationCart.CalculatedMedication;
import medrex.commons.vo.medicationCart.MedicationView;
import medrex.commons.vo.medicationCart.Medications;
import medrex.commons.vo.physicianOrders.PhysicianOrderForm3Row;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.awt.Direction;
import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelPhysicianOrder extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7926920551694909734L;
	private JLabel lblDetails;
	private JTextArea txtNursesNotes;
	private JLabel needsLtcLabel;
	private JLabel specialNotesLabel;
	private JLabel lblRoom;
	private JLabel lblSex;
	private JLabel lblPatientName;
	private static final Color BACKGROUND = new Color(231, 234, 234);
	private static final Color FOREGROUND = new Color(0, 69, 97);
	private static final Border BORDER = new LineBorder(
			new Color(122, 154, 167), 2, false);
	private NurseMedicationNotesFormRow nurseMed;
	private PhysicianOrderForm3Row phyOrder;
	Date currentDate = MedrexClientManager.getServerTime();
	private int firstEmptyRow;
	private int lastNotesForm;
	private ArrayList<Object[]> elementsCurrent;
	private ArrayList<Object[]> elementsHistory;
	private TouchscreenList currentPhyOrders;
	private TouchscreenList historyPhyOrders;
	List phyOrders = new ArrayList();
	List medNotes = new ArrayList();
	private JPanel scrollPanel;
	private JScrollPane scrollPane_1;
	int panelNo = 0;
	List phyRows = new ArrayList();
	// private static int listSize=0;
	private int CurrentFormId = 0;

	public PanelPhysicianOrder() {
		super();
		Global.panelPhysicianOrder = this;
		setLayout(null);
		setSize(961, 708);
		setPreferredSize(getSize());
		this.setLinearGradient(ColorConstants.GradientDark,
				ColorConstants.GradientBright, Direction.LEFT_TO_RIGHT);
		setCurvedView(false);

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 943, 108);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 10, 233, 88);
		panel.add(panel_1);

		final JLabel label_3 = new JLabel(new ImageIcon("img/medrexLogo.png"));
		label_3.setOpaque(false);
		label_3.setText("");
		panel_1.setLayout(new BorderLayout());
		label_3.setBounds(0, 0, 263, 88);
		panel_1.add(label_3, BorderLayout.CENTER);

		final JxButton cancelButton = new JxButton();
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				//				
				phyOrders = null;
				phyRows = null;
				// Global.frameResidentDesktopMedication.openMainOptions();
				Global.frameMedicationForms.dispose();

			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBorderPainted(false);
		cancelButton.setArc(0.6f);
		cancelButton.setVisible(false);
		cancelButton.setBorder(BORDER);
		cancelButton.setBackground(BACKGROUND);
		cancelButton.setForeground(FOREGROUND);
		cancelButton.setRolloverEnabled(true);
		cancelButton.setGlassyPainted(true);
		cancelButton.setBounds(837, 58, 106, 26);
		panel.add(cancelButton);

		final JxButton backButton = new JxButton();
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {

					List listForms = MedrexClientManager.getInstance()
							.getNurseMedicationNotesForms();
					Iterator iForm = listForms.iterator();
					while (iForm.hasNext()) {
						NurseMedicationNotesForm form = (NurseMedicationNotesForm) iForm
								.next();
						form.getSerial();
					}
					List listNotes = MedrexClientManager.getInstance()
							.getNurseMedicationNotesFormRows(CurrentFormId);
					// System.out.println("ListNotesSize is:"+listNotes.size());
					// System.out.println("No Of MedicationPanel"+Global.NoOfMedicationPanel);
					if (listNotes.size() < Global.NoOfMedicationPanel) {
						// MsgBoxTouchScreen.ShowPrompt(
						JOptionPane.showMessageDialog(null,
								"Please go through all medicines First!!!!");
					} else {
						Global.frameMedicationForms.showMedication();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		backButton.setText("Back");
		backButton.setBorderPainted(false);
		backButton.setArc(0.6f);
		backButton.setBorder(BORDER);
		backButton.setBackground(BACKGROUND);
		backButton.setForeground(FOREGROUND);
		backButton.setRolloverEnabled(true);
		backButton.setGlassyPainted(true);
		backButton.setBounds(697, 58, 106, 26);
		panel.add(backButton);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setLayout(null);
		panel_4.setCurvedView(false);
		panel_4.setBounds(0, 108, 961, 30);
		panel_4.setLinearGradient(ColorConstants.GradientBright,
				ColorConstants.GradientDark, Direction.LEFT_TO_RIGHT);
		add(panel_4);

		final JLabel addNewPhysicianLabel = new JLabel();
		addNewPhysicianLabel.setText("Physician's Orders");
		addNewPhysicianLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		addNewPhysicianLabel.setForeground(ColorConstants.DEF_COLOR);
		addNewPhysicianLabel.setBounds(50, 5, 312, 20);
		panel_4.add(addNewPhysicianLabel);

		lblPatientName = new JLabel();
		lblPatientName.setText("JOHN GRATES");
		lblPatientName.setForeground(Color.WHITE);
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientName.setBounds(31, 151, 149, 14);
		add(lblPatientName);

		lblSex = new JLabel();
		lblSex.setText("MALE");
		lblSex.setForeground(Color.WHITE);
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSex.setBounds(186, 152, 88, 14);
		add(lblSex);

		lblRoom = new JLabel();
		lblRoom.setText("Room # 102");
		lblRoom.setForeground(Color.WHITE);
		lblRoom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoom.setBounds(31, 178, 149, 14);
		add(lblRoom);

		specialNotesLabel = new JLabel();
		specialNotesLabel.setText("** Special Notes");
		specialNotesLabel.setForeground(Color.WHITE);
		specialNotesLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		specialNotesLabel.setBounds(31, 203, 133, 14);
		add(specialNotesLabel);

		needsLtcLabel = new JLabel();
		needsLtcLabel.setText("Needs TLC");
		needsLtcLabel.setForeground(Color.WHITE);
		needsLtcLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		needsLtcLabel.setBounds(31, 223, 75, 14);
		add(needsLtcLabel);

		final PanelImage panel_6 = new PanelImage();
		panel_6.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		panel_6.setCurvedView(true);
		panel_6.setArc(1f);
		panel_6.setBounds(31, 254, 107, 108);
		add(panel_6);

		final JLabel nursesNotesLabel = new JLabel();
		nursesNotesLabel.setForeground(Color.WHITE);
		nursesNotesLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		nursesNotesLabel.setText("Nurses Notes:");
		nursesNotesLabel.setBounds(31, 379, 107, 23);
		add(nursesNotesLabel);

		final JxPanel panel_8 = new JxPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setLayout(null);
		panel_8.setBounds(31, 408, 243, 279);
		add(panel_8);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(10, 10, 223, 259);
		panel_8.add(scrollPane);

		txtNursesNotes = new JTextArea();
		scrollPane.setViewportView(txtNursesNotes);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		panel_2.setBounds(298, 178, 653, 509);
		add(panel_2);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_1.setBackground(Color.WHITE);
		scrollPane_1.setBounds(7, 7, 640, 495);
		panel_2.add(scrollPane_1);

		scrollPanel = new JPanel();
		scrollPanel.setBackground(Color.WHITE);
		scrollPanel.setLayout(null);

		lblDetails = new JLabel();
		lblDetails.setForeground(Color.WHITE);
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDetails.setText("Details");
		lblDetails.setBounds(856, 150, 66, 16);
		add(lblDetails);

		final JLabel pleaseAcceptOrLabel = new JLabel();
		pleaseAcceptOrLabel.setForeground(Color.WHITE);
		pleaseAcceptOrLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		pleaseAcceptOrLabel
				.setText("Please accept Or Decline All The Medications At One Go");
		pleaseAcceptOrLabel.setBounds(300, 151, 445, 16);
		add(pleaseAcceptOrLabel);
	}

	public void updateData() {
		ResidentMain rm = new ResidentMain();
		try {
			rm = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblPatientName.setText(rm.getUserPass() + ", " + rm.getUserName());
		lblSex.setText("" + rm.getSex());
		/* TODO: Migrating to room history */
		// lblRoom.setText(rm.getRoom() + "");
		showMedicationPanel();

	}

	public void showMedicationPanel() {
		List<MedicationView> list = new ArrayList<MedicationView>();
		try {
			list = MedrexClientManager.getInstance().getMedicationsList(
					Global.currentResidenceKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int size = list.size();
		PanelMedication RunTimepanel[] = new PanelMedication[size];
		Iterator<MedicationView> it = list.iterator();
		while (it.hasNext()) {
			MedicationView phy = new MedicationView();
			phy = it.next();
			RunTimepanel[panelNo] = new PanelMedication();
			RunTimepanel[panelNo].setBounds(0, panelNo * 99, 640, 99);
			RunTimepanel[panelNo].updateLabels(phy);
			scrollPanel.add(RunTimepanel[panelNo]);
			scrollPanel.setPreferredSize(new Dimension(623, 109));
			scrollPane_1.setViewportView(scrollPanel);
			panelNo++;
		}
	}

	public void doSave(boolean acceptDecline, MedicationView row) {
		CalculatedMedication cm = new CalculatedMedication();
		Medications m = new Medications();
		try {
			m = MedrexClientManager.getInstance().getMedications(
					row.getCalcSerial());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MedrexException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cm.setSerial(row.getFormId());
		cm.setMedSerial(m);
		cm.setTimeRecord(new Date());
		if (acceptDecline) {
			cm.setStatus(1);
		} else {
			cm.setStatus(2);
		}
		cm.setNotes(txtNursesNotes.getText());
		cm.setCalculatedStartTime(row.getCalculatedStartTime());
		cm.setCalculatedEndTime(row.getCalculatedEndTime());
		try {
			MedrexClientManager.getInstance()
					.insertOrUpdateCalculatedMedication(cm);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public void doUpdate(PhysicianOrderForm3Row value1,
	// NurseMedicationNotesFormRow value2) {
	// if (value1 != null) {
	// phyOrder = (PhysicianOrderForm3Row) value1;
	// Global.panelMedication.updateLabels(value1);
	//
	// } else {
	// Global.panelMedication.updateLabels(null);
	// }
	//
	// if (value2 != null) {
	// nurseMed = (NurseMedicationNotesFormRow) value2;
	// txtNursesNotes.setText(nurseMed.getReason());
	// if (("").equalsIgnoreCase(nurseMed.getResult())
	// || (nurseMed.getResult() == null)) {
	// } else {
	// }
	// } else {
	// nurseMed = new NurseMedicationNotesFormRow();
	// }
	// }

	// -------------------------copied from Medication
	// cart------------------------------------

	public void fillCombos() {
		List<MedicationView> list = new ArrayList<MedicationView>();
		try {
			list = MedrexClientManager.getInstance().getMedicationsList(
					Global.currentResidenceKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int size = list.size();
		PanelMedication RunTimepanel[] = new PanelMedication[size];
		Iterator<MedicationView> it = list.iterator();
		int i = 0;
		while (it.hasNext()) {
			MedicationView phy = new MedicationView();
			phy = it.next();
			System.out.println("page num is :" + panelNo + size + i);
			RunTimepanel[panelNo] = new PanelMedication();
			RunTimepanel[panelNo].setBounds(0, panelNo * 99, 640, 99);
			RunTimepanel[panelNo].updateLabels(phy);
			scrollPanel.add(RunTimepanel[panelNo]);
			panelNo++;
			i++;
		}
	}

	private boolean isCorrectMedicine(int freq, String timeSlot) {
		boolean res = false;
		String[] strArr = PanelMedicationDesktop.getTimeList(freq);
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equalsIgnoreCase(timeSlot)) {
				res = true;
				break;
			}
		}
		return res;
	}

	private boolean isCorrectNotes(Date nurDate, Date nurTime, Date cTime,
			Date nTime) {
		if (nurDate != null && nurTime != null) {
			if (nurDate.getDate() == cTime.getDate()) {

				if (cTime.getTime() <= nurTime.getTime() /*
														 * && nTime.getTime() >
														 * nurTime.getTime()
														 */) {
					// if(cTime.getTime() <= nurTime.getTime()) {
					return true;
				}
			}
		}
		return false;
	}

	public String getFormattedText(NurseMedicationNotesFormRow refNurse) {
		SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy");
		String retStr = "<html><body>";
		if (refNurse.getDateRecord() != null) {
			retStr += "<font color=";
			retStr += refNurse.getResult().equalsIgnoreCase("Accepted") ? "#228b22"
					: "#ff0000";
			retStr += "/>";
			retStr += refNurse.getResult() + " on "
					+ df.format(refNurse.getDateRecord()) + " at "
					+ refNurse.getTimeRecord();
			retStr += "</font>";
		}
		retStr += "</body></html>";
		return retStr;
	}

	// public static void main(String args[]) {
	// SwingUtils.wrapInFrame(new PanelPhysicianOrder()).setVisible(true);
	// }
}
