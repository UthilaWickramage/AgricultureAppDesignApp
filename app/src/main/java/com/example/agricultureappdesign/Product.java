package com.example.agricultureappdesign;


import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String productName;
    private String weight;

    private int image;

    public Product(int id, String productName, String weight, int image) {
        this.id = id;
        this.productName = productName;
        this.weight = weight;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getWeight() {
        return weight;
    }

    public int getImage() {
        return image;
    }

    public static List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();

        products.add(new Product(1,"Rice Seeds","$15 / Kg",R.mipmap.machinery));
        products.add(new Product(2,"Harvest Disease","$35 / Kg",R.mipmap.crop_disease));
        products.add(new Product(3,"Lime Seedlings","$150 / Kg",R.mipmap.workers));
        products.add(new Product(3,"Lime Seedlings","$150 / Kg",R.mipmap.workers));
        products.add(new Product(3,"Lime Seedlings","$150 / Kg",R.mipmap.workers));
        return products;
    }
}
