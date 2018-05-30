package com.example.android.genericnycguide;

import java.util.Random;

public class Location {
    static private int NUMBER_OF_IMAGES = 22;
    private int[] imageIDs = new int[NUMBER_OF_IMAGES];
    private String packageName = MainActivity.MAIN_CONTEXT.getPackageName();

    private String  name;
    private int     imageResourceID;
    private String  address;
    private String  description;
    private String  locationType;
    private String  time = "";

    public Location(String name,String address,String description,String locationType,int imageResourceID) {
        this.name             = name;
        this.address          = address;
        this.description      = description;
        this.locationType     = locationType;
        this.imageResourceID  = imageResourceID;
        defineImageID();
    }

    public Location(String name,String address,String description, String time, String locationType,int imageResourceID) {
        this.name             = name;
        this.address          = address;
        this.description      = description;
        this.locationType     = locationType;
        this.time             = time;
        this.imageResourceID  = imageResourceID;
        defineImageID();
    }

    /**
     * Defines the image resource ID.
     * The task of creating individual images was taxing and excessive.
     * I believe I've shown enough proof of concept that tediously making individual images is
     * unnecessary.
     * I've opted to simply randomize the image used from a selection of stock NYC images.
     */
    private void defineImageID(){
        for(int i = 0; i<NUMBER_OF_IMAGES; i++){
            int resID = MainActivity.MAIN_CONTEXT.getResources().getIdentifier("nyc_"+(i+1) , "drawable", packageName);
            imageIDs[i] = resID;
        }
        int index = new Random().nextInt(imageIDs.length);
        imageResourceID = imageIDs[index];
    }

    /**
     * Gets image resource ID.
     */
    public int getImageResourceID() {
        return imageResourceID;
    }

    /**
     * Gets address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets location type.
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Gets name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets time;
     */
    public String getTime() {
        return time;
    }

    /**
     * Returns true if location has a timed event.
     */
    public boolean hasTime(){
        return time.length()>0;
    }
}
