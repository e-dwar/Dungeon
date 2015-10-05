package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

public class FistTest {

	@Test
	public void getNameTest() {
		Fist fist = new Fist();
		assertEquals("fist", fist.getName());
	}

	@Test
	public void getDamageTest() {
		Fist fist = new Fist();
		assertEquals(1, fist.getDamage());
	}

	@Test
	public void toStringTest() {
		Fist fist = new Fist();
		assertEquals("fist (dmg: 1)", fist + "");
	}
}
