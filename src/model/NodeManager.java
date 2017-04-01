package model;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Keeps information about the current node and its children
 */
public class NodeManager {
    private static NodeManager instance;
    private URL currentPage;

    /**
     * Singleton pattern
     */
    private NodeManager() {
        try {
            currentPage = new URL("file://data/bio/main.html");
        } catch (MalformedURLException e) {
            System.out.println("Wrong URL!");
            e.printStackTrace();
        }
    }

    public NodeManager getInstance() {
        if(instance == null) {
            instance = new NodeManager();
        }
        return instance;
    }

    /**
     * @return current page URL
     */
    public URL getCurrentPage() {
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
    public URL getPageAt(Direction direction) {
        return null; // stub
    }

}
