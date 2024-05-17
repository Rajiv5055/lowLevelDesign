package DesignPatterns.FacadeDesignPattern.impl;

import DesignPatterns.FacadeDesignPattern.dto.EmployeeDTO;
import DesignPatterns.FacadeDesignPattern.interfaces.EmployeeDao;
import DesignPatterns.FacadeDesignPattern.interfaces.IEmployeeFacade;

/*
 Here Facade is implemented to restrict only some methods for client.
 */
public class EmployeeFacadeImpl implements IEmployeeFacade {

    EmployeeDao employeeDao;

    public EmployeeFacadeImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void createEmployee(String cliend, EmployeeDTO employeeDTO) {
        employeeDao.createEmployee(cliend, employeeDTO);
    }

    @Override
    public void getAllEmployee(String client) {
        employeeDao.getAllEmployee(client);
    }

}
