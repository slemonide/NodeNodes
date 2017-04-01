package ui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Bubble;

import java.util.ArrayList;
import java.util.List;


public class BubblerMain extends Application {
    private static final Bubble top1 = new Bubble("Desktops");
    private static final int STAGE_WIDTH = 800;
    private static final int STAGE_HEIGHT = 600;
    private static final int GRADIENT_RADIUS = 1000;
    
    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        
        primaryStage.setTitle("NodeSpace");
        Scene scene = new Scene(root, STAGE_WIDTH, STAGE_HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);

        List<Bubble> topBubbles = new ArrayList<>();
        topBubbles.add(top1);


        Rectangle colors = new Rectangle(scene.getWidth(), scene.getHeight(),
                new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new
                        Stop[]{
                        new Stop(0, Color.web("#f8bd55")),
                        new Stop(0.33, Color.web("#c0fe56")),
                        new Stop(0.66, Color.web("#5dfbc1")),
                        new Stop(1, Color.web("#64c2f8")),}));
                //new RadialGradient(45.0, 50, scene.getWidth()/2, scene.getHeight()/2, GRADIENT_RADIUS, );
        colors.widthProperty().bind(scene.widthProperty());
        colors.heightProperty().bind(scene.heightProperty());
        root.getChildren().add(colors);

        for (Bubble bubble: topBubbles
             ) {
            root.getChildren().add(bubble);
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
