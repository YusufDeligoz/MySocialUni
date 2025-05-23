package com.example.mysocialuni;

import java.util.HashMap;
import java.util.Map;

public class eventModel implements Comparable<eventModel> {
    public int day;
    public int month;
    public String title;
    public String description;
    public String clubName;
    public String startTime;
    public String endTime;
    public int imageResId;

    public eventModel(String day, String month, String title, String description, String clubName, String startTime, String endTime, int imageResId) {
        this.day = Integer.parseInt(day);
        this.month = convertMonthToNumber(month);
        this.title = title;
        this.description = description;
        this.clubName = clubName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.imageResId = imageResId;
    }

    private int convertMonthToNumber(String monthName) {
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("Ocak", 1);
        monthMap.put("Şubat", 2);
        monthMap.put("Mart", 3);
        monthMap.put("Nisan", 4);
        monthMap.put("Mayıs", 5);
        monthMap.put("Haziran", 6);
        monthMap.put("Temmuz", 7);
        monthMap.put("Ağustos", 8);
        monthMap.put("Eylül", 9);
        monthMap.put("Ekim", 10);
        monthMap.put("Kasım", 11);
        monthMap.put("Aralık", 12);

        return monthMap.getOrDefault(monthName, 0);
    }

    public String getMonthName() {
        String[] monthNames = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        return (month >= 1 && month <= 12) ? monthNames[month] : "";
    }

    public String getClubAndTime() {
        return clubName + " | " + startTime + " - " + endTime;
    }

    @Override
    public int compareTo(eventModel other) {
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        } else {
            return Integer.compare(this.day, other.day);
        }
    }
}
