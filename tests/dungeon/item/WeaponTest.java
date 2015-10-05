package dungeon.item;

import static org.junit.Assert.*;

import org.junit.*;

public class WeaponTest {

	@Test
	public void getNameTest() {
		Weapon mock = new WeaponMock("mock", 10);
		assertEquals("mock", mock.getName());
	}

	@Test
	public void getDamageTest() {
		Weapon mock = new WeaponMock("mock", 10);
		assertEquals(10, mock.getDamage());
	}

}
