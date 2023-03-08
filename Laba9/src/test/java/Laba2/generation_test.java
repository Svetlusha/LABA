package Laba2;

import static org.junit.Assert.*;

import org.junit.Test;

public class generation_test {
	public static int min = 100; 
	public static int max = 700;
	@Test
	public void test() {
		generation gen = new generation(); 
		int number =gen.randomizer(min,max); 
		assertTrue(number<=max && number>=min);
	}
}