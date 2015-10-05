package dungeon.item;

import dungeon.character.Hero;

/**
 * Common stuffs for all weapons.
 */
public abstract class Weapon extends Item {

	/**
	 * The amount of damage dealt by the weapon.
	 */
	protected int damage;

	/*
	 * Initializes the weapon.
	 * 
	 * @param name The name of the weapon.
	 * 
	 * @param damage The amount of damage dealt by the weapon.
	 */
	protected Weapon(String name, int damage) {
		super(name);
		this.damage = damage;
	}

	/**
	 * Gives the amount of damage dealt by the weapon.
	 * 
	 * @return
	 */
	public int getDamage() {
		return this.damage;
	}
	
	public void goToInventory(Hero hero) {
		hero.setWeapon(this);
	}

	/**
	 * Returns a String object representing this Weapon's value.
	 */
	public String toString() {
		return this.name + " (dmg: " + this.damage + ")";
	}

}
