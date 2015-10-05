package dungeon.room;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dungeon.door.Door;
import dungeon.room.Room;


public class RoomTest {
	
	protected Room roomA;
	
	public Room createRoom() {
		return new Room("room A");
	}
	
	@Before
	public void before() {
		roomA = this.createRoom();
	}

	@Test
	public void getNameTest() {
		assertEquals("room A", roomA.getName());
	}

	@Test
	public void toStringTest() {
		assertEquals("room A", roomA + "");
	}

	@Test
	public void getDescriptionTest() {
		Room roomB = new Room("room B");
		Door east = new Door(roomA, roomB);
		Door west = new Door(roomA, roomB);
		String namePart = "Room: room A.";
		String doorsEastPart = "\nDoors: east, 0 hidden doors.";
		String doorsEastWestPart = "\nDoors: east, west, 0 hidden doors.";
		assertEquals(namePart, roomA.getDescription());
		roomA.addDoor("east", east);
		assertEquals(namePart + doorsEastPart, roomA.getDescription());
		roomA.addDoor("west", west);
		assertEquals(namePart + doorsEastWestPart, roomA.getDescription());
	}

	@Test
	public void getNeighbourTest() {
		Room roomB = new Room("room B");
		Room roomC = new Room("room C");
		roomA.addDoor("east", new Door(roomA, roomB));
		roomA.addDoor("west", new Door(roomA, roomC));
		assertTrue(roomA.getNeighbour("north") == null);
		assertEquals(roomB, roomA.getNeighbour("east"));
		assertEquals(roomC, roomA.getNeighbour("west"));
	}
}
