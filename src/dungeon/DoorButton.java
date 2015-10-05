package dungeon;

import dungeon.door.HiddenDoor;

public class DoorButton {
	
	private HiddenDoor door;
	
	public DoorButton(HiddenDoor door) {
		this.door = door;
	}
	
	public void press() {
		if (this.door.isHidden()){
			this.door.reveal();
		}
	}
	
	public boolean isPressed() {
		return !this.door.isHidden();
	}
}
