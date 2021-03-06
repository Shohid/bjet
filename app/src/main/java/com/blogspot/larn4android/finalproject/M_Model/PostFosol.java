package com.blogspot.larn4android.finalproject.M_Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Minto on 9/1/2016.
 */
public class PostFosol implements Parcelable {
    private String fosolPostTitle,fosolPostDescription;

    public PostFosol(String fosolPostTitle, String fosolPostDescription, String fosolPostImage) {
        this.fosolPostTitle = fosolPostTitle;
        this.fosolPostDescription = fosolPostDescription;
    }

    public PostFosol() {
    }

    public PostFosol(Parcel in) {

        String[] data = new String[2];

        in.readStringArray(data);
        this.fosolPostTitle = data[0];
        this.fosolPostDescription = data[1];
    }

    public String getfosolPostTitle() {
        return fosolPostTitle;
    }

    public void setfosolPostTitle(String fosolPostTitle) {
        this.fosolPostTitle = fosolPostTitle;
    }

    public String getfosolPostDescription() {
        return fosolPostDescription;
    }

    public void setfosolPostDescription(String fosolPostDescription) {
        this.fosolPostDescription = fosolPostDescription;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeStringArray(new String[] {this.fosolPostTitle,
                this.fosolPostDescription,
                });
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public PostFosol createFromParcel(Parcel in) {
            return new PostFosol(in);
        }

        public PostFosol[] newArray(int size) {
            return new PostFosol[size];
        }
    };
}
