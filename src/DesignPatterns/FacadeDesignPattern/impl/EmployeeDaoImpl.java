package DesignPatterns.FacadeDesignPattern.impl;

import DesignPatterns.FacadeDesignPattern.dto.EmployeeDTO;
import DesignPatterns.FacadeDesignPattern.interfaces.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void createEmployee(String cliend, EmployeeDTO employeeDTO) {
        System.out.println("Employee created successfully");
    }

    @Override
    public void updateEmployee(String client, EmployeeDTO employeeDTO) {
        System.out.println("Employee updated successfully");
    }

    @Override
    public void getAllEmployee(String client) {
        System.out.println("All employees fetched successfully");
    }

    @Override
    public void deleteEmployee(String client, EmployeeDTO employeeDTO) {
        System.out.println("Employee deleted successfully");
    }
}
