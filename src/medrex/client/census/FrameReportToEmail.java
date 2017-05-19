package medrex.client.census;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.loading.FrameLoading;
import medrex.client.utils.SwingUtils;
import medrex.commons.vo.admission.ResidentAssessmentFormPage1;
import medrex.commons.vo.census.CensusStatus;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.providers.ProvidersRecord;
import medrex.commons.vo.providers.ProvidersRecordForm;
import medrex.commons.vo.providers.ProvidersReport;
import medrex.commons.vo.resident.DiagnosisReport;
import medrex.commons.vo.resident.DoctorsReport;
import medrex.commons.vo.resident.PayerInfoReport;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.ResidentPayerNew;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import com.sX.swing.JxButton;

public class FrameReportToEmail extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3470463293010125721L;
	private JTextField txtSubject;
	private JTextField txtTo;
	private static final Color DEF_COLOR = new Color(49, 104, 127);
	private ResidentMain res;
	private JTextArea txtAreaContent;

	public FrameReportToEmail(ResidentMain res) {
		super();
		setModal(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		SwingUtils.center(this);
		this.res = res;
		setSize(new Dimension(430, 370));
		getContentPane().setLayout(null);
		setTitle("Report To E-mail");

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 424, 341);
		getContentPane().add(panel);

		final JLabel toLabel = new JLabel();
		toLabel.setForeground(DEF_COLOR);
		toLabel.setHorizontalAlignment(SwingConstants.LEFT);
		toLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		toLabel.setText("To:");
		toLabel.setBounds(10, 5, 54, 23);
		panel.add(toLabel);

		txtTo = new JTextField();
		txtTo.setForeground(DEF_COLOR);
		txtTo.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtTo.setBounds(95, 6, 319, 21);
		panel.add(txtTo);

		final JLabel subjectLabel = new JLabel();
		subjectLabel.setForeground(DEF_COLOR);
		subjectLabel.setHorizontalAlignment(SwingConstants.LEFT);
		subjectLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		subjectLabel.setText("Subject:");
		subjectLabel.setBounds(10, 46, 81, 23);
		panel.add(subjectLabel);

		txtSubject = new JTextField();
		txtSubject.setForeground(DEF_COLOR);
		txtSubject.setBorder(new LineBorder(DEF_COLOR, 1, false));
		txtSubject.setBounds(95, 45, 317, 21);
		panel.add(txtSubject);

		final JLabel contentLabel = new JLabel();
		contentLabel.setForeground(DEF_COLOR);
		contentLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentLabel.setText("Content:");
		contentLabel.setBounds(10, 86, 79, 23);
		panel.add(contentLabel);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(DEF_COLOR);
		scrollPane.setBounds(95, 86, 319, 206);
		panel.add(scrollPane);

		txtAreaContent = new JTextArea();
		txtAreaContent.setForeground(DEF_COLOR);
		scrollPane.setViewportView(txtAreaContent);
		txtAreaContent.setBorder(new LineBorder(DEF_COLOR, 1, false));

		final JxButton button = new JxButton();
		button.addActionListener(new ActionListener() {
			private FrameLoading fl;

			public void actionPerformed(final ActionEvent e) {
				fl = new FrameLoading("Sending Report");
				fl.setTitle("Sending...");
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						fl.callNotify();
					}
				});
				new Thread(new Runnable() {
					public void run() {
						reportToEmail();
						dispose();
						fl.dispose();
					}
				}).start();
				fl.setVisible(true);
			}
		});

		button.setBorder(new LineBorder(new Color(180, 188, 193), 1, false));
		button.setBackground(Color.WHITE);
		button.setArc(0.4f);
		button.setForeground(DEF_COLOR);
		button.setFont(new Font("", Font.BOLD, 12));
		button.setText("Send");
		button.setBounds(323, 298, 91, 33);
		panel.add(button);

		doUpdateText();
		doReportInPdf();
	}

	private void reportToEmail() {
		String toAdd = txtTo.getText();
		if (!toAdd.equalsIgnoreCase("")) {
			String server = "mail.technolabs.in";
			String from = "ltclabreports@technolabs.in";
			String to = toAdd;
			String subject = txtSubject.getText();
			String message = txtAreaContent.getText();
			String[] filenames = { res.getUserPass() + res.getUserName()
					+ "report" + ".pdf" };

			try {
				sendMail(server, from, to, subject, message, filenames);
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(this, "Please Enter email address",
					"E-mail Address", JOptionPane.WARNING_MESSAGE);
		}
	}

	public void sendMail(String mailServer, String from, String to,
			String subject, String messageBody, String[] attachments)
			throws MessagingException, AddressException {
		// Setup mail server
		Properties props = System.getProperties();
		props.put("mail.smtp.host", mailServer);

		// Get a mail session
		Session session = Session.getDefaultInstance(props, null);

		// Define a new mail message
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));

		ArrayList recipientsArray = new ArrayList();
		StringTokenizer st = new StringTokenizer(to, ",");
		while (st.hasMoreTokens()) {
			recipientsArray.add(st.nextToken());
		}
		int sizeTo = recipientsArray.size();
		InternetAddress[] addressTo = new InternetAddress[sizeTo];
		for (int i = 0; i < sizeTo; i++) {
			addressTo[i] = new InternetAddress(recipientsArray.get(i)
					.toString());
		}

		message.addRecipients(Message.RecipientType.TO, addressTo);
		message.setSubject(subject);

		// Create a message part to represent the body text
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setText(messageBody);

		// use a MimeMultipart as we need to handle the file attachments
		Multipart multipart = new MimeMultipart();

		// add the message body to the mime message
		multipart.addBodyPart(messageBodyPart);

		// add any file attachments to the message
		addAtachments(attachments, multipart);

		// Put all message parts in the message
		message.setContent(multipart);

		// Send the message
		Transport.send(message);

	}

	public void addAtachments(String[] attachments, Multipart multipart)
			throws MessagingException, AddressException {
		for (int i = 0; i <= attachments.length - 1; i++) {
			String filename = attachments[i];
			MimeBodyPart attachmentBodyPart = new MimeBodyPart();

			// use a JAF FileDataSource as it does MIME type detection
			DataSource source = new FileDataSource(filename);
			attachmentBodyPart.setDataHandler(new DataHandler(source));

			// assume that the filename you want to send is the same as the
			// actual file name - could alter this to remove the file path
			attachmentBodyPart.setFileName(filename);

			// add the attachment
			multipart.addBodyPart(attachmentBodyPart);
		}
	}

	private void doReportInPdf() {
		try {
			// for last Admisstion
			CensusStatus censusStatus = MedrexClientManager.getInstance()
					.getCensusLastAdmission(res.getSerial());

			// for ORIGINAL Admisstion or first time admission
			CensusStatus cenStatus = MedrexClientManager.getInstance()
					.getCensusOriginalAdmission(res.getSerial());

			// for getting last allergies
			ResidentAssessmentFormPage1 residentAssessmentFormPage1 = MedrexClientManager
					.getInstance().getResidentAllergies(res.getSerial());

			List<ResidentPayerNew> tempResidentPayerList = MedrexClientManager
					.getInstance().getResidentPayersNew(res.getSerial());
			List<PayerInfoReport> payerInfoReportList = new ArrayList<PayerInfoReport>();
			if (tempResidentPayerList != null) {
				SimpleDateFormat df = new SimpleDateFormat();
				df.applyPattern("MMM dd, yyyy");

				for (ResidentPayerNew residentPayerNew : tempResidentPayerList) {
					PayerInfoReport payerInfoReport = new PayerInfoReport();
					payerInfoReport
							.setType(residentPayerNew.getInsuranceType());
					payerInfoReport.setStartDate(df.format(residentPayerNew
							.getDateStart()));
					payerInfoReport.setEndDate(df.format(residentPayerNew
							.getEndDate()));
					payerInfoReportList.add(payerInfoReport);
				}
			}

			List<PhysicianForm> phyList = MedrexClientManager.getInstance()
					.getPhysicianForms(res.getSerial());
			List<DoctorsReport> doctorReportList = new ArrayList<DoctorsReport>();
			if (phyList != null) {
				for (PhysicianForm phyForm : phyList) {
					DoctorsReport doctorsReport = new DoctorsReport();
					Doctors d = phyForm.getPhysician();// MedrexClientManager.getInstance().getDoctorsRecord(phyForm.getPhysicianId());
					if (d.getPhysicianName().contains("Dr.")) {
						doctorsReport.setDoctors(d.getPhysicianName() + ","
								+ d.getPhysicianSurName() + ", ");
						doctorsReport.setPhoneNumber(d.getPhoneNumber());
						doctorsReport.setDoctorType(d.getDoctorType()
								.toString());

					} else {
						doctorsReport.setDoctors("Dr. " + d.getPhysicianName()
								+ "," + d.getPhysicianSurName() + ", ");
						doctorsReport.setPhoneNumber(d.getPhoneNumber());
						doctorsReport.setDoctorType(d.getDoctorType()
								.toString());
					}
					doctorReportList.add(doctorsReport);
				}
			}

			List<ProvidersRecord> prList = MedrexClientManager.getInstance()
					.getProvidersRecords(res.getSerial());
			List<ProvidersReport> providersReportList = new ArrayList<ProvidersReport>();
			if (prList != null) {
				for (ProvidersRecord providersRecord : prList) {
					ProvidersRecordForm prForm = MedrexClientManager
							.getInstance().getProvidersRecordForm(
									providersRecord.getProvider().getSerial());
					if (prForm != null) {
						ProvidersReport providersReport = new ProvidersReport();
						providersReport.setProviders(prForm
								.getProviderSurName()
								+ ", " + prForm.getProviderName());
						providersReport.setPhoneNumber(prForm.getPhoneNumber());
						providersReport.setProviderType(prForm
								.getProviderType().toString());
						providersReportList.add(providersReport);
					}
				}
			}

			List<ResidentDiagnosis> listDiagnosis = MedrexClientManager
					.getInstance().getResidentDiagnosiss(res.getSerial());
			List<DiagnosisReport> diagnosisReportList = new ArrayList<DiagnosisReport>();
			if (listDiagnosis != null) {
				for (ResidentDiagnosis resDiag : listDiagnosis) {
					DiagnosisReport diagnosisReport = new DiagnosisReport();
					diagnosisReport.setDiagnosis(resDiag.getName());
					diagnosisReport.setOrder(resDiag.getOrder() + "");
					diagnosisReportList.add(diagnosisReport);
				}
			}

			JRBeanArrayDataSource payerInfoDataSource;
			Object[] payerInfoReportRows = payerInfoReportList.toArray();
			payerInfoDataSource = new JRBeanArrayDataSource(payerInfoReportRows);

			JRBeanArrayDataSource doctorsDataSource;
			Object[] doctorsRows = doctorReportList.toArray();
			doctorsDataSource = new JRBeanArrayDataSource(doctorsRows);

			JRBeanArrayDataSource providersDataSource;
			Object[] providersRows = providersReportList.toArray();
			providersDataSource = new JRBeanArrayDataSource(providersRows);

			JRBeanArrayDataSource diagnosisDataSource;
			Object[] diagnosisRows = diagnosisReportList.toArray();
			diagnosisDataSource = new JRBeanArrayDataSource(diagnosisRows);

			SimpleDateFormat df = new SimpleDateFormat();
			df.applyPattern("MMM dd, yyyy  hh:mm a");

			Map parameters = new HashMap();
			parameters.put("firstName", res.getUserName());
			parameters.put("lastName", res.getUserPass());
			SimpleDateFormat df1 = new SimpleDateFormat();
			df1.applyPattern("MMM dd, yyyy");
			String dobdate = df1.format(res.getDob());
			parameters.put("dob", dobdate);
			parameters.put("address", res.getAddress());
			parameters.put("phoneNumber", res.getHome() + ", " + res.getWork()
					+ ", " + res.getCell());

			if (cenStatus != null) {
				String originaladmissiondate = df.format(cenStatus
						.getDateAndTime());
				parameters.put("originalAdmission", originaladmissiondate);
			}

			if (censusStatus != null) {
				String lastAdmissiondate = df.format(censusStatus
						.getDateAndTime());
				parameters.put("lastAdmission", lastAdmissiondate);
			}

			if (residentAssessmentFormPage1 != null) {
				parameters.put("allergies", residentAssessmentFormPage1
						.getAllergies());
			}
			if (payerInfoDataSource != null) {
				parameters.put("payerInfoDataSource", payerInfoDataSource);
			}
			if (doctorsDataSource != null) {
				parameters.put("doctorsDataSource", doctorsDataSource);
			}
			if (providersDataSource != null) {
				parameters.put("providersDataSource", providersDataSource);
			}
			if (diagnosisDataSource != null) {
				parameters.put("diagnosisDataSource", diagnosisDataSource);
			}
			JRPdfExporter pdfExporter = new JRPdfExporter();
			JasperFillManager.fillReportToFile(
					"report//resident//residentReports.jasper", parameters,
					new JREmptyDataSource());

			JasperPrint jasperPrint = (JasperPrint) JRLoader
					.loadObject("report//resident//report name.jrprint");
			pdfExporter.setParameter(JRExporterParameter.JASPER_PRINT,
					jasperPrint);

			// System.out.println(fc.getSelectedFile().getAbsolutePath());
			pdfExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, res
					.getUserPass()
					+ res.getUserName() + "report" + ".pdf");
			// System.out.println("Exporting report...");
			pdfExporter.exportReport();
			// System.out.println("Exported report...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doUpdateText() {
		txtSubject.setText(res.getUserPass() + ", " + res.getUserName()
				+ " Report");
		txtAreaContent.setText(res.getUserPass() + ", " + res.getUserName()
				+ " Report");
	}

}
