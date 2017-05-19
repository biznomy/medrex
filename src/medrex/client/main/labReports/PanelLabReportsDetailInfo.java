package medrex.client.main.labReports;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.GuiModes;
import medrex.commons.vo.reports.Report;

import com.sX.swing.JxTable;

public class PanelLabReportsDetailInfo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1783274940447460731L;
	private JLabel reportDate;
	private JEditorPane reportText;
	private JTextField txtReportType;
	private JTextField txtResidentName;
	private JLabel labReportLabel;
	private JPanel panel;
	private JxTable table;
	private JScrollPane scrollPane;

	int serial = 0;

	public PanelLabReportsDetailInfo(int serial) {
		super();
		setBackground(Color.WHITE);
		this.serial = serial;
		setPreferredSize(new Dimension(900, 600));
		setLayout(null);
		setSize(900, 600);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 900, 600);
		add(panel);

		labReportLabel = new JLabel();
		labReportLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		labReportLabel.setFont(new Font("", Font.BOLD, 16));
		labReportLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labReportLabel.setText("LAB REPORT");
		labReportLabel.setBounds(10, 10, 717, 33);
		panel.add(labReportLabel);

		txtResidentName = new JTextField();
		txtResidentName.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtResidentName.setBounds(118, 75, 199, 21);
		panel.add(txtResidentName);

		final JLabel residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		residentNameLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		residentNameLabel_1.setText("Resident Name:");
		residentNameLabel_1.setBounds(10, 75, 102, 14);
		panel.add(residentNameLabel_1);

		txtReportType = new JTextField();
		txtReportType.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		txtReportType.setBounds(118, 110, 199, 21);
		panel.add(txtReportType);

		final JLabel reportTypeLabel = new JLabel();
		reportTypeLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		reportTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		reportTypeLabel.setText("Report Type:");
		reportTypeLabel.setBounds(10, 110, 102, 14);
		panel.add(reportTypeLabel);

		final JLabel reportTextLabel = new JLabel();
		reportTextLabel.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		reportTextLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		reportTextLabel.setText("Report Text:");
		reportTextLabel.setBounds(10, 144, 83, 16);
		panel.add(reportTextLabel);

		final JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(118, 144, 780, 450);
		panel.add(scrollPane_1);

		reportText = new JTextPane();
		reportText.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		reportText.setContentType("text/html");
		reportText.setEditable(false);
		scrollPane_1.setViewportView(reportText);

		final JLabel label = new JLabel();
		label
				.setForeground(GuiModes.DESIGNER_FORMS
						.getDefaultForegroundColor());
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setText("Report Date: ");
		label.setBounds(340, 77, 83, 16);
		panel.add(label);

		reportDate = new JLabel();
		reportDate.setForeground(GuiModes.DESIGNER_FORMS
				.getDefaultForegroundColor());
		reportDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		reportDate.setBounds(416, 78, 149, 18);
		panel.add(reportDate);

		updatePanel();

	}

	public void updatePanel() {
		Report rep = null;
		try {
			rep = MedrexClientManager.getInstance().getLabReports(serial);
			rep.setNew(false);
			MedrexClientManager.getInstance().insertOrUpdatedLabReportText(rep);

		} catch (Exception e) {

		}
		// System.out.println("vinod: "+rep.getLabReportText());
		txtResidentName.setText(rep.getLastName() + ", " + rep.getFirstName()
				+ "");
		txtReportType.setText(rep.getReportTitle() + "");
		Date date = rep.getReportDate();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		reportDate.setText(dateFormat.format(date) + "");
		String str = rep.getLabReportText().replaceAll(
				"<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\"",
				"<table border=\"1\"  cellspacing=\"0\" cellpadding=\"0\"");
		reportText.setText("<html>" + str);

	}

}
