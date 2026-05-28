package com.example.address.controller;

import com.example.address.dto.AddressDTO;
import com.example.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDTO> saveAddress(@RequestBody AddressDTO addressDTO){
        AddressDTO addressDTO1 = addressService.saveAddress(addressDTO);
        return new ResponseEntity<>(addressDTO1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO>getAddressById(@PathVariable Long id){
        AddressDTO addressDTO2 = addressService.getAddressById(id);
        return new ResponseEntity<>(addressDTO2,HttpStatus.OK);
    }
}
