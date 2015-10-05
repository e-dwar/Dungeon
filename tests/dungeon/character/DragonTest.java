package dungeon.character;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dungeon.item.Weapon;

public class DragonTest {

	protected Dragon dragon;
	protected int damage;

	@Before
	public void before() {
		dragon = new Dragon("Kys");
	}

	@Test
	public void attackTest() {
		Character bonhomme = new CharacterMock("bonhomme", 32);
		Weapon weapon = dragon.getWeapon();
		int damage = weapon.getDamage();
		dragon.attack(bonhomme);
		assertEquals(32 - damage, bonhomme.getHealthPoints());
	}
}
