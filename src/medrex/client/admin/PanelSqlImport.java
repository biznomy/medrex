package medrex.client.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.DefaultCaret;

import medrex.client.loading.FrameLoading;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;

public class PanelSqlImport extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2530284734043167525L;
	JButton importButton;
	FrameLoading fl;

	PanelSqlImport() {
		setBackground(Color.WHITE);
		setSize(750, 450);
		setLayout(null);

		final JTextArea a = new JTextArea(10, 10);
		a.setForeground(GuiModes.DESIGNER_SCREEN.getControlForegroundColor());
		a.setAutoscrolls(true);
		a.setBounds(50, 158, 600, 149);
		a.setBorder(new LineBorder(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor()));
		DefaultCaret caret = (DefaultCaret) a.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

		add(a);

		final JTextField txtPath = new JTextField();
		txtPath.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		txtPath.setBounds(115, 114, 535, 20);
		txtPath.setText("d:\\wamp\\bin\\mysql\\mysql5.1.36\\bin\\mysql.exe");
		add(txtPath);

		fl = new FrameLoading("Loading");
		fl.setTitle("Loading Acuities Details");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				fl.callNotify();
			}
		});

		importButton = new JButton("Import");
		importButton.setBounds(50, 318, 600, 36);
		importButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

				new Thread(new Runnable() {
					public void run() {
						int i = 0;
						boolean flag = true;
						String temp;
						try {
							final String[] command = new String[8];
							command[0] = "cmd";
							command[1] = "/C";
							command[2] = txtPath.getText();
							command[3] = "-u";
							command[4] = "root";
							command[5] = "-pltc";
							command[6] = "ltc<C:\\medrexstandalone\\medrexclient\\bin\\data\\sql\\medrex.sql";
							command[7] = "-v";

							Date sd = new Date();

							//						
							Process p = Runtime.getRuntime().exec(command);
							BufferedReader stdInput = new BufferedReader(
									new InputStreamReader(p.getInputStream()));

							BufferedReader stdError = new BufferedReader(
									new InputStreamReader(p.getErrorStream()));

							// read the output from the command

							String s = null;
							System.out
									.println("Here is the standard output of the command:\n");
							while ((s = stdInput.readLine()) != null) {

								temp = "";
								System.out.println(s);
								temp = temp + s;
								a.setAutoscrolls(true);
								a.setWrapStyleWord(true);
								a.setLineWrap(true);
								if (i == 40) {
									a.setText(temp);
									a.setCaretPosition(a.getDocument()
											.getLength());
									temp = "";
									i = 0;
								}
								i++;

							}
							// read any errors from the attempted command
							System.out
									.println("Here is the standard error of the command (if any):\n");
							while ((s = stdError.readLine()) != null) {
								flag = false;
								System.out.println(s);
							}
							Date se = new Date();
							System.out.println("Total Time "
									+ (se.getTime() - sd.getTime()));

						} catch (Exception ee) {
							ee.printStackTrace();

						}

						fl.dispose();
						if (flag) {
							JOptionPane
									.showMessageDialog(null,
											"Database imported successfully. Please restart application now");
							System.exit(0);
						} else {
							JOptionPane
									.showMessageDialog(null,
											"Database import failed. Please check mysql path and sql file");
						}
					}
				}).start();

				try {
					if (!fl.isVisible())
						fl.setVisible(true);
				} catch (Exception ee) {

				}
			}
		});
		add(importButton, BorderLayout.NORTH);

		JLabel lblImportOfDatabase = new JLabel(
				"<html><bold>Import of database is time consuming process. <br>Please wait for few minutes after clicking import.<br> It may take up from 2-10 minutes, depending upon data.</bold></html>");
		lblImportOfDatabase.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblImportOfDatabase.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblImportOfDatabase.setBounds(50, 23, 600, 49);
		add(lblImportOfDatabase);

		JLabel lblMysqlPath = new JLabel("Mysql Path");
		lblMysqlPath.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		lblMysqlPath.setBounds(50, 117, 82, 14);
		add(lblMysqlPath);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(750, 450);
		f.getContentPane().setSize(740, 450);
		f.getContentPane().add(new PanelSqlImport());
		f.setVisible(true);

		// try {
		// String line;
		//
		// String command =
		// "cmd D:\\wamp\\bin\\mysql\\mysql5.1.36\\bin\\mysql.exe";
		// Process p = Runtime.getRuntime().exec(command);
		// BufferedReader input =
		// new BufferedReader
		// (new InputStreamReader(p.getInputStream()));
		// while ((line = input.readLine()) != null) {
		// System.out.println(line);
		// }
		// input.close();
		// }
		// catch (Exception err) {
		// err.printStackTrace();
		// }

		// C:\Users\admin>D:\\wamp\\bin\\mysql\\mysql5.1.36\\bin\\mysql.exe -u
		// root -pltc ltc<C:\\Users\\admin\\Desktop\\097.sql -v
		//		

	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Medrex Database Import";
	}
}
