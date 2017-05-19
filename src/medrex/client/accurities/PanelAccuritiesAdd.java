package medrex.client.accurities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.resident.payerInfo.PanelResidentInfoPayerAdd;
import medrex.client.utils.SwingUtils;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.accurities.Accurities;
import medrex.commons.vo.resident.ResidentMain;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox; 

public class PanelAccuritiesAdd extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9115527654745365585L;
	private JList tList;
	private JList woList;
	private JList ivList;
	private JList o2List;
	private JxButton tButton;
	private JxButton woButton;
	private JxButton ivButton;
	private JxButton o2Button;
	private JLabel currentDateLabel;
	private List residentList = null;
	private FrameAccuritiesListAdd frameAccuritiesListAdd;
	private String strListData[] = new String[0];

	private JxButton cancelButton;
	private JxButton saveButton;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);
	private static final Color DEF_COLOR = new Color(49, 104, 127);

	public PanelAccuritiesAdd() {
		super();
		setPreferredSize(new Dimension(700, 500));
		setBorder(new LineBorder(DEF_COL, 1, false));
		setLayout(null);
		setBackground(Color.WHITE);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setForeground(SystemColor.desktop);
		residentNameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentNameLabel.setBounds(40, 10, 33, 14);
		residentNameLabel.setText("Date: ");
		add(residentNameLabel);

		saveButton = new JxButton(0.4f);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				doSave();
				Global.frameAccuritiesAddNew.dispose();
			}
		});
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(40, 413, 75, 21);
		if (Global.currentAccuritiesKey == 1) {
			saveButton.setEnabled(false);
		}
		add(saveButton);

		cancelButton = new JxButton(0.4f);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameAccuritiesAddNew.dispose();
			}
		});
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(138, 413, 75, 21);
		add(cancelButton);

		SimpleDateFormat df = new SimpleDateFormat();
		df.applyPattern("MMM dd, yyyy");
		currentDateLabel = new JLabel();
		currentDateLabel.setForeground(SystemColor.desktop);
		currentDateLabel.setFont(new Font("", Font.BOLD, 12));
		currentDateLabel.setText(df.format(MedrexClientManager.getServerTime())
				+ "");
		currentDateLabel.setBounds(79, 8, 116, 16);
		add(currentDateLabel);

		o2Button = new JxButton(0.4f);
		o2Button.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 1;
				// frameAccuritiesListAdd = new
				// FrameAccuritiesListAdd(Global.currentAccuritiesListKey);
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Accuties List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		o2Button.setBackground(Color.WHITE);
		o2Button.setForeground(DEF_COL);
		o2Button.setBorder(new LineBorder(BORDER_COL, 1, false));
		o2Button.setFont(new Font("", Font.BOLD, 12));
		o2Button.setText("O2");
		o2Button.setBounds(78, 43, 50, 25);
		add(o2Button);

		o2List = new JList();
		o2List.setFont(new Font("", Font.BOLD, 12));
		o2List.setForeground(DEF_COL);
		o2List.setBorder(new LineBorder(DEF_COL, 1, false));

		JScrollPane listScrollPane = new JScrollPane();
		listScrollPane.setBounds(40, 75, 140, 320);
		listScrollPane.setViewportView(o2List);
		add(listScrollPane);

		ivButton = new JxButton(0.4f);
		ivButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 2;
				// frameAccuritiesListAdd = new
				// FrameAccuritiesListAdd(Global.currentAccuritiesListKey);
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Accuties List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		ivButton.setBackground(Color.WHITE);
		ivButton.setForeground(DEF_COL);
		ivButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		ivButton.setFont(new Font("", Font.BOLD, 12));
		ivButton.setText("IV");
		ivButton.setBounds(245, 43, 50, 25);
		add(ivButton);

		ivList = new JList();
		ivList.setFont(new Font("", Font.BOLD, 12));
		ivList.setForeground(DEF_COL);
		ivList.setBorder(new LineBorder(DEF_COL, 1, false));
		JScrollPane listScrollPane1 = new JScrollPane();
		listScrollPane1.setBounds(200, 76, 140, 320);
		listScrollPane1.setViewportView(ivList);
		add(listScrollPane1);

		woButton = new JxButton(0.4f);
		woButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 3;
				// frameAccuritiesListAdd = new
				// FrameAccuritiesListAdd(Global.currentAccuritiesListKey);
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Accuties List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		woButton.setBackground(Color.WHITE);
		woButton.setForeground(DEF_COL);
		woButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		woButton.setFont(new Font("", Font.BOLD, 12));
		woButton.setText("WO");
		woButton.setBounds(397, 43, 50, 25);
		add(woButton);

		woList = new JList();
		woList.setFont(new Font("", Font.BOLD, 12));
		woList.setForeground(DEF_COL);
		woList.setBorder(new LineBorder(DEF_COL, 1, false));
		JScrollPane listScrollPane2 = new JScrollPane();
		listScrollPane2.setBounds(360, 76, 140, 320);
		listScrollPane2.setViewportView(woList);
		add(listScrollPane2);

		tButton = new JxButton(0.4f);
		tButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.currentAccuritiesListKey = 4;
				// frameAccuritiesListAdd = new
				// FrameAccuritiesListAdd(Global.currentAccuritiesListKey);
				SwingUtils.center(frameAccuritiesListAdd);
				frameAccuritiesListAdd.setTitle("Accuties List Add");
				frameAccuritiesListAdd.setModal(true);
				frameAccuritiesListAdd.setVisible(true);
				fillList();
			}
		});
		tButton.setBackground(Color.WHITE);
		tButton.setForeground(DEF_COL);
		tButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		tButton.setFont(new Font("", Font.BOLD, 12));
		tButton.setText("T");
		tButton.setBounds(567, 43, 50, 25);
		add(tButton);

		tList = new JList();
		tList.setBorder(new LineBorder(DEF_COL, 1, false));
		tList.setFont(new Font("", Font.BOLD, 12));
		tList.setForeground(DEF_COL);
		JScrollPane listScrollPane3 = new JScrollPane();
		listScrollPane3.setBounds(522, 76, 140, 320);
		listScrollPane3.setViewportView(tList);
		add(listScrollPane3);

		fillList();
	}

	public void fillList() {
		List accList = Global.accuritiesList;
		ResidentMain res = null;
		int i = 0;
		int typeId = 0;
		if (accList != null) {
			o2List.removeAll();
			ivList.removeAll();
			woList.removeAll();
			tList.removeAll();

			List o2 = new ArrayList<String>();
			List iv = new ArrayList<String>();
			List wo = new ArrayList<String>();
			List t = new ArrayList<String>();

			strListData = new String[accList.size()];
			Iterator itr = accList.iterator();
			while (itr.hasNext()) {
				Accurities acc = (Accurities) itr.next();
				typeId = acc.getTypeId();
				try {
					res = MedrexClientManager.getInstance().getResident(
							acc.getResidentId());
				} catch (Exception e) {
					e.printStackTrace();
				}
				String resName = res.getUserPass() + ", " + res.getUserName();
				i++;

				if (typeId == 1) {
					o2.add(resName);
				}
				if (typeId == 2) {
					iv.add(resName);
				}
				if (typeId == 3) {
					wo.add(resName);
				}
				if (typeId == 4) {
					t.add(resName);
				}
			}

			o2List.setModel(new DefaultComboBoxModel(o2.toArray()));
			ivList.setModel(new DefaultComboBoxModel(iv.toArray()));
			woList.setModel(new DefaultComboBoxModel(wo.toArray()));
			tList.setModel(new DefaultComboBoxModel(t.toArray()));
		}

	}

	public void doSave() {
		new Accurities();
		List accList = Global.accuritiesList;
		if (accList != null) {
			Iterator itr = accList.iterator();
					}

	}
}
