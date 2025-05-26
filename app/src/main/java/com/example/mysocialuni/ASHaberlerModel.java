package com.example.mysocialuni;

public class ASHaberlerModel {
    private final String day;
    private final String month;
    private final String title;
    private final String description; // Yeni eklenen alan
    private final int imageResId;

    public ASHaberlerModel(String day, String month, String title, String description, int imageResId) {
        this.day = day;
        this.month = month;
        this.title = title;
        this.description = description; // Açıklama zorunlu
        this.imageResId = imageResId;
    }

    // Getter'lar
    public String getDay() { return day; }
    public String getMonth() { return month; }
    public String getTitle() { return title; }
    public String getDescription() { return description; } // Yeni getter
    public int getImageResId() { return imageResId; }
}