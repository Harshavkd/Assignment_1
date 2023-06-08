import java.util.*;
class Main {

    public static int countDigitFreq(int n,int D) {
		if(n == 0 && D == 0) return 1;
      
		if(n < 0) n = -n;
      
		int counter = 0;
		while(n != 0) {
			int digit = n % 10; 
			if(digit == D)
        counter++; 
			n = n/10;
		}

		return counter;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		int d = scn.nextInt();

        int x = countDigitFreq(n,d);
		System.out.println("The digit " + d + " occurs " + x + " times in " + n);
	}
}
