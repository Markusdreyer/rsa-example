import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;


public class Controller {
    @FXML
    private Button encryptBtn, decryptBtn;
    @FXML
    private TextField textField;
    @FXML
    private Text resultText;

    private ArrayList<Integer> numericValues = new ArrayList<>();
    private int[] numericArray;
    private int[] key = {5, 14};
    private double encryptedMessage;


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
            encryptedMessage = (Math.pow(i,key[0]) % key[1]);
        }

        return (int) encryptedMessage;
    }
    //System.out.println(Math.pow(2,5) % 14);
}


/*
TODO: subract from numbers so that its integers. this will hopefully not make the numbers astronomical.
TODO: ALSO fix so that all letters are taken into consideration. Not just the last one
 */
