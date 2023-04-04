package empresaIT.model;

public interface Backend {

	public static final double WEB_API_BD_COST = 2200;
	public static final double BE_MAINTENANCE_COST = 500;
	
	public double createWebAPIAndDBConnectionCost();
	public double maintenanceCost();
}
