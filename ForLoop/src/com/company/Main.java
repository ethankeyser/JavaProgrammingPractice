package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcInterest(1000, 20));
        for(double r = 2; r < 9; r++) {
            System.out.println(String.format("%.2f", calcInterest(10000, r)));
        }

        for(int r = 8; r > 1; r--) {
            System.out.println("10,000 with an interest rate of " + r + "% = " + String.format("%.2f", calcInterest(10000, r)));
        }
        int primeCount = 0;
        for(int i = 1; i <40; i++) {

            if(isPrime(i)) {
                primeCount++;
                System.out.println("Prime number found: " + i);
            }
            if(primeCount == 3) {
                break;
            }
        }
    }

    public static double calcInterest(double amount, double rate) {
        return(amount * (rate / 100));
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
