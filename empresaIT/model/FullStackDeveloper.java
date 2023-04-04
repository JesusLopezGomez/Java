package empresaIT.model;

import java.time.LocalDate;

public class FullStackDeveloper extends Candidate implements Backend,Frontend {

	public FullStackDeveloper() {
		super();
	}

	
	public FullStackDeveloper(String dni, String name, String surname, LocalDate dateOrBirth, ContractType ct) {
		super(dni, name, surname, dateOrBirth, ct);
	}

	public double createWebAPIAndDBConnectionCost() {
		return WEB_API_BD_COST;
	}
	
	@Override
	public double computeGrossSalary() {
		return 0;
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
	public double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}

}
