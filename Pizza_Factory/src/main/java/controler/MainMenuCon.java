package controler;

import java.util.ArrayList;
import java.util.Scanner;

import menu.MainMenu;

public class MainMenuCon {
	public static int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("The Menu is");
		System.out.println("***********");
		int i=1;
		ArrayList<String> mainMenu=MainMenu.mainMenu();
		for (String main_Menu: mainMenu) {
			System.out.println(i++ +") "+main_Menu);		
		}
		System.out.println("**************");
		
		System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
		
		int choice=sc.nextInt();
		System.out.println("You choose \n"+mainMenu.get(choice-1));
		System.out.println("***************************");
		
		return choice;
	}
	
}
