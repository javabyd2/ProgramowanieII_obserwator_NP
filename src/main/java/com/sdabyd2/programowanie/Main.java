package com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Zoo zoo = new Zoo();
        zoo.registerAnimalAddedListener(new Visitor());
        Treser treser = new Treser();
        zoo.registerAnimalAddedListener(treser);
        zoo.addAnimal(new Animal("tygrys"));
        ShiftLeader shiftLeader = new ShiftLeader();
        zoo.registerAnimalAddedListener(shiftLeader);

        zoo.addAnimal(new Animal("hipopotam "));

        zoo.registerAnimalAddedListener(new ZooCleaningTeam());
        zoo.unregisterAnimalAddedListener(shiftLeader);
        zoo.unregisterAnimalAddedListener(treser);
        zoo.addAnimal(new Animal("żółw"));
    }
}
