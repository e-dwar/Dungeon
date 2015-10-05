package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.character.Hero;

public class KeyTest {
	
	@Test
	public void getHealthPointsTest() {
		Key key = new Key(10);
		assertEquals(10, key.getLifespan());
	}
	
	@Test
	public void getNameTest() {
		Key key = new Key(10);
		assertEquals("key", key.getName());
	}
	
	@Test
	public void goToInventoryTest() {
		Key key = new Key(10);
		Hero bonhomme = new Hero("bonhomme");
		assertFalse(bonhomme.hasAKey());
		key.goToInventory(bonhomme);
		assertTrue(bonhomme.hasAKey());
	}
	
	@Test
	public void toStringTest() {
		Key key = new Key(10);
		assertEquals("key (10)", key + "");
	}
}
