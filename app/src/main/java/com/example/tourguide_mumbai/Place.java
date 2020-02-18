//created by Sameer on 04/12/2019.
package com.example.tourguide_mumbai;

public class Place {

    private int mImageResourceId;
    private String mPlaceName;
    private String mPlaceAddress;

    public Place(int imageResourceId, String placeName, String placeAddress){
        mImageResourceId = imageResourceId;
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceAddress() {
        return mPlaceAddress;
    }

}
