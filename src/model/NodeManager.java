package model;

/**
 * Keeps information about the current node and its children
 */
public class NodeManager {
    private static NodeManager instance;
    private String currentPage;

    /**
     * Singleton pattern
     */
    private NodeManager() {
        currentPage = "file:///" + System.getProperty("user.dir") + "/data/bio/main.html";
    }

    static public NodeManager getInstance() {
        if(instance == null) {
            instance = new NodeManager();
        }
        return instance;
    }

    /**
     * @return current page URL
     */
    public String getCurrentPage() {
        return currentPage;
    }

    /**
     * Shift the pages
     * @param direction to move to
     */
    public void moveTo(Direction direction) {}

    /**
     * @param direction of the page relative to the current page
     * @return URL of a page at the given direction
     */
    public String getPageAt(Direction direction) {
        return null; // stub
    }

}
