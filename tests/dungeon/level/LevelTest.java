package dungeon.level;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dungeon.room.Room;

public class LevelTest {

	private Level level;
	private Room roomA = new Room("room A");
	private Room roomB = new Room("room B");
	
	@Before
	public void before() {
		level = new LevelMock();
	}
	
	@Test
	public void initTest() {
		assertTrue(level.getCurrentRoom() == null);
		assertTrue(level.getPreviousRoom() == null);
	}
	
	@Test
	public void setCurrentRoomTest() {
		level.setCurrentRoom(roomA);
		assertEquals(roomA, level.getCurrentRoom());
		assertTrue(level.getPreviousRoom() == null);
		level.setCurrentRoom(roomB);
		assertEquals(roomB, level.getCurrentRoom());
		assertEquals(roomA, level.getPreviousRoom());
	}
	
	@Test
	public void getCurrentRoomTest() {
		level.setCurrentRoom(roomA);
		assertEquals(roomA, level.getCurrentRoom());
	}
	
	@Test
	public void getPreviousRoomTest() {
		level.setCurrentRoom(roomA);
		assertTrue(level.getPreviousRoom() == null);
		level.setCurrentRoom(roomB);
		assertEquals(roomA, level.getPreviousRoom());
	}

}
