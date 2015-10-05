package dungeon.door;
import static org.junit.Assert.*;
import org.junit.Test;

import dungeon.door.Door;
import dungeon.room.Room;


public class DoorTest {

    @Test
    public void getNextRoomTest () {
		Room entrance = new Room("entrance");
		Room exit = new Room("exit");
    	Door door = new Door(entrance, exit);
    	assertEquals(door.getNextRoom(entrance), exit);
    	assertEquals(door.getNextRoom(exit), entrance);
    }

    @Test
    public void isLockedTest () {
		Room entrance = new Room("entrance");
		Room exit = new Room("exit");
    	Door door = new Door(entrance, exit);
		assertFalse(door.isLocked());
    }
}
