package pckg.gui.abs.factory;

public class Application {
	
	private GUIFactoryInt factory;
	private Button btn;
	private Checkbox chB;
	
	public Application(GUIFactoryInt factory) {
		
		this.factory = factory;
		createUI();
		paintALL();
	}
	
	
	private void createUI() {
		this.btn = factory.createButton();
		this.chB = factory.createChBox();
	}
	
	private void paintALL() {
		btn.paint();
		chB.paint();
	}

}
