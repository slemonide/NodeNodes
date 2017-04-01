package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ray on 2017-04-01.
 */
public class ProductManager{

    private static ProductManager instance;
    private static ProductManager instance2;
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

    public static ProductManager getInstance2(){
        if(instance2 == null){
            instance2 = new ProductManager();
        }
        return instance2;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    private int distinguishInstance(){
        if (this == instance){
            return current;
        }else{
            return current2;
        }
    }

    public Product getCurrentProduct(){
        int i = distinguishInstance();
        return products.get(i);
    }


    public Product getNextProduct(){
        int i = distinguishInstance();
        if(i<products.size()-1) {
            return products.get(i + 1);
        }
        return products.get(0);
    }

    public Product getPreviousProduct(){
        int i = distinguishInstance();
        if(i>0 && i < products.size()){
            return products.get(i - 1);
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
