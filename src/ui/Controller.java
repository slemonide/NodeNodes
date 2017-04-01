package ui;

import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import model.NodeManager;

import static model.Direction.*;

public class Controller {
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
        WebEngine centerEngine = center.getEngine();
        centerEngine.load(NodeManager.getInstance().getCurrentPage());

        WebEngine leftEngine = left.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(LEFT));
        leftEngine.load(NodeManager.getInstance().getPageAt(LEFT));

        WebEngine rightEngine = right.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(RIGHT));
        rightEngine.load(NodeManager.getInstance().getPageAt(RIGHT));

        WebEngine topEngine = top.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(UP));
        topEngine.load(NodeManager.getInstance().getPageAt(UP));

        WebEngine bottomEngine = bottom.getEngine();
        System.out.println(NodeManager.getInstance().getPageAt(DOWN));
        bottomEngine.load(NodeManager.getInstance().getPageAt(DOWN));
    }
}
