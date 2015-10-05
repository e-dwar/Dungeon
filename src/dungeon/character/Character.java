package dungeon.character;

import dungeon.item.Weapon;

public abstract class Character {

	/** The name of the character. */
	protected String name;
	/** The current life points of the character. */
	protected int healthPoints;
	/** The maximum life points of the character. */
	protected int maxHealthPoints;
	/** The weapon of the character. */
	protected Weapon weapon;
	/** The favorite food of the character. */
	protected String favoriteFood;
	/** The feeling of the character. */
	protected boolean isHappy;

	/**
	 * 
	 * @param name
	 *            The name of the character.
	 * @param healthPoints
	 *            The life points of the character.
	 */
	public Character(String name, int healthPoints) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.maxHealthPoints = healthPoints;
	}

	public String getName() {
		return this.name;
	}

	public int getHealthPoints() {
		return this.healthPoints;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	public String getFavoriteFood() {
		return this.favoriteFood;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void setIsHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	/**
	 * Removes life points from the character until zero.
	 * 
	 * @param damage
	 *            The amount of life points to remove.
	 */
	public void takeAKnock(int damage) {
		this.healthPoints -= damage;
		this.healthPoints = Math.max(this.healthPoints, 0);
	}

	/**
	 * Removes life points from the given enemy based on the damage of the
	 * weapon.
	 * 
	 * @param enemy
	 *            The enemy from whom to remove life points.
	 */
	public void attack(Character enemy) {
		enemy.takeAKnock(this.weapon.getDamage());
	}

	/**
	 * Resets the life points to the maximum life points.
	 */
	public void heal() {
		this.healthPoints = this.maxHealthPoints;
	}

	/**
	 * Adds the given amount of life points until the maximum life points.
	 * 
	 * @param healthPoints
	 *            The amount of life points to add.
	 */
	public void heal(int healthPoints) {
		this.healthPoints += healthPoints;
		this.healthPoints = Math.min(this.healthPoints, this.maxHealthPoints);
	}

	public boolean isDead() {
		return this.healthPoints == 0;
	}

	public boolean isKawai() {
		return false;
	}

	public boolean isHappy() {
		return this.isHappy;
	}

	public boolean eat(String food) {
		return false;
	}

	/**
	 * Returns a string representation of the character.
	 */
	public String toString() {
		if (this.isDead()) {
			return this.name + " (dead)";
		} else {
			return this.name + " (life: " + this.healthPoints + ")";
		}
	}
}
