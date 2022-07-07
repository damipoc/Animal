package com.qa.animal;

public class Cat extends Animal {

    private String eyeColour;

    public Cat(String size, int age, int gramWeight, String eyeColour) {
        this.size = size;
        this.age = age;
        this.gramWeight = gramWeight;
        this.eyeColour = eyeColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public int getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(int gramWeight) {
        this.gramWeight = gramWeight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean hasPaws() {
        return true;
    }

    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public void hasFur() {
        System.out.println("Cats do have fur");
    }

    @Override
    public void isPet() {
        System.out.println("This cat is a pet");
    }

    @Override

    public String toString() {
        return "Cat age=" + age + ", gramWeight=" + gramWeight + ", size=" + size;
    }

}
