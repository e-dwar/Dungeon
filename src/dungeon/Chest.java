package dungeon;

import java.util.ArrayList;
import java.util.Iterator;


import dungeon.character.Hero;
import dungeon.item.Item;

public class Chest {
	
	private ArrayList<Item> treasures;
	
	public Chest () {
		this.treasures = new ArrayList<Item>();
	}
	
	public void addTreasure(Item treasure) {
		this.treasures.add(treasure);
	}
	
	public void open (Hero hero) {
		while (this.treasures.size() > 0) {
			this.treasures.remove(0).goToInventory(hero);
		}
	}
	
	public String getDescription() {
		String description = "";
		Iterator<Item> it = this.treasures.iterator();
		while (it.hasNext()) {
			description += it.next();
			if (it.hasNext()) {
				description += "\n+ ";
			}
		}
		return description;
	}
	
	public boolean isEmpty () {
		return this.treasures.isEmpty();
	}
}
