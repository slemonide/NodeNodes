package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ray on 2017-04-01.
 */
public class ProductManager{

    private static ProductManager instance;
    private List<Product> products;
    private int current;       //index of current selected product
    private List<Product> favourites;


    private ProductManager(){
        products = new ArrayList<>();
        current = 0;
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

    public Product getCurrentProduct(){
        return products.get(current);
    }

    //REQUIRES: non-empty list, index less than size of list - 1
    public Product getNextProduct(){
        if(current<products.size()-1) {
            return products.get(current + 1);
        }
        return null;
    }

    public Product getPreviousProduct(){
        if(current>0 && current < products.size()){
            return products.get(current - 1);
        }
        return null;
    }

    public void toggleFavourites(){
        Product p = getCurrentProduct();
        if(!favourites.contains(p)){
        favourites.add(p);}
        else{
            favourites.remove(p);
        }
    }
}
