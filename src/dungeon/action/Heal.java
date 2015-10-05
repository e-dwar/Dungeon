package dungeon.action;

import dungeon.Dungeon;
import dungeon.character.Hero;

public class Heal implements Action {

	public void execute(String[] args) {
		Hero hero = Dungeon.getHero();
		if (hero.hasAPotion()) {			
			hero.useAPotion();
			Dungeon.message("You use a potion.");
			Dungeon.message("Life: " + hero.getHealthPoints() + ".");
		}
		else {
			Dungeon.message("You have no potion :-(");
		}
	}
}
