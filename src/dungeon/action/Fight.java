package dungeon.action;

import dungeon.Dungeon;
import dungeon.character.Character;
import dungeon.character.Hero;
import dungeon.level.Level;

public class Fight implements Action {

	/**
	 * @see Action
	 */
	public void execute(String[] args) {
		Level level = Dungeon.getCurrentLevel();
		Hero hero = Dungeon.getHero();
		Character monster = level.getCurrentRoom().getMonster();
		if (monster == null) {
			Dungeon.message("You fight the air...");
		} else {
			int potionsUsed = 0;
			while (!hero.isDead() && !monster.isDead()) {
				hero.attack(monster);
				if (!monster.isDead()) {
					monster.attack(hero);
					if (hero.hasAPotion()) {
						hero.useAPotion();
						potionsUsed++;
					}
				}
			}
			if (hero.isDead()) {
				Dungeon.message("You are dead :-P");
			} else {
				Dungeon.message("You killed " + monster.getName() + "!");
				Dungeon.message("You used " + potionsUsed + " potions.");
				Dungeon.message("Bonus: full life!");
				hero.heal();
			}
		}
	}
}
