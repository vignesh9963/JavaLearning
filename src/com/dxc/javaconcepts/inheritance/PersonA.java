package com.dxc.javaconcepts.inheritance;

class PersonA
{
    int age;
    String name;

    @Override
    public String toString() {
        return "PersonA{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public PersonA(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}