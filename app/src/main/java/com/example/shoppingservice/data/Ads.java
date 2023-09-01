package com.example.shoppingservice.data;

import java.time.LocalDateTime;

public class Ads {
    private int iconAdsId;
    private String title;
    private String city;
    private LocalDateTime date;
    private int price;
    private int iconPremiumId;
    private int iconDesiredId;

    public Ads(int iconId, String title, String city, LocalDateTime date, int price, int iconPremiumId, int iconDesiredId) {
        this.iconAdsId = iconId;
        this.title = title;
        this.city = city;
        this.date = date;
        this.price = price;
        this.iconPremiumId = iconPremiumId;
        this.iconDesiredId = iconDesiredId;
    }
    public Ads(int iconId, String title, String city, LocalDateTime date, int price,  int iconDesiredId) {
        this.iconAdsId = iconId;
        this.title = title;
        this.city = city;
        this.date = date;
        this.price = price;
        this.iconDesiredId = iconDesiredId;
    }

    public int getIconAdsId() {
        return iconAdsId;
    }

    public void setIconAdsId(int iconAdsId) {
        this.iconAdsId = iconAdsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIconPremiumId() {
        return iconPremiumId;
    }

    public void setIconPremiumId(int iconPremiumId) {
        this.iconPremiumId = iconPremiumId;
    }

    public int getIconDesiredId() {
        return iconDesiredId;
    }

    public void setIconDesiredId(int iconDesiredId) {
        this.iconDesiredId = iconDesiredId;
    }
}
