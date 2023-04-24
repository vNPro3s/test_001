package pckg.fact.method;

public class EU_CarStore extends CarStore {

private Car car;
	
	
	public EU_CarStore() {
		System.out.println(this.getClass().getSimpleName() + " store was opened!!!");
	}

	@Override
	protected Car createCar(String type, String color) {
		
		switch (type) {
		case "SUV":
			
			car = new EUSUVCar();
			break;
		case "Cabrio":
			
			car = new EUCabrioCar();

		default:
			break;
		}
		return car;
	}

}
