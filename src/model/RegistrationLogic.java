package model;

import dao.RegistrationDao;

public class RegistrationLogic {
	public void execute(Registration registration) {
		RegistrationDao dao = new RegistrationDao();
		dao.accountRegistration(registration);
	}
}