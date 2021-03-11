package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication {
    ArrayList<Pet> pets = new ArrayList<Pet>();

    public MainApplication(){

    }

    public static void main(String[] args){
        Boolean morePets = true;

        Console console1 = new Console();

        while(morePets){
            String morePetsQuestion = console1.getStringInput("Do you have any more pets?");
            if(morePetsQuestion=="no"){
                morePets = false;
            }
            String
        }

    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

}
