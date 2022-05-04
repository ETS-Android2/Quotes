package com.example.quotes.Modal;

public class Modal_Data_Quotes {
    String s;
    int images;

    public Modal_Data_Quotes(String s, int image) {
        this.s = s;
        this.images = image;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
