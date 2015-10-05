package dungeon.action;

import dungeon.Chest;
import dungeon.Dungeon;
import dungeon.character.Hero;
import dungeon.level.Level;
import dungeon.room.Room;

public class Open implements Action {

	public void execute(String[] args) {
		Level level = Dungeon.getCurrentLevel();
		Room currentRoom = level.getCurrentRoom();
		Chest chest = currentRoom.getChest();
		if (chest == null) {
			Dungeon.message("You open the air...");
		} else if (chest.isEmpty()) {
			Dungeon.message("This chest is empty.");
		} else {
			Hero hero = Dungeon.getHero();
			String gifts = chest.getDescription();
			chest.open(hero);
			Dungeon.message("You found a treasure!");
			Dungeon.message("Gifts: " + gifts + ".");
		}
	}
}
