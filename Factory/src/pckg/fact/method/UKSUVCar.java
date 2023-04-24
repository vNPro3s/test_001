package pckg.fact.method;

public class UKSUVCar extends Car {

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Special manufacturing process unique for -> " + this.getClass().getSimpleName());
	}
	
	
	
	@Override
	public void deliver() {
		super.deliver();
		System.out.println("Order detail: " + this.getClass().getSimpleName());
	}



	@Override
	public void paint(String color) {
		System.out.println(this.getClass().getSimpleName() + " pinted into -> " + color);

	}

}
