package com.example.assignment3zoo.Model;

import java.util.ArrayList;
import java.util.List;

public class Enclosure implements EnclosureCollection{

    private final String aName;
    private final List<Animal> aAnimal;
    public Enclosure(String pName) {
        this.aName = pName;
        this.aAnimal = new ArrayList<>();
    }

    public void addAnimal(Animal pAnimal) {
        this.aAnimal.add(pAnimal);
    }

    @Override
    public String getName() {
        String EnclosureName = this.aName;
        return EnclosureName;
    }
}