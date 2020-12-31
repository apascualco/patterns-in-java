package com.apascualco.pattern.creational.singleton.domain;

public class ShopApplication {
    private static ShopApplication instance;
    public int version;
    public String name;

    private ShopApplication(final int version, final String name) {
        this.version = version;
        this.name = name;
    }

    public static ShopApplication getInstance(final int version, final String name) {
        if (instance == null) {
            instance = new ShopApplication(version, name);
        }
        return instance;
    }
}
