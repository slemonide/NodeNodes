package parsers;

import model.Direction;
import model.NodeManager;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import static model.Direction.*;

public class RelationsParser extends DefaultHandler {
    private StringBuilder accumulator;
    private String link;
    private Direction relation;

    public RelationsParser() {
        accumulator = new StringBuilder();
    }

    @Override
    public void startElement(String namespaceURI, String localName,
                             String qName, Attributes atts) {

        if (qName.toLowerCase().equals("a")) {
            link = atts.getValue("href");
        }
    }


    /**
     * Called for values of elements
     *
     * Lookup DefaultHandler documentation to learn meanings of parameters.
     */
    public void characters(char[] temp, int start, int length) {
        // Remember the value parsed
        accumulator.append(temp, start, length);
    }

    /**
     * Called when the end of an element is seen. (e.g., </title>)
     *
     * Lookup DefaultHandler documentation to learn meanings of parameters.
     */
    public void endElement(String uri, String localName, String qName) {
        String data = accumulator.toString().trim();   // trim leading and trailing whitespace
        accumulator.setLength(0);                      // clear accumulator

        switch (data) {
            case "TOP":
                relation = UP;
                break;
            case "DOWN":
                relation = DOWN;
                break;
            case "LEFT":
                relation = LEFT;
                break;
            case "RIGHT":
                relation = RIGHT;
                break;
        }

        if (link != null && relation !=null) {
            NodeManager.getInstance().setPageAt(relation, link);
        }
    }
}
