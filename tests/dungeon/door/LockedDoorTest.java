package dungeon.door;
import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.door.LockedDoor;
import dungeon.room.Room;


public class LockedDoorTest {

	@Test
	public void isLockedTest() {
		Room roomA = new Room("room A");
		Room roomB = new Room("room B");
		LockedDoor door = new LockedDoor(roomA, roomB);
		assertTrue(door.isLocked());
		door.unlock();
		assertFalse(door.isLocked());
	}

}
