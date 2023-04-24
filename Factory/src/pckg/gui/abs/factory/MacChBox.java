package pckg.gui.abs.factory;

public class MacChBox implements Checkbox{

	@Override
	public void paint() {
		
		System.out.println("Painting -> "+ this.getClass().getSimpleName());
		
	}

}
