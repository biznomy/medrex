package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.rmi.RemoteException;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.AbstractTableModel;

import org.hibernate.cfg.Mappings.ColumnNames;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;

import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderConsultations;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrdersConsulationRow;
import medrex.commons.vo.resident.ResidentMain;
import medrex.server.service.physicianOrders.physicianOrderNewScreen.PhysicianOrderConsultationsDAO;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxComboBox;
import com.sX.swing.JxCheckBox;
import com.sX.swing.JxRadioButton;
import com.sX.swing.JxDateChooser;
import com.sX.swing.JxTextA;
import com.sX.swing.JxPanel;
import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelPhysicianOrderConsultations extends JxPanel {
	private JxButton btnDelete;
	private JxButton btnSave;
	private JxButton btnAddNew;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5812093021761963224L;
	private int id = 0;
	private int[] serialrow;
	Theme theme = new BlueOverWhiteTheme();
	public PanelPhysicianOrderConsultations() {
		super();
		Global.panelPhysicianOrderConsultations = this;
		setBorder(new LineBorder(ColorConstants.DEF_COLOR, 1));
		setBackground(Color.WHITE);
		setArc(1.0f);
		setLayout(new BorderLayout());

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setPreferredSize(new Dimension(0, 40));
		add(panel_1, BorderLayout.NORTH);

		panel_1.setLayout(null);

		final JxLabel consultationsLabel = new JxLabel();
		consultationsLabel.setTheme(theme);
		consultationsLabel.setFontSize(18);
		consultationsLabel.setForeground(ColorConstants.DEF_COLOR);

		consultationsLabel.setFontStyle(Font.BOLD);
		consultationsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		consultationsLabel.setText("CONSULTATIONS");
		consultationsLabel.setBounds(335, 5, 200, 25);
		panel_1.add(consultationsLabel);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		add(panel, BorderLayout.CENTER);

		JTable table = new JTable(new MyTableModal());
		table.setSize(300, 300);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.setForeground(ColorConstants.DEF_COLOR);
		
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(250);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.setRowHeight(20);
		
		
		
		JScrollPane pane = new JScrollPane(table);
		pane.setSize(720, 400);
		pane.setViewportView(table);
		panel.add(pane);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setPreferredSize(new Dimension(0, 40));
		panel_2.setLayout(null);
		add(panel_2, BorderLayout.SOUTH);

		btnAddNew = new JxButton();
		btnAddNew.setTheme(theme);

		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {

				setBlankField();
				Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
			}
		});
		btnAddNew.setBackground(Color.WHITE);
		btnAddNew.setForeground(ColorConstants.DEF_COLOR);
		btnAddNew.setFont(new Font("Tahoma", Font.BOLD, 12));		
		btnAddNew.setArc(0.4f);
		btnAddNew.setText("Add New");
		btnAddNew.setBounds(190, 0, 100, 20);
		panel_2.add(btnAddNew);

		btnSave = new JxButton();
		btnSave.setTheme(theme);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.framePhysicianOrder.dispose();

			}
		});

		
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(ColorConstants.DEF_COLOR);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));		
		btnSave.setArc(0.4f);
		btnSave.setText("Save");
		btnSave.setBounds(320, 0, 100, 20);
		panel_2.add(btnSave);

		btnDelete = new JxButton();
		btnDelete.setTheme(theme);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doDelete();

			}
		});

		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(ColorConstants.DEF_COLOR);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));		
		btnDelete.setArc(0.4f);
		btnDelete.setText("Delete");
		btnDelete.setBounds(450, 0, 100, 20);
		panel_2.add(btnDelete);

		serialrow = new int[22];
	}

	public void doDelete() {
		try {
			if (Global.currentPhysicianOrderRecordKey != 0
					&& Global.currentPhysicianOrderConsultationskey != 0) {
				MedrexClientManager.getInstance().deletePhysicianOrderRecord(
						Global.currentPhysicianOrderRecordKey);
				MedrexClientManager.getInstance()
						.deletePhysicianOrderConsultations(
								Global.currentPhysicianOrderConsultationskey);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		setBlankField();
	}

	public void doSave() {

		List<Consultation> data = MyTableModal.data;
		Iterator<Consultation> iterator = data.iterator();
		List<PhysicianOrdersConsulationRow> phConList = new ArrayList<PhysicianOrdersConsulationRow>();
		int i = 0;
		while (iterator.hasNext()) {
			Consultation consultation = (Consultation) iterator.next();
			PhysicianOrdersConsulationRow row = new PhysicianOrdersConsulationRow();
			if (id == 0) {
				row.setSerial(0);
			} else {
				row.setSerial(serialrow[i]);
			}
			row.setReason(consultation.getReason());
			row.setSpeciality(consultation.getSpeciality());
			row.setApplicable(consultation.getIsSelected());
			row.setNotApplicable(consultation.getIsApplicable());
			row.setForCon(consultation.getName());
			phConList.add(row);
			i++;
		}

		ResidentMain residentMain = null;
		try {
			residentMain = MedrexClientManager.getInstance().getResident(
					Global.currentResidenceKey);
		} catch (Exception e) {
			e.printStackTrace();
		}

		PhysicianOrderConsultations phorderConsul = new PhysicianOrderConsultations();
		phorderConsul.setSerial(id);
		phorderConsul.setResidents(residentMain);
		phorderConsul.setConsulationsRow(phConList);
		try {
			Global.currentPhysicianOrderConsultationskey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderConsultations(
							phorderConsul);
		} catch (Exception e) {
			e.printStackTrace();
		}

		PhysicianOrderRecord physRec = new PhysicianOrderRecord();
		physRec.setDateCreated(MedrexClientManager.getServerTime());
		physRec.setLastModified(MedrexClientManager.getServerTime());
		physRec.setFormId(Global.currentPhysicianOrderConsultationskey);
		physRec.setFormType("Consultations");
		physRec.setResidents(residentMain);
		physRec.setStatus("");
		Users user = null;
		try {
			user = MedrexClientManager.getInstance().getUser(
					Global.currentLoggedInUserKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		physRec.setUser(user);
		physRec.setTitle("Consultations");
		physRec.setSerial(Global.currentPhysicianOrderRecordKey);
		try {
			Global.currentPhysicianOrderRecordKey = MedrexClientManager
					.getInstance().insertOrUpdatePhysicianOrderRecord(physRec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Global.panelPhysicianOrderDetails != null) {
			Global.panelPhysicianOrderDetails.updatePhysicianOrderJTable();
		}
		setBlankField();

	}

	public void setBlankField() {

		this.id = 0;
		Global.currentPhysicianOrderRecordKey = 0;
		Global.currentPhysicianOrderRespiratoryTherapyKey = 0;
		List<Consultation> data = MyTableModal.data;
		Iterator<Consultation> iterator = data.iterator();
		while (iterator.hasNext()) {
			Consultation consultation = (Consultation) iterator.next();
			consultation.isApplicable = false;
			consultation.isSelected = false;
			consultation.reason = "";
			consultation.speciality = "";
		}
	}

	public void setValueObjectForConsultants(
			PhysicianOrderConsultations consult, int id) {

		this.id = consult.getSerial();
		List<Consultation> data = MyTableModal.data;
		Iterator<Consultation> iterator = data.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			Consultation consultation = (Consultation) iterator.next();
			consultation.isApplicable = consult.getConsulationsRow().get(i)
					.isNotApplicable();
			consultation.isSelected = consult.getConsulationsRow().get(i)
					.isApplicable();
			consultation.name = consult.getConsulationsRow().get(i).getForCon();
			consultation.reason = consult.getConsulationsRow().get(i)
					.getReason();
			consultation.speciality = consult.getConsulationsRow().get(i)
					.getSpeciality();
			serialrow[i]=consult.getConsulationsRow().get(i).getSerial();
			i++;
		}
	}
}

class MyTableModal extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5035814126078556389L;
	private final static String[] columnNames = { " ", "For", "Reason",
			"Speciality", "N/A" };
	

	public static List<Consultation> data = null;

	MyTableModal() {

		data = new ArrayList<Consultation>();
		data.add(new Consultation("Podiatary"));
		data.add(new Consultation("Optometry"));
		data.add(new Consultation("Dental"));
		data.add(new Consultation("Ophthalmology"));
		data.add(new Consultation("Renal"));
		data.add(new Consultation("GI"));
		data.add(new Consultation("Pulmonology"));
		data.add(new Consultation("GU"));
		data.add(new Consultation("Endocrinology"));
		data.add(new Consultation("Hematology/Oncology"));
		data.add(new Consultation("Gynecology"));
		data.add(new Consultation("Cardiology"));
		data.add(new Consultation("Vascular"));
		data.add(new Consultation("General Surgery"));
		data.add(new Consultation("ENT"));
		data.add(new Consultation("Pshchiatry"));
		data.add(new Consultation("Psychology"));
		data.add(new Consultation("Wound Care"));
		data.add(new Consultation("Ortho"));
		data.add(new Consultation("Infectious Disease"));
		data.add(new Consultation("Oral Surgery"));
		data.add(new Consultation("Other"));
	
	}

	@Override
	public int getColumnCount() {

		return 5;
	}

	@Override
	public int getRowCount() {

		return data.size();
	}
	
	


	@Override
	public Object getValueAt(int row, int col) {
		Consultation c = data.get(row);
		switch (col) {
		case 0:
			return c.getIsSelected();
		case 1:
			return c.getName();
		case 2:
			return c.getReason();
		case 3:
			return c.getSpeciality();
		case 4:
			return c.getIsApplicable();

		default:
			return null;
		}

	}

	@Override
	public String getColumnName(int col) {
		
		/*String s=columnNames[col];
		AttributedString attributedString = new AttributedString(s);
		attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red);*/
		return (columnNames[col]);
	}

	@Override
	public Class getColumnClass(int columnIndex) {
		if (columnIndex == 0) {
			return Boolean.class;
		} else if (columnIndex == 4) {
			return Boolean.class;
		}

		else {
			return super.getColumnClass(columnIndex);
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {

		if (columnIndex == 0) {
			return true;
		}
		if (columnIndex == 1) {
			return false;
		} else if (columnIndex == 2 || columnIndex == 3 || columnIndex == 4) {
			Boolean bool = (Boolean) getValueAt(rowIndex, 0);
			if (bool == null)
				bool = false;
			if (bool == false) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		super.setValueAt(value, rowIndex, columnIndex);

		if (data != null) {
			Consultation values = data.get(rowIndex);
			// ResidentMain resident = (ResidentMain)
			// residentMap.get(values.getResidentId());

			switch (columnIndex) {
			case 0:
				values.setIsSelected((Boolean) value);
				fireTableCellUpdated(rowIndex, columnIndex);
				break;
			case 2:
				values.setReason((String) value);
				fireTableCellUpdated(rowIndex, columnIndex);
				break;
			case 3:
				values.setSpeciality((String) value);
				fireTableCellUpdated(rowIndex, columnIndex);
				break;
			case 4:
				values.setIsApplicable((Boolean) value);
				fireTableCellUpdated(rowIndex, columnIndex);
				break;
			}

		}
	}

	public void mouseClicked(java.awt.event.MouseEvent evt) {
		if (evt.getClickCount() == 2) {

		}
	}
}

class Consultation {
	public Boolean isSelected = false;
	public String name;
	public String reason;
	public String speciality;
	public Boolean isApplicable = false;

	/**
	 * @return the isSelected
	 */

	Consultation(String name) {
		this.name = name;
	
	}

	public Boolean getIsSelected() {
		return isSelected;
	}

	/**
	 * @param isSelected
	 *            the isSelected to set
	 */
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason
	 *            the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality
	 *            the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return the isApplicable
	 */
	public Boolean getIsApplicable() {
		return isApplicable;
	}

	/**
	 * @param isApplicable
	 *            the isApplicable to set
	 */
	public void setIsApplicable(Boolean isApplicable) {
		this.isApplicable = isApplicable;
	}
}
