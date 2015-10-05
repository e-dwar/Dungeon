package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.character.Hero;

public class PotionTest {

	@Test
	public void getHealthPointsTest() {
		Potion potion = new Potion(10);
		assertEquals(10, potion.getHealthPoints());
	}

	@Test
	public void getNameTest() {
		Potion potion = new Potion(10);
		assertEquals("potion", potion.getName());
	}

	@Test
	public void goToInventoryTest() {
		Potion potion = new Potion(10);
		Hero bonhomme = new Hero("bonhomme");
		assertFalse(bonhomme.hasAPotion());
		potion.goToInventory(bonhomme);
		assertTrue(bonhomme.hasAPotion());
	}

	@Test
	public void toStringTest() {
		Potion potion = new Potion(10);
		assertEquals("potion (10)", potion + "");
	}
}
