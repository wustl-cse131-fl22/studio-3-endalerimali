package studio3;

import java.util.Scanner;
import java.util.Arrays;

public class Sieve {
	
	public static void main(String[] args) {
		
		//User Input Phase
		Scanner in = new Scanner(System.in);
		System.out.println("Searching for Primes: Where should we stop?");
		int n = in.nextInt();
		while(n < 2) {
			System.out.println("Invalid number, must be greater than 2. Try again.");
			n = in.nextInt();
		}//end of while
		
		//Fill  Step
		int[] mainP = new int[n - 1];
		
		for(int i = 0; i <= mainP.length - 1; i++) {
			mainP[i] = i + 2;
			//System.out.print(mainP[i]);
		}
		
		int curPrime = 2;
		int[] prime = new int[n];
		int countP = 0;

		
		//Big boi
		for(int c = 0; c <= mainP.length - 1; c++) {
			prime[c] = curPrime;
			//fill in zeros
			for(int j = 0; j <= mainP.length - 1; j++) {
				if((mainP[j] != 0) && (mainP[j] % curPrime == 0)) {
					mainP[j] = 0;
				}
			}//end of fill zero
			
			//find next cur
			for(int k = 0; k <= mainP.length - 1; k++) {
				if(mainP[k] != 0) {
					curPrime = mainP[k];
					k = mainP.length;
					countP++;
				}
				
			}//end of next cur
			
		
		}//end of big boi
		
		int[] finalPrime = new int[countP];
		
		for(int l = 0; l <= finalPrime.length - 1; l++) {
			finalPrime[l] = prime[l];
		}
		
		
		
	System.out.println(Arrays.toString(finalPrime)); //use when prime is made	
	}//end of main meth
	
}//end of class