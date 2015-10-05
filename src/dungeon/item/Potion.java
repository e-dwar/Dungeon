package dungeon.item;

import dungeon.character.Hero;

public class Potion extends Item {

	protected int healthPoints;
	
	public Potion (int healthPoints){
		super("potion");
		this.healthPoints = healthPoints;
	}

	public int getHealthPoints() {
		return healthPoints;
	}
	
	/**
	 * @see Item
	 */
	public void goToInventory(Hero hero) {
		hero.addAPotion(this);
	}

	/**
	 * Returns a String representing the potion.
	 */
	public String toString() {
		return this.name + " (" + this.healthPoints + ")";
	}
}
