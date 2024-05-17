package DesignPatterns.FacadeDesignPattern;

import DesignPatterns.FacadeDesignPattern.dto.EmployeeDTO;
import DesignPatterns.FacadeDesignPattern.impl.EmployeeDaoImpl;
import DesignPatterns.FacadeDesignPattern.impl.EmployeeFacadeImpl;
import DesignPatterns.FacadeDesignPattern.interfaces.EmployeeDao;
import DesignPatterns.FacadeDesignPattern.interfaces.IEmployeeFacade;

public class FacadeDesignMainClass {

    public static void execute(){
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        IEmployeeFacade employeeProxy = new EmployeeFacadeImpl(employeeDao);

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeProxy.createEmployee("ADMIN", employeeDTO);
        employeeProxy.getAllEmployee("User");

    }
}
