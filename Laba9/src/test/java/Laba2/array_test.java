package Laba2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class array_test {

	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Запустился array тест"); }

	@Test
	public void test() { 
		array arr = new array(); 
	int[] array = arr.arrr();
	assertTrue(array.length==15); 
	}
	
	@Test 
	public void test2() { 
		array arr = new array();
		int[] arrayy = arr.arrr();
		for(int i = 0; i<15; i++) { 
			assertNotNull(arrayy[i]);
			} 
		}

}

