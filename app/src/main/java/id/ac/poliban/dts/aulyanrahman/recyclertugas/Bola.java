package id.ac.poliban.dts.aulyanrahman.recyclertugas;

import java.io.Serializable;

public class Bola implements Serializable {
    private String name;
    private String detail;
    private int photo;

    public Bola(String name, String detail, int photo) {
        this.name = name;
        this.detail = detail;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
