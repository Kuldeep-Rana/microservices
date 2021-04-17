package com.codersdesks.employee.service;

import com.codersdesks.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee create(Employee employee);

    public Employee findById(Long id);

    public List<Employee> findAll();

    public Employee update(Employee employee);

    public Employee delete(Employee employee);

    public Employee deleteById(Long id);
}
