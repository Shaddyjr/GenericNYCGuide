package com.example.android.genericnycguide;

public class Location {
    private String  name;
    private int     imageResourceID;
    private String  address;
    private String  description;
    private String  locationType;

    public Location(String name,int imageResourceID,String address,String description,String locationType) {
        this.name             = name;
        this.imageResourceID  = imageResourceID;
        this.address          = address;
        this.description      = description;
        this.locationType     = locationType;
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
}
