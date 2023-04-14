package menu;

import java.util.ArrayList;

public class Crush {

	public static ArrayList crush() {
		ArrayList crush=new ArrayList();

		crush.add(new Item("New hand tossed",0,'u'));
		crush.add(new Item("Wheat thin crust",0,'u'));
		crush.add(new Item("Cheese Burst",0,'u'));
		crush.add(new Item("Fresh pan pizza",0,'u'));

		return crush;
	}

}
