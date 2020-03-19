package Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	
	@Test
	public void test() throws Exception {
		
		assertEquals(0,Fibonacci.check(1));
	}
	@Test
	public void test2() throws Exception {
		assertEquals(1,Fibonacci.check(2));
	}
	@Test
	public void test3() throws Exception {
		assertEquals(1,Fibonacci.check(3));
	}
	@Test
	public void test4() throws Exception {
		assertEquals(2,Fibonacci.check(4));
	}
	@Test
	public void test5() throws Exception {
		assertEquals(3,Fibonacci.check(5));
	}
	@Test
	public void test6() throws Exception {
		assertEquals(5,Fibonacci.check(6));
	}
	@Test
	public void test7() throws Exception {
		assertEquals(8,Fibonacci.check(7));
	}
	@Test
	public void test8() throws Exception {
		
		assertEquals(0,Fibonacci.check(-3));
	}



}
