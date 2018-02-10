package com.sdabyd2.programowanie;

public class Visitor implements AnimalAddedListener{
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy: " + animal.getName());
    }
}
