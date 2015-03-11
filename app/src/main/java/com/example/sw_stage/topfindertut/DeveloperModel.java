package com.example.sw_stage.topfindertut;

import java.io.Serializable;

/**
 * Created by sw_stage on 11-3-2015.
 */
public class DeveloperModel implements Serializable {
    private String name;
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    private String platform;
    public String getPlatform() {return platform;}
    public void setPlatform(String platform) {this.platform = platform;}

    private String image;
    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}
}
