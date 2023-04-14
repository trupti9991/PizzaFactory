package menu;

import java.util.ArrayList;

public class SubMenu {
	
	public static ArrayList<String> subMenu(int choice){

		switch (choice) {
		case 1: return vegPizza();
		case 2: return nonVegPizza();
		default : return null;
		}
		
	}

	public static ArrayList vegPizza(){
		ArrayList vegPizza=new ArrayList();

		vegPizza.add(new Item("Deluxe Veggie pizza: \t(Regular)",150,'v'));
		vegPizza.add(new Item("Deluxe Veggie pizza: \t(Medium) ", 200,'v'));
		vegPizza.add(new Item("Deluxe Veggie pizza: \t(Large)  ", 325,'v'));

		vegPizza.add(new Item("Cheese and corn pizza: \t(Regular)", 175,'v'));
		vegPizza.add(new Item("Cheese and corn pizza: \t(Medium)", 375,'v'));
		vegPizza.add(new Item("Cheese and corn pizza: \t(Large) ", 475,'v'));

		vegPizza.add(new Item("Paneer Tikka pizza:    \t(Regular)", 160,'v'));
		vegPizza.add(new Item("Paneer Tikka pizza:    \t(Medium)", 290,'v'));
		vegPizza.add(new Item("Paneer Tikka pizza:    \t(Large) ", 340,'v'));


		
		return vegPizza;
	}
	
	private static ArrayList nonVegPizza() {
		ArrayList nonVegPizza=new ArrayList();
		nonVegPizza.add(new Item("Non-Veg Supreme pizza: 	\t(Regular)",190,'n'));
		nonVegPizza.add(new Item("Non-Veg Supreme pizza: 	\t(Medium)",325,'n'));
		nonVegPizza.add(new Item("Non-Veg Supreme pizza:  	\t(Large) ",425,'n'));

		nonVegPizza.add(new Item("Chicken Tikka pizza:		\t(Regular)",210,'n'));
		nonVegPizza.add(new Item("Chicken Tikka pizza:		\t(Medium)",370,'n'));
		nonVegPizza.add(new Item("Chicken Tikka pizza:		\t(Large) ",500,'n'));

		nonVegPizza.add(new Item("Pepper Barbecue Chicken pizza: \t(Regular)",220,'n'));
		nonVegPizza.add(new Item("Pepper Barbecue Chicken pizza: \t(Medium)",380,'n'));
		nonVegPizza.add(new Item("Pepper Barbecue Chicken pizza: \t(Large) ",525,'n'));

		return nonVegPizza;
	}

}
