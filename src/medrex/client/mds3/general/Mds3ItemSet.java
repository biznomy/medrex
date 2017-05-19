package medrex.client.mds3.general;

import java.util.HashMap;

public class Mds3ItemSet {

	String name;
	HashMap<String, Mds3Page> pages = new HashMap();

	public String getName() {
		return name;
	}

	public HashMap<String, Mds3Page> getPages() {
		return pages;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPages(HashMap<String, Mds3Page> pages) {
		this.pages = pages;
	}

}
