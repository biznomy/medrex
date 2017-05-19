package medrex.client.admin.formConfig.validationParser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConstraintSet {

	private List<ConstraintItem> list = null;

	public ConstraintSet() {
		list = new ArrayList<ConstraintItem>();
	}

	ConstraintSet(List<ConstraintItem> valList) {
		list = valList;
	}

	public void add(ConstraintItem item) {
		if (item == null) {
			throw new IllegalArgumentException("item can't be null");
		}

		if (item instanceof Operand) {
			addOperand((Operand) item);
		} else if (item instanceof Operator) {
			addOperator((Operator) item);
		}
	}

	public void addOperand(Condition condition, String value) {
		Operand operand = new Operand();
		operand.setCondition(condition);
		operand.setValue(value);
		addOperand(operand);
	}

	public void addOperand(Operand operand) {
		if (list.isEmpty() || isOperator()) {
			list.add(operand);
		}
	}

	public void addOperator(Operator operator) {
		if (!list.isEmpty() || isOperand()) {
			list.add(operator);
		}
	}

	public boolean isOperator() {
		int lastIndex = list.size() - 1;
		ConstraintItem lastObj = null;
		if (lastIndex >= 0 && lastIndex < list.size()) {
			lastObj = list.get(lastIndex);
		}
		if (lastObj instanceof Operator) {
			return true;
		}
		return false;
	}

	public boolean isOperand() {
		int lastIndex = list.size() - 1;
		ConstraintItem lastObj = null;
		if (lastIndex >= 0 && lastIndex < list.size()) {
			lastObj = list.get(lastIndex);
		}
		if (lastObj instanceof Operand) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String toStr = "";
		int len = list.size();
		for (int i = 0; i < len; i++) {
			Object obj = list.get(i);
			toStr += obj.toString();
			if (i != len - 1) {
				toStr += " ";
			}
		}
		return toStr;
	}

	public String toValidationQuery() {
		String toStr = "";
		int len = list.size();
		for (int i = 0; i < len; i++) {
			Object obj = list.get(i);
			if (obj instanceof Operand) {
				toStr += ((Operand) obj).toValidationQuery();
			} else if (obj instanceof Operator) {
				toStr += ((Operator) obj).toValidationQuery();
			}
			if (i != len - 1) {
				toStr += ValidationParser.TOKEN;
			}
		}
		return toStr;
	}

	public void validate() {
		Object obj = list.get(list.size() - 1);
		if (obj instanceof Operator) {
			list.remove(list.size() - 1);
		}
	}

	public void reset() {
		list = new ArrayList<ConstraintItem>();
	}

	public void clear() {
		if (list != null) {
			list.clear();
		}
	}

	public Iterator<ConstraintItem> getIterator() {
		return list.iterator();
	}

	public List<ConstraintItem> getItems() {
		return list;
	}

	public boolean isEmpty() {
		if (list.isEmpty()) {
			return true;
		}
		return false;
	}
}
