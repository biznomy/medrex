package medrex.client.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.loading.FrameLoading;

public class PanelTrial extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1607588493261760173L;
	JButton importButton;
	FrameLoading fl;

	PanelTrial() {
		setSize(800, 600);
		setLayout(new BorderLayout());

		final JTextArea a = new JTextArea(10, 10);
		a.setAutoscrolls(true);
		a.setSize(800, 400);

		JTextField abc = new JTextField();
		abc.setSize(50, 20);

		abc.setMargin(new Insets(0, 15, 0, 0));
		abc.setBorder(new LineBorder(Color.RED));
		abc.setText("LLLLLLLLLLLLLLLLLL");

		add(abc, BorderLayout.SOUTH);

		fl = new FrameLoading("Loading");
		fl.setTitle("Loading Acuities Details");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				fl.callNotify();
			}
		});

		importButton = new JButton("Import");
		importButton.setSize(200, 100);
		importButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {

			}
		});
		add(importButton, BorderLayout.NORTH);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.getContentPane().setSize(800, 600);
		f.getContentPane().add(new PanelTrial());
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

}
