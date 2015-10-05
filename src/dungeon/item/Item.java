package dungeon.item;

import dungeon.character.Hero;

/**
 * Common stuffs for all items.
 */
public abstract class Item {

	/**
	 * The name of the item.
	 */
	protected String name;
	public abstract void goToInventory(Hero hero);

	/*
	 * Initializes the item.
	 * 
	 * @param name
	 */
	public Item(String name) {
		this.name = name;
	}

	/**
	 * Gives the name of the item.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	
	
	/**
	 * Returns a String object representing this Item's value.
	 */
	public String toString () {
		return this.name;
	}

}
