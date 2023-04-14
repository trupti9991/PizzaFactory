package application;

import java.util.ArrayList;
import java.util.Scanner;

import controler.BillCon;
import controler.CrushCon;
import controler.MainMenuCon;
import controler.SubMenuCon;
import controler.ToppingsCon;
import repository.Repo;


public class Application {
	

	public static int toppingCount;
	public static void main(String[] args) {

		System.out.println("WELCOME TO PIZZA FACTORY! ");
		System.out.println("*************************");
		System.out.println(" Hello! sir/mam");
		System.out.println("***************");
		System.out.println("Please choose your order from menu!");
		Application.order();
		
		
	}
		static void order() {
			Scanner sc = new Scanner(System.in);
	 
			Repo.order.add(SubMenuCon.subMenu(MainMenuCon.mainMenu()));
			Repo.order.add(CrushCon.crush());
			toppingCount=1;
			controler.ToppingsCon.toppingCon();
			controler.SidesCon.sidesCon();
			
			boolean loop=true;
			while (loop) {
				int i=1;
				System.out.println(i++ +") Choose your pizza");
				System.out.println(i++ +") Continue");
				System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
				switch (sc.nextInt()) {
					case 1:	Repo.order.add(SubMenuCon.subMenu(MainMenuCon.mainMenu()));
							Repo.order.add(CrushCon.crush());
							toppingCount=1;
							controler.ToppingsCon.toppingCon();
							
							break;
					case 2: loop=false;	break;
					default:loop=false;
				}
			}
			Application.bill();
		}

		static void bill() {

			Scanner sc = new Scanner(System.in);
	
			BillCon.bill();
			int i=1;
			System.out.println();
			System.out.println(i++ +") Confirm order");
			System.out.println(i++ +") Add item");
			System.out.println(i++ +") New Order");
			System.out.println(i++ +") Cancel order");
			System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
			
			boolean loop=true;
			while (loop) {
				switch (sc.nextInt()) {
				case 1:	System.out.println("Your final bill");
						BillCon.bill();
						System.out.println("Thank you sir/mam! \n Visit again");
						break;
				case 2: Application.order();
						break;
				case 3: Repo.order=new ArrayList();
						Application.order();
						break;
				case 4: System.out.println("Thank you sir/mam! \n Visit again");
						loop=false;
						break;
				default:loop=false;
			}			
		}
	}
}
