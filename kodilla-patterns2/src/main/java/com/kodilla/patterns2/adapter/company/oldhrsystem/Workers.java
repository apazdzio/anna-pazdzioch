package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            { "6845123785", "John", "Smith"},
            {"78126354879", "Ivone", "Novak"},
            {"6412324895", "Jessie", "Pinkman"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00};

    public String getWorker(int n){
        if(n > salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
