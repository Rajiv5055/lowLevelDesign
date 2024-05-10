package DesignPatterns.ProxyDesignPattern;

import DesignPatterns.ProxyDesignPattern.dto.EmployeeDTO;
import DesignPatterns.ProxyDesignPattern.impl.EmployeeDaoImpl;
import DesignPatterns.ProxyDesignPattern.impl.EmployeeProxyImpl;
import DesignPatterns.ProxyDesignPattern.interfaces.EmployeeDao;

public class ProxyDesignMainClass {

    public static void execute(){
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeDao employeeProxy = new EmployeeProxyImpl(employeeDao);

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeProxy.createEmployee("ADMIN", employeeDTO);
        try{
            employeeProxy.deleteEmployee("USER", employeeDTO);
        } catch (Exception e){
            System.out.println("Exception Occurred : " + e.getMessage());
        }

    }
}
