package dungeon.action;

import dungeon.character.Hero;
import dungeon.level.Level;

import dungeon.Dungeon;
import dungeon.room.Room;

public class About implements Action {

	/**
	 * @see Action
	 */
	public void execute(String[] args) {
		if (args.length < 2) {
			Dungeon.message("about what?");
		}
		else {
			switch (args[1]) {
			case "here":
				Level level = Dungeon.getCurrentLevel();
				Room currentRoom = level.getCurrentRoom();
				Dungeon.message(currentRoom.getDescription());
				break;
			case "me":
				Hero hero = Dungeon.getHero();
				Dungeon.message(hero.getDescription());
				break;
			default:
				Dungeon.messageIdk();
			}			
		}
	}
}
