package medrex.client.test.ra.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.utils.events.ViewEvent;
import medrex.commons.intf.AbstractPanelView;
import medrex.commons.intf.DataObject;
import medrex.commons.vo.ra.RARecord;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelRAMain extends AbstractPanelView {
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private static final long serialVersionUID = 1L;
	private JxTable table;
	private PanelRAMainJTable panelRAMainJTable;

	private ArrayList<DataObject> dataObjects;
	private List<RARecord> raList;
	private String forName = "RAF";

	public PanelRAMain() {
		super();

		setLayout(null);
		setPreferredSize(new Dimension(718, 448));
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					refresh();
				}
			}
		});

		final JxPanel panel = new JxPanel(1f);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 720, 404);
		add(panel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 46, 680, 290);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(DEF_COL, 1, false));
		panel.add(scrollPane);

		table = new JxTable();
		panelRAMainJTable = new PanelRAMainJTable();
		table.setModel(panelRAMainJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					int serial = new Integer((String) panelRAMainJTable
							.getValueAt(table.getSelectedRow(), 3)).intValue();
					if (serial != 0) {
						fireViewEvent(ViewEvent.LOAD, serial);
					}
				} else if (evt.getClickCount() == 1) {
					System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnAdd = new JxButton(0.4f);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(DEF_COL);
		btnAdd.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnAdd.setBounds(70, 355, 84, 26);
		btnAdd.setFont(new Font("", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				fireViewEvent(ViewEvent.NEW, forName);
			}
		});
		btnAdd.setText("Add New");
		panel.add(btnAdd);

		final JxButton btnView = new JxButton(0.4f);
		btnView.setBackground(Color.WHITE);
		btnView.setForeground(DEF_COL);
		btnView.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnView.setBounds(195, 355, 111, 26);
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int serial = new Integer((String) panelRAMainJTable
							.getValueAt(table.getSelectedRow(), 3)).intValue();
					if (serial != 0) {
						fireViewEvent(ViewEvent.LOAD, serial);
					}
				} catch (Exception ve) {
					ve.printStackTrace();
				}
			}
		});
		btnView.setText("View / Update");
		panel.add(btnView);

		final JxButton btnDelete = new JxButton(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setForeground(DEF_COL);
		btnDelete.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnDelete.setBounds(350, 355, 70, 26);
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					int serial = new Integer((String) panelRAMainJTable
							.getValueAt(table.getSelectedRow(), 3)).intValue();
					if (serial != 0) {
						fireViewEvent(ViewEvent.DELETE, serial);
					}
				} catch (Exception xe) {

				}

			}
		});
		btnDelete.setText("Delete");
		panel.add(btnDelete);

		final JxButton btnCancel = new JxButton(0.4f);
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setForeground(DEF_COL);
		btnCancel.setBorder(new LineBorder(BORDER_COL, 1, false));
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(592, 355, 70, 26);
		panel.add(btnCancel);

		final JLabel residentInformationLabel = new JLabel();
		residentInformationLabel.setForeground(DEF_COL);
		residentInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentInformationLabel.setBounds(10, 10, 700, 30);
		residentInformationLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		residentInformationLabel.setText("RA");
		panel.add(residentInformationLabel);

	}

	@Override
	public List<DataObject> getDataObjects() {
		dataObjects = new ArrayList<DataObject>();

		/*
		 * RARecord raRecord = new RARecord(); raRecord.setFormName("RAF");
		 * raRecord.setResidentId(Global.currentResidenceKey);
		 * dataObjects.add(raRecord);
		 */
		return dataObjects;
	}

	@Override
	public void setDataObjects(List<DataObject> dataObjectList) {
		raList = new ArrayList<RARecord>();
		if (dataObjectList != null) {
			RARecord raRecord = null;
			for (DataObject dataObj : dataObjectList) {
				if (dataObj.getClass() == RARecord.class) {
					raRecord = (RARecord) dataObj;
					raList.add(raRecord);
				}
			}

		}
	}

	@Override
	public void refresh() {
		updateRAMainJTable();
	}

	private void updateRAMainJTable() {
		panelRAMainJTable.setNewList(raList);
		panelRAMainJTable.fireTableStructureChanged();
	}
}
