package dungeon.character;

import dungeon.item.Knife;

public class EvilRabbit extends Character {

	public EvilRabbit(String name) {
		super(name, 128);
		this.weapon = new Knife();
		this.favoriteFood = "carrots";
	}

}
