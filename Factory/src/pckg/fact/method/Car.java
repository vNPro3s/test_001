package pckg.fact.method;

public abstract class Car {
	
	protected String type;
	
	public void manufacture() {
		System.out.println("================== New Order ====================");
		System.out.println("Basic manufacturing process...");
	}
	
	public abstract void paint(String color);
	
	public void deliver() {
		System.out.println("Delivering a car to the car store...");
	}

}
