package sgh;

public class PrimeNumbers {

    public static void primes(int n) {

        StringBuilder output = new StringBuilder();
        int count = 0;

        int intToCheck = 2;
        while (count < n) {
            if (isPrime(intToCheck)) {
                if (count == 0) {
                    output.append(intToCheck);
                } else {
                    output.append(", ").append(intToCheck);
                }
                count++;
            }
            intToCheck++;
        }

        System.out.print(output.append("\n"));
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        primes(10);
    }
}
