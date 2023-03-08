package Laba2;

public class array {
	public static int min = 900;
    public static int max = 1200;
    public int[] arrr() {

    	generation arr = new generation();

        int[] Buff = new int[15];
        for (int i = 0; i < 15; i++) {
            Buff[i] = arr.randomizer(min, max);
            


        }
        return Buff;
    }
	
}
