package com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new Visitor());

        zoo.addAnimal(new Animal("tygrys"));

        zoo.registerAnimalAddedListener(new ShiftLeader());

        zoo.addAnimal(new Animal("hipopotam "));

        zoo.registerAnimalAddedListener(new ZooCleaningTeam());

        zoo.addAnimal(new Animal("żółw"));
    }
}
