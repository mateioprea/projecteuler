/**
 * Created by matei on 20/06/16.
 */
public class largestPrime {

    public static void main (String [] args) {
        long largestPrime = checkPrime(600851475143l);
        System.out.println(largestPrime);
    }

    private static long checkPrime (long number) {
        long largestPrime = 0;
        long upperLimit = number / 2;
        for (long i = 1; i < upperLimit; i++) {

            boolean isPrime = true;
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if(number % i == 0) {
                    if (i > largestPrime) {
                        largestPrime = i;
                    }
                }
            }
        }
        return largestPrime;
    }
}
