package com.sang.sc_tatica.Community;

public class LocalOrGlobal {
    private String name;
    private int image;

    public LocalOrGlobal() {
    }

    public LocalOrGlobal(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "LocalOrGlobal{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
