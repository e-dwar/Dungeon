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

	/**
	 * Adds itself to the inventory of the hero.
	 * 
	 * @param hero 
	 */
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
	 * Returns a String representing the Item.
	 */
	public String toString() {
		return this.name;
	}

}
