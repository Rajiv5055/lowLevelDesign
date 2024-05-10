package DesignPatterns.ProxyDesignPattern.impl;

import DesignPatterns.ProxyDesignPattern.dto.EmployeeDTO;
import DesignPatterns.ProxyDesignPattern.interfaces.EmployeeDao;

/*
 Here proxy is implemented to check authorization for client.
   only authorized clients will have access to do operations
 */
public class EmployeeProxyImpl implements EmployeeDao {

    EmployeeDao employeeDao;

    public EmployeeProxyImpl(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    public void createEmployee(String cliend, EmployeeDTO employeeDTO) {
        if(cliend.equalsIgnoreCase("ADMIN")){
            employeeDao.createEmployee(cliend, employeeDTO);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public void updateEmployee(String client, EmployeeDTO employeeDTO) {
        if(client.equalsIgnoreCase("ADMIN")){
            employeeDao.updateEmployee(client, employeeDTO);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public void getAllEmployee(String client) {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")){
            employeeDao.getAllEmployee(client);
            return;
        }
        throw new RuntimeException("Access Denied");
    }

    @Override
    public void deleteEmployee(String client, EmployeeDTO employeeDTO) {
        if(client.equalsIgnoreCase("ADMIN")){
            employeeDao.deleteEmployee(client, employeeDTO);
            return;
        }
        throw new RuntimeException("Access Denied");
    }
}
