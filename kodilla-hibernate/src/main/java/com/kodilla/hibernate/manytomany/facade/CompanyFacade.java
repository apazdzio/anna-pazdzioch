package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.repository.CompanyRepository;
import com.kodilla.hibernate.manytomany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.kodilla.hibernate.manytomany.Company.getResult;
import static com.kodilla.hibernate.manytomany.Employee.showResult;

@Component
public class CompanyFacade {
    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    List<Company> findCompany(String string) {
        List<Company> list = companyRepository.retrieveCompany(string);
        getResult(list);
        return list;
    }

    List<Employee> findEmployee(String string) {
        List<Employee> list = employeeRepository.retrieveEmployee(string);
        showResult(list);
        return list;
    }
}