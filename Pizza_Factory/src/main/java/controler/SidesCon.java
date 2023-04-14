package controler;

import java.util.ArrayList;
import java.util.Scanner;

import menu.Item;
import menu.Sides;

public class SidesCon {

	public static void sidesCon() {
		Scanner sc = new Scanner(System.in);
		int i=1;
		ArrayList sides=Sides.sides();

		for (Object o: sides) {
			Item side=(Item)o;
			System.out.println(i++ +") "+side.itemName+"\t price : Rs "+side.itemPrice);
			
		}
		System.out.println("**************");
		
		System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
		
		int choice=sc.nextInt();
		System.out.println("You choose \n"+sides.get(choice-1));
		System.out.println("***************************");
		
	}

}
