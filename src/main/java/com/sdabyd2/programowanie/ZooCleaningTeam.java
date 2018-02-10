package com.sdabyd2.programowanie;

public class ZooCleaningTeam implements AnimalAddedListener {
    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("Przygotować miejsce na: " + animal.getName());
    }
}
