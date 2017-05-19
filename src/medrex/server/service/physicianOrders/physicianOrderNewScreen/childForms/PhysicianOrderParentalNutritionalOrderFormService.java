package medrex.server.service.physicianOrders.physicianOrderNewScreen.childForms;

import medrex.commons.exception.MedrexException;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.childForms.ParentalNutritionalOrderForm;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.childForms.PhysicianOrderParentalNutritionalOrderFormDao;

public class PhysicianOrderParentalNutritionalOrderFormService {

	public int insertOrUpdateParentalNutritionalOrderForm(
			ParentalNutritionalOrderForm refParentalNutritionalOrderForm)
			throws MedrexException {
		return PhysicianOrderParentalNutritionalOrderFormDao.getInstance()
				.insertOrUpdateParentalNutritionalOrderForm(
						refParentalNutritionalOrderForm);
	}

	public ParentalNutritionalOrderForm getParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException {
		return PhysicianOrderParentalNutritionalOrderFormDao.getInstance()
				.getParentalNutritionalOrderForm(
						currentParentalNutritionalOrderFormKey);
	}

	public void deletePhysicianOrderParentalNutritionalOrderForm(
			int currentParentalNutritionalOrderFormKey) throws MedrexException {
		PhysicianOrderParentalNutritionalOrderFormDao.getInstance()
				.deletePhysicianOrderParentalNutritionalOrderForm(
						currentParentalNutritionalOrderFormKey);

	}

}
