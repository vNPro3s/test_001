package pckg.fact.method;

public class UK_CarStore extends CarStore {
	
	private Car car;
	
	
	public UK_CarStore() {
		System.out.println(this.getClass().getSimpleName() + " store was opened!!!");
	}

	@Override
	protected Car createCar(String type, String color) {
		
		switch (type) {
		case "SUV":
			
			car = new UKSUVCar();
			break;
		case "Cabrio":
			
			car = new UKCabrioCar();

		default:
			break;
		}
		return car;
	}

}
