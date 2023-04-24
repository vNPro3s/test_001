package pckg.one;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		int[] nums = new int[11];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("////////////////////////////////");
		System.out.println(Arrays.toString(nums));
		System.out.println("////////////////////////////////");
		for(int k = 0; k< nums.length; k++) {
			boolean flag = true;
			while (flag) {
				System.out.println("Unesite jedan cijeli broj za " + k + " element niza:");
				
				if(sc.hasNextInt()) {
					nums[k] = sc.nextInt();
					System.out.println("Unijeli ste -> " + nums[k]);
					flag = false;
				} else {
					System.out.println("Pogrešan unos... Probajte ponovno");
					System.out.println("----------------------------------");
				}
				sc.nextLine();
			}
			
		}
		sc.close();
		System.out.println(Arrays.toString(nums));
	}

}
