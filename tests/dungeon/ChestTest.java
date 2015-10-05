package dungeon;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dungeon.character.Hero;
import dungeon.item.ItemMock;

public class ChestTest {

	private Chest chest;
	
	@Before
	public void before () {
		chest = new Chest();
	}
	
	@Test
	public void isEmptyTest () {
		assertTrue(chest.isEmpty());
		chest.addTreasure(new ItemMock("allo"));
		assertFalse(chest.isEmpty());
	}
	
	@Test
	public void addTreasureTest () {
		assertTrue(chest.isEmpty());
		chest.addTreasure(new ItemMock("allo"));
		assertFalse(chest.isEmpty());
	}
	
	@Test
	public void openTest () {
		chest.addTreasure(new ItemMock("allo"));
		assertFalse(chest.isEmpty());
		chest.open(new Hero("bonhomme"));
		assertTrue(chest.isEmpty());
	}
	
	@Test
	public void getDescriptionTest () {
		assertEquals("empty", chest.getDescription());
		chest.addTreasure(new ItemMock("star"));
		assertEquals("star", chest.getDescription());
		chest.addTreasure(new ItemMock("flower"));
		assertEquals("star\n+ flower", chest.getDescription());
	}
}
