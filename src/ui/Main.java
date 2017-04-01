package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Graphics initialization
        Parent root = FXMLLoader.load(getClass().getResource("mainPanes.fxml"));
        primaryStage.setTitle("NodeSpace");
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
/*
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        NodeManager.getInstance().moveTo(UP);
                        break;
                    case DOWN:
                        NodeManager.getInstance().moveTo(DOWN);
                        break;
                    case LEFT:
                        NodeManager.getInstance().moveTo(LEFT);
                        break;
                    case RIGHT:
                        NodeManager.getInstance().moveTo(RIGHT);
                        break;
                }
            }
        });
        */
    }


    public static void main(String[] args) {
        launch(args);
    }
}
