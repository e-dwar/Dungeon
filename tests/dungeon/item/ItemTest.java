package dungeon.item;

import static org.junit.Assert.*;

import org.junit.Test;

import dungeon.item.Item;

public class ItemTest {

	@Test
	public void getNameTest() {
		Item mock = new ItemMock("mock");
		assertEquals("mock", mock.getName());
	}

	@Test
	public void toStringTest() {
		Item mock = new ItemMock("mock");
		assertEquals("mock", mock + "");
	}

}
