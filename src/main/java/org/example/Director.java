package org.example;

public class Director {
    private String name;
    private Company company;

    private Hierarchy hierarchy;

    public Director(String name, Company company, Hierarchy hierarchy) {
        this.name = name;
        this.company = company;
        this.hierarchy = hierarchy;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Hierarchy getHierarchy() {
        return hierarchy;
    }
}
