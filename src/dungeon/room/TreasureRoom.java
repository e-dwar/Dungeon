package dungeon.room;

import dungeon.Chest;

public class TreasureRoom extends Room {

	private Chest chest;

	public TreasureRoom(String name) {
		super(name);
	}

	public Chest getChest() {
		return this.chest;
	}

	public void setChest(Chest chest) {
		this.chest = chest;
	}

	public String getDescription() {
		String description = super.getDescription();
		if (this.chest.isEmpty()) {
			return description + "\nTreasure: the chest is empty.";
		} else {
			return description + "\nTreasure: open the chest.";
		}
	}
}
