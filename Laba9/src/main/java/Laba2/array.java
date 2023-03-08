package Laba2;

public class array {
	public static int min = 100;
    public static int max = 700;
    public int[] arrr() {

    	generation arr = new generation();

        int[] Buff = new int[10];
        for (int i = 0; i < 10; i++) {
            Buff[i] = arr.randomizer(min, max);
            


        }
        return Buff;
    }
}
