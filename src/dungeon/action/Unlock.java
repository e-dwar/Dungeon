package dungeon.action;

import dungeon.Dungeon;
import dungeon.character.Hero;
import dungeon.door.Door;
import dungeon.level.Level;
import dungeon.room.Room;

public class Unlock implements Action {

	/**
	 * @see Action
	 */
	public void execute(String[] args) {
		if (args.length < 2) {
			Dungeon.message("unlock what?");
		} else {
			Level level = Dungeon.getCurrentLevel();
			Room currentRoom = level.getCurrentRoom();
			Door door = currentRoom.getDoor(args[1]);
			Hero hero = Dungeon.getHero();
			if (currentRoom.mustFight()) {
				Dungeon.messageFight();
			} else if (door == null) {
				Dungeon.message("You unlock the air...");
			} else if (!door.isLocked()) {
				Dungeon.message("This door is not locked.");
			} else if (!hero.hasAKey()) {
				Dungeon.message("Go find a key!");
			} else {
				hero.useAKey();
				door.unlock();
				Dungeon.message("\"" + (args[1]) + "\" door is now unlocked!");
			}
		}

	}
}
