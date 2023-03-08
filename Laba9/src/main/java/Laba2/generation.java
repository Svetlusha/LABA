package Laba2;

public class generation {
	public static int randomizer(int min, int max){
	max -= min;
	return (int)(Math.random()* ++max) + min;
	}
}