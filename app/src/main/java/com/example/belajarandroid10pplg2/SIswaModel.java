package com.example.belajarandroid10pplg2;

public class SIswaModel {
    String nama;
    String absen;
    String alamat;
    String DetailInfo;

    int gambar;

    public String getNama() {
        return nama;
    }

    public String getAbsen() {
        return absen;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDetailInfo(){return DetailInfo;}

    public int getGambar() {
        return gambar;
    }

    public SIswaModel(String nama, String absen, String alamat, int gambar, String DetailInfo) {
        this.nama = nama;
        this.absen = absen;
        this.alamat = alamat;
        this.gambar = gambar;
        this.DetailInfo = DetailInfo;
    }
}
