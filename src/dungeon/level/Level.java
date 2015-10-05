package dungeon.level;

import dungeon.room.Room;

public abstract class Level {

    protected Room currentRoom;
    protected Room previousRoom;
    
    /*
     * Gives the current room.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /*
     * Gives the previous room.
     */
    public Room getPreviousRoom() {
        return previousRoom;
    }
    
    public void setCurrentRoom(Room room) {
    	this.previousRoom = this.currentRoom;
    	this.currentRoom = room;
    }
}
