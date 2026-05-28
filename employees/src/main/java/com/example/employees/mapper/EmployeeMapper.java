package com.example.employees.mapper;

import com.example.employees.dto.EmployeeDTO;
import com.example.employees.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
            EmployeeDTO employeeDTO = new EmployeeDTO(
                    employee.getEmployeeId(),
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getEmail(),
                    employee.getPhoneNumber(),
                    employee.getAddressId()
            );
            return employeeDTO;
    }
    public static Employee maptoEmployee(EmployeeDTO employeeDTO){
            Employee employee = new Employee(
                    employeeDTO.getEmployeeId(),
                    employeeDTO.getFirstName(),
                    employeeDTO.getLastName(),
                    employeeDTO.getEmail(),
                    employeeDTO.getPhoneNumber(),
                    employeeDTO.getAddressId()
            );
            return employee;
    }
}
