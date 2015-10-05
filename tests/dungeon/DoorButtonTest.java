package dungeon;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dungeon.door.HiddenDoor;
import dungeon.room.Room;

public class DoorButtonTest {

	private DoorButton button;
	private HiddenDoor door;

	@Before
	public void before() {
		Room roomA = new Room("room A");
		Room roomB = new Room("room B");
		door = new HiddenDoor(roomA, roomB);
		button = new DoorButton(door);
	}

	@Test
	public void isPressedTest() {
		assertFalse(button.isPressed());
		button.press();
		assertTrue(button.isPressed());
	}

	@Test
	public void pressTest() {
		assertTrue(door.isHidden());
		button.press();
		assertFalse(door.isHidden());
	}

}
