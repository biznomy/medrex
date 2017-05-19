package medrex.commons.vo.careLog;

public class CareLogOption {

	String title;
	String img;
	int typeOfOptions;
	String options[];
	int careLogNum;
	int parentNum;

	public CareLogOption(String title, String img, int typeOfOptions,
			String options[], int careLogNum, int parentNum) {
		this.title = title;
		this.img = img;
		this.typeOfOptions = typeOfOptions;
		this.options = options;
		this.careLogNum = careLogNum;
		this.parentNum = parentNum;
	}

	public int getParentNum() {
		return parentNum;
	}

	public void setParentNum(int parentNum) {
		this.parentNum = parentNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getTypeOfOptions() {
		return typeOfOptions;
	}

	public void setTypeOfOptions(int typeOfOptions) {
		this.typeOfOptions = typeOfOptions;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public int getCareLogNum() {
		return careLogNum;
	}

	public void setCareLogNum(int careLogNum) {
		this.careLogNum = careLogNum;
	}

}
