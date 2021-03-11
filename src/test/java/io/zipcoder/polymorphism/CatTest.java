package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class CatTest{

    @Test
    public void constructorTest() {
        Cat cat = new Cat("titus");

        String expected = "titus";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Cat = new Cat("titus");
        cat.setNameTest("burrito"); ////actual name of a friend's cat

        String expected = "burrito";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest() {
        Cat cat = new Cat("cat");

        String expected = "meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest() {
        Cat cat = new Cat("cat");
        cat.setSpeak("hiss");

        String expected = "hiss";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

}

