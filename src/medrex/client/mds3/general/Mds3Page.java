package medrex.client.mds3.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mds3Page implements Form {

	List<Mds3SubSection> subSections = new ArrayList();;
	Mds3SubSection subSectionFooter;

	public Mds3SubSection getSubSectionFooter() {
		return subSectionFooter;
	}

	public void setSubSectionFooter(Mds3SubSection subSectionFooter) {
		this.subSectionFooter = subSectionFooter;
	}

	public List<Mds3SubSection> getSubSections() {
		return subSections;
	}

	public void setSubSections(List<Mds3SubSection> subSections) {
		this.subSections = subSections;
	}

	@Override
	public void doLoad() {
		// TODO Auto-generated method stub

	}

	@Override
	public int doSave() {
		Iterator itr = subSections.iterator();
		while (itr.hasNext()) {
			((Mds3SubSection) itr.next()).doSave();
		}

		return 0;

	}

	@Override
	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
