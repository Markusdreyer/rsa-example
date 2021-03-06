import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;


public class Main extends Application {
    
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