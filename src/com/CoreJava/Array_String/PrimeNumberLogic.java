package com.CoreJava.Array_String;

public class PrimeNumberLogic {

	public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // number of primes printed so far
        int cnt = 0;
        // number to be checked for prime
        int num = 2;

        
        while (cnt < 10) {
            // Prime Check
            if (isPrime(num)) {
                System.out.println(num);
                cnt++;
            }
            num++;
        }
    }
		


	

}
