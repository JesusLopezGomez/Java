package empresaIT.model;

import java.time.LocalDate;

public class WebDesigner extends Candidate implements Frontend {

	public WebDesigner() {
	}

	public WebDesigner(String dni, String name, String surname, LocalDate dateOrBirth, ContractType ct) {
		super(dni, name, surname, dateOrBirth, ct);
	}

	@Override
	public double computeFEMaintenanceCost() {
		return FE_MAINTENANCE_COST;
	}

	@Override
	public double computeWebDesignCost() {
		return WEB_INTERFACE_DESING_COST;
	}

	@Override
	public double computeGrossSalary() {
		return 0;
	}

}
