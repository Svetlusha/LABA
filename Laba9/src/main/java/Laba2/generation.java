package Laba2;

public class generation {
	public static int min = 100;
	public static int max = 700;
	public static int randomizer(){
	max -= min;
	return (int)(Math.random()* ++max) + min;
	}
}