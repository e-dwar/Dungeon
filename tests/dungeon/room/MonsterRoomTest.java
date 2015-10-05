package dungeon.room;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.character.Character;
import dungeon.character.CharacterMock;
import dungeon.door.Door;
import dungeon.room.MonsterRoom;
import dungeon.room.Room;

public class MonsterRoomTest extends RoomTest {

	private Character monster = new CharacterMock("rabbit", 10);

	public Room createRoom() {
		return new MonsterRoom("room A");
	}

	@Test
	public void getMonsterTest() {
		MonsterRoom roomA = (MonsterRoom) this.roomA;
		roomA.setMonster(monster);
		assertEquals(monster, roomA.getMonster());
	}

	@Test
	public void getDescriptionTest() {
		MonsterRoom roomA = (MonsterRoom) this.roomA;
		Room roomB = new Room("room B");
		Door east = new Door(roomA, roomB);
		Door west = new Door(roomA, roomB);
		String namePart = "Room: room A.";
		String monsterPart = "\nMonster: rabbit (life: 10).";
		String doorsEastPart = "\nDoors: east, 0 hidden doors.";
		String doorsEastWestPart = "\nDoors: east, west, 0 hidden doors.";
		assertEquals(namePart, roomA.getDescription());
		roomA.setMonster(monster);
		assertEquals(namePart + monsterPart, roomA.getDescription());
		roomA.addDoor("east", east);
		assertEquals(namePart + doorsEastPart + monsterPart, roomA.getDescription());
		roomA.addDoor("west", west);
		assertEquals(namePart + doorsEastWestPart + monsterPart, roomA.getDescription());
	}
}
