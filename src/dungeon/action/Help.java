package dungeon.action;

import dungeon.Dungeon;

public class Help implements Action {

	public void execute(String[] args) {
		Dungeon.message("about me      : display informations about the hero.");
		Dungeon.message("about here    : display informations about the room.");
		Dungeon.message("go <door>     : move from one room to another.");
		Dungeon.message("unlock <door> : unlock the given door.");
		Dungeon.message("press         : press a button in the room.");
		Dungeon.message("open          : open a chest in the room.");
		Dungeon.message("fight         : fight a monster until death.");
		Dungeon.message("feed          : feed a monster (no junk food please).");
	}
}
