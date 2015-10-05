package dungeon.room;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import dungeon.character.Character;
import dungeon.Chest;
import dungeon.DoorButton;
import dungeon.door.Door;

public class Room {

	/** The name of the room. */
	protected String name;
	/** The list of doors in the room. */
	protected HashMap<String, Door> doors = new HashMap<String, Door>();

	/**
	 * Builds a new room.
	 * 
	 * @param name
	 *            The name of the room.
	 */
	public Room(String name) {
		this.name = name;
	}

	/**
	 * Gives the name of the room.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Adds a door to the room.
	 * 
	 * @param name
	 *            The name of the door.
	 * @param door
	 *            The door object.
	 */
	public void addDoor(String name, Door door) {
		this.doors.put(name, door);
	}

	/**
	 * Returns a button if present in the room.
	 */
	public DoorButton getButton() {
		return null;
	};

	/**
	 * Returns a chest if present in the room.
	 * 
	 * @return
	 */
	public Chest getChest() {
		return null;
	}
	
	/**
	 * Returns a monster if present in the room.
	 * 
	 * @return
	 */
	public Character getMonster() {
		return null;
	}

	public boolean mustFight() {
		return false;
	}
	
	/**
	 * Gives the room behind the given door.
	 * 
	 * @param doorName
	 *            The name of the door.
	 * @return
	 */
	public Room getNeighbour(String doorName) {
		Door door = this.getDoor(doorName);
		if (door == null) {
			return null;
		} else {
			return door.getNextRoom(this);
		}
	}

	/**
	 * Returns a door according to the given name.
	 * 
	 * @param doorName
	 * @return
	 */
	public Door getDoor(String doorName) {
		return this.doors.get(doorName);
	}

	/**
	 * Gives a description of the room (name, doors, monsters, items...).
	 * 
	 * @return
	 */
	public String getDescription() {
		String description = "Room: " + name + ".";
		Set<Entry<String, Door>> entrySet = doors.entrySet();
		if (!entrySet.isEmpty()) {
			description += "\nDoors: ";
			int nHidden = 0;
			Iterator<Entry<String, Door>> doorsIt = entrySet.iterator();
			while (doorsIt.hasNext()) {
				Entry<String, Door> entry = doorsIt.next();
				Door door = entry.getValue();
				if (door.isHidden()) {
					nHidden++;
				} else {
					description += entry.getKey();
					if (door.isLocked()) {
						description += " (locked)";
					}
					description += ", ";
				}
			}
			description += nHidden + " hidden ";
			description += nHidden == 1 ? "door" : "doors";
			description += ".";
		}
		return description;
	}

	/**
	 * Returns a string representation of the room.
	 */
	public String toString() {
		return name;
	}
}
