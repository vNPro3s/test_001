package pckg.fact.method;

public abstract class CarStore {
	
	protected Car orderCar(String type, String color) {
		Car car;
		car = createCar(type, color);
		car.manufacture();
		car.paint(color);
		car.deliver();
		return car;
	}
	
	protected abstract Car createCar(String type, String color);

}
