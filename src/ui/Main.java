package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    WebView centralNode;
    WebView leftNode;
    WebView rightNode;
    WebView topNode;
    WebView downNode;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // NodeManager initialization


        // Graphics initialization
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
