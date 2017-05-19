package medrex.commons.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Convertor {
	private String strFileName;
	private String strContent;
	private String strConvertedContent;

	static String CRLF = "\r\n";
	static String tabtab = "\t\t";
	static String fileData = "";
	public static String importsText = "import com.sX.swing.JxButton;" + CRLF
			+ "import com.sX.swing.JxLabel;" + CRLF
			+ "import com.sX.swing.JxText;" + CRLF
			+ "import com.sX.swing.JxComboBox;" + CRLF
			+ "import com.sX.swing.JxCheckBox;" + CRLF
			+ "import com.sX.swing.JxRadioButton;" + CRLF
			+ "import com.sX.swing.JxDateChooser;" + CRLF
			+ "import com.sX.swing.JxTextA;" + CRLF
			+ "import com.sX.swing.JxPanel;" + CRLF;

	static HashMap<String, String> sourceList1 = null;
	static ArrayList<String> source2 = null;
	static String theme1 = "theme";

	static HashMap<String, String> fontSizeReplacements = null;
	static HashMap<String, String> fontStyleReplacements = null;
	static HashMap<String, String> backGroundReplacements = null;
	static HashMap<String, String> foreGroundReplacements = null;

	public static void main(String[] args) {

		sourceList1 = new HashMap<String, String>();
		sourceList1.put("JPanel", "JxPanel");
		sourceList1.put("JLabel", "JxLabel");
		sourceList1.put("JButton", "JxButton");
		sourceList1.put("JTextField", "JxText");
		sourceList1.put("JCheckBox", "JxCheckBox");
		sourceList1.put("JRadioButton", "JxRadioButton");
		sourceList1.put("JComboBox", "JxComboBox");
		sourceList1.put("JFormattedTextField", "JxText");
		sourceList1.put("JDateChooser", "JxDateChooser");
		sourceList1.put("JTextArea", "JxTextA");

		source2 = new ArrayList();
		source2.add("JxPanel");
		source2.add("JxLabel");
		source2.add("JxButton");
		source2.add("JxText");
		source2.add("JxCheckBox");
		source2.add("JxRadioButton");
		source2.add("JxComboBox");
		source2.add("JxDateChooser");
		source2.add("JxTextA");

		fontSizeReplacements = new HashMap<String, String>();
		fontSizeReplacements.put("12", "12");
		fontSizeReplacements.put("13", "13");
		fontSizeReplacements.put("14", "14");

		fontStyleReplacements = new HashMap<String, String>();
		fontStyleReplacements.put("Font.BOLD", "Font.BOLD");

		backGroundReplacements = new HashMap<String, String>();
		backGroundReplacements.put("background_white", "");
		backGroundReplacements.put("WHITE", "");

		foreGroundReplacements = new HashMap<String, String>();
		foreGroundReplacements.put("foreground_black", "");

		/* 1: Read file name from console. */
		/* 2: Read file from given source */
		/* 3: Loop through file */
		/* 3.1: Parse each line */
		/* 4: End loop */

		/* Step 1: */
		// BufferedReader consoleReader = new BufferedReader(new
		// InputStreamReader(System.in));
		// System.out.println("Enter the java file name  to be converted...  ");
		// System.out.println("\n");
		// Convertor convertor = new Convertor();
		// try {
		// convertor.strFileName = consoleReader.readLine();
		// consoleReader.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// System.out.println("your entered this"+convertor.strFileName);
		/* Step 2: Read file */
		BufferedReader fIn = null;
		// File sourceFile = new
		// File("F:\\project\\medrex\\MedrexCS\\src\\medrex\\client\\main\\admission\\PanelResidentAssessmentFormPage1.java");
		File sourceFile = new File(
				"F:\\project\\medrex\\MedrexCS\\src\\medrex\\client\\admin\\masterschedule\\PanelShifts.java");

		try {
			fIn = new BufferedReader(new FileReader(sourceFile));
			String data = null;
			while ((data = fIn.readLine()) != null) {
				fileData = fileData + data + "\r\n";

			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fIn.close();
			} catch (Exception ee) {

			}
		}

		int posOfSubString;
		int posOfCRLFAfterSS;
		int posOfNewLineAfterSSLine;
		Iterator<String> i;

		fileData = fileData.replaceAll("javax.swing.J", "javax.swing.BB");
		fileData = fileData.replaceAll("com.toedter.calendar.J",
				"com.toedter.calendar.BB");

		// posOfSubString = fileData.lastIndexOf("package");
		// posOfCRLFAfterSS = fileData.indexOf("\r\n",posOfSubString);
		// posOfNewLineAfterSSLine = posOfCRLFAfterSS+2;
		//	
		// fileData = "package convertor.destination;"
		// +CRLF+fileData.substring(posOfNewLineAfterSSLine);
		//		

		posOfSubString = fileData.lastIndexOf("import");
		posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
		posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;

		fileData = fileData.substring(0, posOfNewLineAfterSSLine - 1) + CRLF
				+ importsText + CRLF
				+ fileData.substring(posOfNewLineAfterSSLine);

		i = sourceList1.keySet().iterator();

		while (i.hasNext()) {
			String key = i.next();
			fileData = fileData.replaceAll(key, sourceList1.get(key));
		}

		i = sourceList1.keySet().iterator();

		ArrayList<String> components = new ArrayList();
		new StringBuffer(fileData);
		StringTokenizer tokenizer = new StringTokenizer(fileData);
		while (tokenizer.hasMoreTokens()) {
			String currentVal = tokenizer.nextToken();
			if (source2.contains(currentVal)) {
				components.add(tokenizer.nextToken().replaceAll(";", ""));
			}
		}
		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent + " = new");
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			if (posOfSubString < 5)
				continue;

			if (fileData.indexOf(currentComponent + ".setTheme (" + theme1
					+ ");") < 0) {
				fileData = fileData.substring(0, posOfNewLineAfterSSLine - 1)
						+ tabtab + currentComponent + ".setTheme (" + theme1
						+ ");" + CRLF
						+ fileData.substring(posOfNewLineAfterSSLine);
			}

		}

		int posOfCRLFBeforeSS;
		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent
					+ ".setBackground");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			String lineSubString = fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			if (posOfSubString < 5)
				continue;
			boolean flag = false;

			Iterator ii = backGroundReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				fileData = fileData.substring(0, posOfCRLFBeforeSS + 2) + CRLF
						+ fileData.substring(posOfNewLineAfterSSLine);
			}

		}

		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent + ".setFore");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			String lineSubString = fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			if (posOfSubString < 5)
				continue;
			boolean flag = false;

			Iterator ii = foreGroundReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					flag = true;
					break;
				}
			}

			if (flag) {
				fileData = fileData.substring(0, posOfCRLFBeforeSS + 2) + CRLF
						+ fileData.substring(posOfNewLineAfterSSLine);
			}

		}

		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent + ".setFont(");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			if (posOfSubString < 5)
				continue;

			String lineSubString = fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			String replaceLine = "";

			Iterator ii = fontSizeReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					replaceLine = currentComponent + ".setFontSize("
							+ fontSizeReplacements.get(key) + ");" + CRLF;
					break;
				}

			}

			ii = fontStyleReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					replaceLine = replaceLine + currentComponent
							+ ".setFontStyle(" + fontStyleReplacements.get(key)
							+ ");" + CRLF;
					break;
				}

			}

			fileData = fileData.substring(0, posOfCRLFBeforeSS + 2) + CRLF
					+ replaceLine + fileData.substring(posOfNewLineAfterSSLine);

		}

		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent + ".setMargin(");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			if (posOfSubString < 5)
				continue;

			fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			String replaceLine = "";

			fileData = fileData.substring(0, posOfCRLFBeforeSS + 2) + CRLF
					+ replaceLine + fileData.substring(posOfNewLineAfterSSLine);

		}

		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent + ".setBorder(");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			if (posOfSubString < 5)
				continue;

			fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			String replaceLine = "";

			fileData = fileData.substring(0, posOfCRLFBeforeSS + 2)
					+ replaceLine + fileData.substring(posOfNewLineAfterSSLine);

		}

		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent + ".setBorder(");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			if (posOfSubString < 5)
				continue;

			fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			String replaceLine = "";

			fileData = fileData.substring(0, posOfCRLFBeforeSS + 2)
					+ replaceLine + fileData.substring(posOfNewLineAfterSSLine);

		}

		i = components.iterator();
		while (i.hasNext()) {
			String currentComponent = i.next();

			posOfSubString = fileData.indexOf(currentComponent
					+ "new CompoundBorderUIResource(");
			if (posOfSubString < 0)
				continue;
			posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
			String temp = fileData.substring(0, posOfSubString);
			posOfCRLFBeforeSS = temp.lastIndexOf("\r\n");
			posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;
			if (posOfSubString < 5)
				continue;

			fileData.substring(posOfCRLFBeforeSS + 2,
					posOfNewLineAfterSSLine - 2);
			String replaceLine = "";

			fileData = fileData.substring(0, posOfCRLFBeforeSS + 2)
					+ replaceLine + fileData.substring(posOfNewLineAfterSSLine);

		}

		fileData = fileData.replaceAll("javax.swing.BB", "javax.swing.J");
		fileData = fileData.replaceAll("com.toedter.calendar.BB",
				"com.toedter.calendar.J");

		/* Step 3: */
		BufferedWriter fOut = null;
		// File destFile = new
		// File("F:\\project\\medrex\\MedrexCS\\src\\medrex\\client\\main\\admission\\PanelResidentAssessmentFormPage1.java");
		File destFile = new File(
				"F:\\project\\medrex\\MedrexCS\\src\\medrex\\client\\admin\\masterschedule\\PanelShifts.java");
		try {
			fOut = new BufferedWriter(new FileWriter(destFile));
			fOut.write(fileData);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fOut.close();
			} catch (Exception ee) {

			}
		}

	}

}
