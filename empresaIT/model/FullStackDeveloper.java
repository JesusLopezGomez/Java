package empresaIT.model;

import java.time.LocalDate;

public class FullStackDeveloper extends Candidate {

	public FullStackDeveloper() {
		super();
	}

	
	public FullStackDeveloper(String dni, String name, String surname, LocalDate dateOrBirth, ContractType ct) {
		super(dni, name, surname, dateOrBirth, ct);
	}

	public double computeWebDesingCost() {
		return 2200 + 2100;
	}
	
	public double computeFEMaintenanceCos() {
		return 700;
	}
	
	public double createWebAPIAndDBConnectionCost() {
		return 2200 + 2100;
	}
	
	@Override
	public double computeGrossSalary() {
		return 0;
	}

}
