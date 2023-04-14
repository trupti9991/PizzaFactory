package controler;

import java.util.ArrayList;
import java.util.Scanner;

import application.Application;
import menu.Crush;
import menu.Item;
import menu.Toppings;
import repository.Repo;

public class ToppingsCon {
	static boolean moreTopping=false;
	public static void toppingCon() {
		
		Item item= (Item)repository.Repo.order.get(repository.Repo.order.size()-2);
		if (item.itemName.contains("(Large)")) {
			ToppingsCon.isLargePizza();
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose topping");
			System.out.println("*************************************************************************");
			ArrayList toppings=ToppingsCon.toppings();
			int i=1;
			for (Object o: toppings) {
				Item topping=(Item)o;
				System.out.println(i++ +") "+topping.itemName);
				
			}
			System.out.println("*************************************************************************");
			System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
			
			int choice=sc.nextInt();
			Item topping=(Item)toppings.get(choice-1);
			System.out.println("You choose \n"+topping.itemName);
			System.out.println("***************************");
			
			Repo.order.add(topping);
			ToppingsCon.moreToppings();
		}
	}
	
	static void isLargePizza() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Congratulation sir \n You got 2 free toppings of your choice");
		for (int j=1;j<=2;j++) {
			System.out.println("Choose the topping");
			System.out.println("*************************************************************************");
			ArrayList toppings=ToppingsCon.toppings();
			int i=1;
			for (Object o: toppings) {
				Item topping=(Item)o;
				System.out.println(i++ +") "+topping.itemName);
				
			}
			System.out.println("*************************************************************************");
			System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
			
			int choice=sc.nextInt();
			Item topping=(Item)toppings.get(choice-1);
			System.out.println("You choose \n"+topping.itemName);
			System.out.println("***************************");
			Repo.order.add(new Item(topping.itemName,0,topping.itemType));
			ToppingsCon.moreTopping=true;
		}
		ToppingsCon.moreToppings();
		
	}

	public static ArrayList toppings() {
		Item item= (Item)repository.Repo.order.get(repository.Repo.order.size()- ++Application.toppingCount);
		switch (item.itemType) {
		case 'v':return Toppings.vegToppings();
		case 'n':ArrayList forNonVegPizza=new ArrayList();
				Item itm=(Item)repository.Repo.order.get(repository.Repo.order.size()-1);
				if (moreTopping && itm.itemType=='n') {
				}
				else {
					forNonVegPizza.addAll(Toppings.nonVegToppings());
				}
				
				for (Object o:Toppings.vegToppings()) {
					Item vegTopping=(Item)o;
					if (vegTopping.itemName.equalsIgnoreCase("Paneer")) continue;
					forNonVegPizza.add(vegTopping);
				}
				return forNonVegPizza;
		default :return null;
		}
		
		
	}	
	
	public static void moreToppings() {
		Scanner sc = new Scanner(System.in);
		boolean toppingLoop=true;
		while (toppingLoop) {
			int j=1;
			System.out.println(j++ +") Choose another topping");
			System.out.println(j++ +") Continue");
			System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
			switch (sc.nextInt()) {
				case 1:	ToppingsCon.moreTopping=true;
						ToppingsCon.toppingCon();
						break;
				case 2: toppingLoop=false;
						ToppingsCon.moreTopping=false;
						break;
				default:toppingLoop=false;
				ToppingsCon.moreTopping=false;
			}
		}					
	}
}
