package com.example.mysocialuni;

public class ASDuyurularModel {
    private String gun;
    private String ay;
    private String baslik;
    private String aciklama;
    private int resimId; // Resim yoksa -1

    // Constructor
    public ASDuyurularModel(String gun, String ay, String baslik, String aciklama, int resimId) {
        this.gun = gun;
        this.ay = ay;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.resimId = resimId;
    }

    // Getter'lar
    public String getGun() { return gun; }
    public String getAy() { return ay; }
    public String getBaslik() { return baslik; }
    public String getAciklama() { return aciklama; }
    public int getResimId() { return resimId; } // Yeni getter
}