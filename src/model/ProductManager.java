package model;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class ProductManager{

    private static ProductManager instance;
    private List<Product> products;
    private int current;       //index of current selected product
    private int current2;
    private List<Product> favourites;

    private Product testProduct1;
    private Product testProduct2;


    private ProductManager(){
        products = new ArrayList<>();
        current = 0;
        current2 = 0;
        favourites = new ArrayList<>();
        products.add(new Product());
        products.add(new Product());
        //initializeProducts();
    }

    public static ProductManager getInstance(){
        if(instance == null){
            instance = new ProductManager();
        }
        return instance;
    }


    public void initializeProducts(){
        testProduct1 = new Product();
        testProduct1.setPrice(1399.99);
        testProduct1.setName("Dell 15.6 Gaming Laptop");
        testProduct1.setImage(new Image( "https://multimedia.bbycastatic.ca/multimedia/products/1500x1500/105/10573/10573801.jpg"));
        testProduct1.setVRready(false);
        testProduct1.setScreenSize(15.6);
        testProduct1.setProcessSpeed(2.8);
        testProduct1.setGraphics("NVIDIA GeForce GTX 1050 Ti with 4GB GDDR5");
        testProduct1.setWeight(2.62);
        testProduct1.setCapacity(1024); //ASK EYLUL
        testProduct1.setOS("Windows 10 Home 64bit");
        testProduct1.setType("Laptop");
        testProduct1.setRAMSize(8.0);
        testProduct1.setScreenResolution("1920 x 1080");

        testProduct2 = new Product("Asus ROG Strix GL753", 1499.99, true, 17.3, "1920 x 1080", 2.8, "NVIDIA GTX1050Ti",
                2.99, 16, 1024, "Windows 10 Home 64bit", "Laptop", new Image("https://multimedia.bbycastatic.ca/multimedia/products/1500x1500/105/10573/10573746_12.jpg"));
    }


    public void setProducts(List<Product> products){
        this.products = products;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public Product getCurrentProductLeft(){
        if(0<=current && current<products.size()){
            return products.get(current);
        }
        return null;
    }

    public Product getCurrentProductRight(){
        if(0<=current2 && current2<products.size()){
            return products.get(current2);
        }
        return null;
    }


    public Product getNextProductLeft(){
        if (current < products.size()) {
            current++;
        }
        current = 0;
        return getCurrentProductLeft();
    }

    public Product getNextProductRight(){
        if( current2 < products.size()){
            current2++;
        }
        current2 = 0;
        return getCurrentProductRight();
    }

    public Product getPreviousProductLeft(){
        if((current< products.size())&&current > 0) {
            current--;
        }
        current = products.size() - 1;
        return getCurrentProductLeft();
    }

    public Product getPreviousProductRight(){
        if((current2< products.size())&&current2 > 0) {
            current2--;
        }
        current2 = products.size() - 1;
        return getCurrentProductLeft();
    }

    public void toggleFavouriteLeft(){
        Product p = getCurrentProductLeft();
        if(!favourites.contains(p)){
        favourites.add(p);}
        else{
            favourites.remove(p);
        }
    }

    public void toggleFavouriteRight(){
        Product p = getCurrentProductRight();
        if(!favourites.contains(p)){
            favourites.add(p);}
        else{
            favourites.remove(p);
        }
    }
}
