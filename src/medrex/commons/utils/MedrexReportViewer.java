package medrex.commons.utils;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.swing.JRViewerToolbar;

public class MedrexReportViewer extends JRViewer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7837571901532342659L;
	private String exportDataFile;

	public MedrexReportViewer(JasperPrint jrPrint) {
		super(jrPrint);

		Component[] components = this.getComponents();
		JRViewerToolbar toolbar = (JRViewerToolbar) components[0];
		JButton btnSave = (JButton) toolbar.getComponents()[0];
		removeListeners(btnSave);
		// toolbar.remove(btnSave);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doExport();
			}
		});

	}

	private void removeListeners(JButton com) {
		ActionListener listeners[] = com.getActionListeners();
		for (ActionListener l : listeners) {
			com.removeActionListener(l);
		}
	}

	public void doExport() {
		final JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(this);
		new File(fc.getSelectedFile() + "/");
		System.out.println("hello");
		// if (returnVal == JFileChooser.APPROVE_OPTION) {
		try {
			JRPdfExporter pdfExporter = new JRPdfExporter();
			if (getExportDataFile() != null) {
				JasperPrint jasperPrint = (JasperPrint) JRLoader
						.loadObject(getExportDataFile());
				pdfExporter.setParameter(JRExporterParameter.JASPER_PRINT,
						jasperPrint);
				// System.out.println(fc.getSelectedFile().getAbsolutePath());
				pdfExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
						fc.getSelectedFile() + ".pdf");
				System.out.println("Exporting report...");
				pdfExporter.exportReport();
			}
		} catch (JRException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// }
	}

	public static void main(String args[]) {
		try {
			new MedrexReportViewer((JasperPrint) JRLoader
					.loadObject("report//report name.jrprint"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getExportDataFile() {
		return exportDataFile;
	}

	public void setExportDataFile(String exportDataFile) {
		this.exportDataFile = exportDataFile;
	}
}
