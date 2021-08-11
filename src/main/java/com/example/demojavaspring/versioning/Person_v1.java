package com.example.demojavaspring.versioning;

public class Person_v1 {
    private String name;

    public Person_v1() {
        super();
    }

    public Person_v1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
