package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

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
	public void toStringTest() {
		Key key = new Key(10);
		assertEquals("key (10)", key + "");
	}
}
