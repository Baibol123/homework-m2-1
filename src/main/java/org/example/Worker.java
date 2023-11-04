package org.example;

final public class Worker {
    private int age;
    private String name;
    private Company company;

    private Hierarchy hierarchy;
    public Worker(int age, String name, Company company, Hierarchy hierarchy) {
        this.age = age;
        this.company = company;
        this.hierarchy = hierarchy;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return (
                "\nимя работника : " +
                        getName() + " \nему : " +
                        getAge() + " лет");
    }
}
