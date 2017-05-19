package medrex.client.admin.formConfig.validationParser;

/**
 * @author D S Naruka
 * 
 */
public class ValidationParser {

	public final static String TOKEN = " :;:T:;: ";
	public final static String CONDITION_DELIMITER = "%";
	public final static String VALUE_DELIMITER1 = "<";
	public final static String VALUE_DELIMITER2 = ">";
	public final static String OPERATOR_DELIMITER = "#";

	/**
	 * @param validationQuery
	 *            Parses a validation query to a constraint set.
	 */
	public ConstraintSet parse(String validationQuery) {
		ConstraintSet cSet = new ConstraintSet();
		String str[] = validationQuery.split(TOKEN);

		Operand operand = null;
		for (String s : str) {
			if (s.startsWith(CONDITION_DELIMITER)) {
				if (operand == null) {
					operand = new Operand();
				}

				s = s.replaceAll(CONDITION_DELIMITER, "");
				Condition c = null;
				if (Condition.STARTS_WITH.toString().equalsIgnoreCase(s)) {
					c = Condition.STARTS_WITH;
				} else if (Condition.ENDS_WITH.toString().equalsIgnoreCase(s)) {
					c = Condition.ENDS_WITH;
				} else if (Condition.CONTAINS.toString().equalsIgnoreCase(s)) {
					c = Condition.CONTAINS;
				} else if (Condition.NOT_CONTAINS.toString()
						.equalsIgnoreCase(s)) {
					c = Condition.NOT_CONTAINS;
				} else if (Condition.EQUALS.toString().equalsIgnoreCase(s)) {
					c = Condition.EQUALS;
				} else if (Condition.NOT_EQUALS.toString().equalsIgnoreCase(s)) {
					c = Condition.NOT_EQUALS;
				} else if (Condition.GREATER_THAN.toString()
						.equalsIgnoreCase(s)) {
					c = Condition.GREATER_THAN;
				} else if (Condition.LESS_THAN.toString().equalsIgnoreCase(s)) {
					c = Condition.LESS_THAN;
				} else if (Condition.GREATER_THAN_EQUALS.toString()
						.equalsIgnoreCase(s)) {
					c = Condition.GREATER_THAN_EQUALS;
				} else if (Condition.LESS_THAN_EQUALS.toString()
						.equalsIgnoreCase(s)) {
					c = Condition.LESS_THAN_EQUALS;
				}

				operand.setCondition(c);
			} else if (s.startsWith(VALUE_DELIMITER1)) {
				if (operand == null) {
					operand = new Operand();
				}
				s = s.replaceAll(VALUE_DELIMITER1, "");
				s = s.replaceAll(VALUE_DELIMITER2, "");
				operand.setValue(s);

				cSet.add(operand);
				operand = null;

			} else if (s.startsWith(OPERATOR_DELIMITER)) {
				Operator obj = null;
				if ("#OR#".equalsIgnoreCase(s)) {
					obj = Operator.OR;
				}
				if ("#AND#".equalsIgnoreCase(s)) {
					obj = Operator.AND;
				}
				if (obj != null) {
					cSet.add(obj);
				}
			}
		}

		return cSet;
	}
}
