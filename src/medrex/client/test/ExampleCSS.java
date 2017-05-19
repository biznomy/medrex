package medrex.client.test;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ExampleCSS {

	public static void main(String[] args) {
		String content = "<html>" + "<head>" + "<style type='text/css'>"
				+ ".hidden { display: none; }"
				+ ".invisible { visibility: hidden; }" + ".red { color: red; }"
				+ "</style>" + "</head>" + "<body>"
				+ "<p class='hidden'> Hidden </p> "
				+ "<p class='invisible'> Invisible </p> "
				+ "<p class='red'> I see red </p> " + "";
		JLabel render = new JLabel(content);
		JOptionPane.showMessageDialog(null, render);
	}
}
