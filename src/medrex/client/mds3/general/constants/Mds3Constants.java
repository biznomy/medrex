package medrex.client.mds3.general.constants;

import java.awt.Color;

public interface Mds3Constants {

	public final static String DATE_FORMAT = "";

	public final static int PAGE_WIDTH = 840;
	public final static int PAGE_HEIGHT = 1280;

	public final static int SUBSECTION_WIDTH = PAGE_WIDTH - 0;

	// for left column of subsection
	public final static int SUBSECTION_WIDTH_LEFT_1 = 80;
	// provision for SUBSECTION_WIDTH_LEFT_2 and SUBSECTION_WIDTH_LEFT_3

	// for right colum of subsection
	public final static int SUBSECTION_WIDTH_RIGHT_1 = (SUBSECTION_WIDTH - SUBSECTION_WIDTH_LEFT_1);
	// provision for SUBSECTION_WIDTH_RIGHT_2 and SUBSECTION_WIDTH_RIGHT_2

	public final static int SUBSECTION_WIDTH_GENERAL_1 = 100;

	public final static Color FONT_COLOR_WHITE = Color.WHITE;
	public final static Color FONT_COLOR_BlACK = Color.BLACK;
	public final static Color FONT_COLOR_DARKGRAY = Color.DARK_GRAY;

	public final static Color BACKGROUND_LIGHTGREY = Color.LIGHT_GRAY;
	public final static Color BACKGROUND_DARKGRAY = Color.DARK_GRAY;

	public final static int BORDER_SIZE_1 = 1;
	public final static int BORDER_SIZE_2 = 5;
	public final static int BORDER_SIZE_3 = 10;

	public final static Color BORDER_LIGHTGRAY = Color.LIGHT_GRAY;
	public final static Color BORDER_DARKGRAY = Color.DARK_GRAY;
	public final static Color BORDER_BLACK = Color.BLACK;

	// Header Page 1 of every Item Set - height = 100
	// Header of every Section - height = 25
	// Header of every Section - height = 25 , wherever its multiline use
	// multiples of 25
	// No height limitation for subsection content

	// Font- Arial (everywhere)

	// Header Font size -
	// Section Header Font size - (B,18),(B,16),(BI,16), and bold
	// Sub-Section Header Font size - 12 and bold
	// Content Font and input font size - 12 and bold/not bold depending on hard
	// printed pages
	// page header font
	// page footer font
	// font near input boxes is smaller - define size and it is not bold

	// font color

	// Alignments and sizes
	// size of input fields
	// textboxes, checkboxes, combo, date usuallualy appear of left panel but
	// sometimes in right column also
	// align all thes input fields, when being used in left panel to center
	// align all these input fields when being used in right panel to left (
	// with some margin)

	// Combo width=50;
	// ..... Height=22
	// Combo in left panel x=15

	// Al input field in right panel x=25
	// the Content above input field in right panel=10.

	// textBox height=22
	// dateChooser height=22
	// dateChooser width=125.

	// BY DESIGNING IN PAGE MODE THESE PROBLEMS WOUlD BE TAKEN CARE OF.

	// header informatin by :varun
	// header width =840
	// header height =100
	// upper line font size=18
	// middle line font size=16
	// lower line font size=16 with italics

	// 

}
