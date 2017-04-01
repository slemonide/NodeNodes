package model;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class ProductManager{

    private static ProductManager instance;
    private List<Product> products1;
    private List<Product> products2;
    private List<Product> favourites;

    private ProductManager(){
        products1 = new ArrayList<>();
        products2 = new ArrayList<>();
        favourites = new ArrayList<>();
        products1.add(generateRandomProduct());
        products2.add(generateRandomProduct());
    }

    public static ProductManager getInstance(){
        if(instance == null){
            instance = new ProductManager();
        }
        return instance;
    }

    private Product generateRandomProduct() {
        Product product = new Product();

        product.setPrice(200 + Math.random() * 2000);
        product.setName("Dell 15.6 Gaming Laptop");
        product.setImage(new Image( "https://multimedia.bbycastatic.ca/multimedia/products/1500x1500/105/10573/10573801.jpg"));
        product.setVRready(false);
        product.setScreenSize(15.6);
        product.setProcessSpeed(2.8);
        product.setGraphics("NVIDIA GeForce GTX 1050 Ti with 4GB GDDR5");
        product.setWeight(2.62);
        product.setCapacity(1024); //ASK EYLUL
        product.setOS("Windows 10 Home 64bit");
        product.setType("Laptop");
        product.setRAMSize(8.0);
        product.setScreenResolution("1920 x 1080");

        product = new Product("Asus ROG Strix GL753", 1499.99, true, 17.3, "1920 x 1080", 2.8, "NVIDIA GTX1050Ti",
                2.99, 16, 1024, "Windows 10 Home 64bit", "Laptop", new Image("https://multimedia.bbycastatic.ca/multimedia/products/1500x1500/105/10573/10573746_12.jpg"));

        return product;
    }


    public void addProduct(Product p){
        products1.add(p);
    }

    public Product getCurrentProductLeft(){
        return products1.get(products1.size() - 1);
    }

    public Product getCurrentProductRight(){
        return products2.get(products2.size() - 1);
    }


    public void nextProductLeft(){
        products1.add(generateRandomProduct());
    }

    public void nextProductRight(){
        products2.add(generateRandomProduct());
    }

    public Product getPreviousProductLeft(){
        products1.remove(products1.size() - 1);
        return getCurrentProductLeft();
    }

    public Product getPreviousProductRight(){
        products2.remove(products2.size() - 1);
        return getCurrentProductRight();
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
