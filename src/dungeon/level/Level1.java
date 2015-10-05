package dungeon.level;

import dungeon.Chest;
import dungeon.DoorButton;
import dungeon.character.Dragon;
import dungeon.character.Rabbit;
import dungeon.door.Door;
import dungeon.door.HiddenDoor;
import dungeon.door.LockedDoor;
import dungeon.item.Key;
import dungeon.room.ButtonRoom;
import dungeon.room.MonsterRoom;
import dungeon.room.Room;
import dungeon.room.TreasureRoom;

public class Level1 extends Level {

	public Level1() {
		
		// objects creation
		Rabbit goliath = new Rabbit("Goliath the rabbit");
		Dragon kys = new Dragon("Kys the dragon");
		Chest chest = new Chest();
		TreasureRoom secretRoom = new TreasureRoom("secret room");
		ButtonRoom entrance = new ButtonRoom("entrance");
		MonsterRoom junction1 = new MonsterRoom("first boss");
		MonsterRoom junction2 = new MonsterRoom("second boss");
		Room trap = new Room("trap");
		Room exit = new Room("exit");
		HiddenDoor entranceSecretRoom = new HiddenDoor(entrance, secretRoom);
		Door entranceJunction1 = new Door(entrance, junction1);
		Door junction1Junction2 = new Door(junction1, junction2);
		LockedDoor junction2Exit = new LockedDoor(junction2, exit);
		Door junction1Trap = new Door(junction1, trap);
		DoorButton junctionTrapButton = new DoorButton(entranceSecretRoom);

		// objects assemblage
		chest.addTreasure(new Key(1));
		entrance.setButton(junctionTrapButton);
		entrance.addDoor("north", entranceJunction1);
		entrance.addDoor("under the carpet", entranceSecretRoom);
		secretRoom.setChest(chest);
		secretRoom.addDoor("upstairs", entranceSecretRoom);
		junction1.setMonster(goliath);
		junction1.addDoor("south", entranceJunction1);
		junction1.addDoor("west", junction1Trap);
		junction1.addDoor("north", junction1Junction2);
		junction2.setMonster(kys);
		junction2.addDoor("south", junction1Junction2);
		junction2.addDoor("north", junction2Exit);
		this.currentRoom = entrance;
	}
}
