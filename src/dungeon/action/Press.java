package dungeon.action;

import dungeon.DoorButton;
import dungeon.Dungeon;
import dungeon.level.Level;
import dungeon.room.Room;

public class Press implements Action {

	/**
	 * @see Action
	 */
	public void execute(String[] args) {
		Level level = Dungeon.getCurrentLevel();
		Room currentRoom = level.getCurrentRoom();
		DoorButton button = currentRoom.getButton();
		if (button == null) {
			Dungeon.message("You pressed the air...");
		} else if (button.isPressed()) {
			Dungeon.message("This button has been pressed already.");
		} else {
			button.press();
			Dungeon.message("A new door is available!");
		}
	}
}
