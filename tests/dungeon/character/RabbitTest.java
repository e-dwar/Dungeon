package dungeon.character;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import dungeon.character.Rabbit;

public class RabbitTest {

	protected Rabbit rabbit;

	@Before
	public void before() {
		rabbit = new Rabbit("Roger");
	}

	@Test
	public void attackTest() {
		Character bonhomme = new CharacterMock("bonhomme", 32);
		rabbit.attack(bonhomme);
		assertTrue(bonhomme.isDead() || bonhomme.getHealthPoints() <= 32);
	}

}