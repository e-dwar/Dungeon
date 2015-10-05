package dungeon.character;

import dungeon.item.Weapon;

public abstract class Character {

	protected String name;
	protected int healthPoints;
	protected int maxHealthPoints;
	protected Weapon weapon;
	protected String favoriteFood;
	protected boolean isHappy;

	/**
	 * Constructor of Character
	 * 
	 * @param name
	 * @param healthPoints
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

	public void takeAKnock(int damage) {
		this.healthPoints -= damage;
		this.healthPoints = Math.max(this.healthPoints, 0);
	}

	public void attack(Character enemy) {
		enemy.takeAKnock(this.weapon.getDamage());
	}

	public void heal() {
		this.healthPoints = this.maxHealthPoints;
	}

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

	public String toString() {
		if (this.isDead()) {
			return this.name + " (dead)";
		} else {
			return this.name + " (life: " + this.healthPoints + ")";
		}
	}
}
