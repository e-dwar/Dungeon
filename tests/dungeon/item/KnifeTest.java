package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnifeTest {

	@Test
	public void getNameTest() {
		Knife knife = new Knife();
		assertEquals("knife", knife.getName());
	}

	@Test
	public void getDamageTest() {
		Knife knife = new Knife();
		assertEquals(5, knife.getDamage());
	}

	@Test
	public void toStringTest() {
		Knife knife = new Knife();
		assertEquals("knife (dmg: 5)", knife + "");
	}
}
