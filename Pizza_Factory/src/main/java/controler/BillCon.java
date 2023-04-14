package controler;

import java.util.Iterator;

import menu.Item;
import repository.Repo;


public class BillCon {
	public static void bill() {
		System.out.println("You choose following items");
		System.out.println("*****************************************************************************");
		int i=1,total=0;
		Iterator it=Repo.order.iterator();
		while (it.hasNext()) {
			Item item=(Item)it.next();
			System.out.println(i++ +") "+item.itemName+" \n		\t	\t	\t price : Rs "+item.itemPrice);
			total+=item.itemPrice;
		}
		System.out.println("*****************************************************************************");
		System.out.println("Total bill is :		\t	\t	\t Rs "+total);
		System.out.println("*****************************************************************************");
	}
}
