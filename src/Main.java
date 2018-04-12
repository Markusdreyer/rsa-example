import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {
    private int letterNumber = 1;
    private String letter = "";


    public String numberLookup() {
        String letter = "";
        switch (letterNumber) {
            case 1:
                letter = "A";
                break;
            case 2:
                letter = "B";
                break;
            case 3:
                letter = "C";
                break;
            default:
                letter = "";
                break;
        }

        return letter;
    }

    /*
    public String letterLookup() {
        String letter = "";
        switch (letter) {
            case 1:
                letter = "A";
                break;
            case 2:
                letter = "B";
                break;
            case 3:
                letter = "C";
                break;
            default:
                letter = "";
                break;
        }

        return letter;
    }*/

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setScene(new Scene(root, 470, 390));
        primaryStage.setResizable(false);
        primaryStage.show();


    }

    public static void main(String[] args) {
        //System.out.println(Math.pow(2,5) % 14);
        launch(args);
    }

}