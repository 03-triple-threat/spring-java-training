package com.example.demojavaspring.versioning;

public class Person_v2 {
    private Name name;

    public Person_v2() {
        super();
    }

    public Person_v2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

}
