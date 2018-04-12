import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    @FXML
    private Button encryptBtn, decryptBtn;

    public void encryptMessage(ActionEvent e) {
        System.out.println("Encrypted message");
    }
}
