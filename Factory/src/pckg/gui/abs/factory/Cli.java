package pckg.gui.abs.factory;

import java.util.Scanner;

public class Cli {
	
	private static Scanner sc;
	private static String platform;
	private static GUIFactoryInt factory;
	private static Application apl;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Choose between MAC and WIN for application creation!");
		System.out.println("Enter your choice...");
		platform = sc.nextLine(); 
		
		if (platform.equals("WIN")) {
			factory = new WinGUIFactory();
		} else if (platform.equals("MAC")) {
			factory = new MACGUIFactory();
		} else {
			System.out.println("Unknown operating system!!!");
		}
		
		apl = new Application(factory);
		
	}

}
