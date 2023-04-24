package pckg.gui.abs.factory;

public class MACGUIFactory implements GUIFactoryInt {

	@Override
	public Button createButton() {
		MacBtn mcBtn = new MacBtn();
		return mcBtn;
	}

	@Override
	public Checkbox createChBox() {
		MacChBox mChB = new MacChBox();
		return mChB;
	}

}
