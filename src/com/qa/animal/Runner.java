package com.qa.animal;

public class Runner {

    public static void main(String[] args) {

        Snake snakeOne = new Snake("M", 3, 2000, "Python");
        Cat catOne = new Cat("M", 4, 4000, "Green");
        Dog dogOne = new Dog("L", 5, 30000, "Rex");
        Hamster hamsterOne = new Hamster("S", 1, 300, "Dwarf");

        System.out.println(snakeOne);
        System.out.println("Does this animal have paws? " + snakeOne.hasPaws());
        System.out.println("What sound does this animal make? " + snakeOne.sound());
        System.out.println("What type of snake is this? " + snakeOne.getType());
        snakeOne.isPet();
        snakeOne.hasFur();

        System.out.println();

        System.out.println(catOne);
        System.out.println("Does this animal have paws? " + catOne.hasPaws());
        System.out.println("What sound does this animal make? " + catOne.sound());
        System.out.println("Whats the eye colour of the cat? " + catOne.getEyeColour());
        catOne.isPet();
        catOne.hasFur();

        System.out.println();

        System.out.println(dogOne);
        System.out.println("Does this animal have paws? " + dogOne.hasPaws());
        System.out.println("What sound does this animal make? " + dogOne.sound());
        System.out.println("What is the name of the dog? " + dogOne.getName());
        dogOne.isPet();
        dogOne.hasFur();

        System.out.println();

        System.out.println(hamsterOne);
        System.out.println("Does this animal have paws? " + hamsterOne.hasPaws());
        System.out.println("What sound does this animal make? " + hamsterOne.sound());
        System.out.println("What type of hamster is this? " + hamsterOne.getType());
        hamsterOne.isPet();
        hamsterOne.hasFur();

    }

}
