package medrex.server.report;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import medrex.commons.vo.reports.LabReport;

import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.lexer.Lexer;
import org.htmlparser.lexer.Page;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;

public class LabReportParser {

	private static TableTag[] getTables(NodeList list) {
		TableTag[] tableArr = new TableTag[list.size()];
		list.copyToNodeArray(tableArr);
		return tableArr;
	}

	public static LabReport getLabResults(String htmlContent) {
		final LabReport report = new LabReport();
		Parser htmlParser = null;
		NodeList tableNodes = null;
		TableTag[] tables = null;
		try {
			Page p = new Page(htmlContent);

			htmlParser = new Parser(new Lexer(p));
			tableNodes = htmlParser.parse(new TagNameFilter("table"));
			tables = getTables(tableNodes);
		} catch (Exception e) {
			e.printStackTrace();
		}

		populatePatientInfo(report, tables);
		populateReportType(report, tables);

		return report;
	}

	private static void populatePatientInfo(final LabReport report,
			TableTag[] tables) {
		TableRow[] rows = tables[5].getRows();
		for (int rIndex = 0; rIndex < rows.length; rIndex++) {
			TableColumn[] cols = rows[rIndex].getColumns();
			for (int cIndex = 0; cIndex < cols.length; cIndex++) {
				String temp = cols[cIndex].toPlainTextString().replaceAll(
						"[\t\n]", "").trim();
				// System.out.println(temp);
				if (temp.contains("PATIENT:")) {
					String name = cols[cIndex + 1].toPlainTextString()
							.replaceAll("[\t\n]", "").trim();
					// System.out.println("Name: " + name);
					String[] nameArr = name.split(",");
					report.setPatientFirstName(nameArr[1]);
					report.setPatientLastName(nameArr[0]);
				}
				if (temp.contains("DOB/AGE:")) {
					String dob = null;
					dob = cols[cIndex + 1].toPlainTextString().replaceAll(
							"[\t\n]", "").trim();
					dob = dob.replaceAll("[(\\s)*\\-]{1}(.)*", "");
					System.out.println("dob: " + dob);
					DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
					try {
						Date dobDate = df.parse(dob);
						report.setDob(dobDate);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}
		}
	}

	private static void populateReportType(final LabReport report,
			TableTag[] tables) {
		TableRow[] rows = tables[12].getRows();
		for (int rIndex = 1; rIndex < rows.length; rIndex++) {
			TableColumn[] cols = rows[rIndex].getColumns();
			String temp = cols[0].toPlainTextString().replaceAll("[\t\n]", "")
					.trim();
			report.setType(temp);
		}
	}
}
