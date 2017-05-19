package medrex.client.main.admission;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

class FrameAbnormality extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7019098358783517627L;
	private JPanel topPanel;
	private JList listbox;
	private Object[] selectedValues;
	private String[] listOfAbnormality = { "1.Pressure ulcer", "2.Skin tear",
			"3.Trauma/Laceration", "4.Burn", "5.Venous ulcer", "6.DM ulcer",
			"7.Arterial ulcer", "8.Ostomy", "9.Peg tube", "10.Surgical",
			"11.Rash", "12.Abrasion", "13.Bruise", "14.Hematoma", "15.Blister",
			"16.Maceration", "17.Other(describe)" };

	public Object[] getSelectedValues() {
		return selectedValues;
	}

	public void setSelectedValues(Object[] selectedValues) {

		this.selectedValues = selectedValues;
	}

	PanelResidentAssessmentFormPage3 panelResidentAssessmentFormPage3;

	public FrameAbnormality() {
		// Set the frame characteristics
		setTitle("Abnormality List");
		setSize(179, 400);
		setModal(true);
		setBackground(Color.gray);

		// Create a panel to hold all other components
		topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		topPanel.setLayout(null);
		topPanel.setPreferredSize(new Dimension(0, 0));
		getContentPane().add(topPanel);

		listbox = new JList(listOfAbnormality);
		listbox.setBounds(6, 1, 178, 323);
		listbox
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		topPanel.add(listbox);

		final JButton okButton = new JButton();
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSetVal();
				dispose();
			}
		});
		okButton.setText("Ok");
		okButton.setBounds(14, 329, 61, 26);
		topPanel.add(okButton);
	}

	public void doSetVal() {
		// ArrayList arrayList = new ArrayList();

		// System.out.println(""+ listbox.size());
		// arrayList = listbox.getSelectedValue();
		// setSelectedValues((String)listbox.getSelectedValue());
		setSelectedValues(listbox.getSelectedValues());
	}

	/*
	 * public static void main( String args[] ) { FrameAbnormality mainFrame =
	 * new FrameAbnormality(); mainFrame.setVisible( true ); }
	 */

	public void updateListValues() {
		Object objSelected[] = getSelectedValues();
		int[] indices = new int[20];
		int i = 0;
		for (Object o : objSelected) {
			String str[] = o.toString().split("\\.");
			indices[i] = Integer.parseInt(str[0]) - 1;
			i++;
		}
		listbox.clearSelection();
		listbox.setSelectedIndices(indices);

	}

	public void test() {
		String a[] = "4.Burn".split("\\.");
		System.out.println("content" + a[0]);
	}

	public static void main(String ar[]) {
		new FrameAbnormality().test();
	}
}
