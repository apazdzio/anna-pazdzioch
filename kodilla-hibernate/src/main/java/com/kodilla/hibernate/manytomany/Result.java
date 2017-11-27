package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Result {

    public static void getEmployees(List<Employee> list){
        if(list.size() > 0) {
            for (Employee employee : list) {
                System.out.println(employee);}
        } else {
            System.out.println("No employees were found.");
        }
    }

    public static void getCompanies(List<Company> list){
        if(list.size() > 0) {
            for (Company company : list) {
                System.out.println(company);}
        } else {
            System.out.println("No companies were found.");
        }
    }
}
