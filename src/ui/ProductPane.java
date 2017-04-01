package ui;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ProductPane {
    public Text title;
    public ImageView image;
    public Text price;
    public Text screenSize;
    public Text screenResolution;
    public Text speed;
    public Text ram;
    public Text capacity;
    public Text vr;
    public Text graphics;
    public Text os;
    public Text weight;

    @FXML
    private void initialize() {
        title.setText("LOL");
    }
}
