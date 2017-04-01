package model;

import java.util.ArrayList;
import java.util.List;

public class ProductManager{

    private static ProductManager instance;
    private List<Product> products;
    private int current;       //index of current selected product
    private int current2;
    private List<Product> favourites;


    private ProductManager(){
        products = new ArrayList<>();
        current = 0;
        current2 = 0;
        favourites = new ArrayList<>();
    }

    public static ProductManager getInstance(){
        if(instance == null){
            instance = new ProductManager();
        }
        return instance;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public Product getCurrentProductLeft(){
        return products.get(current);
    }

    public Product getCurrentProductRight(){
        return products.get(current2);
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
