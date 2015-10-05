package dungeon.character;

import static org.junit.Assert.*;

import org.junit.*;

import dungeon.character.Character;
import dungeon.item.Sword;

public class CharacterTest {

	protected Character character;
	protected int hp = 10;

	@Before
	public void before() {
		character = new CharacterMock("Maurice", hp);
	}

	@Test
	public void characterTest() {
		assertEquals("Maurice", character.getName());
		assertEquals(hp, character.getHealthPoints());

	}

	@Test
	public void setWeaponTest() {
		Sword sword = new Sword();
		assertEquals(null, character.getWeapon());
		character.setWeapon(sword);
		assertEquals(sword, character.getWeapon());
	}

	@Test
	public void takeAKnockTest() {
		character.takeAKnock(5);
		assertEquals(hp - 5, character.getHealthPoints());
		character.takeAKnock(6);
		assertEquals(0, character.getHealthPoints());
	}

	@Test
	public void deathTest() {
		character.takeAKnock(hp);
		assertTrue(character.isDead());
		assertEquals(0, character.getHealthPoints());
	}
	
	@Test
	public void toStringDeadTest() {
		character.takeAKnock(hp);
		assertEquals("Maurice (dead)", character + "");
	}
	
	@Test
	public void toStringAliveTest() {
		assertEquals("Maurice (life: " + hp + ")", character + "");
	}

}
