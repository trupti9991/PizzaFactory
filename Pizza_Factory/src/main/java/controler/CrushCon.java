package controler;
 import java.util.ArrayList;
import java.util.Scanner;

import menu.Crush;
import menu.Item;
import menu.SubMenu;
public class CrushCon {

	public static Item crush() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your free crush");
		System.out.println("*************************************************************************");
		ArrayList crush=Crush.crush();
		int i=1;
		for (Object o: crush) {
			Item crush_=(Item)o;
			System.out.println(i++ +") "+crush_.itemName);
			
		}
		System.out.println("*************************************************************************");
		System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
		
		int choice=sc.nextInt();
		Item crush_=(Item)crush.get(choice-1);
		System.out.println("You choose \n"+crush_.itemName);
		System.out.println("***************************");
		return crush_;
	}

}
