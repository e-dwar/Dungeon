package dungeon.door;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.room.Room;

public class HiddenDoorTest {

	@Test
	public void isHiddenTest() {
		Room roomA = new Room("room A");
		Room roomB = new Room("room B");
		HiddenDoor door = new HiddenDoor(roomA, roomB);
		assertTrue(door.isHidden());
		door.reveal();
		assertFalse(door.isHidden());
	}

}
