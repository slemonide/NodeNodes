package model;

import javafx.scene.image.Image;

/**
 * Created by maddyyao on 4/1/2017.
 */
public class Product {
    public String name;
    public double price;
    public boolean VRready;
    public double screenSize;   //inches
    public String screenResolution;  // w x h
    public double speed;    //GHz
    public String graphics;
    public double weight;   // kg
    public double RAMSize;  //Gb
    public int capacity;    //Gb
    public String OS;
    public String type;
    private Image image;

    public Product() {
        name = "";
        price = 0;
        VRready = false;
        screenSize = 0;
        screenResolution = "";
        speed = 0;
        graphics = "";
        weight = 0;
        RAMSize = 0;
        capacity = 0;
        OS = "";
        type = "";
        image = null;
    }

    //INCOMPLETE
    public Product(String name, double price, boolean VRready, double screenSize, String screenResolution,
                   double speed, String graphics, double weight, double RAMSize, int capacity, String OS,
                   String type, Image image) {
        this.name = name;
        this.price = price;
        this.VRready = VRready;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.speed = speed;
        this.graphics = graphics;
        this.weight = weight;
        this.RAMSize = RAMSize;
        this.capacity = capacity;
        this.OS = OS;
        this.type = type;
        this.image = image;

    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public boolean getVRready() {
        return VRready;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public String getOS() {
        return OS;
    }

    public double getRAMSize() {
        return RAMSize;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public String getGraphics() {
        return graphics;
    }

    public double getSpeed() {
        return speed;
    }


    public void setImage(Image image) {
        this.image = image;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVRready(boolean VRready) {
        this.VRready = VRready;
    }

    public void setScreenSize(double screensize) {
        this.screenSize = screensize;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void setProcessSpeed(double speed) {
        this.speed = speed;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRAMSize(double RAMSize) {
        this.RAMSize = RAMSize;
    }

    public Image getImage() {
        return image;
    }
}