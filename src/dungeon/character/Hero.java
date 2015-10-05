package dungeon.character;

import java.util.ArrayList;

import dungeon.item.Fist;
import dungeon.item.Key;
import dungeon.item.Potion;

public class Hero extends Character {

	protected ArrayList<Key> keys;
	protected ArrayList<Potion> potions;

	public Hero(String name) {
		super(name, 32);
		this.setWeapon(new Fist());
		this.keys = new ArrayList<Key>();
		this.potions = new ArrayList<Potion>();
	}
	
	public boolean hasAPotion() {
		return this.potions.size() > 0;
	}

	public void addAKey(Key key) {
		this.keys.add(key);
	}

	public void addAPotion(Potion potion) {
		this.potions.add(potion);
	}

	public Key useAKey() {
		if (this.keys.size() == 0) {
			return null;
		} else {
			return this.keys.remove(0);
		}
	}

	public void useAPotion() {
		Potion potion = this.potions.remove(0);
		this.heal(potion.getHealthPoints());
	}

	public String getDescription() {
		String description = "Name: " + this.name + ".";
		description += "\nLife: " + this.healthPoints;
		description += " (max: " + this.maxHealthPoints + ").";
		description += "\nWeapon: " + this.weapon + ".";
		description += "\nPotions: " + this.potions.size() + ".";
		description += "\nKeys: " + this.keys.size() + ".";
		return description;
	}

	public boolean hasAKey() {
		return this.keys.size() > 0;
	}
}
