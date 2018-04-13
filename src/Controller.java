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


    public void encryptAction(ActionEvent e) {
        resultText.setText(Arrays.toString(generateNumericArray()));
    }

    public int[] generateNumericArray() {
        for(char ch : textField.getText().toCharArray()) {
            numericValues.add(Character.getNumericValue(ch));
        }
        numericArray = numericValues.stream().mapToInt(i -> i).toArray();
        return numericArray;
    }

}
