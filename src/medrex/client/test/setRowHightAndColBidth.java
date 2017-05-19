package medrex.client.test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class setRowHightAndColBidth {
	public static void main(String[] args) {
		new setRowHightAndColBidth();
	}

	public setRowHightAndColBidth() {
		JFrame frame = new JFrame("Creating JTable Component Example!");
		JPanel panel = new JPanel();
		String data[][] = {
				{
						"vinodaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
						"BCA", "A" }, { "Raju", "MCA", "b" },
				{ "Ranjan", "MBA", "c" }, { "Rinku", "BCA", "d" },
				{ "Rama anuj pathak tiwari", "PGDCA", "e" } };
		String col[] = { "Name", "Course", "Grade" };
		JTable table = new JTable(data, col);
		// first column width
		TableColumn column = table.getColumnModel().getColumn(0);
		column.setPreferredWidth(150);
		// set all rows height
		table.setRowHeight(20);
		// set specific row height
		table.setRowHeight(2, 50);
		// Select single cell
		table.setCellSelectionEnabled(true);
		panel.add(table, BorderLayout.CENTER);
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}