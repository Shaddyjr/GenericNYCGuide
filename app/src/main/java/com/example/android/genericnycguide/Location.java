package com.example.android.genericnycguide;

public class Location {
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
    }

    public Location(String name,String address,String description, String time, String locationType,int imageResourceID) {
        this.name             = name;
        this.address          = address;
        this.description      = description;
        this.locationType     = locationType;
        this.time             = time;
        this.imageResourceID  = imageResourceID;
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
