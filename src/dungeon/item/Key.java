package dungeon.item;

import dungeon.character.Hero;

public class Key extends Item {

	protected int lifespan;

	public Key(int lifespan) {
		super("key");
		this.lifespan = lifespan;
	}

	public int getLifespan() {
		return lifespan;
	}
	
	public void goToInventory(Hero hero) {
		hero.addAKey(this);
	}
	
	public String toString() {
		return this.name + " (" + this.lifespan + ")";
	}
}
