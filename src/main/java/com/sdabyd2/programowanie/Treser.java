package com.sdabyd2.programowanie;

public class Treser implements AnimalAddedListener {
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowe zwierzę do tresury: " + animal.getName());
    }
}
