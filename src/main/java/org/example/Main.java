package org.example;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("samsung", "korea");
        Secretary objectA = new Secretary("Alfred", company, Hierarchy.SECRETARY, 38);
        Worker objectB = new Worker(25, "bek", company, Hierarchy.WORKER);
        Worker objectC = new Worker(28, "aliya", company, Hierarchy.WORKER);

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());
        objectA.overload();
        objectA.nonOver();

    }
}