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

        resultText.setText(Double.toString(encryptNumericValues()));
    }

    public int[] generateNumericArray() {
        for(char ch : textField.getText().toCharArray()) {
            numericValues.add(Character.getNumericValue(ch));
        }
        numericArray = numericValues.stream().mapToInt(i -> i).toArray();
        return numericArray;
    }

    public double encryptNumericValues() {
        for (int i : generateNumericArray()) {
            encryptedMessage = Math.pow(i,key[0] % key[1]);
    }
        return encryptedMessage;
    }
    //System.out.println(Math.pow(2,5) % 14);
}
