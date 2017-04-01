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
        leftEngine.load(NodeManager.getInstance().getPageAt(LEFT));

        WebEngine rightEngine = right.getEngine();
        rightEngine.load(NodeManager.getInstance().getPageAt(RIGHT));

        WebEngine topEngine = top.getEngine();
        topEngine.load(NodeManager.getInstance().getPageAt(UP));

        WebEngine bottomEngine = bottom.getEngine();
        bottomEngine.load(NodeManager.getInstance().getPageAt(DOWN));
    }
}
