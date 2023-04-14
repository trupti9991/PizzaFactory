package controler;

import java.util.ArrayList;
import java.util.Scanner;

import menu.Item;
import menu.SubMenu;

public class SubMenuCon {
	public static Item subMenu(int choice) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your order");
		System.out.println("*************************************************************************");
		ArrayList subMenu=SubMenu.subMenu(choice);
		int i=1;
		for (Object o: subMenu) {
			Item sub_Menu=(Item)o;
			System.out.println(i++ +") "+sub_Menu.itemName+"\t price : Rs "+sub_Menu.itemPrice);
			
		}
		System.out.println("*************************************************************************");
		System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
		
		choice=sc.nextInt();
		Item item=(Item)subMenu.get(choice-1);
		System.out.println("You choose \n"+item.itemName);
		System.out.println("***************************");
		return item;

	}
}
