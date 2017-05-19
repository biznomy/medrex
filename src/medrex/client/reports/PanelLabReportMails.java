package medrex.client.reports;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.reports.LabReport;
import medrex.commons.vo.reports.LabReportTest;

import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.lexer.Lexer;
import org.htmlparser.lexer.Page;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTable;

public class PanelLabReportMails extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JxTable table;

	private LabReportsMailsJTable usersRecordJTable;

	private JScrollPane scrollPane;

	private JxPanel panel;

	private JPanel topTabArea;

	private JPanel topTabsPanel;

	private JPanel topBlueStrip;

	private JPanel defaultPanel;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	/**
	 * Create the panel
	 */
	public PanelLabReportMails() {
		super();
		addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName() == "DISPLAY_TAB") {
					doUpdate();
				}
			}
		});
		setLayout(null);
		setPreferredSize(new Dimension(868, 768));

		topTabArea = new JPanel();
		topTabArea.setLayout(new BorderLayout(0, 0));
		topTabArea.setOpaque(false);
		topTabArea.setBounds(0, 0, 868, 138);
		add(topTabArea);

		topTabsPanel = new JPanel();
		topTabsPanel.setOpaque(false);
		topTabsPanel.setLayout(null);
		topTabsPanel.setPreferredSize(new Dimension(868, 40));
		topTabArea.add(topTabsPanel, BorderLayout.SOUTH);

		topBlueStrip = new JPanel();
		topBlueStrip.setLayout(new GridLayout(0, 2));
		topBlueStrip.setBackground(new Color(28, 93, 113));
		topBlueStrip.setBounds(0, 138, 868, 38);
		add(topBlueStrip);

		final JLabel lastLoginLabel = new JLabel();
		lastLoginLabel.setForeground(Color.WHITE);
		lastLoginLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		lastLoginLabel.setBorder(new EmptyBorder(0, 100, 0, 0));
		lastLoginLabel.setText("<html><b>Last Login:</b> 2009-05-01 08:30 AM");
		topBlueStrip.add(lastLoginLabel);

		final JLabel logLabel = new JLabel();
		logLabel.setBorder(new EmptyBorder(0, 0, 0, 50));
		logLabel.setForeground(Color.WHITE);
		logLabel.setFont(GuiModes.DESIGNER_FORMS.getControlFont()
				.deriveFont(16));
		logLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		logLabel.setText("Log off   |   Support   |   Help");
		topBlueStrip.add(logLabel);

		defaultPanel = new JPanel();
		defaultPanel.setBorder(new EmptyBorder(20, 0, 0, 10));
		defaultPanel.setOpaque(false);
		defaultPanel.setLayout(null);
		defaultPanel.setBounds(0, 176, 868, 592);
		add(defaultPanel);

		panel = new JxPanel();
		panel.setArc(1f);
		panel.setBorder(new LineBorder(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor(), 1, false));
		panel.setBounds(0, 0, 750, 434);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(750, 434));
		panel.setLayout(null);
		defaultPanel.add(panel);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBounds(24, 75, 702, 250);
		panel.add(scrollPane);

		table = new JxTable();
		usersRecordJTable = new LabReportsMailsJTable();
		table.setModel(usersRecordJTable);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (evt.getClickCount() == 2) {
					LabReport report = (LabReport) usersRecordJTable
							.getValueAt(table.getSelectedRow(), 3);
					PanelLabReport panelLabReport = new PanelLabReport(report);
					JDialog f = new JDialog();
					f.setSize(820, 500);
					f.getContentPane().add(panelLabReport);
					f
							.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					SwingUtils.center(f);
					f.setVisible(true);
				} else if (evt.getClickCount() == 1) {
					// System.out.println("single click");
				}
			}
		});

		scrollPane.setViewportView(table);

		final JxButton btnView = new JxButton();
		btnView.setArc(0.4f);
		btnView.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnView.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnView.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnView.setLabel("View");
		btnView.setName("");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				try {
					LabReport report = (LabReport) usersRecordJTable
							.getValueAt(table.getSelectedRow(), 3);
					PanelLabReport panelLabReport = new PanelLabReport(report);
					JDialog f = new JDialog();
					f.setSize(820, 500);
					f.getContentPane().add(panelLabReport);
					f
							.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					SwingUtils.center(f);
					f.setVisible(true);
				} catch (Exception ve) {
					ve.printStackTrace();
				}
			}
		});
		btnView.setFont(new Font("", Font.BOLD, 12));
		btnView.setText("View");
		btnView.setBounds(503, 331, 111, 26);
		panel.add(btnView);

		final JxButton btnCancel = new JxButton();
		btnCancel.setArc(0.4f);
		btnCancel.setBackground(GuiModes.DESIGNER_FORMS
				.getControlBackgroundColor());
		btnCancel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		btnCancel.setBorder(GuiModes.DESIGNER_FORMS.getControlBorder());
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				Global.frameLabReports.openMainOptions();
			}
		});
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(620, 331, 106, 26);
		panel.add(btnCancel);

		final JLabel usersInformationLabel = new JLabel();
		usersInformationLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		usersInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usersInformationLabel.setFont(new Font("", Font.PLAIN, 28));
		usersInformationLabel.setText("LAB REPORTS");
		usersInformationLabel.setBounds(24, 18, 702, 34);
		panel.add(usersInformationLabel);

		fillCombos();
		updateUsersJTable();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(new Color(32, 63, 84));
		g2.fillRect(0, getHeight() - 76, getWidth(), 76);
	}

	public void doUpdate() {
		topTabArea.setSize(getWidth(), topTabArea.getHeight());
		topBlueStrip.setSize(getWidth(), topBlueStrip.getHeight());
		defaultPanel.setSize(getWidth(), getHeight() - defaultPanel.getY());
		panel.setLocation((defaultPanel.getWidth() - panel.getWidth()) / 2,
				(defaultPanel.getHeight() - panel.getHeight() - 76) / 2);
		this.repaint();
	}

	public void updateUsersJTable() {
		List<LabReport> l = new ArrayList<LabReport>();
		String host = "mail.technolabs.in";
		String user = "ltclabreports@technolabs.in";
		String password = "medrex";

		try {
			List mails = ReadAttachment.getMails(host, user, password);
			Iterator<String> i = mails.iterator();
			while (i.hasNext()) {
				l.add(LabReportParser.getLabResults(i.next()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		usersRecordJTable.setNewList(l);
		usersRecordJTable.fireTableStructureChanged();
		table.updateUI();
		table.repaint();
	}

	public void fillCombos() {

	}

}

class LabReportsMailsJTable extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = { "Resident Name ", "Resident Id",
			"Lab Report Type" };

	public List<LabReport> l;

	int n = 0;

	LabReportsMailsJTable(List ls) {
		l = ls;
	}

	LabReportsMailsJTable() {
		l = new ArrayList<LabReport>();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return (l.size());
	}

	public void setRowCount(int count) {
		n = n + count;
	}

	public void setNewList(List<LabReport> ls) {
		l = ls;
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		try {
			LabReport rec = l.get(row);
			switch (col) {
			case 0:
				return rec.getPatientLastName() + ", "
						+ rec.getPatientFirstName();
			case 1:
				return rec.getPatientId() + "";
			case 2:
				return rec.getType() + "";
			case 3:
				return rec;
			default:
				return ("");
			}
		} catch (Exception e) {
			return ("");
		}

	}
}

class ReadAttachment {

	public static List<String> getMails(String host, String user,
			String password) throws NoSuchProviderException,
			MessagingException, IOException {
		// public static void main(String args[]) throws Exception {
		// String host = "mail.technolabs.in";
		// String user = "ltclabreports@technolabs.in";
		// String password = "medrex";

		// Get system properties
		Properties properties = System.getProperties();

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);

		// Get a Store object that implements the specified protocol.
		Store store = session.getStore("pop3");

		// Connect to the current host using the specified username and
		// password.
		store.connect(host, user, password);

		// System.out.println("connected");
		// Create a Folder object corresponding to the given name.
		Folder folder = store.getFolder("inbox");

		// Open the Folder.
		folder.open(Folder.READ_WRITE);

		Message[] message = folder.getMessages();
		List<String> mailAttachments = new ArrayList<String>();
		for (int a = 0; a < message.length; a++) {
			// System.out.println("-------------" + (a + 1) + "-----------");
			// System.out.println(message[a].getSentDate());

			Multipart multipart = (Multipart) message[a].getContent();
			// System.out.println(multipart.getCount());
			// System.out.println("-----"+multipart.getCount());
			for (int i = 0; i < multipart.getCount(); i++) {
				// System.out.println(i);
				// System.out.println(multipart.getContentType());
				BodyPart bodyPart = multipart.getBodyPart(i);
				InputStream stream = bodyPart.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(
						stream));
				String content = "";
				while (br.ready()) {
					content = content + br.readLine();
					content = content + "\n";
				}
				// System.out.println("Content is: ------------- \n\n" +
				// content);
				// JOptionPane.showMessageDialog(null,content);
				// message[a].setFlag(Flags.Flag.DELETED, true);
				if (content.contains("c_reportStandard")) {
					mailAttachments.add(content);
				}
			}
		}

		folder.close(true);
		store.close();
		return mailAttachments;
	}
}

class LabReportParser {
	// public static final String filePath =
	// "C:\\Documents and Settings\\Nikhil\\My Documents\\My Dev\\Ltc_LabReportParser\\doc\\sample2.htm";

	/*
	 * public static void main(String[] args) { LabReport report = null; report
	 * = LabReportParser.getLabResults(filePath);
	 * 
	 * PanelLabReport panelLabReport = new PanelLabReport(report);
	 * 
	 * JFrame f = new JFrame(); f.setSize(820, 500);
	 * f.getContentPane().add(panelLabReport);
	 * f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	 * f.setVisible(true); }
	 */

	private static TableTag[] getTables(NodeList list) {
		TableTag[] tableArr = new TableTag[list.size()];
		list.copyToNodeArray(tableArr);
		return tableArr;
	}

	/*
	 * public static void printTables(TableTag[] tables) { for(int tIndex = 0;
	 * tIndex < tables.length; tIndex++) { TableRow[] rows =
	 * tables[0].getRows(); for(int rIndex = 0; rIndex < rows.length; rIndex++)
	 * { TableColumn[] cols = rows[rIndex].getColumns(); for(int cIndex = 0;
	 * cIndex < cols.length; cIndex++) { Node[] children =
	 * cols[cIndex].getChildrenAsNodeArray(); for(int i = 0; i <
	 * children.length; i++) {
	 * System.out.print(children[i].toPlainTextString().replaceAll("[\t\n]",
	 * "").trim()); } System.out.print(" | "); } System.out.println(); }
	 * System.out.print("\n "); //---------------------------------------------
	 * \n"); } }
	 * 
	 * public static void printPage(final NodeList nodeList) { for(Node tag :
	 * nodeList.toNodeArray()) { if(tag.getChildren() != null) {
	 * System.out.println(tag.getText()); if(tag.getChildren().size() > 0)
	 * printPage(tag.getChildren()); } } }
	 */
	public static LabReport getLabResults(String htmlContent) {
		final LabReport report = new LabReport();
		Parser htmlParser = null;
		NodeList tableNodes = null;
		TableTag[] tables = null;
		try {
			Page p = new Page(htmlContent);

			htmlParser = new Parser(new Lexer(p));
			// htmlParser.setResource(filePath);
			// htmlParser.setInputHTML(htmlContent);

			// htmlParser.main(new String[] {filePath, "table"});
			tableNodes = htmlParser.parse(new TagNameFilter("table"));
			// System.out.println("Table Node Size: " + tableNodes.size());
			tables = getTables(tableNodes);
			// printPage(tables);
		} catch (Exception e) {
			e.printStackTrace();
		}

		populatePatientInfo(report, tables);
		// System.out.println(report.getPatientLastName() + ", " +
		// report.getPatientFirstName());
		// System.out.println(report.getPatientId());

		populateReportType(report, tables);
		// System.out.println(report.getType());

		populateTestResults(report, tables);
		// System.out.println(report.getType());

		return report;
	}

	private static void populatePatientInfo(final LabReport report,
			TableTag[] tables) {
		TableRow[] rows = tables[5].getRows();
		for (int rIndex = 0; rIndex < rows.length; rIndex++) {
			TableColumn[] cols = rows[rIndex].getColumns();
			for (int cIndex = 0; cIndex < cols.length; cIndex++) {
				String temp = cols[cIndex].toPlainTextString().replaceAll(
						"[\t\n]", "").trim();
				// System.out.println(temp);
				if (temp.contains("PATIENT:")) {
					String name = cols[cIndex + 1].toPlainTextString()
							.replaceAll("[\t\n]", "").trim();
					// System.out.println("Name: " + name);
					String[] nameArr = name.split(",");
					report.setPatientFirstName(nameArr[1]);
					report.setPatientLastName(nameArr[0]);
				}
				if (temp.contains("PATIENT ID:")) {
					String id = cols[cIndex + 1].toPlainTextString()
							.replaceAll("[\t\n]", "").trim();
					report.setPatientId(Integer.parseInt(id));
				}
			}
		}
	}

	private static void populateReportType(final LabReport report,
			TableTag[] tables) {
		// for(int tIndex = 0; tIndex < tables.length; tIndex++) {
		TableRow[] rows = tables[12].getRows();
		for (int rIndex = 1; rIndex < rows.length; rIndex++) {
			TableColumn[] cols = rows[rIndex].getColumns();
			// for(int cIndex = 0; cIndex < cols.length; cIndex++) {
			// Node[] children = cols[cIndex].getChildrenAsNodeArray();
			// for(int i = 0; i < children.length; i++) {
			String temp = cols[0].toPlainTextString().replaceAll("[\t\n]", "")
					.trim();
			// System.out.println(temp);
			report.setType(temp);
			// }
			// }
		}
		// }
	}

	private static void populateTestResults(final LabReport report,
			TableTag[] tables) {
		int resCounter = 0;
		List<LabReportTest> reportTests = new ArrayList<LabReportTest>();

		TableRow[] rows = tables[16].getRows();
		for (int rIndex = 1; rIndex < rows.length; rIndex++) {
			LabReportTest tempTest = new LabReportTest();
			TableColumn[] cols = rows[rIndex].getColumns();
			// name
			String temp = cols[0].toPlainTextString().replaceAll("[\t\n]", "")
					.trim();
			tempTest.setName(temp);
			// System.out.println(temp);

			// result
			temp = cols[1].toPlainTextString().replaceAll("[\t\n]", "").trim();
			if (temp.equalsIgnoreCase("")) {
				TableRow[] tempRows = tables[16 + ++resCounter].getRows();
				TableColumn[] tempCols = tempRows[0].getColumns();
				// System.out.print("Len: " + tempCols.length + ", ");
				String temp2 = tempCols[0].toPlainTextString().replaceAll(
						"[\t\n]", "").trim();
				tempTest.setResult(temp2);
				temp2 = tempCols[2].toPlainTextString()
						.replaceAll("[\t\n]", "").trim();
				tempTest.setOutOfRange(temp2);
			} else {
				tempTest.setResult(temp);
				tempTest.setOutOfRange("N");
			}
			// System.out.println(tempTest.getResult() + ", " +
			// tempTest.getOutOfRange());

			// units
			temp = cols[3].toPlainTextString().replaceAll("[\t\n]", "").trim();
			tempTest.setUnit(temp);
			// System.out.println(temp);

			// range
			temp = cols[4].toPlainTextString().replaceAll("[\t\n]", "").trim();
			temp = temp.replaceAll("&gt;", ">");
			temp = temp.replaceAll("&lt;", "<");
			tempTest.setRange(temp);
			// System.out.println(temp);

			reportTests.add(tempTest);
		}
		report.setTestResults(reportTests);
	}
}