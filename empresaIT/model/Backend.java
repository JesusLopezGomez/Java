package empresaIT.model;

public interface Backend {

	public static final double WEB_API_BD_COST = 0.33;
	public static final double BE_MAINTENANCE_COST = 0.43;
	
	public double createWebAPIAndDBConnectionCost();
	public double maintenanceCost();
}
