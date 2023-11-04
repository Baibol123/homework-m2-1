package org.example;

public class Secretary extends Director{
    private int age;
    public Secretary(String name, Company company, Hierarchy hierarchy, int age) {
        super(name, company, hierarchy);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void overload() {
        System.out.println("перегруженный метод");
    }

    public final void nonOver() {
        System.out.println("неперезаписываемый метод");
    }
    public String getInfo() {
        return (
                "\nимя секретаря : " +
                        getName() + " \nему : " +
                        getAge() + " лет");
    }
}
