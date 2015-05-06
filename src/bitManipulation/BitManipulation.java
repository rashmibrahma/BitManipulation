package bitManipulation;

public class BitManipulation {

	/*
	 * Cracking the Coding Interview: 5.1
	 */
	public static void modifyBits(int N, int M, int i, int j){
		int allOnes=~0;
		int mask1=(allOnes << (j+1));
		int mask2=(~0 >> (32-i));
		int mask=mask1+mask2;
		int maskedN=(mask & N)|(M<<i);
	}
	
	
}
