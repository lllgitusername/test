package test_pack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testDemo {

	@BeforeClass
	public void init() {
		System.out.println("before class");
	}
	@Test
	public void test() {
		System.out.println("start test");
	}
}
