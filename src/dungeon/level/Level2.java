package dungeon.level;

import dungeon.Chest;
import dungeon.Dungeon;
import dungeon.character.*;
import dungeon.door.Door;
import dungeon.item.Potion;
import dungeon.item.Sword;
import dungeon.room.*;

public class Level2 extends Level {

	public Level2() {
		
		Hero hero = Dungeon.getHero();
		int hp = hero.getHealthPoints();

		// objects creation
		EvilRabbit goliath = new EvilRabbit("Goliath the rabbit");
		TreasureRoom secretRoom = new TreasureRoom("secret room");
		Room entrance = new Room("entrance");
		Room exit = new Room("exit");
		MonsterRoom junction = new MonsterRoom("an old acquaintance");
		Door entranceJunction = new Door(entrance, junction);
		Door entranceSecretRoom = new Door(entrance, secretRoom);
		Door junctionExit = new Door(junction, exit);
		Chest chest = new Chest();
		
		// objects assemblage
		chest.addTreasure(new Sword());
		chest.addTreasure(new Potion(hp));
		chest.addTreasure(new Potion(hp));
		chest.addTreasure(new Potion(hp));
		chest.addTreasure(new Potion(hp));
		entrance.addDoor("upstairs", entranceJunction);
		entrance.addDoor("behind the painting", entranceSecretRoom);
		secretRoom.addDoor("entrance", entranceSecretRoom);
		secretRoom.setChest(chest);
		junction.addDoor("downstairs", entranceJunction);
		junction.addDoor("outside", junctionExit);
		junction.setMonster(goliath);
		this.currentRoom = entrance;
	}
}
