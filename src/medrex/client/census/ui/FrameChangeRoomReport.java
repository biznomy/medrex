package medrex.client.census.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.AbstractTableModel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.utils.ComponentPrintable;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.RoomChange;

import com.sX.swing.JxButton;
import com.sX.swing.JxTable;

public class FrameChangeRoomReport extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1479016799497633740L;
	private JxTable table_1;
	private JxTable table;
	private RoomChnageTableModal refFirstFloorTableModal;
	private Date date;
	private RoomChnageTableModal refSecondFloorTableModal;

	public FrameChangeRoomReport(Date date) {
		super();
		this.date = date;
		setSize(600, 700);
		setTitle("Change Room Report");
		setResizable(false);
		setModal(true);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);

		final JPanel panelMain = new JPanel();
		panelMain.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		panelMain.setLayout(null);
		panelMain.setSize(getSize());
		panelMain.setPreferredSize(panelMain.getSize());
		getContentPane().add(panelMain, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(GuiModes.DESIGNER_FORMS
				.getDefaultBackgroundColor());
		scrollPane.getViewport().setBackground(
				GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		scrollPane.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		scrollPane.setBounds(10, 87, 574, 250);
		panelMain.add(scrollPane);

		final JLabel lblTitle = new JLabel();
		lblTitle.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(
				28f));
		lblTitle.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setText("Change Room Report:("
				+ new SimpleDateFormat("MM/dd/yyyy").format(date) + ")");
		lblTitle.setBounds(10, 10, 574, 37);
		panelMain.add(lblTitle);

		refFirstFloorTableModal = new RoomChnageTableModal();

		table = new JxTable();
		table.setRowHeight(21);
		table.setRowMargin(2);
		table.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(12f)
				.deriveFont(Font.PLAIN));
		table.setModel(refFirstFloorTableModal);
		scrollPane.setViewportView(table);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 374, 574, 250);
		panelMain.add(scrollPane_1);

		refSecondFloorTableModal = new RoomChnageTableModal();

		table_1 = new JxTable();
		table_1.setRowMargin(2);
		table_1.setRowHeight(21);
		table_1.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont()
				.deriveFont(12f).deriveFont(Font.PLAIN));
		table_1.setModel(refSecondFloorTableModal);
		scrollPane_1.setViewportView(table_1);

		final JLabel lblTitle_1 = new JLabel();
		lblTitle_1.setText("First Floor");
		lblTitle_1.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont().deriveFont(
				20f));
		lblTitle_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle_1.setBounds(10, 53, 574, 28);
		panelMain.add(lblTitle_1);

		final JLabel lblTitle_1_1 = new JLabel();
		lblTitle_1_1.setText("Second Floor");
		lblTitle_1_1.setFont(GuiModes.DESIGNER_FORMS.getDefaultFont()
				.deriveFont(20f));
		lblTitle_1_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		lblTitle_1_1.setBounds(10, 340, 574, 28);
		panelMain.add(lblTitle_1_1);
		updateJTable();

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(0, 36));
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.SOUTH);

		final JxButton btnOk = new JxButton();
		btnOk.setBounds(464, 0, 120, 30);
		panel.add(btnOk);
		btnOk.setArc(0.4f);
		btnOk
				.setBackground(GuiModes.DESIGNER_FORMS
						.getControlBackgroundColor());
		btnOk
				.setForeground(GuiModes.DESIGNER_FORMS
						.getControlForegroundColor());
		btnOk.setHorizontalAlignment(SwingConstants.CENTER);
		btnOk.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnOk.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent evt) {
				FrameChangeRoomReport.this.dispose();
			}
		});
		btnOk.setText("Ok");

		final JxButton btnPrint = new JxButton();
		btnPrint.setBounds(338, 0, 120, 30);
		btnPrint.setArc(0.4f);
		btnPrint.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnPrint.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnPrint.setHorizontalAlignment(SwingConstants.CENTER);
		btnPrint.setFont(GuiModes.DESIGNER_FORMS.getControlFont());
		btnPrint.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Book book = new Book();
				PrinterJob printJob = PrinterJob.getPrinterJob();
				PageFormat pageFormat = new PageFormat();
				Paper paper = new Paper();
				paper.setSize(594.992125984252, 841.8897637795276);
				paper.setImageableArea(36.0, 36.0, 522.99212598425197,
						769.8897637795276);
				pageFormat.setPaper(paper);
				pageFormat.setOrientation(PageFormat.PORTRAIT);
				printJob.defaultPage(pageFormat);
				printJob.setCopies(1);
				printJob.setPageable(book);
				final Component comp = panelMain;
				comp.setSize(comp.getPreferredSize());
				final ComponentPrintable cp = new ComponentPrintable(comp);
				book.append(cp, pageFormat);
				try {
					printJob.print();
				} catch (Exception PrintException) {
					PrintException.printStackTrace();
				}
				FrameChangeRoomReport.this.dispose();
			}
		});
		btnPrint.setText("Print");
		panel.add(btnPrint);
	}

	public void updateJTable() {
		List<RoomChange> roomFirstFloorlist = new ArrayList<RoomChange>();
		new ArrayList<RoomChange>();
		try {
			roomFirstFloorlist = MedrexClientManager.getInstance()
					.getRoomChangeFirstFloor(date);
			MedrexClientManager.getInstance().getRoomChangeSecondFloor(date);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MedrexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		refFirstFloorTableModal.setNewList(roomFirstFloorlist);
		refFirstFloorTableModal.fireTableStructureChanged();
		refFirstFloorTableModal.setNewList(roomFirstFloorlist);
		refFirstFloorTableModal.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
		table_1.updateUI();
		table_1.repaint();
	}
}

class RoomChnageTableModal extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4776254332493294832L;

	private String[] columnNames = { "Resident", "From Room", "To Room" };

	public List<RoomChange> roomChange;

	int n = 0;

	RoomChnageTableModal(List roomChange) {
		this.roomChange = roomChange;
	}

	RoomChnageTableModal() {
		roomChange = new ArrayList();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (roomChange.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List roomChange) {
		this.roomChange = roomChange;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			Object o = roomChange.get(row);
			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MM / dd / yyyy  hh:mm a");
			if (o instanceof RoomChange) {
				RoomChange rc = (RoomChange) o;

				if (col == 0) {
					ResidentMain rm = MedrexClientManager.getInstance()
							.getResident(rc.getResidentId());
					return rm.getUserPass() + ", " + rm.getUserName();
				}
				if (col == 1) {
					return (rc.getFromRoom());
				}
				if (col == 2) {
					return (rc.getToRoom());
				}
				/*
				 * if (col == 3) { return (df.format(rc.getStartDate())); } if
				 * (col == 4) { return (df.format(rc.getEndDate())); }
				 */
				return ("");
			}
			return "";
		} catch (Exception e) {
			return ("");
		}

	}

}
