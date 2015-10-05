package dungeon.character;

import dungeon.item.Fist;

public class Dragon extends Character {

	public Dragon(String name) {
		super(name, 32);
		this.weapon = new Fist();
		this.favoriteFood = "humans";
	}

}
