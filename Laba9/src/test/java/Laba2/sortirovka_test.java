package Laba2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class sortirovka_test {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
System.out.println("Тест для sortirovka запустился"); }

@AfterClass
public static void tearDownAfterClass() throws Exception {
System.out.println("Тест для sortirovka завершился"); }

@Test
public void testSortyr() {
int[] mass = {950,1121,937,1181,1035};
int[] sortMass = {937,950,1035,1121,1181};
sortirovka.sortirovka(mass);
assertArrayEquals(sortMass,mass); }

}