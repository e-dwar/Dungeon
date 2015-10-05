package dungeon.door;

import dungeon.room.Room;

public class LockedDoor extends Door {

	protected boolean locked = true;

	public LockedDoor(Room roomA, Room roomB) {
		super(roomA, roomB);
	}

	public boolean isLocked() {
		return this.locked;
	}

	public void unlock() {
		this.locked = false;
	}
}