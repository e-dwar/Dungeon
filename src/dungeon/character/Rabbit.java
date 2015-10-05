package dungeon.character;

import java.util.Random;

import dungeon.item.Fist;

public class Rabbit extends Character {
	
	static Random rand = new Random();

	public Rabbit(String name) {
		super(name, 128);
		this.weapon = new Fist();
		this.favoriteFood = "carrots";
	}
	
	public void attack(Character enemy) {
		int hp = enemy.getHealthPoints();
		enemy.takeAKnock(rand.nextInt(hp) + 1);
	}
	
	public void takeAKnock(int damage) {
		super.takeAKnock(rand.nextInt(2) * damage);
	}
	
	public boolean isKawai() {
		return true;
	}

	/**
	 * 
	 * @param food
	 *            Rabbits love "carrot"s.
	 * @return
	 */
	public boolean eat(String food) {
		boolean isFavoriteFood = food.equals(this.favoriteFood);
		this.setIsHappy(isFavoriteFood);
		return isFavoriteFood;
	}

}
