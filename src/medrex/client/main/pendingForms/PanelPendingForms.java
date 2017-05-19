package medrex.client.main.pendingForms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.FormSchedulerConstants;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.MedrexMain;
import medrex.commons.enums.ResidentTabs;
import medrex.commons.vo.admin.PendingForm;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelPendingForms extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7357962005516104142L;

	private JxTable table;

	private AdmissionsRecordsJTableNew admissionTable;

	// public FrameAdmissionRecordAdd frameAdmissionRecordAdd;
	// private ImageSlider imgSlider;
	private String[] formName = new String[] { "Resident Assessment Form" };
	// private ImageIcon[] formIcon;

	// public FrameScanPageAdd frameScanPageAdd;
	// public FrameScanFormAdd frameScanFormAdd;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	/**
	 * Create the panel
	 */
	public PanelPendingForms() {
		super();
		// Global.panelAdmissionsRecord = this;
		setLayout(null);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(720, 496));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 20, 720, 466);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 52, 680, 186);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					String formType = (String) admissionTable.getValueAt(table
							.getSelectedRow(), 1)
							+ "";
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.SOCIAL_SERVICE_INITIAL_ASSESSMENT)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.ASSESSMENTS,
										FormSchedulerConstants.SOCIAL_SERVICE_INITIAL_ASSESSMENT);
					}
					// Activities
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.ACTIVITY_INITIAL_ASSESSMENT)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.ACTIVITIES,
										FormSchedulerConstants.ACTIVITY_INITIAL_ASSESSMENT);
					}
					// Medication & Treatment
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES)) {
						System.out
								.println("FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES: "
										+ FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES);
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.MEDICATION_AND_TREATMENT,
										FormSchedulerConstants.MEDICATION_ADMINISTRATION_NOTES);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.MEDICATION_PRN_RECORD)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MEDICATION_AND_TREATMENT,
								FormSchedulerConstants.MEDICATION_PRN_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.MEDICATION_ROUTINE_RECORD)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.MEDICATION_AND_TREATMENT,
										FormSchedulerConstants.MEDICATION_ROUTINE_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.NURSE_MEDICATION_NOTES)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MEDICATION_AND_TREATMENT,
								FormSchedulerConstants.NURSE_MEDICATION_NOTES);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.NURSE_TREATMENT_NOTES)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MEDICATION_AND_TREATMENT,
								FormSchedulerConstants.NURSE_TREATMENT_NOTES);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PAIN_MANAGEMENT_RECORD)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MEDICATION_AND_TREATMENT,
								FormSchedulerConstants.PAIN_MANAGEMENT_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PRESSURE_SORE_RECORD)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MEDICATION_AND_TREATMENT,
								FormSchedulerConstants.PRESSURE_SORE_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.TREATMENT_PRN_RECORD)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.MEDICATION_AND_TREATMENT,
								FormSchedulerConstants.TREATMENT_PRN_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.TREATMENT_ROUTINE_RECORD)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.MEDICATION_AND_TREATMENT,
										FormSchedulerConstants.TREATMENT_ROUTINE_RECORD);
					}
					// Dietary
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.CONSULTANT_DIETICIAN_NURITIONAL_RECOMMEDATIONS)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.DIETARY,
										FormSchedulerConstants.CONSULTANT_DIETICIAN_NURITIONAL_RECOMMEDATIONS);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.DIETARY_COMMUNICATION_FORM)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.DIETARY,
										FormSchedulerConstants.DIETARY_COMMUNICATION_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.DIETARY,
										FormSchedulerConstants.DIETARY_RESIDENT_DIAGNOSIS_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.ENTERAL_FEEDING_PROGRESS_NOTES)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.DIETARY,
										FormSchedulerConstants.ENTERAL_FEEDING_PROGRESS_NOTES);
					}
					// Consultant
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHARMACIST_RESIDENT_EVALUATION)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.CONSULTANT,
										FormSchedulerConstants.PHARMACIST_RESIDENT_EVALUATION);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.REFFERAL_FORM)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.CONSULTANT,
								FormSchedulerConstants.REFFERAL_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.RENAL_DIALYSIS_COMMUNICATION_FORM)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.CONSULTANT,
										FormSchedulerConstants.RENAL_DIALYSIS_COMMUNICATION_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.REPORT_OF_CONSULTATION)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.CONSULTANT,
								FormSchedulerConstants.REPORT_OF_CONSULTATION);
					}
					// progress notes
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.DOCTORS_PROGRESS_NOTES)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PROGRESS_NOTES,
								FormSchedulerConstants.DOCTORS_PROGRESS_NOTES);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.INTERDISPLINARY_PROGRESS_NOTES)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.PROGRESS_NOTES,
										FormSchedulerConstants.INTERDISPLINARY_PROGRESS_NOTES);
					}
					// Lab & special reports
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.MEDFAX_FORM_1)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.LAB_AND_SPECIAL_REPORTS,
								FormSchedulerConstants.MEDFAX_FORM_1);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.MEDFAX_FORM_2)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.LAB_AND_SPECIAL_REPORTS,
								FormSchedulerConstants.MEDFAX_FORM_2);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.REASON_FOR_STUDY_FORM)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.LAB_AND_SPECIAL_REPORTS,
								FormSchedulerConstants.REASON_FOR_STUDY_FORM);
					}
					// History & physical
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.CUMULATIVE_DIAGNOSIS)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.HISTORY_AND_PHYSICAL,
								FormSchedulerConstants.CUMULATIVE_DIAGNOSIS);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.HISTORY_AND_PHYSICIAL_GENERAL)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.HISTORY_AND_PHYSICAL,
										FormSchedulerConstants.HISTORY_AND_PHYSICIAL_GENERAL);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.MONTHLY_VITAL_SIGNS_AND_WEIGHTS_SHEET)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.HISTORY_AND_PHYSICAL,
										FormSchedulerConstants.MONTHLY_VITAL_SIGNS_AND_WEIGHTS_SHEET);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.RESIDENT_IMMUNIZATION_FORM)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.HISTORY_AND_PHYSICAL,
										FormSchedulerConstants.RESIDENT_IMMUNIZATION_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.WEEKLY_WEIGHTS)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.HISTORY_AND_PHYSICAL,
								FormSchedulerConstants.WEEKLY_WEIGHTS);
					}
					// Physican orders
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICIAN_INFUSION_FORM)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PHYSICIAN_ORDERS,
								FormSchedulerConstants.PHYSICIAN_INFUSION_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICIAN_ORDER_FORM_1)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PHYSICIAN_ORDERS,
								FormSchedulerConstants.PHYSICIAN_ORDER_FORM_1);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICIAN_ORDER_FORM_2)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PHYSICIAN_ORDERS,
								FormSchedulerConstants.PHYSICIAN_ORDER_FORM_2);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICIAN_ORDER_FORM_3)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PHYSICIAN_ORDERS,
								FormSchedulerConstants.PHYSICIAN_ORDER_FORM_3);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICIAN_PLAZA_HEALTH_CARE_FORM)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.PHYSICIAN_ORDERS,
										FormSchedulerConstants.PHYSICIAN_PLAZA_HEALTH_CARE_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICIAN_SPECIALITY_FORM)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.PHYSICIAN_ORDERS,
										FormSchedulerConstants.PHYSICIAN_SPECIALITY_FORM);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PRESCRIPTION)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PHYSICIAN_ORDERS,
								FormSchedulerConstants.PRESCRIPTION);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PROGRESS_NOTES)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.PHYSICIAN_ORDERS,
								FormSchedulerConstants.PROGRESS_NOTES);
					}
					// ot-pt-act-speech
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.OCCUPATIONAL_DAILY_RECORD)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.OT_PT_ACT_SPEECH,
										FormSchedulerConstants.OCCUPATIONAL_DAILY_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.OCCUPATIONAL_THERAPY)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.OCCUPATIONAL_THERAPY);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.PHYSICAL_THERAPY)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.PHYSICAL_THERAPY);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.POSITIONING_EVALUATION)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.POSITIONING_EVALUATION);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.REHAB_CARE_PLAN)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.REHAB_CARE_PLAN);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.SPEECH_DAILY_RECORD)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.SPEECH_DAILY_RECORD);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.SPEECH_THERAPY)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.SPEECH_THERAPY);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.THERAPY_PROGRESSNOTE_RECERTIFICATION_DISCHARGE)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.OT_PT_ACT_SPEECH,
										FormSchedulerConstants.THERAPY_PROGRESSNOTE_RECERTIFICATION_DISCHARGE);
					}
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.TREATMENT)) {
						Global.frameMainOptions.openMainDesktopWithPanel(
								ResidentTabs.OT_PT_ACT_SPEECH,
								FormSchedulerConstants.TREATMENT);
					}
					// assessment
					if (formType
							.equalsIgnoreCase(FormSchedulerConstants.RESIDENT_ADMISSION_ASSESSMENT)) {
						Global.frameMainOptions
								.openMainDesktopWithPanel(
										ResidentTabs.ASSESSMENTS,
										FormSchedulerConstants.RESIDENT_ADMISSION_ASSESSMENT);
					}

				}
			}
		});
		admissionTable = new AdmissionsRecordsJTableNew();
		table.setModel(admissionTable);
		scrollPane.setViewportView(table);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("PENDING FORMS");
		residentInformationLabel.setBounds(10, 10, 700, 30);
		panel.add(residentInformationLabel);

	}

	protected void doUpdate() {
		updateAdmissionsRecordJTable();
	}

	public void updateAdmissionsRecordJTable() {
		List residentAdmissionRecords = new ArrayList();
		if (Global.currentResidenceKey != 0) {
			try {
				residentAdmissionRecords = MedrexClientManager
						.getInstance()
						.getPendingFormsByResidentId(Global.currentResidenceKey);
			} catch (Exception e) {

			}
		}

		admissionTable.setNewList(residentAdmissionRecords);
		admissionTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public static void main(String[] a) {
		Global.currentResidenceKey = 11;
		(new MedrexMain()).generalInitializations();
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		PanelPendingForms p = new PanelPendingForms();
		JFrame frame = SwingUtils.wrapInFrame(p);
		frame.getContentPane().setBackground(Color.RED);
		p.updateAdmissionsRecordJTable();
		frame.setVisible(true);
	}
}

class AdmissionsRecordsJTableNew extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5319738534275399476L;

	private String[] columnNames = { "Type", "Form Type", "Due Date" };

	public List admissionsRecords;

	int n = 0;

	AdmissionsRecordsJTableNew(List admissionRecords) {
		admissionsRecords = admissionRecords;
	}

	AdmissionsRecordsJTableNew() {
		admissionsRecords = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (admissionsRecords.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List admissionRecords) {
		admissionsRecords = admissionRecords;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MM / dd / yyyy");
		try {
			Object o = admissionsRecords.get(row);
			if (o instanceof PendingForm) {
				PendingForm rc = (PendingForm) o;

				if (col == 0) {
					return (rc.getType()); // + "");
				}
				if (col == 1) {
					return (rc.getForm());
				}
				if (col == 2) {
					return (df.format(rc.getFormDueDate())); // + "");
				}

				if (col == 6) {
					return (rc.getSerial());
				}
				return ("");
			}
		}

		catch (Exception e) {
			return ("");
		}

		return ("");

	}
}
