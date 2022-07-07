package com.qa.animal;

public class Animal implements Pet, Fur {

    public String size;
    public int age;
    public int gramWeight;

    // Fix grams

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

    public int getgramWeight() {
        return gramWeight;
    }

    public void setgramWeight(int gramWeight) {
        this.gramWeight = gramWeight;
    }

    public String sound() {
        return "Woof";
    }

    public boolean hasPaws() {
        return true;
    }

    @Override
    public void hasFur() {
        // TODO Auto-generated method stub

    }

    @Override
    public void isPet() {
        // TODO Auto-generated method stub

    }

}
