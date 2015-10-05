package dungeon.action;

import dungeon.level.Level;

import dungeon.Dungeon;
import dungeon.character.Character;
import dungeon.character.Hero;
import dungeon.room.Room;

public class Feed implements Action {

	/**
	 * @see Action
	 */
	public void execute(String[] args) {
		int diffHP;
		Hero hero = Dungeon.getHero();
		Level level = Dungeon.getCurrentLevel();
		int previousHP = hero.getHealthPoints();
		Room currentRoom = level.getCurrentRoom();
		Character monster = currentRoom.getMonster();
		if (monster == null) {
			Dungeon.message("You feed the air...");
		} else if (!monster.isKawai()) {
			String name = "\"" + monster.getName() + "\"";
			monster.attack(hero);
			diffHP = previousHP - hero.getHealthPoints();
			Dungeon.message(name + " is devilish!");
			Dungeon.message("He beats you severely! -" + diffHP + "HP!");
			if (hero.isDead()) {
				Dungeon.message("You are dead...");
			}
		} else {
			String name = "\"" + monster.getName() + "\"";
			Dungeon.message("What do you think " + name + " likes to eat?");
			String food = Dungeon.prompt();
			if (monster.eat(food)) {
				hero.heal();
				diffHP = hero.getHealthPoints();
				Dungeon.message(name + " is so grateful that he kisses you <3");
				Dungeon.message("Your heart is about to blow up! +" + diffHP
						+ "HP!");
			} else {
				monster.attack(hero);
				diffHP = previousHP - hero.getHealthPoints();
				Dungeon.message(name + " is very angry about this junk food.");
				Dungeon.message("He gives you a good hiding! -" + diffHP
						+ "HP!");
			}
			if (hero.isDead()) {
				Dungeon.message("You are dead...");
				Dungeon.message(name + " likes to eat "
						+ monster.getFavoriteFood() + " of course!");
			}
		}
	}
}
