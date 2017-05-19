package medrex.client.test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import medrex.client.PanelImage;

import com.sX.swing.JxButton;

public class FormAddDialog extends JDialog {

	private JScrollPane scroll;
	private JPanel residentInfoPanel;
	private Pager pagerPanel;
	private JxButton btnPrint;
	private JxButton btnCancel;
	private JxButton btnSave;
	private JxButton btnAction02;
	private JxButton btnAction01;
	private JPanel mainPanel;
	private JPanel headerPanel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			FormAddDialog dialog = new FormAddDialog();
			dialog.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog
	 */
	public FormAddDialog() {
		super();
		setResizable(false);
		setTitle("Medrex");
		// setSize(new
		// Dimension(Toolkit.getDefaultToolkit().getScreenSize().width,
		// Toolkit.getDefaultToolkit().getScreenSize().height -50 ));
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(1024, 768);
		setModal(true);

		headerPanel = new JPanel();
		headerPanel.setOpaque(false);
		headerPanel.setLayout(null);
		headerPanel.setPreferredSize(new Dimension(0, 120));
		getContentPane().add(headerPanel, BorderLayout.NORTH);

		mainPanel = new JPanel();
		mainPanel.setOpaque(false);
		mainPanel.setLayout(new BorderLayout());
		getContentPane().add(mainPanel, BorderLayout.CENTER);

		scroll = new JScrollPane();
		scroll.setOpaque(false);
		scroll.getViewport().setOpaque(false);
		mainPanel.add(scroll, BorderLayout.CENTER);

		btnSave = new JxButton(0.4f);
		btnSave.setForeground(Pager.DEFAULT_FORE);
		btnSave.setBackground(Pager.DEFAULT_BACK);
		btnSave.setBorder(Pager.DEFAULT_BORDER);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});

		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setText("Save");
		btnSave.setBounds(10, 10, 106, 26);
		headerPanel.add(btnSave);

		btnCancel = new JxButton(0.4f);
		btnCancel.setForeground(Pager.DEFAULT_FORE);
		btnCancel.setBackground(Pager.DEFAULT_BACK);
		btnCancel.setBorder(Pager.DEFAULT_BORDER);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				FormAddDialog.this.dispose();
			}
		});
		btnCancel.setFont(new Font("", Font.BOLD, 12));
		btnCancel.setText("Cancel");
		btnCancel.setBounds(234, 10, 106, 26);
		headerPanel.add(btnCancel);

		btnPrint = new JxButton(0.4f);
		btnPrint.setForeground(Pager.DEFAULT_FORE);
		btnPrint.setBackground(Pager.DEFAULT_BACK);
		btnPrint.setBorder(Pager.DEFAULT_BORDER);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
			}
		});
		btnPrint.setFont(new Font("", Font.BOLD, 12));
		btnPrint.setText("Cancel");
		btnPrint.setBounds(122, 10, 106, 26);
		headerPanel.add(btnPrint);

		pagerPanel = new Pager();
		pagerPanel.setOpaque(false);
		pagerPanel.setBounds(10, 84, 848, 26);
		headerPanel.add(pagerPanel);

		residentInfoPanel = new JPanel();
		residentInfoPanel.setLayout(null);
		residentInfoPanel.setBounds(708, 10, 300, 100);
		headerPanel.add(residentInfoPanel);

		final PanelImage panelImg = new PanelImage();
		panelImg.setCurvedView(true);
		panelImg.setArc(0.6f);
		panelImg.setForeground(Pager.DEFAULT_FORE);
		panelImg.setBackground(Pager.DEFAULT_BACK);
		panelImg.setBorder(Pager.DEFAULT_BORDER);
		panelImg.setBounds(0, 0, 100, 100);
		residentInfoPanel.add(panelImg);

		final JLabel lblResidentName = new JLabel();
		lblResidentName.setBounds(106, 0, 264, 89);
		residentInfoPanel.add(lblResidentName);

		final JLabel lblResidentSubInfo = new JLabel();
		lblResidentSubInfo.setBounds(106, 95, 264, 35);
		residentInfoPanel.add(lblResidentSubInfo);

		btnAction01 = new JxButton();
		btnAction01.setForeground(Pager.DEFAULT_FORE);
		btnAction01.setBackground(Pager.DEFAULT_BACK);
		btnAction01.setBorder(Pager.DEFAULT_BORDER);
		btnAction01.setText("Cancel");
		btnAction01.setBounds(640, 10, 106, 26);
		headerPanel.add(btnAction01);

		btnAction02 = new JxButton();
		btnAction02.setForeground(Pager.DEFAULT_FORE);
		btnAction02.setBackground(Pager.DEFAULT_BACK);
		btnAction02.setBorder(Pager.DEFAULT_BORDER);
		btnAction02.setText("Cancel");
		btnAction02.setBounds(752, 10, 106, 26);
		headerPanel.add(btnAction02);
	}
}
