package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Company.retrieveCompany",
        query = "FROM Company WHERE name LIKE :ARG"
)
@NamedNativeQuery(
        name = "Company.retrieveCompanyWhoseNameBegins",
        query = "SELECT * FROM COMPANIES" +
                "WHERE LEFT(COMPANY_NAME, 3) = :STRING",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" + name + '}';
    }

    public static void getResult(List<Company> list){
        if(list.size() > 0) {
            for (Company company : list) {
                System.out.println(company);}
        } else {
            System.out.println("No company found.");
        }
    }
}