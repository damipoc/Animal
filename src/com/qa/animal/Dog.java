package com.qa.animal;

public class Dog extends Animal {

    private String size;
    private int age;
    private int gramWeight;
    private String name;

    public Dog(String size, int age, int gramWeight, String name){
        this.size = size;
        this.age = age;
        this.gramWeight = gramWeight;
        this.name = name;
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

    public int getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(int gramWeight) {
        this.gramWeight = gramWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean hasPaws() {
        return true;
    }

    @Override
    public String sound() {
        return "Woof";
    }

    @Override
    public void hasFur() {
        System.out.println("Dogs do have fur");
    }

    @Override
    public void isPet() {
        System.out.println("This dog is a pet");
    }

    @Override

    public String toString() {
        return "Dog age=" + age + ", gramWeight=" + gramWeight + ", size=" + size;
    }

}
