package dungeon.door;

import dungeon.room.Room;

public class HiddenDoor extends Door {

	protected boolean hidden = true;

	public HiddenDoor(Room roomA, Room roomB) {
		super(roomA, roomB);
	}

	public boolean isHidden() {
		return this.hidden;
	}

	public void reveal() {
		this.hidden = false;
	}

}
