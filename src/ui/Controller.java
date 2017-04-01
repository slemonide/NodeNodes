package ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    public ImageView centralImage;
    
    public static ImageView image1;
    public static Label price1;
    public static Label screenSize1;
    public static Label screenRezolution1;
    public static Label processorSpeed1;
    public static Label ramSize1;
    public static Label capacity1;
    public static Label vr1;
    public static Label graphics1;
    public static Label os1;
    public static Label weight1;

    public static ImageView image2;
    public static Label price2;
    public static Label screenSize2;
    public static Label screenRezolution2;
    public static Label processorSpeed2;
    public static Label ramSize2;
    public static Label capacity2;
    public static Label vr2;
    public static Label graphics2;
    public static Label os2;
    public static Label weight2;

    @FXML
    private void initialize()
    {
        centralImage.setImage(new Image("https://s3.amazonaws.com/piktochartv2-dev/v2/uploads/9d0773b3-d92e-41cb-979c-06f284ad0a4b/4a62671f940494f7f2dcf8ae583246852f024a76_original.png"));

        update();
    }

    public static void update() {
        /*
        Product product1 = ProductManager.getInstance().getCurrentProductLeft();
        Product product2 = ProductManager.getInstance().getCurrentProductRight();

        image1 = new ImageView(product1.getImage());
        price1 = new Label(Double.toString(product1.getPrice()));
        screenSize1 = new Label(Double.toString(product1.getScreenSize()));
        screenRezolution1 = new Label(product1.getScreenResolution());
        processorSpeed1 = new Label(Double.toString(product1.getProcessorSPeed()));
        ramSize1 = new Label(Double.toString(product1.getRAMSize()));
        capacity1 = new Label(Double.toString(product1.getRAMSize()));
        vr1 = new Label(product1.getVRready() ? "Yes" : "No");
        graphics1 = new Label(product1.getGraphics());
        os1 = new Label(product1.getOS());
        weight1 = new Label(Double.toString(product1.getWeight()));

        image2 = new ImageView(product2.getImage());
        price2 = new Label(Double.toString(product2.getPrice()));
        screenSize2 = new Label(Double.toString(product2.getScreenSize()));
        screenRezolution2 = new Label(product2.getScreenResolution());
        processorSpeed2 = new Label(Double.toString(product2.getProcessorSPeed()));
        ramSize2 = new Label(Double.toString(product2.getRAMSize()));
        capacity2 = new Label(Double.toString(product2.getRAMSize()));
        vr2 = new Label(product2.getVRready() ? "Yes" : "No");
        graphics2 = new Label(product2.getGraphics());
        os2 = new Label(product2.getOS());
        weight2 = new Label(Double.toString(product2.getWeight()));
        */
    }

}
