package menu;

import java.util.ArrayList;

public class Toppings {

	public static ArrayList vegToppings() {
		ArrayList vegToppings =new ArrayList();
		int i=1;
		vegToppings.add(new menu.Item("Black olive",20,'v'));
		vegToppings.add(new menu.Item("Capsicum", 25,'v'));
		vegToppings.add(new menu.Item("Paneer", 35,'v'));
		vegToppings.add(new menu.Item("Mushroom", 30,'v'));
		vegToppings.add(new menu.Item("Fresh tomato",10,'v'));
			
		return vegToppings;
	}	
	public static ArrayList nonVegToppings() {
		ArrayList nonVegToppings =new ArrayList();
		int i=1;
		nonVegToppings.add(new menu.Item("Chicken tikka", 35,'n'));
		nonVegToppings.add(new menu.Item("Barbeque chicken",45,'n'));
		nonVegToppings.add(new menu.Item("Grilled chicken",40,'n'));
			
		return nonVegToppings;
	}
}
