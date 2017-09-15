package com.example.uefi.design;

import java.io.Serializable;
import java.util.List;

/**
 * Created by uefi on 8/29/2017.
 */

public class Charity implements Serializable {
    private String name;
    private String shortdescription;
    private  int  photoid;
    private    boolean fav = false;



    private List<Charity> charityList;

    public Charity() {
    }

    public Charity(String name, String shortdescription, int photoid, boolean fav) {
        this.name = name;
        this.shortdescription = shortdescription;
        this.photoid = photoid;
        this.fav = fav;
    }

    public int getPhotoid() {
        return photoid;
    }

    public void setPhotoid(int photoid) {
        this.photoid = photoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
    public List<Charity> DAta(){
        charityList.add(new Charity("محک" ,"name "  , 2 , false));
         return charityList;
    }

    @Override
    public String toString() {
        return "Charity{" +
                "name='" + name + '\'' +
                ", shortdescription='" + shortdescription + '\'' +
                ", photoid=" + photoid +
                ", fav=" + fav +
                '}';
    }
}
