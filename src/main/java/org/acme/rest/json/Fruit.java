package org.acme.rest.json;

public class Fruit {

    //  making a change to we can deploy our pipeline
    public String name;
    public String description;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
