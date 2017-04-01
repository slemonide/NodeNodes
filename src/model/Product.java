package model;

import javafx.scene.image.Image;

import java.lang.reflect.Type;

/**
 * Created by maddyyao on 4/1/2017.
 */
public class Product {
    public String name;
    public double price;
    public boolean VRready;
    public double screensize;
    public String screenresolution;
    public double speed;
    public String graphics;
    public double weight;
    public double RAMSize;
    public int capacity;
    public String OS;
    public Type a;
    private Image image;
    private double screenSize;
    private double processorSPeed;

    public Product(){
         name = "";
         price = 0;
         VRready = false;
         screensize = 0;
         screenresolution = "";
         speed = 0;
         graphics = "";
         weight = 0;
         RAMSize = 0;
         capacity = 0;
         OS = "";
    }

    public String getName(){
        return name;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getWeight(){
        return weight;
    }

    public String getOS(){
        return OS;
    }

    public double getRAMSize(){
        return RAMSize;
    }

    public String getScreenResolution(){ return screenresolution; }

    public String getGraphics(){
        return graphics;
    }

    public double getSpeed(){
        return speed;
    }

    public boolean getVRready(){
        return VRready;
    }

    public double getPrice(){
        return price;
    }

    public void setImage(Image image) {this.image = image;}

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVReady(boolean VRready){
        this.VRready = VRready;
    }

    public void setScreenSize(double screensize){
        this.screensize = screensize;
    }

    public void setProcessSpeed(double speed){
        this.speed = speed;
    }

    public void setGraphics(String graphics){
        this.graphics = graphics;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public void setType(Type a){
        this.a = a;
    }

    public void setRAMSize(double ramsize){
        this.RAMSize = ramsize;
    }

    public Image getImage() {
        return image;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getProcessorSPeed() {
        return processorSPeed;
    }
}
