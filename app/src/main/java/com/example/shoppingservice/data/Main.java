package com.example.shoppingservice.data;

public class Main {
    private int iconId;
    private String title;
    private String tag;

    public Main(int iconId, String title, String tag) {
        this.iconId = iconId;
        this.title = title;
        this.tag = tag;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
