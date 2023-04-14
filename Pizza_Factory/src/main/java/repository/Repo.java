package repository;

import java.util.ArrayList;

import menu.Item;

public class Repo {
	public static ArrayList order = new ArrayList();
	public static void Repo(Item item) {
		order.add(item);	
	}

}
