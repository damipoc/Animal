package com.qa.animal;

public class Hamster extends Animal {

    private String size;
    private int age;
    private int gramWeight;
    private String type;

    public Hamster(String size, int age, int gramWeight, String type){
        this.size = size;
        this.age = age;
        this.gramWeight = gramWeight;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean hasPaws() {
        return true;
    }

    @Override
    public String sound() {
        return "Squeak";
    }

    @Override
    public void hasFur() {
        System.out.println("Hamsters do have fur");
    }

    @Override
    public void isPet() {
        System.out.println("This hamster is a pet");
    }

    @Override

    public String toString() {
        return "Hamster age=" + age + ", gramWeight=" + gramWeight + ", size=" + size;
    }

}
