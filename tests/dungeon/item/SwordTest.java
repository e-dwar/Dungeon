package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwordTest {

	@Test
	public void getNameTest() {
		Sword sword = new Sword();
		assertEquals("sword", sword.getName());
	}

	@Test
	public void getDamageTest() {
		Sword sword = new Sword();
		assertEquals(32, sword.getDamage());
	}

	@Test
	public void toStringTest() {
		Sword sword = new Sword();
		assertEquals("sword (dmg: 32)", sword + "");
	}
}
