package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Result;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.repository.CompanyRepository;
import com.kodilla.hibernate.manytomany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyFacade {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    private Result result;

    List<Company> findCompany(String string) {
        List<Company> list = companyRepository.retrieveCompany(string);
        result.getCompanies(list);
        return list;
    }

    List<Employee> findEmployee(String string) {
        List<Employee> list = employeeRepository.retrieveEmployee(string);
        result.getEmployees(list);
        return list;
    }
}