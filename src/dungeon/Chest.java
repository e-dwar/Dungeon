package dungeon;

import java.util.ArrayList;
import java.util.Iterator;

import dungeon.character.Hero;
import dungeon.item.Item;

public class Chest {

	/**
	 * The content of the chest.
	 */
	private ArrayList<Item> treasures = new ArrayList<Item>();;

	/**
	 * Adds an item in the chest.
	 * 
	 * @param treasure
	 *            The item to add.
	 */
	public void addTreasure(Item treasure) {
		this.treasures.add(treasure);
	}

	/**
	 * Transfers items from the chest to the given hero.
	 * 
	 * @param hero
	 *            The hero to whom to give the items.
	 */
	public void open(Hero hero) {
		while (this.treasures.size() > 0) {
			this.treasures.remove(0).goToInventory(hero);
		}
	}

	/**
	 * Generates a description about the content of the chest.
	 * 
	 * @return
	 */
	public String getDescription() {
		String description = "";
		if (this.treasures.size() == 0) {
			description = "empty";
		} else {
			Iterator<Item> it = this.treasures.iterator();
			while (it.hasNext()) {
				description += it.next();
				if (it.hasNext()) {
					description += "\n+ ";
				}
			}
		}
		return description;
	}

	/**
	 * Returns true if the chest is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return this.treasures.isEmpty();
	}
}
