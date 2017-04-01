package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

import java.util.ArrayList;
import java.util.List;


public class Bubble extends Circle{
    private String name;

    private Bubble superBubble;
    private List<Bubble> subBubbles;

    public Bubble(String name){
        super(150, Color.web("blue", 0.98));
        setStrokeType(StrokeType.OUTSIDE);
        setStroke(Color.web("black", 0.16));
        setStrokeWidth(4);

        this.name = name;
        superBubble = null;
        this.subBubbles = new ArrayList<>();
    }

    public List<Bubble> getSubBubbles(){
        return subBubbles;
    }

    public void setSubBubbles(List<Bubble> subBubbles){
        this.subBubbles = subBubbles;

        for (Bubble subBubble:
             subBubbles) {
            subBubble.setSuperBubble(this);
        }
    }

    private void setSuperBubble(Bubble superBubble){
        this.superBubble = superBubble;
    }

}
