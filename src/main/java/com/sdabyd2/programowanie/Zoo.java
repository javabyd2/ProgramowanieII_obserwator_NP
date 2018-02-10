package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal>animalList = new ArrayList<>();
    private List<AnimalAddedListener>listenerList = new ArrayList<>();

    public void addAnimal(Animal animal){
        this.animalList.add(animal);
        this.notifyAnimal(animal);
    }

    public void registerAnimalAddedListener(AnimalAddedListener animalAddedListener){
        this.listenerList.add(animalAddedListener);
    }

    public void unregisterAnimalAddedListener (AnimalAddedListener animalAddedListener){
        this.listenerList.remove(animalAddedListener);
    }

    public void notifyAnimal(Animal animal){
        this.listenerList.forEach(listener -> listener.onAnimalAdded(animal));
    }

}
