package com.codersdesks.employee.service.impl;

import com.codersdesks.employee.entity.Employee;
import com.codersdesks.employee.repo.EmployeeRepo;
import com.codersdesks.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee create(Employee employee) {
        return employeeRepo.save(employee);

    }

    @Override
    public Employee findById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepo.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepo.deleteById(id);
    }
}
