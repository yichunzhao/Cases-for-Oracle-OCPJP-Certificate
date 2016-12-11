/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

import java.util.List;

/**
 *
 * @author YNZ
 */
class Employee {
    
    private long id;
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
}

public interface EmployeeDAO{
    void creatEmployee(Employee e);
    Employee getEmployee(long id);
    boolean deleteEmployee(Employee e);
    boolean updateEmployee(Employee e);
    List<Employee> getAll();
    
}

class EmployeeDaoImpl implements EmployeeDAO{

    @Override
    public void creatEmployee(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getEmployee(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteEmployee(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateEmployee(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

