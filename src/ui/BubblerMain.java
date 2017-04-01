package ui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Bubble;

import java.util.ArrayList;
import java.util.List;


public class BubblerMain extends Application {
    private static final Bubble top1 = new Bubble("Desktops");
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        
        primaryStage.setTitle("NodeSpace");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMaximized(true);

        List<Bubble> topBubbles = new ArrayList<>();
        topBubbles.add(top1);

        for (Bubble bubble: topBubbles
             ) {
            for (Bubble secondBubble: bubble.getSubBubbles()
                 ) {
                root.getChildren().add(secondBubble);

            }
        }
        
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);
    }
}
