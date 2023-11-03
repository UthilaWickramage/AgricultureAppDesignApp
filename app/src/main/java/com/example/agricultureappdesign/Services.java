package com.example.agricultureappdesign;

import java.util.ArrayList;
import java.util.List;

public class Services {
    private Integer id;
    private String name;
    private Integer image;

    public Services(Integer id, String name, Integer image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getImage() {
        return image;
    }

    public static List<Services> allServices(){
        List<Services> services = new ArrayList<>();
        services.add(new Services(1,"Seeds",R.mipmap.seeds));
        services.add(new Services(1,"Seeds",R.mipmap.machinery));
        services.add(new Services(1,"Seeds",R.mipmap.workers));

        return services;
    }
}
