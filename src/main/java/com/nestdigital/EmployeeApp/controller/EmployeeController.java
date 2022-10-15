package com.nestdigital.EmployeeApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Employees()
    {
        return "welcome to employee page";
    }
    @GetMapping("/home")
    public String HomePage()
    {
        return "Employee home page";
    }
    @GetMapping("/empadd")
    public  String EmployeeAdd()
    {
        return "Employee Add details";
    }
    @GetMapping("/empsearch")
    public  String EmployeeSearch()
    {
        return "Search employee details";
    }
    @GetMapping("/empdelete")
    public String EmployeeDelete()
    {
        return "Delete Employee Details";
    }
}
