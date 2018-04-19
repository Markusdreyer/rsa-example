import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PrimeNumberTest {
    @FXML
    private Button encryptBtn, decryptBtn;
    @FXML
    private TextField textField;

    private ArrayList<Integer> numericValues = new ArrayList<>();
    private int[] numericArray;
    private int p, q, n;
    private double encryptedMessage;



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

    public int[] generateNumericArray() {
        for(char ch : textField.getText().toCharArray()) {
            numericValues.add(Character.getNumericValue(ch) - 9);
        }
        numericArray = numericValues.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(numericArray));
        return numericArray;
    }

    /*The RSA encryption formula (m^pK % n) where m is the numerical value of each letter in the message, pK is the generated privateKey and n is TODO: what is n?*/
    public int encryptNumericValues() {
        for (int i : generateNumericArray()) {
            encryptedMessage = (Math.pow(i,p) % q);
        }

        return (int) encryptedMessage;
    }
    //System.out.println(Math.pow(2,5) % 14);


    /*
    TODO: Implement this inside controller class
     */
}
