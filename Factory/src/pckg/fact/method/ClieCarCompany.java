package pckg.fact.method;

public class ClieCarCompany {
	
	public static void main(String[] args) {
		
		EU_CarStore eu = new EU_CarStore();
		UK_CarStore uk = new UK_CarStore();
		Car car1 = eu.orderCar("SUV", "Ocean blue");
		Car car2 = uk.orderCar("Cabrio", "Pale white");
	}

}
