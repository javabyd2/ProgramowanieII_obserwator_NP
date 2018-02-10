package com.sdabyd2.programowanie;

public class ShiftLeader implements AnimalAddedListener {
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Kierowniku, mamy nowy: " + animal.getName());
    }
}
