package com.example.employees.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDTO {
    private EmployeeDTO employeeDTO;
    private AddressDTO addressDTO;

}
