import java.math.BigInteger;
import java.util.Random;

public class PrimeNumberTest {


    public static void main(String[] args) {
        System.out.println(generateKeypair());
    }

    public static int generatePrimeNumber() {
        Random random = new Random();
        int min = 10000000;
        int max = 1000000000;
        int primeNumber = random.nextInt((max - min) + 1) + min;
        while(!isPrime(primeNumber)) {
            primeNumber = random.nextInt((max - min) + 1) + min;
        }
        return primeNumber;
    }

    public static boolean isPrime(int n) {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static String generateKeypair() {
        long p, q, n;
        p = generatePrimeNumber();
        q = generatePrimeNumber();
        n = (p * q);

        return ("P: " + p +"\nQ: " + q + "\nN: " + n);
    }

    /*
    TODO: Implement this inside controller class 
     */
}
