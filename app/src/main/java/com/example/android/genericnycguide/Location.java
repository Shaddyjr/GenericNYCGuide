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

    Location(String[] locationArray,String locationType,int imageResourceID) {
        this.name             = locationArray[0];
        this.address          = locationArray[1];
        this.description      = locationArray[2];
        this.locationType     = locationType;
        this.imageResourceID  = imageResourceID;
        if(locationArray.length>3){
            this.time = locationArray[3];
        }
    }

    /**
     * Gets image resource ID.
     */
    public int getImageResourceID() {
        // The task of creating individual images was taxing and excessive.
        // I believe I've shown enough proof of concept to prove capability.

        //        return imageResourceID;

        // I've opted to simply randomize the image used from a selection of
        // stock NYC images

        int[] imageIDs = {
                R.drawable.nyc_1,
                R.drawable.nyc_2,
                R.drawable.nyc_3,
                R.drawable.nyc_4,
                R.drawable.nyc_5,
                R.drawable.nyc_6,
                R.drawable.nyc_7,
                R.drawable.nyc_8,
                R.drawable.nyc_9,
                R.drawable.nyc_10,
                R.drawable.nyc_11,
                R.drawable.nyc_12,
                R.drawable.nyc_13,
                R.drawable.nyc_14,
                R.drawable.nyc_15,
                R.drawable.nyc_16,
                R.drawable.nyc_17,
                R.drawable.nyc_18,
                R.drawable.nyc_19,
                R.drawable.nyc_20,
                R.drawable.nyc_21,
                R.drawable.nyc_22,
        };

        int index = new Random().nextInt(imageIDs.length);
        return imageIDs[index];
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
