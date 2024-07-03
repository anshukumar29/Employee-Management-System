package com.example.Employee.Management.System.service;

import com.example.Employee.Management.System.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
