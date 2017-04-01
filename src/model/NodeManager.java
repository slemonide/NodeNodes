package model;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import parsers.RelationsParser;
import ui.Controller;

import java.io.IOException;

/**
 * Keeps information about the current node and its children
 */
public class NodeManager {
    private static NodeManager instance;
    private String currentPage;
    private String leftPage;
    private String rightPage;
    private String topPage;
    private String downPage;

    /**
     * Singleton pattern
     */
    private NodeManager() {
        currentPage = "file:///" + System.getProperty("user.dir") + "/data/bestBuy/main.html";
    }

    /**
     * Initializes children
     * @param currentPage parent
     */
    private void initializeChildren(String currentPage) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            RelationsParser handler = new RelationsParser();
            reader.setContentHandler(handler);
            reader.parse(currentPage);
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static NodeManager getInstance() {
        if(instance == null) {
            instance = new NodeManager();
        }
        return instance;
    }

    /**
     * @return current page URL
     */
    public String getCurrentPage() {
        initializeChildren(currentPage);// TODO: cut it out man
        return currentPage;
    }

    public void setPageAt(Direction direction, String url) {
        switch (direction) {
            case UP:
                topPage = url;
            case DOWN:
                downPage = url;
            case LEFT:
                leftPage = url;
            case RIGHT:
                rightPage = url;
        }
    }

    /**
     * Shift the pages
     * @param direction to move to
     */
    public void moveTo(Direction direction) {
        switch (direction) {
            case UP:
                currentPage = topPage;
            case DOWN:
                currentPage = downPage;
            case LEFT:
                currentPage = leftPage;
            case RIGHT:
                currentPage = rightPage;
        }

        Controller.update();
        initializeChildren(currentPage);
    }

    /**
     * @param direction of the page relative to the current page
     * @return URL of a page at the given direction
     */
    public String getPageAt(Direction direction) {
        switch (direction) {
            case UP:
                return topPage;
            case DOWN:
                return downPage;
            case LEFT:
                return leftPage;
            case RIGHT:
                return rightPage;
            default:
                return null;
        }
    }

}
