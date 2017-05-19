package medrex.commons.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class CopyOfConvertor {
	private String strFileName;
	private String strContent;
	private String strConvertedContent;

	String CRLF = "\r\n";
	String tabtab = "\t\t";
	// static String fileData="";
	public String importsText = "import com.sX.swing.JxButton;" + CRLF
			+ "import com.sX.swing.JxLabel;" + CRLF
			+ "import com.sX.swing.JxText;" + CRLF
			+ "import com.sX.swing.JxComboBox;" + CRLF
			+ "import com.sX.swing.JxCheckBox;" + CRLF
			+ "import com.sX.swing.JxRadioButton;" + CRLF
			+ "import com.sX.swing.JxDateChooser;" + CRLF
			+ "import com.sX.swing.JxTextA;" + CRLF
			+ "import com.sX.swing.JxPanel;" + CRLF;

	HashMap<String, String> sourceList1 = null;
	ArrayList<String> source2 = null;
	String theme1 = "theme";

	HashMap<String, String> fontSizeReplacements = null;
	HashMap<String, String> fontStyleReplacements = null;
	HashMap<String, String> backGroundReplacements = null;
	HashMap<String, String> foreGroundReplacements = null;

	public CopyOfConvertor() {
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

	}

	public static void main(String[] args) {

		File folder = new File(
				"F:\\project\\medrex\\MedrexCS\\src\\medrex\\client\\mds3\\ui\\PanelMds3RUGPage");
		File[] listOfFiles = folder.listFiles();
		// File sourceFile1=null;
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				// fileData = "";
				// read one file on fileData
				String fileData = readFile(listOfFiles[i]);
				// parse and convert fileData
				fileData = convert(fileData);
				// write updated fileData on file.
				writeFile(listOfFiles[i], fileData);
			}
		}
	}

	public static String readFile(File file) {
		String fileData = "";
		BufferedReader fIn = null;
		if (file.isFile()) {
			try {
				fIn = new BufferedReader(new FileReader(file));
				String data = null;
				while ((data = fIn.readLine()) != null) {
					fileData = fileData + data + "\r\n";
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fIn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

		return fileData;
	}

	public static String convert(String fileData) {

		CopyOfConvertor c = new CopyOfConvertor();

		int posOfSubString;
		int posOfCRLFAfterSS;
		int posOfNewLineAfterSSLine;
		Iterator<String> i;

		fileData = fileData.replaceAll("javax.swing.J", "javax.swing.BB");
		fileData = fileData.replaceAll("com.toedter.calendar.J",
				"com.toedter.calendar.BB");

		posOfSubString = fileData.lastIndexOf("import");
		posOfCRLFAfterSS = fileData.indexOf("\r\n", posOfSubString);
		posOfNewLineAfterSSLine = posOfCRLFAfterSS + 2;

		fileData = fileData.substring(0, posOfNewLineAfterSSLine - 1) + c.CRLF
				+ c.importsText + c.CRLF
				+ fileData.substring(posOfNewLineAfterSSLine);

		i = c.sourceList1.keySet().iterator();

		while (i.hasNext()) {
			String key = i.next();
			fileData = fileData.replaceAll(key, c.sourceList1.get(key));
		}

		i = c.sourceList1.keySet().iterator();

		ArrayList<String> components = new ArrayList();
		new StringBuffer(fileData);
		StringTokenizer tokenizer = new StringTokenizer(fileData);
		while (tokenizer.hasMoreTokens()) {
			String currentVal = tokenizer.nextToken();
			if (c.source2.contains(currentVal)) {
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

			if (fileData.indexOf(currentComponent + ".setTheme (" + c.theme1
					+ ");") < 0) {
				fileData = fileData.substring(0, posOfNewLineAfterSSLine - 1)
						+ c.tabtab + currentComponent + ".setTheme ("
						+ c.theme1 + ");" + c.CRLF
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

			Iterator ii = c.backGroundReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				fileData = fileData.substring(0, posOfCRLFBeforeSS + 2)
						+ c.CRLF + fileData.substring(posOfNewLineAfterSSLine);
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

			Iterator ii = c.foreGroundReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					flag = true;
					break;
				}
			}

			if (flag) {
				fileData = fileData.substring(0, posOfCRLFBeforeSS + 2)
						+ c.CRLF + fileData.substring(posOfNewLineAfterSSLine);
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

			Iterator ii = c.fontSizeReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					replaceLine = currentComponent + ".setFontSize("
							+ c.fontSizeReplacements.get(key) + ");" + c.CRLF;
					break;
				}
			}

			ii = c.fontStyleReplacements.keySet().iterator();
			while (ii.hasNext()) {
				String key = (String) ii.next();
				if (lineSubString.indexOf(key) > 0) {
					replaceLine = replaceLine + currentComponent
							+ ".setFontStyle("
							+ c.fontStyleReplacements.get(key) + ");" + c.CRLF;
					break;
				}
			}
			fileData = fileData.substring(0, posOfCRLFBeforeSS + 2) + c.CRLF
					+ replaceLine + fileData.substring(posOfNewLineAfterSSLine);
		}

		fileData = fileData.replaceAll("javax.swing.BB", "javax.swing.J");
		fileData = fileData.replaceAll("com.toedter.calendar.BB",
				"com.toedter.calendar.J");

		return fileData;
	}

	public static void writeFile(File file, String data) {
		BufferedWriter fOut = null;
		try {
			fOut = new BufferedWriter(new FileWriter(file));
			fOut.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fOut.close();
			} catch (Exception e2) {

			}
		}
	}

}
