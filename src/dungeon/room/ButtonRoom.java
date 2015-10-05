package dungeon.room;

import dungeon.DoorButton;

public class ButtonRoom extends Room {

	private DoorButton button;

	public ButtonRoom(String name) {
		super(name);
	}

	public void setButton(DoorButton button) {
		this.button = button;
	}

	public DoorButton getButton() {
		return this.button;
	}

	public String getDescription() {
		String description = super.getDescription() + "\nButton: ";
		if (this.button.isPressed()) {
			return description + "already pressed.";
		} else {
			return description + "press to reveal a door in the dungeon.";
		}
	}
}
