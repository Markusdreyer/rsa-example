import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Text resultText, privateKeyField, publicKeyField;

    private ArrayList<Integer> numericValues = new ArrayList<>();
    private int[] numericArray;
    private int p, q, n;
    private double encryptedMessage;


    public void generateKeypair(ActionEvent e) {
        generateKeypair();
        privateKeyField.setText(Integer.toString(p));
    }

    public void encryptAction(ActionEvent e) {
        resultText.setText(Integer.toString(encryptNumericValues()));

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

    public int generatePrimeNumber() {
        Random random = new Random();
        int min = 10000000;
        int max = 1000000000;
        int p = random.nextInt((max - min) + 1) + min;
        return p;
    }

    public void generateKeypair() {
        p = generatePrimeNumber();
        q = generatePrimeNumber();
        n = (p * q);

        System.out.println("P:" + p +"\nQ: " + q + "\nN: " + n);
    }
}


/*
TODO: ALSO fix so that all letters are taken into consideration. Not just the last one
TODO: Generate KEYPAIR
*/
