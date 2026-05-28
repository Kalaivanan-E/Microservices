package com.example.employees.service.impl;

import com.example.employees.dto.APIResponseDTO;
import com.example.employees.dto.AddressDTO;
import com.example.employees.dto.EmployeeDTO;
import com.example.employees.entity.Employee;
import com.example.employees.mapper.EmployeeMapper;
import com.example.employees.repository.EmployeeRepository;
import com.example.employees.service.EmployeeService;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
            Employee employee = EmployeeMapper.maptoEmployee(employeeDTO);
            Employee savedEmployee = employeeRepository.save(employee);
            EmployeeDTO savedEmployeeDTO = EmployeeMapper.mapToEmployeeDTO(savedEmployee);
            return savedEmployeeDTO;
    }
    @Override
    public APIResponseDTO getEmployeeById(Long employeeId){
        Employee employee = employeeRepository.findById(employeeId).get();
        ResponseEntity<AddressDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/address/"+
                employee.getAddressId(), AddressDTO.class);
        AddressDTO addressDTO = responseEntity.getBody();

        EmployeeDTO employeeDTO = EmployeeMapper.mapToEmployeeDTO(employee);
        APIResponseDTO apiResponseDTO = new APIResponseDTO();
        apiResponseDTO.setEmployeeDTO(employeeDTO);
        apiResponseDTO.setAddressDTO(addressDTO);

        return apiResponseDTO;
    }
}
