package dungeon.character;

import static org.junit.Assert.*;
import dungeon.item.*;
import dungeon.character.Hero;
import org.junit.Before;
import org.junit.Test;

public class HeroTest {

	protected Hero hero;

	@Before
	public void before() {
		hero = new Hero("Maurice");
	}

	@Test
	public void heroTest() {
		assertEquals("Maurice", hero.getName());
		assertEquals(32, hero.getHealthPoints());
	}

	@Test
	public void hasAKeyTest() {
		assertFalse(hero.hasAKey());
		hero.addAKey(new Key(1));
		assertTrue(hero.hasAKey());
		hero.useAKey();
		assertFalse(hero.hasAKey());
	}

	@Test
	public void hasAPotionTest() {
		assertFalse(hero.hasAPotion());
		hero.addAPotion(new Potion(1));
		assertTrue(hero.hasAPotion());
		hero.useAPotion();
		assertFalse(hero.hasAPotion());
	}

	@Test
	public void addAKeyTest() {
		assertFalse(hero.hasAKey());
		hero.addAKey(new Key(1));
		assertTrue(hero.hasAKey());
	}

	@Test
	public void addAPotionTest() {
		assertFalse(hero.hasAPotion());
		hero.addAPotion(new Potion(1));
		assertTrue(hero.hasAPotion());
	}

	@Test
	public void useAKeyTest() {
		hero.addAKey(new Key(1));
		assertTrue(hero.hasAKey());
		hero.useAKey();
		assertFalse(hero.hasAKey());
	}

	@Test
	public void useAPotionTest() {
		hero.addAPotion(new Potion(1));
		assertTrue(hero.hasAPotion());
		hero.useAPotion();
		assertFalse(hero.hasAPotion());
	}
}