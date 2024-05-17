package DesignPatterns.FacadeDesignPattern.interfaces;

import DesignPatterns.FacadeDesignPattern.dto.EmployeeDTO;

public interface IEmployeeFacade {
    void createEmployee(String client, EmployeeDTO employeeDTO);
    void getAllEmployee(String client);
}
