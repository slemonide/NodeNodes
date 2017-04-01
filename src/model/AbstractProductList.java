package model;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maddyyao on 4/1/2017.
 */
public class AbstractProductList {
    public Type producttype;
    public List<Product> b,m;
    public Product c,d;
    private int e;
    public double o,g,t;
    public double l,f;
    public int q,i;

    public AbstractProductList(Type producttype){
        this.producttype = producttype;
        b = new ArrayList<>();


    }

    public void addProduct(){
        b.add(d);
    }

    public void removeSpecificProduct(int e){
        b.remove(b.get(e));
    }

    public List<Product> getProducts(){
        return b;
    }

    public List<Product> getSizeRelatedProducts(){
        List<Product> am = new ArrayList<>();
        for(Product c: b){
            if(c.getRAMSize()==d.getRAMSize()){
                am.add(c);
                am.add(d);
            }
            return am;
        }
        return am;
    }


    public List<Product> getPriceRelatedProducts(){
        List<Product> bm = new ArrayList<>();
        for(Product next: b){
            if(l<next.getPrice()&&f>next.getPrice()){
                bm.add(next);
            }
        }
        return bm;
    }


    public List<Product> getProcessorSpeedRelatedProducts(){
        List<Product> cm = new ArrayList<>();
        for (Product next: b){
            if(next.getSpeed()==c.getSpeed()){
                cm.add(next);
            }
        }

        return cm;
    }


    public List<Product> getOSRelatedProducts(){
        List<Product> fm = new ArrayList<>();
        for(Product next: b){
            if(next.getOS().equals(c.getOS())){
                fm.add(next);
            }
        }
        return fm;
    }


    public List<Product> getMultiAspectsRelatedProducts(){
        List<Product> om = new ArrayList<>();
        for(Product next: b){
            if(next.getVRready()==c.getVRready()||next.getRAMSize()==c.getRAMSize()||next.getOS()==c.getOS()
                    ||o<next.getWeight()&&next.getWeight()<g||next.getScreenResolution()==c.getScreenResolution()
                    ||q<next.getCapacity()&& next.getCapacity()<i||next.getGraphics()==c.getGraphics()){
                om.add(next);
            }
        }
        return om;
    }

    public void removeAllProducts(){
        b.removeAll(b);
    }

    public void addSomeProducts(List<Product> f){
        b.addAll(f.subList(q,i));
    }

    public int getNumofProductsAvailable(){
        int i = 0;
        for(Product next: m){
            if(next.getName()==c.getName()){
                i = i +1;
            }
        }
        return i;
    }











}
