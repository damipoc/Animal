package com.qa.animal;

public class Snake extends Animal {

    private String type;

    public Snake(String size, int age, int gramWeight, String type) {
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
        return false;
    }

    @Override
    public String sound() {
        return "SSSSSS";
    }

    @Override
    public void hasFur() {
        System.out.println("Snakes do not have fur");
    }

    @Override
    public void isPet() {
        System.out.println("This snake is not a pet");
    }

    @Override

    public String toString() {
        return "Snake age=" + age + ", gramWeight=" + gramWeight + ", size=" + size;
    }

}
