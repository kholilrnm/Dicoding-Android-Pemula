package com.kholil.submission_dicoding1;

import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {
    private String nama_makanan;
    private String detail_makanan;
    private int photo;
    private String harga;

    public Makanan() {

    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public String getDetail_makanan() {
        return detail_makanan;
    }

    public void setDetail_makanan(String detail_makanan) {
        this.detail_makanan = detail_makanan;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_makanan);
        parcel.writeString(detail_makanan);
        parcel.writeInt(photo);
        parcel.writeString(harga);
    }

    protected Makanan(Parcel in) {
        nama_makanan = in.readString();
        detail_makanan = in.readString();
        photo = in.readInt();
        harga = in.readString();
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };
}
