package sample;

import junit.framework.TestCase;

public class DogTest extends TestCase {

	public DogTest(String name) {
		super(name);
	}

	/**
	 * getNameメソッドのテスト
	 *
	 */
	public void testGetName() {
		String name = "pochi";
		Dog dog = new Dog();
		dog.setName(name);
		assertEquals(name, dog.getName());
	}
}