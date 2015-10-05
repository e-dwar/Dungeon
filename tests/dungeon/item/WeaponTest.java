package dungeon.item;

import static org.junit.Assert.*;

import org.junit.*;

import dungeon.character.Hero;

public class WeaponTest {

	@Test
	public void getNameTest() {
		Weapon weapon = new WeaponMock("mock", 10);
		assertEquals("mock", weapon.getName());
	}

	@Test
	public void getDamageTest() {
		Weapon weapon = new WeaponMock("mock", 10);
		assertEquals(10, weapon.getDamage());
	}
	
	@Test
	public void goToInventoryTest() {
		Weapon weapon = new WeaponMock("mock", 10);
		Hero bonhomme = new Hero("bonhomme");
		assertNotEquals(bonhomme.getWeapon(), weapon);
		weapon.goToInventory(bonhomme);
		assertEquals(bonhomme.getWeapon(), weapon);
	}

}
