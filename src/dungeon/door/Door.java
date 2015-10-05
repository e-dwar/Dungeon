package dungeon.door;

import dungeon.room.Room;

public class Door {

	protected Room roomA;
	protected Room roomB;

	public Door(Room roomA, Room roomB) {
		this.roomA = roomA;
		this.roomB = roomB;
	}

	public Room getNextRoom(Room currentRoom) {
		if (this.isLocked() || this.isHidden()) {
			return null;
		}
		else if (currentRoom == roomA){
			return roomB;
		}
		else{			
			return roomA;
		}
	}
	
	public boolean isLocked(){
		return false;
	}
	
	public boolean isHidden(){
		return false;
	}

	public void unlock() {
		// noop
		
	}
}
