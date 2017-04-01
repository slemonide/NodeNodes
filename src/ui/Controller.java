package ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Product;
import model.ProductManager;

public class Controller {
    public ImageView centralImage;

    @FXML private ImageView image1;
    @FXML private Label price1;
    @FXML private Label screenSize1;
    @FXML private Label screenRezolution1;
    @FXML private Label processorSpeed1;
    @FXML private Label ramSize1;
    @FXML private Label capacity1;
    @FXML private Label vr1;
    @FXML private Label graphics1;
    @FXML private Label os1;
    @FXML private Label weight1;

    @FXML private ImageView image2;
    @FXML private Label price2;
    @FXML private Label screenSize2;
    @FXML private Label screenRezolution2;
    @FXML private Label processorSpeed2;
    @FXML private Label ramSize2;
    @FXML private Label capacity2;
    @FXML private Label vr2;
    @FXML private Label graphics2;
    @FXML private Label os2;
    @FXML private Label weight2;

    @FXML
    private void initialize()
    {
        centralImage.setImage(new Image("https://s3.amazonaws.com/piktochartv2-dev/v2/uploads/9d0773b3-d92e-41cb-979c-06f284ad0a4b/4a62671f940494f7f2dcf8ae583246852f024a76_original.png"));

        update();
    }

    private void update() {
        Product product1 = ProductManager.getInstance().getCurrentProductLeft();
        Product product2 = ProductManager.getInstance().getCurrentProductRight();

        image1.setImage(product1.getImage());
        price1.setText(Double.toString(product1.getPrice()));
        screenSize1.setText(Double.toString(product1.getScreenSize()));
        screenRezolution1.setText(product1.getScreenResolution());
        processorSpeed1.setText(Double.toString(product1.getSpeed()));
        ramSize1.setText(Double.toString(product1.getRAMSize()));
        capacity1.setText(Double.toString(product1.getRAMSize()));
        vr1.setText(product1.getVRready() ? "Yes" : "No");
        graphics1.setText(product1.getGraphics());
        os1.setText(product1.getOS());
        weight1.setText(Double.toString(product1.getWeight()));

        image2.setImage(product2.getImage());
        price2.setText(Double.toString(product2.getPrice()));
        screenSize2.setText(Double.toString(product2.getScreenSize()));
        screenRezolution2.setText(product2.getScreenResolution());
        processorSpeed2.setText(Double.toString(product2.getSpeed()));
        ramSize2.setText(Double.toString(product2.getRAMSize()));
        capacity2.setText(Double.toString(product2.getRAMSize()));
        vr2.setText(product2.getVRready() ? "Yes" : "No");
        graphics2.setText(product2.getGraphics());
        os2.setText(product2.getOS());
        weight2.setText(Double.toString(product2.getWeight()));
    }
}
