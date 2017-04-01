package model;

import javax.swing.text.html.HTML;

/**
 * Keeps information about the current node and its children
 */
public class NodeManager {
    private static NodeManager instance;
    private HTML currentPage;

    /**
     * Singleton pattern
     */
    private NodeManager() {
        currentPage = new HTML();
    }

    public NodeManager getInstance() {
        if(instance == null) {
            instance = new NodeManager();
        }
        return instance;
    }

    public HTML getCurrentPage() {
        return null; // stub
    }

    public void moveTo(Direction direction) {}

    public HTML getPageAt(Direction direction) {
        return null; // stub
    }

}
