package dungeon.action;

import dungeon.level.Level;

import dungeon.Dungeon;
import dungeon.room.Room;

public class Go implements Action {

	/**
	 * @see Action
	 */
	public void execute(String[] args) {
		if (args.length < 2) {
			Dungeon.message("go where?");
		}
		else {
			Level level = Dungeon.getCurrentLevel();
			Room previousRoom = level.getPreviousRoom();
			Room currentRoom = level.getCurrentRoom();
			Room nextRoom = currentRoom.getNeighbour(args[1]);
			if (nextRoom != previousRoom && currentRoom.mustFight()) {
				Dungeon.messageFight();
			} else if (nextRoom == null) {
				Dungeon.message("Can't go there.");
			} else {
				level.setCurrentRoom(nextRoom);
				Dungeon.getAction("about").execute("about here".split(" ", 2));
			}			
		}
	}
}
