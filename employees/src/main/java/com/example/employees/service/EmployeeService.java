package com.example.employees.service;

import com.example.employees.dto.APIResponseDTO;
import com.example.employees.dto.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    APIResponseDTO getEmployeeById(Long employeeId);
}
