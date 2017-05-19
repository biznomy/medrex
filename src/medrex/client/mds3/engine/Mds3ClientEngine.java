package medrex.client.mds3.engine;

import java.util.Date;

import medrex.client.mds3.controller.Mds3Controller;

public class Mds3ClientEngine {
	private static final String rehabilizationPlusExtensiveServiceClassCategory_IStep2category2 = null;
	private Mds3Controller mds3Controler;

	public Mds3ClientEngine() {
		mds3Controler = Mds3Controller.getInstance();
	}

	// This RUG-IV algorith is in Mds3.0 chapter 6 page 18.......
	public int CalculateMds3ADLScore() {

		int g0110A = 0;
		int g0110B = 0;
		int g0110I = 0;
		int g0110H = 0;

		// Calculation of bed mobility

		g0110A = calculateMds3ADL_ABI(getInt(mds3Controler.getSectionG()
				.getG0110A1()),
				getInt(mds3Controler.getSectionG().getG0110A2()));
		g0110B = calculateMds3ADL_ABI(getInt(mds3Controler.getSectionG()
				.getG0110B1()),
				getInt(mds3Controler.getSectionG().getG0110B2()));
		g0110I = calculateMds3ADL_ABI(getInt(mds3Controler.getSectionG()
				.getG0110I1()),
				getInt(mds3Controler.getSectionG().getG0110I2()));
		g0110H = calculateMds3ADL_H(getInt(mds3Controler.getSectionG()
				.getG0110H1()),
				getInt(mds3Controler.getSectionG().getG0110H2()));

		return g0110A + g0110B + g0110H + g0110I;
	}

	int getInt(String string) {
		try {
			return (Integer.parseInt(string));
		} catch (Exception e) {
			return (-1);
		}
	}

	public static double getDouble(String string) {
		try {
			return (Double.parseDouble(string));
		} catch (Exception e) {
			return 0.0;
		}
	}

	int calculateMds3ADL_ABI(int fieldCol1, int fieldCol2) {

		int adlScore = 0;

		if ((fieldCol1 == -1) || (fieldCol1 == 0) || (fieldCol1 == 1)
				|| (fieldCol1 == 7) || (fieldCol1 == 8))
			adlScore = 0;

		if ((fieldCol1 == 2))
			adlScore = 1;

		if ((fieldCol1 == 3)
				&& ((fieldCol1 == -1) || (fieldCol1 == 0) || (fieldCol1 == 1) || (fieldCol1 == 2)))
			adlScore = 2;

		if ((fieldCol1 == 4)
				&& ((fieldCol2 == -1) || (fieldCol2 == 0) || (fieldCol2 == 1) || (fieldCol2 == 2)))
			adlScore = 3;

		if ((fieldCol1 == 3 || fieldCol1 == 4) && ((fieldCol2 == 3)))
			adlScore = 4;

		return adlScore;

	}

	int calculateMds3ADL_H(int fieldCol1, int fieldCol2) {

		int adlScore = 0;

		if (((fieldCol1 == -1) || (fieldCol1 == 0) || (fieldCol1 == 2)
				|| (fieldCol1 == 7) || (fieldCol1 == 8))
				&& ((fieldCol2 == -1) || (fieldCol2 == 0) || (fieldCol2 == 1) || (fieldCol2 == 8)))
			adlScore = 0;

		if (((fieldCol1 == -1) || (fieldCol1 == 0) || (fieldCol1 == 2)
				|| (fieldCol1 == 7) || (fieldCol1 == 8))
				&& ((fieldCol2 == 2) || (fieldCol2 == 3)))
			adlScore = 2;

		if (((fieldCol1 == 3) || (fieldCol1 == 4))
				&& ((fieldCol2 == -1) || (fieldCol2 == 0) || (fieldCol2 == 1)))
			adlScore = 2;

		if (((fieldCol1 == 3)) && ((fieldCol2 == 2) || (fieldCol2 == 3)))
			adlScore = 3;

		if (((fieldCol1 == 4)) && ((fieldCol2 == 2) || (fieldCol2 == 3)))
			adlScore = 4;

		return adlScore;

	}

	double calculateSpeechTotal = 0.0;
	double occupationalTherapyTotal = 0.0;
	double physicalTherapyTotal = 0.0;

	public double totalMinutes() {

		double totalMinute = 0.0;
		calculateSpeechTotal = calculateSpeech_language_pathologyServicesTotal(
				mds3Controler.getSectionO().getO0400A1(), mds3Controler
						.getSectionO().getO0400A2(), mds3Controler
						.getSectionO().getO0400A3());
		occupationalTherapyTotal = occupationalTherapyTotal(mds3Controler
				.getSectionO().getO0400B1(), mds3Controler.getSectionO()
				.getO0400B2(), mds3Controler.getSectionO().getO0400B3());
		physicalTherapyTotal = physicalTherapyTotal(mds3Controler.getSectionO()
				.getO0400C1(), mds3Controler.getSectionO().getO0400C2(),
				mds3Controler.getSectionO().getO0400C3());

		totalMinute = calculateSpeechTotal + occupationalTherapyTotal
				+ physicalTherapyTotal;
		return totalMinute;
	}

	public double adjustedMinutes() {

		double calculateSpeechAdjusted = 0.0;
		double occupationalTherapyAdjusted = 0.0;
		double physicalTherapyAdjusted = 0.0;
		double adjustedMinute = 0.0;

		calculateSpeechAdjusted = calculateSpeech_language_pathologyServicesAdjusted(
				calculateSpeechTotal, mds3Controler.getSectionO().getO0400A1(),
				mds3Controler.getSectionO().getO0400A2(), mds3Controler
						.getSectionO().getO0400A3());
		occupationalTherapyAdjusted = occupationalTherapyAdjusted(
				occupationalTherapyTotal, mds3Controler.getSectionO()
						.getO0400B1(),
				mds3Controler.getSectionO().getO0400B2(), mds3Controler
						.getSectionO().getO0400B3());
		physicalTherapyAdjusted = physicalTherapyAdjusted(physicalTherapyTotal,
				mds3Controler.getSectionO().getO0400C1(), mds3Controler
						.getSectionO().getO0400C2(), mds3Controler
						.getSectionO().getO0400C3());

		adjustedMinute = calculateSpeechAdjusted + occupationalTherapyAdjusted
				+ physicalTherapyAdjusted;
		return adjustedMinute;

	}

	double calculateSpeech_language_pathologyServicesTotal(
			double individualMinutes, double concurrentMinutes,
			double groupMinutes)

	{
		// individualMinutes for (Item O0400A1)
		// concurrentMinutes for(Item O0400A2)
		// groupMinutes for(Item O0400A3)

		double totalMinute = 0.0;

		// Calculate total SLP minutes
		totalMinute = individualMinutes + (concurrentMinutes / 2)
				+ groupMinutes;
		return totalMinute;

	}

	double calculateSpeech_language_pathologyServicesAdjusted(
			double totalMinute, double individualMinutes,
			double concurrentMinutes, double groupMinutes) {

		// individualMinutes for (Item O0400A1)
		// concurrentMinutes for(Item O0400A2)
		// groupMinutes for(Item O0400A3)

		double adjustedMinute = 0.0;

		// Calculate Adjusted SLP minutes
		adjustedMinute = groupMinutes / totalMinute;
		if ((adjustedMinute) > .25)
			// group adjustment applies for Medicare Part A.
			adjustedMinute = ((individualMinutes + (concurrentMinutes / 2)) * 1.33);

		return adjustedMinute;

	}

	double occupationalTherapyTotal(double individualMinutes,
			double concurrentMinutes, double groupMinutes)

	{
		// individualMinutes for (Item O0400B1)
		// concurrentMinutes for(Item O0400B2)
		// groupMinutes for(Item O0400B3)

		double totalMinute = 0.0;

		// Calculate total SLP minutes
		totalMinute = individualMinutes + (concurrentMinutes / 2)
				+ groupMinutes;
		return totalMinute;

	}

	double occupationalTherapyAdjusted(double totalMinute,
			double individualMinutes, double concurrentMinutes,
			double groupMinutes) {

		// individualMinutes for (Item O0400B1)
		// concurrentMinutes for(Item O0400B2)
		// groupMinutes for(Item O0400B3)

		double adjustedMinute = 0.0;

		// Calculate Adjusted SLP minutes
		adjustedMinute = groupMinutes / totalMinute;
		if ((adjustedMinute) > .25)
			// group adjustment applies for Medicare Part B.
			adjustedMinute = ((individualMinutes + (concurrentMinutes / 2)) * 1.33);

		return adjustedMinute;

	}

	double physicalTherapyTotal(double individualMinutes,
			double concurrentMinutes, double groupMinutes)

	{
		// individualMinutes for (Item O0400C1)
		// concurrentMinutes for(Item O0400C2)
		// groupMinutes for(Item O0400C3)

		double totalMinute = 0.0;
		// Calculate total SLP minutes
		totalMinute = individualMinutes + (concurrentMinutes / 2)
				+ groupMinutes;

		return totalMinute;

	}

	double physicalTherapyAdjusted(double totalMinute,
			double individualMinutes, double concurrentMinutes,
			double groupMinutes) {

		// individualMinutes for (Item O0400C1)
		// concurrentMinutes for(Item O0400C2)
		// groupMinutes for(Item O0400C3)

		double adjustedMinute = 0.0;

		// Calculate Adjusted SLP minutes
		adjustedMinute = groupMinutes / totalMinute;
		if ((adjustedMinute) > .25)
			// group adjustment applies for Medicare Part C.
			adjustedMinute = ((individualMinutes + (concurrentMinutes / 2)) * 1.33);

		return adjustedMinute;
	}

	public double mds3MedicareShortStayAssessment() {
		// boolean fun1=true;

		if (mds3Step1(mds3Controler.getSectionA().getA0310C())) {
			if (mds3Step2(mds3Controler.getSectionA().getA0310B())) {
				if (mds3Step3(mds3Controler.getSectionA().getA2300(),
						mds3Controler.getSectionA().getA2400B())) {
					if (mds3Step4(mds3Controler.getSectionA().getA2300(),
							mds3Controler.getSectionA().getA2400C())) {
						if (mds3Step5(mds3Controler.getSectionA().getA2300(),
								mds3Controler.getSectionO().getO0400A5(),
								mds3Controler.getSectionO().getO0400B5(),
								mds3Controler.getSectionO().getO0400C5())) {
							if (mds3Step6(mds3Controler.getSectionA()
									.getA2400C(), mds3Controler.getSectionO()
									.getO0400A5(), mds3Controler.getSectionO()
									.getO0400B5(), mds3Controler.getSectionO()
									.getO0400C5())) {
								if (mds3Step7(mds3Controler.getSectionA()
										.getA2400C(), mds3Controler
										.getSectionO().getO0400A6(),
										mds3Controler.getSectionO()
												.getO0400B6(), mds3Controler
												.getSectionO().getO0400C6())) {
									if (mds3Step8()) {
										System.out
												.println("medicareShortStayAssessmentminutes:=Yes");
										double days;
										days = mds3GetDays(mds3Controler
												.getSectionA().getA2300(),
												mds3Controler.getSectionO()
														.getO0400A5(),
												mds3Controler.getSectionO()
														.getO0400B5(),
												mds3Controler.getSectionO()
														.getO0400C5());
										double totalThreapyminutes = totalMinutes();
										double medicareShortStayAssessmentminutes = totalThreapyminutes
												/ days;
										System.out
												.println("medicareShortStayAssessmentminutes="
														+ medicareShortStayAssessmentminutes);
										return medicareShortStayAssessmentminutes;
									}

								}

							}

						}
					}

				}
			}

		} else
			System.out.println("medicareShortStayAssessmentminutes=: step1NO");
		return 0.0;
	}

	private double mds3GetDays(Date A2300, Date O0400A5, Date O0400B5,
			Date O0400C5) {
		Date earleatDate = null;
		if (O0400A5.before(O0400B5))
			if (O0400A5.before(O0400C5))
				earleatDate = O0400A5;
			else
				earleatDate = O0400C5;
		else if (O0400B5.before(O0400C5))
			earleatDate = O0400B5;
		else
			earleatDate = O0400C5;

		double diff = A2300.getDay() - earleatDate.getDay();
		if (diff >= 3)
			return diff;
		else
			return 0.0;

	}

	private boolean mds3Step1(String A0310C) {

		if (getInt(A0310C) == 1 || getInt(A0310C) == 3)
			return true;
		else
			return false;

	}

	private boolean mds3Step2(String A0310B) {

		if (getInt(A0310B) == 01 || getInt(A0310B) == 06)
			return true;
		else
			return false;

	}

	private boolean mds3Step3(Date A2300, Date A2400B) {
		try {
			long diff = A2300.getDay() - A2400B.getDay();
			if (diff <= 7)
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

	}

	private boolean mds3Step4(Date A2300, Date A2400c) {
		long A1 = A2300.getDate();
		long A2 = A2400c.getDate();

		if (A1 == A2)
			return true;
		else
			return false;

	}

	private boolean mds3Step5(Date A2300, Date O0400A5, Date O0400B5,
			Date O0400C5) {

		Date earleatDate = null;
		if (O0400A5.before(O0400B5))
			if (O0400A5.before(O0400C5))
				earleatDate = O0400A5;
			else
				earleatDate = O0400C5;
		else if (O0400B5.before(O0400C5))
			earleatDate = O0400B5;
		else
			earleatDate = O0400C5;

		long diff = A2300.getDay() - earleatDate.getDay();
		if (diff >= 3)
			return true;
		else
			return false;
	}

	private boolean mds3Step6(Date A2400C, Date O0400A5, Date O0400B5,
			Date O0400C5) {

		Date earleatDate = null;
		if (O0400A5.before(O0400B5))
			if (O0400A5.before(O0400C5))
				earleatDate = O0400A5;
			else
				earleatDate = O0400C5;
		else if (O0400B5.before(O0400C5))
			earleatDate = O0400B5;
		else
			earleatDate = O0400C5;

		long diff = A2400C.getDay() - earleatDate.getDay();
		if (diff <= 3)
			return true;
		else
			return false;
	}

	private boolean mds3Step7(Date A2400C, Date O0400A6, Date O0400B6,
			Date O0400C6) {

		Date endofThDate = null;
		if (O0400A6.after(O0400B6))
			if (O0400A6.after(O0400C6))
				endofThDate = O0400A6;
			else
				endofThDate = O0400C6;

		if (O0400B6.after(O0400C6))
			endofThDate = O0400B6;
		else
			endofThDate = O0400C6;

		long A1 = endofThDate.getDate();
		long A2 = A2400C.getDate();

		if (A1 == A2)
			return true;
		else
			return false;
	}

	private boolean mds3Step8() {

		return true;
	}

	public String rehabilizationPlusExtensiveServiceClass() {
		String rugIVClass = "";
		rugIVClass = rehabilizationPlusExtensiveServiceClassCategory_1();

		return rugIVClass;

	}

	private String rehabilizationPlusExtensiveServiceClassCategory_1() {

		String rugIVClass = "";
		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();
		if (adlScore >= 2) {

			if ((mds3Controler.getSectionO().isO0100E2() != false)
					|| (mds3Controler.getSectionO().isO0100F2() != false)
					|| (mds3Controler.getSectionO().isO0100M2() != false)) {
				// to Find Ultra High Intensity Criteria
				double totThreapyMinute = totalMinutes();
				double medicareShortStayAverageTherapyMinutes = mds3MedicareShortStayAssessment();
				if ((totThreapyMinute >= 720)
						&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
								|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
								.getSectionO().getO0400C4() >= 5))
						|| (medicareShortStayAverageTherapyMinutes >= 144)) {
					if (adlScore >= 11 && adlScore <= 16) {
						rugIVClass = "RUX";
					} else if (adlScore >= 2 && adlScore <= 10) {
						rugIVClass = "RUL";
					}
				}

				// To Find Very High Intensity Criteria

				else if ((totThreapyMinute >= 500)
						&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
								|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
								.getSectionO().getO0400C4() >= 5))
						|| ((medicareShortStayAverageTherapyMinutes >= 100) && (medicareShortStayAverageTherapyMinutes <= 143))) {
					if (adlScore >= 11 && adlScore <= 16) {
						rugIVClass = "RVX";
					} else if (adlScore >= 2 && adlScore <= 10) {
						rugIVClass = "RVL";
					}
				}

				// To Find High Intensity Criteria

				else if ((totThreapyMinute >= 325)
						&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
								|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
								.getSectionO().getO0400C4() >= 5))
						|| ((medicareShortStayAverageTherapyMinutes >= 65) && (medicareShortStayAverageTherapyMinutes <= 99))) {
					if (adlScore >= 11 && adlScore <= 16) {
						rugIVClass = "RHX";
					} else if (adlScore >= 2 && adlScore <= 10) {
						rugIVClass = "RHL";
					}
				}

				// To Find Medium Intensity Criteria

				else if ((totThreapyMinute >= 150)
						&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
								|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
								.getSectionO().getO0400C4() >= 5))
						|| ((medicareShortStayAverageTherapyMinutes >= 30) && (medicareShortStayAverageTherapyMinutes <= 64))) {
					if (adlScore >= 11 && adlScore <= 16) {
						rugIVClass = "RMX";
					} else if (adlScore >= 2 && adlScore <= 10) {
						rugIVClass = "RML";
					}
				}

				// To Find Low Intensity Criteria

				else if ((totThreapyMinute >= 45)
						&& ((mds3Controler.getSectionO().getO0400A4() >= 3)
								|| (mds3Controler.getSectionO().getO0400B4() >= 3) || (mds3Controler
								.getSectionO().getO0400C4() >= 3))
						|| ((medicareShortStayAverageTherapyMinutes >= 15) && (medicareShortStayAverageTherapyMinutes <= 29))) {
					if (adlScore >= 2 && adlScore <= 16) {
						rugIVClass = "RLX";
					}
				}

			}

			else
				rugIVClass = rehabilizationPlusExtensiveServiceClasscategory2();
		} else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory2();

		return rugIVClass;
	}

	private String rehabilizationPlusExtensiveServiceClasscategory2() {

		String rugIVClass = "";
		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();

		// to Find Ultra High Intensity Criteria
		double totThreapyMinute = totalMinutes();
		double medicareShortStayAverageTherapyMinutes = mds3MedicareShortStayAssessment();
		if ((totThreapyMinute >= 720)
				&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
						|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
						.getSectionO().getO0400C4() >= 5))
				|| (medicareShortStayAverageTherapyMinutes >= 144)) {
			if (adlScore >= 11 && adlScore <= 16) {
				rugIVClass = "RUC";
			} else if (adlScore >= 6 && adlScore <= 10) {
				rugIVClass = "RUB";
			}

			else if (adlScore >= 0 && adlScore <= 5) {
				rugIVClass = "RUA";
			}
		}

		// To Find Very High Intensity Criteria

		else if ((totThreapyMinute >= 500)
				&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
						|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
						.getSectionO().getO0400C4() >= 5))
				|| ((medicareShortStayAverageTherapyMinutes >= 100) && (medicareShortStayAverageTherapyMinutes <= 143))) {
			if (adlScore >= 11 && adlScore <= 16) {
				rugIVClass = "RVC";
			} else if (adlScore >= 6 && adlScore <= 10) {
				rugIVClass = "RVB";
			} else if (adlScore >= 0 && adlScore <= 5) {
				rugIVClass = "RVA";
			}
		}

		// To Find High Intensity Criteria

		else if ((totThreapyMinute >= 325)
				&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
						|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
						.getSectionO().getO0400C4() >= 5))
				|| ((medicareShortStayAverageTherapyMinutes >= 65) && (medicareShortStayAverageTherapyMinutes <= 99))) {
			if (adlScore >= 11 && adlScore <= 16) {
				rugIVClass = "RHC";
			} else if (adlScore >= 6 && adlScore <= 10) {
				rugIVClass = "RHB";
			} else if (adlScore >= 0 && adlScore <= 5) {
				rugIVClass = "RHA";
			}
		}

		// To Find Medium Intensity Criteria

		else if ((totThreapyMinute >= 150)
				&& ((mds3Controler.getSectionO().getO0400A4() >= 5)
						|| (mds3Controler.getSectionO().getO0400B4() >= 5) || (mds3Controler
						.getSectionO().getO0400C4() >= 5))
				|| ((medicareShortStayAverageTherapyMinutes >= 30) && (medicareShortStayAverageTherapyMinutes <= 64))) {
			if (adlScore >= 11 && adlScore <= 16) {
				rugIVClass = "RMC";
			} else if (adlScore >= 6 && adlScore <= 10) {
				rugIVClass = "RMB";
			} else if (adlScore >= 0 && adlScore <= 5) {
				rugIVClass = "RMA";
			}
		}

		// To Find Low Intensity Criteria

		else if ((totThreapyMinute >= 45)
				&& ((mds3Controler.getSectionO().getO0400A4() >= 3)
						|| (mds3Controler.getSectionO().getO0400B4() >= 3) || (mds3Controler
						.getSectionO().getO0400C4() >= 3))
				|| ((medicareShortStayAverageTherapyMinutes >= 15) && (medicareShortStayAverageTherapyMinutes <= 29))) {
			if (adlScore >= 11 && adlScore <= 16) {
				rugIVClass = "RLB";
			} else if (adlScore >= 0 && adlScore <= 10) {
				rugIVClass = "RLA";
			}
		} else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory3();

		return rugIVClass;

	}

	private String rehabilizationPlusExtensiveServiceClasscategory3() {
		String rugIVClass = "";
		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();

		if ((mds3Controler.getSectionO().isO0100E2() != false)
				|| (mds3Controler.getSectionO().isO0100F2() != false)
				|| (mds3Controler.getSectionO().isO0100M2() != false)) {
			if (adlScore >= 2) {

				System.out
						.println("category3 is uncompleted........................");

			} else
				rugIVClass = rehabilizationPlusExtensiveServiceClasscategory4(); // after
			// we
			// move
			// it
			// to
			// category
			// 4,step
			// 2
		}

		else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory4();

		return rugIVClass;
	}

	private String rehabilizationPlusExtensiveServiceClasscategory4() {

		String rugIVClass = "";
		String totalSeverityScore = "";

		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();
		if (((getInt(mds3Controler.getSectionG().getG0110A1()) == 4)
				&& (getInt(mds3Controler.getSectionG().getG0110B1()) == 4)
				&& (getInt(mds3Controler.getSectionG().getG0110H1()) == 4)
				&& (getInt(mds3Controler.getSectionG().getG0110H1()) == 4) || (getInt(mds3Controler
				.getSectionG().getG0110A1()) == 8)
				&& (getInt(mds3Controler.getSectionG().getG0110B1()) == 8)
				&& (getInt(mds3Controler.getSectionG().getG0110H1()) == 8)
				&& (getInt(mds3Controler.getSectionG().getG0110H1()) == 8))
				|| (mds3Controler.getSectionI().isI2100() == true)
				|| ((getInt(mds3Controler.getSectionN().getN0350A()) <= 7) && (getInt(mds3Controler
						.getSectionN().getN0350B()) >= 2))
				|| (adlScore >= 5)
				|| (((mds3Controler.getSectionI().isI6200()) == true) && (mds3Controler
						.getSectionJ().isJ1100C()) == true)
				|| (((mds3Controler.getSectionI().isI2000() == true)
						&& (mds3Controler.getSectionJ().isJ1550A() == true)
						&& (getInt(mds3Controler.getSectionK().getK0300()) == 3) || getInt(mds3Controler
						.getSectionK().getK0300()) == 2) && (mds3Controler
						.getSectionK().isK0500B() == true))
				|| (mds3Controler.getSectionK().isK0500A() == true)
				|| (mds3Controler.getSectionO().getO0400D2() == 7)) {
			if (adlScore >= 2) {
				if ((getInt(mds3Controler.getSectionD().getD0300()) >= 10 && getInt(mds3Controler
						.getSectionD().getD0300()) != 99)
						|| (getInt(mds3Controler.getSectionD().getD0600()) >= 10)) {
					totalSeverityScore = "YES";
				}

				else {
					totalSeverityScore = "NO";

				}

				if ((adlScore >= 15 && adlScore <= 16)
						&& totalSeverityScore == "YES") {
					rugIVClass = "HE2";
				} else if ((adlScore >= 15 && adlScore <= 16)
						&& totalSeverityScore == "NO") {
					rugIVClass = "HE1";
				} else if ((adlScore >= 11 && adlScore <= 14)
						&& totalSeverityScore == "YES") {
					rugIVClass = "HD2";
				} else if ((adlScore >= 11 && adlScore <= 14)
						&& totalSeverityScore == "NO") {
					rugIVClass = "HD1";
				} else if ((adlScore >= 6 && adlScore <= 10)
						&& totalSeverityScore == "YES") {
					rugIVClass = "HC2";
				} else if ((adlScore >= 6 && adlScore <= 10)
						&& totalSeverityScore == "NO") {
					rugIVClass = "HC1";
				} else if ((adlScore >= 2 && adlScore <= 5)
						&& totalSeverityScore == "YES") {
					rugIVClass = "HB2";
				} else if ((adlScore >= 2 && adlScore <= 5)
						&& totalSeverityScore == "NO") {
					rugIVClass = "HB1";
				}

			} else
				rugIVClass = rehabilizationPlusExtensiveServiceClasscategory5();
		} else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory5();
		return rugIVClass;
	}

	private String rehabilizationPlusExtensiveServiceClasscategory5() {

		String rugIVClass = "";
		String totalSeverityScore = "";

		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();
		if (((mds3Controler.getSectionI().isI4400() == true) && (adlScore >= 5))
				|| (mds3Controler.getSectionI().isI5200() == true)
				&& (adlScore >= 5)
				|| (mds3Controler.getSectionI().isI5300() == true)
				&& (adlScore >= 5)
				|| (((mds3Controler.getSectionI().isI6300()) == true) && (mds3Controler
						.getSectionO().isO0100C2()) == true)
				|| (((mds3Controler.getSectionK().isK0500B()) == true))
				|| ((getInt(mds3Controler.getSectionM().getM0300B_1()) >= 2))
				|| ((getInt(mds3Controler.getSectionM().getM0300C_1()) == 3)
						|| ((getInt(mds3Controler.getSectionM().getM0300C_1()) == 4))
						&& (getInt(mds3Controler.getSectionM().getM0300D_1()) == 3)
						|| ((getInt(mds3Controler.getSectionM().getM0300D_1()) == 4))
						&& (getInt(mds3Controler.getSectionM().getM0300E_1()) == 3) || ((getInt(mds3Controler
						.getSectionM().getM0300E_1()) == 4)))
				|| ((getInt(mds3Controler.getSectionM().getM01030()) >= 2))
				|| ((getInt(mds3Controler.getSectionM().getM01030()) >= 2) && (getInt(mds3Controler
						.getSectionM().getM0300B_1()) >= 2))
				|| ((mds3Controler.getSectionM().isM01040A() == true)
						&& (mds3Controler.getSectionM().isM01040B() == true)
						&& (mds3Controler.getSectionM().isM01040C() == true) && (mds3Controler
						.getSectionM().isM1200I() == true))
				|| (mds3Controler.getSectionO().isO0100B2() == true)
				|| (mds3Controler.getSectionO().isO0100J2() == true))

		{
			if (adlScore >= 2) {
				if ((getInt(mds3Controler.getSectionD().getD0300()) >= 10 && getInt(mds3Controler
						.getSectionD().getD0300()) != 99)
						|| (getInt(mds3Controler.getSectionD().getD0600()) >= 10)) {
					totalSeverityScore = "YES";
				}

				else {
					totalSeverityScore = "NO";

				}

				if ((adlScore >= 15 && adlScore <= 16)
						&& totalSeverityScore == "YES") {
					rugIVClass = "LE2";
				} else if ((adlScore >= 15 && adlScore <= 16)
						&& totalSeverityScore == "NO") {
					rugIVClass = "LE1";
				} else if ((adlScore >= 11 && adlScore <= 14)
						&& totalSeverityScore == "YES") {
					rugIVClass = "LD2";
				} else if ((adlScore >= 11 && adlScore <= 14)
						&& totalSeverityScore == "NO") {
					rugIVClass = "LD1";
				} else if ((adlScore >= 6 && adlScore <= 10)
						&& totalSeverityScore == "YES") {
					rugIVClass = "LC2";
				} else if ((adlScore >= 6 && adlScore <= 10)
						&& totalSeverityScore == "NO") {
					rugIVClass = "LC1";
				} else if ((adlScore >= 2 && adlScore <= 5)
						&& totalSeverityScore == "YES") {
					rugIVClass = "LB2";
				} else if ((adlScore >= 2 && adlScore <= 5)
						&& totalSeverityScore == "NO") {
					rugIVClass = "LB1";
				}

			} else
				rugIVClass = rehabilizationPlusExtensiveServiceClasscategory6();
		} else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory6();
		return rugIVClass;
	}

	private String rehabilizationPlusExtensiveServiceClasscategory6() {
		String rugIVClass = "";
		String totalSeverityScore = "";

		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();
		if (((mds3Controler.getSectionI().isI2000() == true))
				|| (mds3Controler.getSectionI().isI4900() == true)
				&& (adlScore >= 5)
				|| ((mds3Controler.getSectionM().isM01040D() == true) && (mds3Controler
						.getSectionM().isM01040E() == true))
				|| (mds3Controler.getSectionO().isO0100A2() == true)
				|| (mds3Controler.getSectionO().isO0100C2() == true)
				|| (mds3Controler.getSectionO().isO0100H2() == true)
				|| (mds3Controler.getSectionO().isO0100I2() == true))

		{
			if ((getInt(mds3Controler.getSectionD().getD0300()) >= 10 && getInt(mds3Controler
					.getSectionD().getD0300()) != 99)
					|| (getInt(mds3Controler.getSectionD().getD0600()) >= 10)) {
				totalSeverityScore = "YES";
			}

			else {
				totalSeverityScore = "NO";

			}

			if ((adlScore >= 15 && adlScore <= 16)
					&& totalSeverityScore == "YES") {
				rugIVClass = "CE2";
			} else if ((adlScore >= 15 && adlScore <= 16)
					&& totalSeverityScore == "NO") {
				rugIVClass = "CE1";
			} else if ((adlScore >= 11 && adlScore <= 14)
					&& totalSeverityScore == "YES") {
				rugIVClass = "CD2";
			} else if ((adlScore >= 11 && adlScore <= 14)
					&& totalSeverityScore == "NO") {
				rugIVClass = "CD1";
			} else if ((adlScore >= 6 && adlScore <= 10)
					&& totalSeverityScore == "YES") {
				rugIVClass = "CC2";
			} else if ((adlScore >= 6 && adlScore <= 10)
					&& totalSeverityScore == "NO") {
				rugIVClass = "CC1";
			} else if ((adlScore >= 2 && adlScore <= 5)
					&& totalSeverityScore == "YES") {
				rugIVClass = "CB2";
			} else if ((adlScore >= 2 && adlScore <= 5)
					&& totalSeverityScore == "NO") {
				rugIVClass = "CB1";
			} else if ((adlScore >= 0 && adlScore <= 1)
					&& totalSeverityScore == "YES") {
				rugIVClass = "CA2";
			} else if ((adlScore >= 0 && adlScore <= 1)
					&& totalSeverityScore == "NO") {
				rugIVClass = "CA1";
			}
		} else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory7();
		return rugIVClass;
	}

	private String rehabilizationPlusExtensiveServiceClasscategory7() {

		String rugIVClass = "";
		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();
		if (adlScore <= 5) {

			if (getInt(mds3Controler.getSectionC().getC0100()) != 0) {

				if (getInt(mds3Controler.getSectionC().getC0500()) >= 9) {
					step5Category7();
					if ((getInt(mds3Controler.getSectionC().getC0500()) > 9)
							&& (getInt(mds3Controler.getSectionC().getC0500()) != 99)) {
						if ((mds3Controler.getSectionE().isE0100A())
								|| (mds3Controler.getSectionE().isE0100B())
								|| ((getInt(mds3Controler.getSectionE()
										.getE0200A()) == 2) || (getInt(mds3Controler
										.getSectionE().getE0200A()) == 3))
								|| ((getInt(mds3Controler.getSectionE()
										.getE0200B()) == 2) || (getInt(mds3Controler
										.getSectionE().getE0200B()) == 3))
								|| ((getInt(mds3Controler.getSectionE()
										.getE0200C()) == 2) || (getInt(mds3Controler
										.getSectionE().getE0200C()) == 3))
								|| ((getInt(mds3Controler.getSectionE()
										.getE0800()) == 2) || (getInt(mds3Controler
										.getSectionE().getE0800()) == 3))
								|| ((getInt(mds3Controler.getSectionE()
										.getE0900()) == 2) || (getInt(mds3Controler
										.getSectionE().getE0900()) == 3))) {

							int totRestorativeNursingCount = calculateTotRestorativeNursingCountCategory7();

							if ((adlScore >= 2 && adlScore <= 5)
									&& totRestorativeNursingCount >= 2) {
								rugIVClass = "BB2";
							} else if ((adlScore >= 2 && adlScore <= 5)
									&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
								rugIVClass = "BB1";
							} else if ((adlScore >= 0 && adlScore <= 1)
									&& totRestorativeNursingCount >= 2) {
								rugIVClass = "BA2";
							} else if ((adlScore >= 0 && adlScore <= 1)
									&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
								rugIVClass = "BA1";
							}
							// step7Category7(); //this step is not exist in
							// RUG-IV Category 7.
						} else {
							rugIVClass = rehabilizationPlusExtensiveServiceClasscategory8();
						}
						if ((getInt(mds3Controler.getSectionC().getC0500()) == 99)
								|| (mds3Controler.getSectionC().getC0500() == null)
								|| (mds3Controler.getSectionC().getC0500() == "-")) {

							if ((getInt(mds3Controler.getSectionB().getB0100()) == 1)
									|| ((getInt(mds3Controler.getSectionG()
											.getG0110A1()) == 4 || (getInt(mds3Controler
											.getSectionG().getG0110A1()) == 8))
											|| (getInt(mds3Controler
													.getSectionG().getG0110B1()) == 4 || (getInt(mds3Controler
													.getSectionG().getG0110B1()) == 8))
											|| (getInt(mds3Controler
													.getSectionG().getG0110H1()) == 4 || (getInt(mds3Controler
													.getSectionG().getG0110H1()) == 8)) || (getInt(mds3Controler
											.getSectionG().getG0110I1()) == 4 || (getInt(mds3Controler
											.getSectionG().getG0110I1()) == 8)))
									|| (getInt(mds3Controler.getSectionC()
											.getC1000()) == 3)
									|| (((getInt(mds3Controler.getSectionB()
											.getB0700()) > 0)
											&& (getInt(mds3Controler
													.getSectionC().getC0700()) == 1) && (getInt(mds3Controler
											.getSectionC().getC1000()) > 0)) && ((getInt(mds3Controler
											.getSectionB().getB0700()) >= 2) && (getInt(mds3Controler
											.getSectionC().getC1000()) >= 2))))

							{
								step5Category7();// riht now this is not
								// implemented....................
							} else if ((mds3Controler.getSectionE().isE0100A())
									|| (mds3Controler.getSectionE().isE0100B())
									|| ((getInt(mds3Controler.getSectionE()
											.getE0200A()) == 2) || (getInt(mds3Controler
											.getSectionE().getE0200A()) == 3))
									|| ((getInt(mds3Controler.getSectionE()
											.getE0200B()) == 2) || (getInt(mds3Controler
											.getSectionE().getE0200B()) == 3))
									|| ((getInt(mds3Controler.getSectionE()
											.getE0200C()) == 2) || (getInt(mds3Controler
											.getSectionE().getE0200C()) == 3))
									|| ((getInt(mds3Controler.getSectionE()
											.getE0800()) == 2) || (getInt(mds3Controler
											.getSectionE().getE0800()) == 3))
									|| ((getInt(mds3Controler.getSectionE()
											.getE0900()) == 2) || (getInt(mds3Controler
											.getSectionE().getE0900()) == 3))) {
								// step7Category7(); it is not exist in RUG-IV
								// category 7

								int totRestorativeNursingCount = calculateTotRestorativeNursingCountCategory7();

								if ((adlScore >= 2 && adlScore <= 5)
										&& totRestorativeNursingCount >= 2) {
									rugIVClass = "BB2";
								} else if ((adlScore >= 2 && adlScore <= 5)
										&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
									rugIVClass = "BB1";
								} else if ((adlScore >= 0 && adlScore <= 1)
										&& totRestorativeNursingCount >= 2) {
									rugIVClass = "BA2";
								} else if ((adlScore >= 0 && adlScore <= 1)
										&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
									rugIVClass = "BA1";
								}
							} else {
								rugIVClass = rehabilizationPlusExtensiveServiceClasscategory8();
							}

						}
					}
				}
			}
		} else
			rugIVClass = rehabilizationPlusExtensiveServiceClasscategory8();

		return rugIVClass;
	}

	private boolean step7Category7() {
		// TODO Auto-generated method stub
		return false;
	}

	private void step5Category7() {
		// TODO Auto-generated method stub

	}

	private String rehabilizationPlusExtensiveServiceClasscategory8() {

		String rugIVClass = "";
		int totRestorativeNursingCount = calculateTotRestorativeNursingCountCategory7();
		int adlScore = 0;
		adlScore = CalculateMds3ADLScore();

		if ((adlScore >= 15 && adlScore <= 16)
				&& totRestorativeNursingCount >= 2) {
			rugIVClass = "PE2";
		} else if ((adlScore >= 15 && adlScore <= 16)
				&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
			rugIVClass = "PE1";
		} else if ((adlScore >= 11 && adlScore <= 14)
				&& totRestorativeNursingCount >= 2) {
			rugIVClass = "PD2";
		} else if ((adlScore >= 11 && adlScore <= 14)
				&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
			rugIVClass = "PD1";
		} else if ((adlScore >= 6 && adlScore <= 10)
				&& totRestorativeNursingCount >= 2) {
			rugIVClass = "PC2";
		} else if ((adlScore >= 6 && adlScore <= 10)
				&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
			rugIVClass = "PC1";
		} else if ((adlScore >= 2 && adlScore <= 5)
				&& totRestorativeNursingCount >= 2) {
			rugIVClass = "PB2";
		} else if ((adlScore >= 2 && adlScore <= 5)
				&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
			rugIVClass = "PB1";
		} else if ((adlScore >= 0 && adlScore <= 1)
				&& totRestorativeNursingCount >= 2) {
			rugIVClass = "PA2";
		} else if ((adlScore >= 0 && adlScore <= 1)
				&& (totRestorativeNursingCount == 0 || totRestorativeNursingCount == 1)) {
			rugIVClass = "PA1";
		}

		return rugIVClass;
	}

	private int calculateTotRestorativeNursingCountCategory7() {

		int totRestorativeNursingCount = 0;
		int h0200CH0500 = 0;
		int o0500AO0500B = 0;
		int o0500C = 0;
		int o0500DO0500F = 0;
		int O0500E = 0;
		int O0500G = 0;
		int O0500H = 0;
		int O0500I = 0;
		int O0500J = 0;

		if (mds3Controler.getSectionH().getH0200C() != null
				|| mds3Controler.getSectionH().getH0500() != null)
			h0200CH0500 = 1;
		if (mds3Controler.getSectionO().getO0500A() != -1
				|| mds3Controler.getSectionO().getO0500B() != -1)
			o0500AO0500B = 1;
		if (mds3Controler.getSectionO().getO0500C() != -1)
			o0500C = 1;
		if (mds3Controler.getSectionO().getO0500D() != -1
				|| mds3Controler.getSectionO().getO0500F() != -1)
			o0500DO0500F = 1;
		if (mds3Controler.getSectionO().getO0500E() != -1)
			O0500E = 1;
		if (mds3Controler.getSectionO().getO0500G() != -1)
			O0500G = 1;
		if (mds3Controler.getSectionO().getO0500H() != -1)
			O0500H = 1;
		if (mds3Controler.getSectionO().getO0500I() != -1)
			O0500I = 1;
		if (mds3Controler.getSectionO().getO0500J() != -1)
			O0500J = 1;
		totRestorativeNursingCount = h0200CH0500 + o0500AO0500B + o0500C
				+ o0500DO0500F + O0500E + O0500G + O0500H + O0500I + O0500J;
		return totRestorativeNursingCount;

	}

}
