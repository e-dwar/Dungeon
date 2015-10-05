package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

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
	public void toStringTest() {
		Potion potion = new Potion(10);
		assertEquals("potion (10)", potion + "");
	}
}
