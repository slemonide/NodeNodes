package model;

/**
 * Created by Ray on 2017-04-01.
 */
public class ProductManager{

    private static ProductManager instance;
    //private List<Product> products;


    private ProductManager(){

    }

    public static ProductManager getInstance(){
        if(instance == null){
            instance = new ProductManager();
        }
        return instance;
    }
/*
    addProduct(){}

    getNextProduct(){}

    getPreviousProduct(){}

    addToFavourites(){}

*/
}
