package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MainApplicationTest {
@Test
    public void addPetTest1() {
        MainApplication mainApp = new MainApplication();

        Cat cat = new Cat("burrito");
        Dog dog = new Dog("airbud");
        Fish fish = new Fish("fishy");
        ArrayList<Pet> pets = new ArrayList<Pet>();

        mainApp.addPet(cat);
        mainApp.addPet(dog);
        mainApp.addPet(fish);

        Integer expected = 3;
        Integer actual = mainApp.pets.size();

        Assert.assertEquals(expected,actual);
    }

    ///////// NOT SURE IF THIS ONE WILL WORK. MORE OF AN EXPERIMENT REALLY ///////////
    @Test
    public void addPetTest2() {
        MainApplication mainApp = new MainApplication();

        Cat cat = new Cat("burrito");
        Dog dog = new Dog("airbud");
        Fish fish = new Fish("fishy");
        ArrayList<Pet> pets = new ArrayList<Pet>();

        mainApp.addPet(cat);
        mainApp.addPet(dog);
        mainApp.addPet(fish);

        String expected = "airbud";
        String actual = mainApp.pets.get(1).name;

        Assert.assertEquals(expected,actual);
    }
}
