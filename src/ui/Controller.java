package ui;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import model.NodeManager;

import static model.Direction.*;

public class Controller {
    private static WebEngine centerEngine;
    private static WebEngine leftEngine;
    private static WebEngine rightEngine;
    @FXML
    private WebView center;
    @FXML
    private WebView left;
    @FXML
    private WebView right;
    @FXML
    private WebView top;
    @FXML
    private WebView bottom;

    @FXML
    private void initialize()
    {
        centerEngine = center.getEngine();
        centerEngine.load(NodeManager.getInstance().getCurrentPage());
        centerEngine.setUserStyleSheetLocation("file:///" + System.getProperty("user.dir") + "/resources/css/styles.css");

        leftEngine = left.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(LEFT));
        leftEngine.load(NodeManager.getInstance().getPageAt(LEFT));
        leftEngine.setUserStyleSheetLocation("file:///" + System.getProperty("user.dir") + "/resources/css/styles.css");


        rightEngine = right.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(RIGHT));
        rightEngine.load(NodeManager.getInstance().getPageAt(RIGHT));
        rightEngine.setUserStyleSheetLocation("file:///" + System.getProperty("user.dir") + "/resources/css/styles.css");

/*
        WebEngine topEngine = top.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(UP));
        topEngine.load(NodeManager.getInstance().getPageAt(UP));

        WebEngine bottomEngine = bottom.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(DOWN));
        bottomEngine.load(NodeManager.getInstance().getPageAt(DOWN));
        */
    }

    public static void update() {
        centerEngine.load(NodeManager.getInstance().getCurrentPage());
        centerEngine.setUserStyleSheetLocation("file:///" + System.getProperty("user.dir") + "/resources/css/styles.css");

        System.out.println(NodeManager.getInstance().getPageAt(LEFT));
        leftEngine.load(NodeManager.getInstance().getPageAt(LEFT));
        leftEngine.setUserStyleSheetLocation("file:///" + System.getProperty("user.dir") + "/resources/css/styles.css");

        System.out.println(NodeManager.getInstance().getPageAt(RIGHT));
        rightEngine.load(NodeManager.getInstance().getPageAt(RIGHT));
        rightEngine.setUserStyleSheetLocation("file:///" + System.getProperty("user.dir") + "/resources/css/styles.css");

    }
}
