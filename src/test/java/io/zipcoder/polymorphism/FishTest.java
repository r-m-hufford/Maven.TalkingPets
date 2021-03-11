package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class FishTest{

    @Test
    public void constructorTest() {
        Fish fish = new Fish("goldie");

        String expected = "goldie";
        String actual = fish.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Fish fish = new Fish("goldie");
        fish.setNameTest("fish");

        String expected = "Airbud";
        String actual = fish.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest() {
        Fish fish = new Fish("fish");

        String expected = "blub";
        String actual = fish.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest() {
        Fish fish = new Fish("fish");
        fish.setSpeak("blub blub");

        String expected = "blub blub";
        String actual = fish.speak();

        Assert.assertEquals(expected, actual);
    }

}

