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
         //
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


    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVReady(boolean VRready){
        this.VRready = VRready;
    }

    public void setScreensize(double screensize){
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
        this.a =a;
    }

    public void SetRamSize(double ramsize){
        this.RAMSize = ramsize;
    }

















}
