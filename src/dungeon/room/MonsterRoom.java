package dungeon.room;

import dungeon.character.Character;

public class MonsterRoom extends Room {

	protected Character monster;

	public MonsterRoom(String name) {
		super(name);
	}

	public Character getMonster() {
		return monster;
	}

	public void setMonster(Character monster) {
		this.monster = monster;
	}

	public boolean mustFight() {
		return !monster.isDead() && !monster.isHappy();
	}

	public String getDescription() {
		String description = super.getDescription();
		if (this.monster == null) {
			return description;
		} else {
			return description + "\nMonster: " + monster + ".";
		}
	}
}
