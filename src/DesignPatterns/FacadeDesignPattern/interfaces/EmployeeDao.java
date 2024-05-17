package DesignPatterns.FacadeDesignPattern.interfaces;

import DesignPatterns.FacadeDesignPattern.dto.EmployeeDTO;

public interface EmployeeDao {
    void createEmployee(String cliend, EmployeeDTO employeeDTO);
    void updateEmployee(String client, EmployeeDTO employeeDTO);

    void getAllEmployee(String client);
    void deleteEmployee(String client, EmployeeDTO employeeDTO);
}
