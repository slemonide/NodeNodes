package model;

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
    public boolean like;
    public Product(){
        this.name = name;
        this.price = price;
        this.VRready = VRready;
        this.screensize = screensize;
        this.speed = speed;
        this.graphics = graphics;
        this.weight = weight;
        this.capacity = capacity;
        this.OS = OS;
        this.a = a;
        this.screenresolution = screenresolution;
        this.RAMSize = RAMSize;
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

    public String getScreenresolution(){
        return screenresolution;
    }

    public String getGraphics(){
        return graphics;
    }

    public double getSpeed(){
        return speed;
    }

    public Type getType(){
        return a;
    }

    public boolean getVRready(){
        return VRready;
    }

    public double getPrice(){
        return price;
    }


    public boolean pressliketheproduct(){
        like = true;
        return like;
    }














}
